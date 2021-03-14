package Implement;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;
import Interfaces.*;
import Pojo.Producto;
import java.util.List;
import java.util.ArrayList;

public class IdaoImplements implements ProductoInter {

    private RandomAccessFile raf;
    private File f;
    private final String RAFNAME = "Almacen.txt";
    private final int SIZE = 132;

    public IdaoImplements() {
        f = new File(RAFNAME);
    }

    public void open() throws IOException {
        if (!f.exists()) {
            f.createNewFile();
            raf = new RandomAccessFile(f, "rw");
            raf.seek(0);
            raf.writeInt(0);//n
            raf.writeInt(0);//k
        } else {
            raf = new RandomAccessFile(f, "rw");
        }
    }

    public void close() throws IOException {
        if (raf != null) {
            raf.close();
        }
    }

    @Override
    public void save(Producto t) throws IOException {
        open();
        raf.seek(0);
        int n = raf.readInt();
        int k = raf.readInt();

        long pos = 8 + k * SIZE;
        raf.seek(pos);

        raf.writeInt(t.getId());
        raf.writeUTF(t.getNombre_producto());
        raf.writeDouble(t.getPrecio());
        raf.writeInt(t.getCantidad());
        raf.writeUTF(t.getPais_origen());
        raf.writeUTF(t.getProveedor());
        raf.writeUTF(t.getDate());

        raf.seek(0);
        raf.writeInt(++n);
        raf.writeInt(++k);

        close();

    }

    @Override
    public int update(int id, Producto t) throws IOException {
        open();
        raf.seek(0);
        int n = raf.readInt();
        for (int i = 0; i < n; i++) {
            long pos = 8 + i * SIZE;
            raf.seek(pos);
            int id2 = raf.readInt();
            if (id2 == id) {
                raf.seek(pos);
                raf.writeInt(t.getId());
                raf.writeUTF(t.getNombre_producto());
                raf.writeDouble(t.getPrecio());
                raf.writeInt(t.getCantidad());
                raf.writeUTF(t.getPais_origen());
                raf.writeUTF(t.getProveedor());
                raf.writeUTF(t.getDate());
                return 1;
            }
        }
        close();
        return -1;

    }

    @Override
    public boolean delete(int id) throws IOException {
        boolean flag2 = false, flag3 = false;
        File tmp = new File("tmp.dat");
        tmp.createNewFile();
        RandomAccessFile tmpr = new RandomAccessFile(tmp, "rw");
        open();
        int c = 0, n1 = 0, k1 = 0;
        raf.seek(0);
        int n = raf.readInt();
        int k = raf.readInt();
        tmpr.seek(0);
        tmpr.writeInt(n1);//n
        tmpr.writeInt(k1);//k
        for (int i = 0; i < n; i++) {

            long pos = 8 + i * SIZE;
            raf.seek(pos);
            int id2 = raf.readInt();
            if (id2 == id) {
                flag2 = true;
                continue;
            }
            raf.seek(pos);
            id2 = raf.readInt();
            String nombrepro = raf.readUTF();
            double precio = raf.readDouble();
            int ca = raf.readInt();
            String pais = raf.readUTF();
            String proveedor = raf.readUTF();
            String fecha = raf.readUTF();

            long posT = 8 + c * SIZE;
            tmpr.seek(posT);
            tmpr.writeInt(id2);
            tmpr.writeUTF(nombrepro);
            tmpr.writeDouble(precio);
            tmpr.writeInt(ca);
            tmpr.writeUTF(pais);
            tmpr.writeUTF(proveedor);
            tmpr.writeUTF(fecha);
            tmpr.seek(0);
            tmpr.writeInt(++n1);
            tmpr.writeInt(++k1);
            c++;

        }
        close();
        tmpr.close();

        boolean flag = f.delete();

        if (flag) {
            tmp.renameTo(f);
        }

        if (flag && flag2) {
            flag3 = true;
        }

        return flag3;
    }

    @Override
    public List<Producto> findAll() throws IOException {
        List<Producto> p = new ArrayList<>();
        open();
        raf.seek(0);
        int n = raf.readInt();
        for (int i = 0; i < n; i++) {
            long pos = 8 + i * SIZE;
            raf.seek(pos);
            int id = raf.readInt();
            String nombrepro = raf.readUTF();
            double precio = raf.readDouble();
            int ca = raf.readInt();
            String pais = raf.readUTF();
            String proveedor = raf.readUTF();
            String fecha = raf.readUTF();
            Producto pe = new Producto(id, nombrepro, precio, ca, pais, proveedor, fecha);
            p.add(pe);
        }
        close();
        return p;
    }

    @Override
    public int LocalizarID(int id) throws IOException {
        open();
        raf.seek(0);
        int n = raf.readInt();

        for (int i = 0; i < n; i++) {
            long pos = 8 + i * SIZE;
            raf.seek(pos);
            int id2 = raf.readInt();
            if (id2 == id) {
                return 1;
            }
        }
        close();
        return -1;
    }

    public Producto findByID(int id) throws IOException {
        open();
        raf.seek(0);
        int n = raf.readInt();
        Producto p=null;

        for (int i = 0; i < n; i++) {
            long pos = 8 + i * SIZE;
            raf.seek(pos);
            int id2 = raf.readInt();
            if (id2 == id) {
                raf.seek(pos);
                id2=raf.readInt();
                String nombrepro = raf.readUTF();
                double precio = raf.readDouble();
                int ca = raf.readInt();
                String pais = raf.readUTF();
                String proveedor = raf.readUTF();
                String fecha = raf.readUTF();
                p=new Producto(id2, nombrepro, precio, ca, pais, proveedor, fecha);
                return p;
            }
        }
        return p;
    }

}

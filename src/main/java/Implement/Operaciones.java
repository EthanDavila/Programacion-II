package Implement;

import POJO.Empleados;
import Servidor.FileConnection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Operaciones implements MethodContainer<Empleados>{
    File archivo;
    DataOutputStream dos;
    DataInputStream dis;
    final static String FILENAME = "Nomina.dat";
    FileConnection fc;


    public Operaciones() {
        fc = new FileConnection(archivo);
    }

    @Override
    public void create(Empleados t) throws IOException {
        if (t == null){
            return;
        }

        dos = fc.getInstance(new File(FILENAME)).getDataOutput();

        guardar(t);

        fc.getInstance(new File(FILENAME)).close();
    }

    @Override
    public void update(Empleados t) throws IOException{
        if (t == null){
            return;
        }

        dos = fc.getInstance(new File(FILENAME)).getDataOutputUpdate();

        guardar(t);

        fc.getInstance(new File(FILENAME)).close();
    }

    public void guardar(Empleados t) throws IOException {
        dos.writeInt(t.getId());
        dos.writeUTF(t.getNombre());
        dos.writeUTF(t.getCargo());
        dos.writeDouble(t.getSalario_devengado());
        dos.writeDouble(t.getINSS_L());
        dos.writeDouble(t.getIR());
        dos.writeDouble(t.getSalario_neto());
        dos.writeDouble(t.getINSS_P());
        dos.writeDouble(t.getINATEC());
        dos.writeDouble(t.getVacaciones());
        dos.writeDouble(t.getTreceavo_mes());
        dos.writeDouble(t.getIndemnizacion());
    }

    @Override
    public void delete(Empleados t) throws IOException {
        List<Empleados> empleados = nomina();

        dos = fc.getInstance(new File(FILENAME)).getDataOutputUpdate();

        for (Empleados e : empleados) {
            if (e.getId() == t.getId()){
                continue;
            }else{
                guardar(e);
            }
        }

        fc.getInstance(new File(FILENAME)).close();
    }

    @Override
    public List<Empleados> nomina() throws IOException {
        List<Empleados> empleados = new ArrayList<>();
        Empleados e ;

        dis = fc.getInstance(new File(FILENAME)).getDataInput();

        while (dis.available() > 0) {
            e = new Empleados();

            read(e);

            empleados.add(e);
        }

        fc.getInstance(new File(FILENAME)).close();
        return empleados;
    }

    public Empleados findById(int id) throws IOException {
        Empleados e = null;

        if(id <=0){
            return e;
        }

        dis = fc.getInstance(new File(FILENAME)).getDataInput();

        while(dis.available() > 0){
            e = new Empleados();

            read(e);

            if(e.getId() == id){
                break;
            }else{
                e = null;
            }
        }

        fc.getInstance(new File(FILENAME)).close();

        return e;
    }

    public void read(Empleados e) throws IOException {
        e.setId(dis.readInt());
        e.setNombre(dis.readUTF());
        e.setCargo(dis.readUTF());
        e.setSalario_devengado(dis.readDouble());
        e.setINSS_L(dis.readDouble());
        e.setIR(dis.readDouble());
        e.setSalario_neto(dis.readDouble());
        e.setINSS_P(dis.readDouble());
        e.setINATEC(dis.readDouble());
        e.setVacaciones(dis.readDouble());
        e.setTreceavo_mes(dis.readDouble());
        e.setIndemnizacion(dis.readDouble());
    }

    public Empleados optionFindByID(int id) throws IOException {
        Empleados e = null;

        if(id <=0){
            return e;
        }

        dis = fc.getInstance(new File(FILENAME)).getDataInput();

        while(dis.available() > 0){
            e = new Empleados();

            readOptionID(e);

            if(e.getId() == id){
                break;
            }else{
                e = null;
            }
        }

        fc.getInstance(new File(FILENAME)).close();

        return e;
    }

    public void readOptionID(Empleados e) throws IOException {
        e.setId(dis.readInt());
        e.setNombre(dis.readUTF());
        e.setCargo(dis.readUTF());
    }
}

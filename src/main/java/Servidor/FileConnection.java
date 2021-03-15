package Servidor;

import java.io.*;

public class FileConnection {
    private static File archivo;
    private FileOutputStream fos;
    private FileInputStream fis;
    private DataOutputStream dos;
    private DataInputStream dis;
    private static FileConnection fileConnection = null;

    public FileConnection(File archivo){
        FileConnection.archivo = archivo;
    }

    public FileConnection getInstance(File archivo) {
        if (fileConnection == null) {
            fileConnection = new FileConnection(archivo);
        }

        if (!FileConnection.archivo.equals(archivo)) {
            fileConnection = new FileConnection(archivo);
        }
        return fileConnection;
    }

    private void openOutput() throws FileNotFoundException {
        fos = new FileOutputStream(archivo, true);
        dos = new DataOutputStream(fos);
    }

    private void openInput() throws IOException {
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        fis = new FileInputStream(archivo);
        dis = new DataInputStream(fis);
    }

    public DataOutputStream getDataOutput() throws FileNotFoundException {
        if (dos == null){
            openOutput();
        }
        return dos;
    }

    public DataInputStream getDataInput() throws IOException {
        if (dis == null){
            openInput();
        }
        return dis;
    }

    public void openOutputUpdate() throws FileNotFoundException {
        fos = new FileOutputStream(archivo,false);
        dos = new DataOutputStream(fos);
    }

    public DataOutputStream getDataOutputUpdate() throws FileNotFoundException {
        openOutputUpdate();
        return dos;
    }

    public void close() throws IOException {
        if (fos != null){
            fos.close();
            fos = null;
        }

        if(fis != null){
            fis.close();
            fis = null;
        }

        if (dos != null){
            dos.close();
            dos = null;
        }

        if(dis != null){
            dis.close();
            dis = null;
        }
    }
}

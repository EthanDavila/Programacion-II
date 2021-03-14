package Interfaces;
import Pojo.Producto;
import java.io.IOException;

public interface ProductoInter extends Interfaces<Producto>{
    int LocalizarID (int id)throws IOException;
    Producto findByID(int id) throws IOException;
}

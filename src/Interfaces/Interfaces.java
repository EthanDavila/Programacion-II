package Interfaces;
import java.io.IOException;
import java.util.List;

public interface Interfaces <T>{
    void save(T t)throws IOException;
    int update(int id, T t)throws IOException;
    boolean delete(int id)throws IOException;
    List<T> findAll()throws IOException;
}

package Implement;
	
import java.io.IOException;
import java.util.List;

public interface MethodContainer<T>{
    void create (T t) throws IOException;
    void update (T t) throws IOException;
    void delete (T t) throws IOException;
    List<T> nomina() throws IOException;
}

package week05.exeptionhandling.autocloseable;

public class Computer implements AutoCloseable{
    public void run() {
        System.out.println("competer is running...");


    }
    @Override
    public void close() throws Exception {


    }
}

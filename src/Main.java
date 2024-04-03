import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Computer computer = new Computer();
        Printer printer = new Printer();
        computer.start();
        printer.start();


//        Printer printer2 = new Printer();
//        printer2.start();
//
//        Printer printer3 = new Printer();
//        printer3.start();
    }
}
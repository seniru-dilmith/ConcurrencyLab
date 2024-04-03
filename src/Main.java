import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Computer computer = new Computer();
        Printer printer = new Printer();
        computer.start();
        Thread.sleep(50);
        printer.start();
    }
}
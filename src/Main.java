import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Computer computer1 = new Computer();
        computer1.setName("COM1");
        Computer computer2 = new Computer();
        computer2.setName("COM2");
        Computer computer3 = new Computer();
        computer3.setName("COM3");

        Printer printer1 = new Printer();
        printer1.setName("Printer1");
        Printer printer2 = new Printer();
        printer2.setName("Printer2");

        computer1.start();
        computer2.start();
        computer3.start();

        Thread.sleep(1000);
        printer1.start();
        printer2.start();
    }
}
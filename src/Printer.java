public class Printer {
     final int ID;
     private static int count = 0;

    public Printer() {
        this.ID = count;
        count++;
    }

    public void executePrintJob(PrintJob printJob) {
        System.out.println(printJob.getFileToPrint());
    }
}

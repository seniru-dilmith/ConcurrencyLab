import java.util.Objects;

public class Printer extends Thread{
     final int ID;
     private static int count = 0;


    @Override
    public void run() {
        while (true) {
            synchronized (SharedQueue.getQueue()) {
                if (!SharedQueue.getQueue().isEmpty()) {
                    executePrintJob(SharedQueue.getFront());
                } else {
                    // No more jobs to print, exit the loop
                    break;
                }
            }
        }
    }

    public Printer() {
        this.ID = count;
        count++;
    }

    // executing printer jobs one by one since it is synchronized
    public synchronized void executePrintJob(PrintJob printJob) {
        var result = printJob.getFileToPrint();
        if (!Objects.equals(result, ""))
            System.out.println(printJob.getFileToPrint());
    }
}

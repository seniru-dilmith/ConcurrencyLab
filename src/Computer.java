import java.io.File;
import java.util.*;

public class Computer extends Thread{

    @Override
    public void run() {
        File file = new File("abc.txt");

        TextFile textFile = new TextFile(file);

        PrintJob printJob = new PrintJob(111, textFile);

        this.addPrintJobsToQueue(printJob);
    }

    // add print jobs to shared queue
        public void addPrintJobsToQueue(PrintJob printJob) {
            try {
                SharedQueue.addJobs(printJob);
            } catch (PrintJobOverloadException e) {
                System.out.println(e.getMessage());
            }
        }

        public PrintJob sendToPrint() {
            PrintJob job = null;
            try {
                job = SharedQueue.getFront();
            } catch (NoFrontElementInTheQueueExeption e) {
                System.out.println(e.getMessage());
            }
            return job;
        }

    }

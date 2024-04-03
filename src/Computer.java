import java.util.*;

public class Computer {

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

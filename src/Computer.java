import java.io.File;

public class Computer extends Thread{

    @Override
    public void run() {
        // testing files to check system

        File file1 = new File(Thread.currentThread().getName()+"abc.txt");
        //System.out.println(Thread.currentThread().getName()+"abc.txt");
        TextFile textFile1 = new TextFile(file1);

        File file2 = new File(Thread.currentThread().getName()+"abd.txt");
        //System.out.println(Thread.currentThread().getName()+"abd.txt");
        TextFile textFile2 = new TextFile(file2);

        File file3 = new File(Thread.currentThread().getName()+"abe.txt");
        //System.out.println(Thread.currentThread().getName()+"abe.txt");
        TextFile textFile3 = new TextFile(file3);

        PrintJob printJob1 = new PrintJob(111, textFile1);
        PrintJob printJob2 = new PrintJob(222, textFile2);
        PrintJob printJob3 = new PrintJob(333, textFile3);

        this.addPrintJobsToQueue(printJob1);
        this.addPrintJobsToQueue(printJob2);
        this.addPrintJobsToQueue(printJob3);
    }

    // add print jobs to shared queue
        public void addPrintJobsToQueue(PrintJob printJob) {
            try {
                while (!SharedQueue.getQueue().contains(printJob))
                    SharedQueue.addJobs(printJob);
            } catch (PrintJobOverloadException e) {
                System.out.println(e.getMessage());
            }
        }

    }

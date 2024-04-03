import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {
    private static Queue<PrintJob> queue = new LinkedList<>();  // queue of all the print jobs

    // adding print jobs to the queue, using synchronization to avoid conflicts
    public synchronized static void addJobs(PrintJob printjob){
        if(queue.size()<5)
            queue.add(printjob);
        else
            throw new PrintJobOverloadException();
    }

    // getting the font element in the queue nd removing it
    public synchronized static PrintJob getFront(){
        if(queue.peek() == null){
            throw new NoFrontElementInTheQueueExeption();
        }
        return queue.poll();
    }


    // getting the queue. This is mainly used to check whether is there same object in the queue
    public static Queue<PrintJob> getQueue() {
        return queue;
    }
}

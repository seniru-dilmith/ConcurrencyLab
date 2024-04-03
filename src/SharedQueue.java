import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {
    private static Queue<PrintJob> queue = new LinkedList<>();

    public static void addJobs(PrintJob printjob){
        if(queue.size()<5)
            queue.add(printjob);
    }

    public static PrintJob getFront(){
        if(queue.peek() == null){
            throw new NoFrontElementInTheQueueExeption();
        }
        return queue.peek();
    }


}
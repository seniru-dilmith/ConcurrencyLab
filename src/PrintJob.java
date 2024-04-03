import java.io.IOException;

// class for printer jobs
public class PrintJob {
    private int ID;
    private TextFile file;

    public PrintJob(int ID, TextFile file) {
        this.ID = ID;
        this.file = file;
    }

    public int getID() {
        return ID;
    }

    // getting file to be printed, if not available throws an exception
    public synchronized String getFileToPrint() {
        String data = null;
        try {
            data = file.ReadAFile();
        } catch (IOException | TypeNotSupportedException e) {
            System.out.println("File is not available to read");
        }
        if (data != null)
            return data;
        return "";
    }
}

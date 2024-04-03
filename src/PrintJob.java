import java.io.IOException;

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

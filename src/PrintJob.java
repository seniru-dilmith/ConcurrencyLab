import java.io.IOException;

public class PrintJob {
    private int ID;
    private TextFile file;

    public int getID() {
        return ID;
    }

    public String getFileToPrint() {
        String data = null;
        try {
            data = file.ReadAFile();
        } catch (IOException | TypeNotSupportedException e) {
            System.out.println("File is not available to read");
        }
        return data;
    }
}

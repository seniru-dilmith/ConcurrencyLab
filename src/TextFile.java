import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class TextFile {
    private File textFile;

    public TextFile(File file){
        this.textFile = file;
    }

    // checking files for the validity (only text files are approved)
    private boolean isValidTextFile(File file) {
        String fileName = file.getName();
        return fileName.endsWith(".txt");
    }

    // reading that file only if txt type
    public synchronized String ReadAFile() throws IOException {
        StringBuilder stringbuilder = new StringBuilder();

        if (!isValidTextFile(this.textFile)) {
            throw new TypeNotSupportedException("Only '.txt' files are supported.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(this.textFile))){

            String line ;
            while ((line = reader.readLine()) != null ){
                stringbuilder.append(line).append("\n");
            }
         }

        return "Printing... File : " + textFile.getName();
    }

}

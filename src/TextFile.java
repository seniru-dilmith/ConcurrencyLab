import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class TextFile {
    private File textFile;

    public TextFile(File path){
        this.textFile = path;
    }

    private boolean isValidTextFile(File file) {
        String fileName = file.getName();
        return fileName.endsWith(".txt");
    }
    public String ReadAFile() throws IOException {
        StringBuilder stringbuilder = new StringBuilder();

        if (!isValidTextFile(this.textFile)) {
            throw new TypeNotSupportedException("Only .txt files are supported.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(this.textFile))){

            String line ;
            while ((line = reader.readLine()) != null ){
                stringbuilder.append(line).append("\n");
            }
         }

        return stringbuilder.toString();
    }

}

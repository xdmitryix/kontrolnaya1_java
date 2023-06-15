import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
    private String fileName;
    
    public TextFileWriter(String fileName) {
        this.fileName = fileName;
    }
    
    public void write(String text) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(text);
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

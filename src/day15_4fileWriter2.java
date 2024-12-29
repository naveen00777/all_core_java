import java.io.FileOutputStream;
import java.io.IOException;

public class day15_4fileWriter2 {
    public static void main(String[] args) {
        String filename = "readingfile1.txt";
        String content = "welcome to java fsd";
        try (FileOutputStream f = new FileOutputStream(filename)){
            byte[] bytes = content.getBytes();
            f.write(bytes);
            System.out.println("content has been written to the file");
        }catch (IOException e)
        {
            System.out.println(e);
        }
    }
}

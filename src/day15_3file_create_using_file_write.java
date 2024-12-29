import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class day15_3file_create_using_file_write {
    public static void main(String[] args) {
        String filename3 = "creating_file_in_filewrite_method.txt";
        try {
            Files.write(Paths.get(filename3),("hello boss").getBytes());
            System.out.println("file created successfully!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

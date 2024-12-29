import java.nio.file.Files;
import java.nio.file.Paths;

public class day15_4fileWriter3 {
    public static void main(String[] args) {
        String filename = "filereader.txt";
        String content = "this is the third method to write the data";
        try{
            Files.write(Paths.get(filename),content.getBytes());
            System.out.println("files is written successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class day16_file_handling3_method_read_all_lines {
    public static void main(String[] args) {
        String fileName = "example1.txt";
        try{
            List<String>Lines = Files.readAllLines(Paths.get(fileName));
            for(String line: Lines){
                System.out.print(line);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

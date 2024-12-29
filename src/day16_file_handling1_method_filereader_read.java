import java.io.FileReader;
import java.io.IOException;

public class day16_file_handling1_method_filereader_read {
    public static void main(String[] args) {
        String fileName = "example1.txt";
        try(FileReader reader = new FileReader(fileName)){
            int character;
            while((character = reader.read())!=-1){
                System.out.print((char)character);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

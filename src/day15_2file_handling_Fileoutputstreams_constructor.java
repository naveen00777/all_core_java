import java.io.FileOutputStream;
import java.io.IOException;

public class day15_2file_handling_Fileoutputstreams_constructor {
    public static void main(String[] args) {
        String filename2 = "example_of_fileoutputstream.txt";
            try(FileOutputStream file = new FileOutputStream(filename2)){
                System.out.println("file created successfully");
            }catch(IOException e){
                System.out.println(e);
            }
    }
}

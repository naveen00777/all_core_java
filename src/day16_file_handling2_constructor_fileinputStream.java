import java.io.IOException;
import java.io.FileInputStream;


public class day16_file_handling2_constructor_fileinputStream {
    public static void main(String[] args) {
        String fileName = "example1.txt";
        try(FileInputStream fis = new FileInputStream(fileName)){
            int byteValue;
            while((byteValue = fis.read())!=-1){
                System.out.print((char)byteValue);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

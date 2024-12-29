import java.io.File;
import java.io.IOException;

public class day15_1file_handling_using_file_method {
    public static void main(String[] args)throws IOException {
        String fileName = "example_of_file_method.txt";
        File file = new File(fileName);
        try{
            if(file.createNewFile()){
                System.out.println("file created successfully");
            }else{
                System.out.println("file already exists or failed to create");
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}

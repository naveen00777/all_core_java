import java.io.File;

public class day16_final_delete_files {
    public static void main(String[] args) {
        File file = new File("example5.txt");
        if(file.exists()){
            if(file.delete()){
                System.out.println("file deleted successfully");
            }else{
                System.out.println("failed to delete the files");
            }
        }else{
            System.out.println("no such file");
        }
    }
}

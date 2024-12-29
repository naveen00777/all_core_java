import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//it is used to read the data and store in the txt file and show for long time
public class day15_4fileWriter1 {
    public static void main(String[] args) {
        String fileName ="example1.txt";
        File file = new File(fileName);
        try{
            if(file.createNewFile()){
                System.out.println("file is created");
            }else{
                System.out.println("file already exist or failed to create!");
            }
            FileWriter writer= new FileWriter(file);
            writer.write("welcome to java junior full stack development\n");
            writer.write("welcome to java junior full stack development\n");
            writer.write("welcome to java junior full stack development");
            System.out.println("content written to the file successsfully");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

import java.io.File;
import java.io.FileReader;

public class day11_exceptionshandling {
    public static void main(String[] args) throws Exception  {//instead of try catch block
//        try{
//            File file = new File("file:///C:/Users/lenovo/OneDrive/Desktop/sslc.pdf");
//            FileReader fr = new FileReader(file);
//        }
//     catch(Exception e){
//         System.out.println(e);
//     }
        File file = new File("file:///C:/Users/lenovo/OneDrive/Desktop/sslc.pdf");
        FileReader fr = new FileReader(file);
    }
    }
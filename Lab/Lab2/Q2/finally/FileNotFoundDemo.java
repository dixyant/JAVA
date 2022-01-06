import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileNotFoundDemo {

  public static void main(String[] args) {
    try {
    FileReader file = new FileReader("abc.txt");
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      File file = new File("NewFile.txt");
      if (!file.exists()) {
        try{
          file.createNewFile();
          System.out.println("\n Required File could not be found.");
          System.out.println("\n Required File created.");
        }catch(IOException e){
          System.out.println(e.getMessage());
        }
		  }
    
    }
  }
}
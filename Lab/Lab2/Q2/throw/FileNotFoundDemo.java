import java.io.FileReader;
import java.io.FileNotFoundException;

class FileNotFoundDemo {

  public static void main(String[] args) throws FileNotFoundException {
    FileReader file = new FileReader("NewFile.txt");
    throw new FileNotFoundException();  
  }
}
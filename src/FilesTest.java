import java.io.File;
import java.nio.file.Paths;

public class FilesTest {

    public static void main(String[] args) {
        String currentPath = Paths.get("").toAbsolutePath().toString() + "\\src";
		
		File file1;
		try {
			
			file1 = new File(currentPath + "\\file1.java");
			
			if(file1.createNewFile()) {
				System.out.println("Created the file: " + file1.getName());
			} else {
				System.out.println("File: " + file1.getName() + " already exists");
			}
			
		} catch (Exception e) {
			System.out.println("Error occured: " + e );
			
			e.printStackTrace();
		}
    }

    void createFile(String fileName){
    
    }

    void createFile(String name, String path){
    
    
    }
}

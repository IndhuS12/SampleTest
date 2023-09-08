package Excel;
import java.io.IOException;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 String a=Excel.readStringData(1, 1);
 System.out.println("Value of a is "+a);
 
 String b=Excel.readIntegerData(0, 0);
 System.out.println("Value of b is "+b);
 
 
 //String currentUsersHomeDir = System.getProperty("user.dir");
 //System.out.println(currentUsersHomeDir);
 
	}

}



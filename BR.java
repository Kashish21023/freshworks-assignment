import java.io.*;
import java.lang.String;
import java.util.*;
import org.json.JSONObject; 
public class BR 
{
 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 public void Insert( ) throws IOException
 {
   Scanner in = new Scanner (System.in);
  System.out.println("Enter the Country_Name: ");
	String country_Name=in.next();
	System.out.println("Enter the Country_capital: ");
	String country_capital=in.next();
	System.out.println("Enter the region: ");
	char  region=in.nextInt();
	System.out.println("Enter the language: ");
	char language=in.nextInt();     
  JSONObject obj=new JSONObject(); 
  obj.put("country_name",country_Name);    
  obj.put("country_capital",country_capital);    
  obj.put("region",region);
  obj.put("language",language);
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("BR.txt",true)));
  pw.print(obj);
  System.out.println("Details added successfully.");
  pw.close();
 }
public static void main(String args[]) throws IOException
{
  BR in = new BR();
  in.Insert();
}
 
}

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
  System.out.println("Enter Patients_Name : ");
	String country_Name=in.next();
	System.out.println("Enter Patients_Address : ");
	String country_capital=in.next();
	System.out.println("Enter Patients_Age : ");
	char  region=in.nextInt();
	System.out.println("Enter Patients_Gender : ");
	char language=in.nextInt();     
  JSONObject obj=new JSONObject(); 
  obj.put("Patients_Name",Patients_Name);    
  obj.put("Patients_Address",Patients_Address);    
  obj.put("Patients_Age",Patients_Age);
  obj.put("Patients_Gender",Patients_Gender);
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

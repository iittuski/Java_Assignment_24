import java.util.Scanner;

public class Get_result extends STUDENT{
 static String name,rollno;
 static int regno,resultper,finalresult;
 
	@Override
	void calculateresult() {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Name");
		name = s1.next();
		super.name = name;
		
		System.out.println("Enter RollNO");
		rollno = s1.next();
		super.rollno = rollno;
		
		System.out.println("Enter Reg no");
		regno = s1.nextInt();
		super.regno = regno;
		
		
	}
	
	public static void main(String args[]){
		Get_result g1 = new Get_result();
		g1.calculateresult();
		System.out.println("Your name:"+name+"\nYour Rollno:"+rollno+"\nYour regno:"+regno);
		resultper=50;
		finalresult=(int) (resultper*Math.random());
		System.out.println("your result is:"+finalresult+"/100");
		
	}
	

	
}

import java.util.Scanner;

public class Patient {
String Name;


static String machName() {
	Scanner Namen = new Scanner(System.in);
	 System.out.print("Patientenname: ");
	    String Name = Namen.nextLine();
 System.out.println("Der Patient hei�t " + Name + ".");
 
 return Name;
}

static Integer machgr() {
	Scanner big = new Scanner(System.in);
	 System.out.print("Wie gro� soll die schlange sein ");
	    Integer bigger = big.nextInt();
 return bigger;
} 


}

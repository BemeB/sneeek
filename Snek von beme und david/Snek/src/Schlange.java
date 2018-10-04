
public class Schlange {

	 static String panam;
	 static Patient snak;
	 static Integer gr;
	public static void main(String[] args) {
		
		snak = new Patient();
		Queue<String> Schlange = new Queue<String>();
        gr = Patient.machgr();
for(int i = 0;i <gr; i++) {
			
			panam = Patient.machName();
			
			Schlange.enqueue(panam);
		
	}
Boolean waddrinne = Schlange.isEmpty();
for(int i = 0;i<gr;i++) {
	

	System.out.println("Der nächste is der " + Schlange.front());
    Schlange.dequeue();
    waddrinne = Schlange.isEmpty();

}
	System.out.println("Die Schlange ist leer");


	}



	
	
	
}

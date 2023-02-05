
public class Exercice1 {
	int age = 70;
	double poids = 52.5;
	boolean  isStudent = false;
	char gender = 'F';
	String name = "Fanta";
	public void displayInfoName(){
		System.out.println("age : " + this.age + " \n poids : " + this.poids + "  \n isStudent : "
				+ this.isStudent + "  \n gender : " + gender + "  \n name : " + this.name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercice1 etudiant = new Exercice1();
		etudiant.displayInfoName();
		

	}

}

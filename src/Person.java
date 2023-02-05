
public class Person {
	
	//les attributs de la classe Person
	private String name;
	private int age;
	private char gender;
	
	
	// constructor sans parametre
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		this.name = "Unknown";
		this.age = 0;
		this.gender = 'U';
	}
	
	

	//constructor with all parameters of Person class

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//constructor with two parameters

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.gender = 'U';
	}

	//methode displayInfo
	public void displayInfo() {
		System.out.println("name : " + this.name + " , age : " + this.age + " ans "+ " , gender : " + this.gender);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.displayInfo();
		Person person2 = new Person("Adja", 17 , 'F');
		person2.displayInfo();
		Person person3 = new Person("Shino", 12);
		person3.displayInfo();
		

	}

}

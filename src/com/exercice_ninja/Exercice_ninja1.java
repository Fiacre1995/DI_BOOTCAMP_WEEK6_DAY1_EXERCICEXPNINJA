package com.exercice_ninja;

import com.exercicexpgold.Exercice_xp_gold2;

public class Exercice_ninja1 {

	int age = 25;
	double poids = 65;
	boolean isStudent = false;
	char gender = 'F';
	String name = "Dion";
	
	
	
	public Exercice_ninja1(int age, double poids, boolean isStudent, char gender, String name) {
		super();
		this.age = age;
		this.poids = poids;
		this.isStudent = isStudent;
		this.gender = gender;
		this.name = name;
	}

	public void displayInfo() {
		
		System.out.println("Age " + this.age + " Poids " + this.poids + " Status " + this.isStudent + " Gender " + this.gender + " nom " + this.name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercice_ninja1 person = new  Exercice_ninja1(28, 63.0, true, 'M', "Dion");
		person.displayInfo();

	}
	
}

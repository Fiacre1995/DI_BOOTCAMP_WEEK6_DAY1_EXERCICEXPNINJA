
public class intermediateDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration des variables
		  int poids = 10;
		 double taille = 11.5;
		 char machar = 'A';
		 boolean bool = true;
		 
		 //imprime les differentes variables
		 System.out.println(poids);
		 System.out.println(taille);
		 System.out.print(machar + "\n");
		 System.out.print(bool + "\n");
		 
		 //conversion de type int en type double
		 double convertiValue = (double)poids;
		 System.out.println(convertiValue);
		 
		 convertiValue = poids + taille;
		 System.out.println(convertiValue);
		 
		 //condition if qui compare le poids à la taille
		 if(poids < taille){
			 System.out.println(poids + " est plus petit que la " + taille);
			 
		 }
		 else{
			 System.out.println(poids + " est plus grand que la " + taille);
		 }

	}

}

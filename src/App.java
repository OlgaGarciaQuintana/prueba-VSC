import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
		//Esto es un escaner:
       Scanner entrada = new Scanner(System.in);
		
		//Variables
		double nota1;
		System.out.println("Introduce nota 1:");
		nota1 = entrada.nextDouble();
		
		double nota2;
		System.out.println("Introduce nota 2:");
		nota2 = entrada.nextDouble();
		
		double nota3;
		System.out.println("Introduce nota 3:");
		nota3 = entrada.nextDouble();

	    	double nota4;
		System.out.println("Introduce nota 4:");
		nota4 = entrada.nextDouble();
		
		//Media:
		double media = (nota1 + nota2 + nota3 + nota4)/ 4;
		System.out.println("La nota media es: " + media);
    }
}

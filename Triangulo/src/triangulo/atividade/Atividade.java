package triangulo.atividade;

import java.util.Scanner;

public class Atividade {
 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do triângulo: ");
        double altura = scanner.nextDouble();

        
        double area = (base * altura) / 2;

        
        System.out.println("A área do triângulo é: " + area);

        
        scanner.close();
	}

}

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        
        // Calcula a temperatura em Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Exibe a temperatura em Fahrenheit
        System.out.printf("A temperatura em Fahrenheit é: %.2f", fahrenheit);
        
        sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradeimc;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class CalculadoraDeIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Pega a entrada de dados do usuário:
        Scanner ler = new Scanner(System.in);
        
        char continuar;
        do {
            System.out.println("Calculadora de IMC");
            System.out.println("Digite o seu nome: ");
            String nome = ler.nextLine();
            System.out.println("Digite a sua altura: ");
            float altura = ler.nextFloat();
            System.out.println("Digite o seu peso: ");
            float peso = ler.nextFloat();
            
            float imc = peso / (altura * altura);
            
            if (imc < 18.5) {
                System.out.printf(nome + " seu IMC é: %.2f, e define Magreza.", imc);
            } else if (imc <= 24.9) {
                System.out.printf(nome + " seu IMC é: %.2f, e define Normal.", imc);
            } else if (imc <= 30) {
                System.out.printf(nome + " seu IMC é: %.2f, e define Sobrepeso.", imc);
            } else {
                System.out.printf(nome + " seu IMC é: %2.f, e define Obesidade.", imc);
            }
            System.out.println("\nDeseja calcular novamente? Digite s/n: ");
            continuar = ler.next().charAt(0);
        } while(continuar == 's');
    }
    
}

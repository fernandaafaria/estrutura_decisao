package org.example;
import java.util.Scanner;

// Questão 6 - Direito ao vale refeição
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do salário: ");
        double salario = entrada.nextDouble();
        if (salario <= 4000){
            System.out.println("Você possui direito ao vale refeição");
        } else {
            System.out.println("Você não possui direito ao vale refeição");
        }

    }
}

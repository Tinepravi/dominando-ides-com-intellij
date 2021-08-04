package br.com.tinepravi.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a , b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("A soma é: " + somar);
        System.out.println("A subtração é: " + subtrair);
        System.out.println("A multiplição é: " + multiplicar);
        System.out.println("A divisão é: " + dividir);

    }

    public static int somar (int a, int b){
        return a + b;
    }
    public static int subtrair (int a, int b){
        return a - b;
    }
    public static int multiplicar (int a, int b){
        return a * b;
    }
    public static float dividir (int a, int b){
        return (float) a / b;
    }
}

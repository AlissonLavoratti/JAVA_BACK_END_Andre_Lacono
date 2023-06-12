import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner primeiroNumeroScan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int primeiroNumero = primeiroNumeroScan.nextByte();

        Scanner segundoNumeroScan = new Scanner(System.in);
        System.out.println("Digite o segundo número");
        int segundoNumero = segundoNumeroScan.nextByte();

        int somaDosNumeros = primeiroNumero + segundoNumero;
        System.out.println("O resultado é: " + somaDosNumeros);

    }
}
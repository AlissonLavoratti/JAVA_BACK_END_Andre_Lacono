import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int valorCarro = 87_000;
        if (valorCarro > 100_000)
            System.out.println("Não comprar acima da tabela");
        else if (valorCarro >=90_000 && valorCarro <=100_000)
             System.out.println("Comprar o carro ");
        else
        System.out.println("Não comprar. Valor abaixo da tabela");
    }
}

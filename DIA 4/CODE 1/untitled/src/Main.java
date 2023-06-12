import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //coletar o nome do produto
        System.out.print("digite o nome do produto ");
        Scanner scan = new Scanner(System.in);
        String nomeProduto = scan.next().toLowerCase();
       //System.out.print(nomeProduto);

        //retornar o valor do produto
        switch (nomeProduto) {
            case "banana":
                System.out.println("9,50");
                break;
            case "manga":
                System.out.println("12,80");
                break;
            case "abacate":
                System.out.println("16,10");


        }
    }
}
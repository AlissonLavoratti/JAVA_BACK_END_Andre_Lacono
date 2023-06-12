// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int ingresso = 600;

    //1° FORMA

        /*String terAcesso;
        if (ingresso >= 500)
            terAcesso = "VIP";
        else
            terAcesso = "Pista";

        System.out.println(terAcesso);*/

    //2° FORMA

    /*String teracesso = "Pista";
        if (ingresso >=500)
            teracesso = "VIP";
            System.out.println(teracesso);*/

    //3° FORMA = OPERADOR TERNARIO

    String teracesso = ingresso >=500 ? "VIP" : "PISTA";

    System.out.println(teracesso);
    }
}
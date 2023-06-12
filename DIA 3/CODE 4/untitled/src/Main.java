// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean maior18 = true;
        boolean temEmprego = false;
        boolean temEmpresa = true;

        boolean temEntrada = true;
        boolean temAvalista = true;


        boolean podeFinanciar = ((((maior18) && temEmprego || temEmpresa) && temEntrada) && temAvalista);


        System.out.println(podeFinanciar);
        //System.out.println(podeFinanciar);


    }
}
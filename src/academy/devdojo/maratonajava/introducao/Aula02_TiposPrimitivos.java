package academy.devdojo.maratonajava.introducao;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 26;
        long numeroGrande = 10000;
/*
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
*/
        boolean falso = false;
        char caractere = 'M';

        String nome = "Goku";

        System.out.println("A idade é: "+idade+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é "+nome);

    }
}

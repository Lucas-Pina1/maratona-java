package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais_01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizado = idade >= 18;

        if (isAutorizado) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado");
        }

        if (!isAutorizado) {
            System.out.println("Nào autorizado");
        }
        System.out.println("Fora do if");
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturadeRepeticao_02 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 até 10000000

        for (int count = 0; count <= 1000000; count++) {
            double resto = count % 2;
            if (resto == 0) {
                System.out.println(count);
            }
        }
    }
}

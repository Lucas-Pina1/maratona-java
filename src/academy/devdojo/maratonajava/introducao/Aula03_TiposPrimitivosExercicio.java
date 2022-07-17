package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos entre < > e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, Confirmo que recebi o salário <salario>, na data <data>

 */

public class Aula03_TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Lucas Pina";
        String endereco = "Av Roberto";
        double salario = 1280.00;
        String dataRecebimento = "17/07/2022";

        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", Confirmo que recebi o salário "
                + salario + ", na data " + dataRecebimento;


        System.out.println(relatorio);
    }
}

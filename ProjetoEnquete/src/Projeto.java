import java.util.Scanner;

public class Projeto {

    public static void main(String args[]) {
        //instanciar um objeto Scanner para permitir a digitacao de dados
        Scanner tec = new Scanner(System.in);

        System.out.print("1. Qual o seu nome? ");
        String nome = tec.nextLine();

        System.out.print("2. Defina classe e objeto?");
        String defClasse = tec.nextLine();

        System.out.print("3. Qual a função do construtor?");
        String funcaoConstrutor = tec.nextLine();

        System.out.print("4. Qual a sua maior dificuldade(s) até o momento?");
        String dificuldade = tec.nextLine();

        System.out.println("Nome = " + nome);
        System.out.println("Definicao classe e atributo = " + defClasse);
        System.out.println("Função do construtor = " + funcaoConstrutor);
        System.out.println("Suas maiores dificuldades = " + dificuldade);
    }
}

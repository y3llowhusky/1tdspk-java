//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //instanciando os objetos
        Telefone edu = new Telefone(55, 11, 94820988);
        Telefone fiap = new Telefone(55, 11, 33858010);
        Telefone fiap2 = new Telefone(55, 11, 981700028);

        edu.enviaMensagem(fiap, "Quero estudar TDS em 2026");

        String numeroCompleto = fiap2.getNumeroCompleto();
        System.out.println(numeroCompleto);


    }
}
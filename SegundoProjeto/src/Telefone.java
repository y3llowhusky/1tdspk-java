public class Telefone {
    //Construtor
    public Telefone(int ddi, int ddd, int numero) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    //atributos (propriedades)

    private int ddi;
    private int ddd;
    private int numero;
    private String operadora;
    private String tipo;

    //métodos (funcionalidades)

    public void enviaMensagem(Telefone destinatario, String msg) {
    }

    /*public double average(double x, double y, double z) {
        double soma = x + y + z;
        double media = soma / 3;
        return media;
    }*/

    public String getNumeroCompleto() {
        return "+" + ddi + " (" + ddd + ") " + numero;
    }
}

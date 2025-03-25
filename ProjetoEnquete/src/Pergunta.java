public class Pergunta {

    private int numero;
    private String questao;
    private String tema;

    //Construtor: instanciar o objeto e inicializar os atributos

    public Pergunta(int numero, String questao) {
        this.numero = numero;
        this.questao = questao;
        //quando coloco o this, imagine que estou me referindo à classe
    }

    public int getNumero() {
        return numero;
    }

    public String getQuestao() {
        return questao;
    }

    public String getQuestaoFormulada() {
        return numero + ") " + questao;
    }
}

public class Carro {

    private String modelo;
    private String montadora;
    private String placa;
    private int anoModelo;
    private int anoFabricacao;
    private int quilometragem;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getMontadora() {
        return this.montadora;
    }

}

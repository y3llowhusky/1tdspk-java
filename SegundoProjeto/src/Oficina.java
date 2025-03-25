public class Oficina {

    public static void main(String[] args) {
        Carro c = new Carro();
        c.setModelo("Corolla XEI");
        c.setMontadora("Toyota");

        System.out.println(c.getMontadora());
        System.out.println(c.getModelo());
    }
}

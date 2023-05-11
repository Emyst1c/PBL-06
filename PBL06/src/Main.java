public class Main {
    public static void main(String[] args)
    {
        Roupa camisa = new Camisa("M", "Amarelo", 52f);
        Roupa calca = new Calca("P", "Preta", 44f);
        Roupa vestido = new Vestido("P", "Vermelho", 68f);

        System.out.println(camisa.calcularPrecoFinal(5));
        System.out.println(calca.calcularPrecoFinal(5));
        System.out.println(vestido.calcularPrecoFinal(5));
    }
}
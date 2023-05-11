public class Calca extends Roupa
{
    public Calca(String tamanho, String cor, float preco) {
        super(tamanho, cor, preco);
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        return (preco -= (preco * 0.15)) + acrescimo;
    }

    @Override
    public void getNome() {

    }

    @Override
    public void getMarca() {

    }

    @Override
    public void getPreco() {

    }

    @Override
    public void setPreco(float preco) {

    }
}

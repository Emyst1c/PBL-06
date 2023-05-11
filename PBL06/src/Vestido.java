public class Vestido extends Roupa
{
    public Vestido(String tamanho, String cor, float preco) {
        super(tamanho, cor, preco);
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        return (preco -= (preco * 0.2)) + acrescimo;
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

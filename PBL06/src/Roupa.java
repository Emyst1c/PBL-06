public abstract class Roupa implements Produto
{
    public String tamanho;
    public String cor;
    public float preco;

    public Roupa(String tamanho, String cor, float preco)
    {
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
    }

    public abstract float calcularPrecoFinal(float acrescimo);
}

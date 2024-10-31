public final class Produto implements Calculavel{
    private String nomeProduto;
    private int qtdProduto;
    private double precoProduto, taxaJuros, taxaLucro, taxaDesconto, taxaManuseio, taxaImposto;
    public CategoriaProduto categoriaProduto;

    public Produto(){}

    public Produto(double taxaImposto, double taxaJuros, double taxaLucro, double taxaDesconto, double taxaManuseio){
        this.taxaImposto = taxaImposto;
        this.taxaJuros = taxaJuros;
        this.taxaLucro = taxaLucro;
        this.taxaDesconto = taxaDesconto;
        this.taxaManuseio = taxaManuseio;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setQtdProduto(int qtdProduto){
        this.qtdProduto = qtdProduto;
    }

    public void setPrecoProduto(double precoProduto){
        this.precoProduto = precoProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }
    @Override
    public double calcularImposto() {
        double totalImposto = 0;

        totalImposto += precoProduto * qtdProduto * (taxaImposto/100);

        return totalImposto;
    }

    @Override
    public double calcularJuros() {
        double totalJuros = 0;

        totalJuros += precoProduto * qtdProduto * (taxaJuros/100);

        return totalJuros;
    }

    @Override
    public double calcularLucro() {
        double totalLucro = 0;

        totalLucro += precoProduto * qtdProduto * (taxaLucro/100);

        return totalLucro;
    }

    @Override
    public double calcularDesconto() {
        double totalDesconto = 0;

        totalDesconto += precoProduto * qtdProduto * (taxaDesconto/100);

        return totalDesconto;
    }

    @Override
    public double calcularTaxaManuseio() {

        return taxaManuseio;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = 0;

        precoFinal = precoProduto * qtdProduto + calcularTaxaManuseio() + calcularLucro() + calcularImposto() + calcularJuros() - calcularDesconto();

        return precoFinal;
    }

    @Override
    public double calcularTotal() {
        double precoTotal = 0;

        precoTotal = precoProduto * qtdProduto;

        return precoTotal;
    }

    @Override
    public String toString() {
        return String.format(
                "- %s | Categoria: %s | Preço: R$ %.2f | Quantidade: %d | Total: R$ %.2f\n" +
                        "  Imposto: R$ %.2f | Juros: R$ %.2f | Lucro: R$ %.2f | Desconto: R$ %.2f | " +
                        "Taxa de Manuseio: R$ %.2f | Preço Final: R$ %.2f\n",
                nomeProduto, categoriaProduto.ELETRONICO, precoProduto, qtdProduto, calcularTotal(),
                calcularImposto(), calcularJuros(), calcularLucro(), calcularDesconto(), calcularTaxaManuseio(),
                calcularPrecoFinal()
        );
    }
}

public final class Produto {
    private String nomeProduto;
    private int qtdProduto, taxaJuros, taxaLucro, taxaDesconto, taxaManuseio, taxaImposto;
    private double precoProduto;
    public CategoriaProduto categoriaProduto;

    public Produto(){}

    public Produto(int taxaImposto, int taxaJuros, int taxaLucro, int taxaDesconto, int taxaManuseio){
        this.taxaImposto = taxaImposto;
        this.taxaJuros = taxaJuros;
        this.taxaLucro = taxaLucro;
        this.taxaDesconto = taxaDesconto;
        this.taxaManuseio = taxaManuseio;
    }

    public int getTaxaImposto() {
        return taxaImposto;
    }

    public int getTaxaJuros() {
        return taxaJuros;
    }

    public int getTaxaLucro() {
        return taxaLucro;
    }

    public int getTaxaDesconto() {
        return taxaDesconto;
    }

    public int getTaxaManuseio() {
        return taxaManuseio;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public void setQtdProduto(int qtdProduto){
        this.qtdProduto = qtdProduto;
    }

    public void setPrecoProduto(double precoProduto){
        this.precoProduto = precoProduto;
    }

    public double getPrecoProduto(){
        return precoProduto;
    }
}

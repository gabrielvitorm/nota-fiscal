public final class NotaFiscal implements Calculavel {
    private Cliente cliente;
    private Produto produto1, produto2, produto3;

    public void adcionarCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void adicionarProduto1(Produto produto){
        this.produto1 = produto1;
    }

    public void adicionarProduto2(Produto produto){
        this.produto2 = produto2;
    }

    public void adicionarProduto3(Produto produto){
        this.produto3 = produto3;
    }

    @Override
    public double calcularImposto() {
        double totalImposto = 0;

        if (produto1 != null) {
            totalImposto += produto1.getPrecoProduto() * produto1.getTaxaImposto() / 100;
        }
        if (produto2 != null) {
            totalImposto += produto2.getPrecoProduto() * produto2.getTaxaImposto() / 100;
        }
        if (produto3 != null) {
            totalImposto += produto3.getPrecoProduto() * produto3.getTaxaImposto() / 100;
        }

        return totalImposto;
    }

    @Override
    public double calcularJuros() {
        double totalJuros = 0;

        if (produto1 != null){
            totalJuros += produto1.getPrecoProduto() * produto1.getTaxaJuros() / 100;
        }
        if (produto2 != null){
            totalJuros += produto2.getPrecoProduto() * produto2.getTaxaJuros() / 100;
        }
        if (produto3 != null){
            totalJuros += produto3.getPrecoProduto() * produto3.getTaxaJuros() / 100;
        }

        return totalJuros;
    }

    @Override
    public double calcularLucro() {
        return 0;
    }

    @Override
    public double calcularDesconto() {
        return 0;
    }

    @Override
    public double calcularTaxaManuseio() {
        return 0;
    }

    @Override
    public double calcularPrecoFinal() {
        return 0;
    }

    @Override
    public double calcularTotal() {
        return 0;
    }
}

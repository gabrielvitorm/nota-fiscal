public final class NotaFiscal extends Cliente implements Calculavel{
    private Cliente cliente;
    private Produto produto1, produto2, produto3;

    public void adicionarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto1(Produto produto){
        this.produto1 = produto;
    }

    public void adicionarProduto2(Produto produto){
        this.produto2 = produto;
    }

    public void adicionarProduto3(Produto produto){
        this.produto3 = produto;
    }

    @Override
    public double calcularImposto() {
        double totalImposto = 0;

        if (produto1 != null) {
            totalImposto += produto1.getPrecoProduto() * produto1.getTaxaImposto() / 100 * produto1.getQtdProduto();
        }
        if (produto2 != null) {
            totalImposto += produto2.getPrecoProduto() * produto2.getTaxaImposto() / 100 * produto2.getQtdProduto();
        }
        if (produto3 != null) {
            totalImposto += produto3.getPrecoProduto() * produto3.getTaxaImposto() / 100 * produto3.getQtdProduto();
        }

        return totalImposto;
    }

    @Override
    public double calcularJuros() {
        double totalJuros = 0;

        if (produto1 != null){
            totalJuros = produto1.getPrecoProduto() * (produto1.getTaxaJuros() / 100);
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
        double totalLucro = 0;

        if (produto1 != null){
            totalLucro += produto1.getPrecoProduto() * produto1.getTaxaLucro() / 100;
        }
        if (produto2 != null){
            totalLucro += produto2.getPrecoProduto() * produto2.getTaxaLucro() / 100;
        }
        if (produto3 != null){
            totalLucro += produto3.getPrecoProduto() * produto3.getTaxaLucro() / 100;
        }

        return totalLucro;
    }

    @Override
    public double calcularDesconto() {
        double totalDesconto = 0;

        if (produto1 != null){
            totalDesconto += produto1.getPrecoProduto() * produto1.getTaxaDesconto() / 100;
        }
        if (produto2 != null){
            totalDesconto += produto2.getPrecoProduto() * produto2.getTaxaDesconto() / 100;
        }
        if (produto3 != null){
            totalDesconto += produto3.getPrecoProduto() * produto3.getTaxaDesconto() / 100;
        }

        return totalDesconto;
    }

    @Override
    public double calcularTaxaManuseio() {
        double totalTaxa = 0;

        totalTaxa = produto1.getTaxaManuseio();
        totalTaxa = produto2.getTaxaManuseio();
        totalTaxa = produto3.getTaxaManuseio();

        return totalTaxa;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = 0;

        if (produto1 != null){
            precoFinal += produto1.getPrecoProduto() * produto1.getQtdProduto();
        }
        if (produto2 != null){
            precoFinal += produto2.getPrecoProduto() * produto2.getQtdProduto();
        }
        if (produto3 != null){
            precoFinal += produto3.getPrecoProduto() * produto3.getQtdProduto();
        }

        return precoFinal;
    }

    @Override
    public double calcularTotal() {
        double precoTotal = 0;

        if (produto1 != null){
            precoTotal += produto1.getPrecoProduto() * produto1.getQtdProduto() + produto1.getTaxaLucro() + produto1.getTaxaImposto() + produto1.getTaxaJuros() + produto1.getTaxaManuseio() - produto1.getTaxaDesconto();
        }
        if (produto2 != null){
            precoTotal += produto2.getPrecoProduto() * produto2.getQtdProduto() + produto2.getTaxaLucro() + produto2.getTaxaImposto() + produto2.getTaxaJuros() + produto2.getTaxaManuseio() - produto2.getTaxaDesconto();
        }
        if (produto3 != null){
            precoTotal += produto3.getPrecoProduto() * produto3.getQtdProduto() + produto3.getTaxaLucro() + produto3.getTaxaImposto() + produto3.getTaxaJuros() + produto3.getTaxaManuseio() - produto3.getTaxaDesconto();
        }

        return precoTotal;
    }

    @Override
    public String toString() {
        return "-------- Nota Fiscal --------\n" +
                "Cliente: " + nomeCliente + "\n" +
                "CPF: " + cpfCliente + "\n\n" +
                "Produtos:\n\n" +
                produto1.toString() + "\n\n" +
                produto2.toString() + "\n\n" +
                produto3.toString() + "\n\n" +
                "Valor Total da Nota: R$ " + calcularTotal() + "\n" +
                "-------------------------------";
    }

}

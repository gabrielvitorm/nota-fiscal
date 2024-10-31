public final class NotaFiscal extends Cliente{
    private Cliente cliente;
    private Produto produto1, produto2, produto3;

    public NotaFiscal(){}

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

    public double calcularValorTotalNota() {
        return produto1.calcularPrecoFinal() + produto2.calcularPrecoFinal() + produto3.calcularPrecoFinal();
    }

    @Override
    public String toString() {
        return String.format(
                "-------- Nota Fiscal --------\n" +
                        "Cliente: %s\n" +
                        "CPF: %s\n" +
                        "----------------------------------------\n" +
                        "Produtos:\n%s%s%s" +
                        "----------------------------------------\n" +
                        "Valor Total da Nota: R$ %.2f\n" +
                        "----------------------------------------\n",
                nomeCliente, cpfCliente,
                produto1.toString(), produto2.toString(), produto3.toString(),
                calcularValorTotalNota()
        );
    }
}

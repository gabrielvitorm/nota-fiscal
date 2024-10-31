public abstract class Cliente {
    protected String nomeCliente;
    protected long cpfCliente;

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void setCpfCliente(long cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", cpfCliente=" + cpfCliente +
                '}';
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotaFiscal nf = new NotaFiscal();
        Produto produto1 = new Produto(10,2,15,5,10);
        Produto produto2 = new Produto(10,2,15,5,10);
        Produto produto3 = new Produto(10,2,15,5,10);

        System.out.println("Digite o nome do cliente");
        nf.setNomeCliente(sc.nextLine());
        System.out.println("Digite o CPF do Cliente");
        nf.setCpfCliente(sc.nextLong());
        nf.adicionarCliente(nf);

        System.out.println("Digite o nome do 1° Produto");
        produto1.setNomeProduto(sc.next());
        System.out.println("Digite a quantidade de produtos");
        produto1.setQtdProduto(sc.nextInt());
        System.out.println("Digite o preço unitário do produto");
        produto1.setPrecoProduto(sc.nextDouble());
        nf.adicionarProduto1(produto1);

        System.out.println("Digite o nome do 2° Produto");
        produto2.setNomeProduto(sc.next());
        System.out.println("Digite a quantidade de produtos");
        produto2.setQtdProduto(sc.nextInt());
        System.out.println("Digite o preço unitário do produto");
        produto2.setPrecoProduto(sc.nextDouble());
        nf.adicionarProduto2(produto2);

        System.out.println("Digite o nome do 3° Produto");
        produto3.setNomeProduto(sc.next());
        System.out.println("Digite a quantidade de produtos");
        produto3.setQtdProduto(sc.nextInt());
        System.out.println("Digite o preço unitário do produto");
        produto3.setPrecoProduto(sc.nextDouble());
        nf.adicionarProduto3(produto3);

        System.out.println(nf);
    }
}
import java.util.Scanner;

public class Product {
    private String codigo;
    private String nome;
    private double valor;

    public Product(String codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}

public class Name2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Product[] produtos = {
                new Product("001", "Banana", 50.0),
                new Product("002", "Roda BBS", 2000.0),
                new Product("003", "Coca Cola", 32.0),
                new Product("004", "Pão", 8.50)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Código do produto: ");
        String codigoProduto = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        Product produtoEncontrado = null;
        for (Product produto : produtos) {
            if (produto.getCodigo().equals(codigoProduto)) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            String nomeProduto = produtoEncontrado.getNome();
            double valorProduto = produtoEncontrado.getValor();
            double valorTotal = valorProduto * quantidade;
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Valor: " + valorProduto);
            System.out.println("Valor Total: " + valorTotal);
        } else {
            System.out.println("Código de produto inválido");
        }
    }
}

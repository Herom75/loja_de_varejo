import java.time.LocalDate;
import java.time.Month;

public class varejo{
    public static void main(String[] args) {
        cliente daniel = new cliente();
        daniel.getNome();
        daniel.setDinheiro(150f);
        daniel.getIdade();
        daniel.setTelefone("00 9 8765-4321");
        daniel.getCpf();
        daniel.setEmail("dan@gmail.com");

        daniel.daniel();

        System.out.println(daniel.daniel());

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        fornecedor ricardo = new fornecedor();
        ricardo.getNome();
        ricardo.setProdutos("Coca-Cola");
        ricardo.getCpf();
        ricardo.setTelefone("11 2 3456-7890");
        ricardo.getEmpresa();
        ricardo.setSalario(1500f);

        ricardo.ricardoBarbosa();

        System.out.println(ricardo.ricardoBarbosa());

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        
        produto cocacola = new produto();
        cocacola.setPreco(8.99f);
        cocacola.getNome();
        cocacola.getCategoria();
        cocacola.setValidade(LocalDate.of(2015,Month.JUNE, 2));
        cocacola.setFabricacao(LocalDate.of(2015,Month.MAY, 01));
        cocacola.getMarca();

        cocacola.cocaCola();

        System.out.println(cocacola.cocaCola());

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        
        transportadora transveco = new transportadora();
        transveco.getNome();
        transveco.setCarga("Coca-Cola");
        transveco.getClass();
        transveco.getCnpj();
        transveco.getEmail();
        transveco.setRota("varejo");
        transveco.setTelefone("00 1 9283-7465");
        
        transveco.getTransporte();
        
        System.out.println(transveco.getTransporte());
        
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        

        vendedor andre = new vendedor();
        andre.nome = "andre da silva";
        andre.salario = (float)1200.0;
        andre.funcao = "repositor de estoque";
        andre.idade = LocalDate.of(1997,Month.JANUARY, 12);
        andre.cpf = "654.213.798.00";
        andre.telefone = "01 2 9876-5430";
        andre.email = "silva@gmial.com";
        
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        
        venda estoque = new venda();
        estoque.produto = "Coca-Cola";
        estoque.quantidade = (int)150; // mes
        estoque.gastos = (float)1340.70; // mes
        estoque.lucros = (float)1780.20; // mes

        
        
        
        }
}

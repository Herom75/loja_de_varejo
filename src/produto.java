import java.time.LocalDate;

public class produto {
    private float preco; // 8.99
    private String nome; // coca cola
    private String categoria; // bebida
    private LocalDate validade; // 20.05.2015
    private LocalDate fabricacao; // 01.05;20015
    private String marca; // razer

    public String cocaCola() {
        return String.format("dados do produto:\nnome:%s\nmarca:%s\ncategoria:%s\npreço:%s\nvalidade:%s\nfabricação:%s",this.nome,this.marca,this.categoria,this.preco,this.validade,this.fabricacao);
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return this.nome = "Coca-Cola";
    }

    

    public String getCategoria() {
        return this.categoria = "Bebida";
    }

    

    

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    

    public void setFabricacao(LocalDate fabricacao) {
        this.fabricacao = fabricacao;
    }

    public String getMarca() {
        return this.marca = "Razer";
    }

    
}

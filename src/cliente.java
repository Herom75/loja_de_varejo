import java.time.LocalDate;
import java.time.Month;

public class cliente {
    private String nome; // daniel macedo
    private Float dinheiro; // 15 R$
    private LocalDate idade; // 2005,feb,16
    private String telefone; // 00 9 8765-4321
    private String cpf; // 876.123.456.09
    private String email; // dan@gmail.com

    public String daniel() {
        return String.format("dados do cliente:\nnome:%s\nidade:%s\ncpf:%s\nemail:%s\ntelefone:%s\nsaldo:%s R$",this.nome,this.idade,this.cpf,this.email,this.telefone,this.dinheiro);
    }
    
    public String getNome() {
        return this.nome = "Daniel Macedo";
    }

    public void setDinheiro(Float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public LocalDate getIdade() {
        return idade=LocalDate.of(2005,Month.FEBRUARY, 16);
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return this.cpf = "876.123.456.09";
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

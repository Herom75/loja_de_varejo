import java.time.LocalDate;

public class vendedor {
    public float salario; // 1200 R$
    public String funcao; // repositor de estoque
    public String nome; // andre da silva
    public LocalDate idade; // 1997.jan.12
    public String cpf; // 654.213.798.00
    public String telefone; // 01 2 9876-5430
    public String email; // silva@gmail.com

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIdade() {
        return this.idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
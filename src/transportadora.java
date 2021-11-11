public class transportadora {
    private String nome; // transveco
    private String rota; // varejo
    private String cnpj; // 09.876.543/2109-87
    private String carga; // coca cola
    private String email; // trans@gmail.com 
    private String telefone; // 00 1 9283-7465

    public String getTransporte() {
        return String.format("dados da transportadora:\nnome:%s\ncnpj:%s\nemail:%s\ntelefone:%s\ncarga:%s\nrota:%s", this.nome,this.cnpj,this.email,this.telefone,this.carga,this.rota);
    }

    public String getNome() {
        return this.nome = "Transveco";
    }


    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getCnpj() {
        return this.cnpj = "09.876.543/2109-87";
    }


    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getEmail() {
        return this.email = "trans@gmail.com";
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    }

    
    

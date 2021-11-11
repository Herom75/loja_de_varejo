public class fornecedor {
   private String nome; // ricardo barbosa
   private String produtos; // coca-cola
   private String cpf; // 12.345.678/9101-23
   private String telefone; //  11 2 3456-7890
   private String empresa; // razer
   private Float salario; //  1500.00

   public String ricardoBarbosa() {
      return String.format("dados do fornecedor:\nnome:%s\ncpf:%s\ntelefone:%s\nempresa:%s\nproduto:%s\nsalario:%s R$",this.nome,this.cpf,this.telefone,this.empresa,this.produtos,this.salario);
   }

   public String getNome() {
      return this.nome = "Ricardo Barbosa";
   }

   public void setProdutos(String produtos) {
      this.produtos = produtos;
   }

   public String getCpf() {
      return this.cpf = "456.123.789.54";
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   public String getEmpresa() {
      return this.empresa = "Razer";
   }

   public void setSalario(Float salario) {
      this.salario = salario;
   }
}

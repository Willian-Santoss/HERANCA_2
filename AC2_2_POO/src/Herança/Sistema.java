package Herança;

//Classe que contém os atributos compartilhados por outras classes
class Dados {
 // Atributos compartilhados
 private String nome;
 private String cpf;
 private String dataNasc;
 
 // Construtor para inicializar os atributos
 public Dados(String nome, String cpf, String dataNasc) {
     this.nome = nome;
     this.cpf = cpf;
     this.dataNasc = dataNasc;
 }
 
 // Métodos getters e setters para chamar e alterar os valores dos atributos
 public String getNome() {
     return nome;
 }

 public String getCpf() {
     return cpf;
 }
 
 public String getDataNasc() {
     return dataNasc;
 }
 
 public void setNome(String nome) {
     this.nome = nome;
 }

 public void setCpf(String cpf) {
     this.cpf = cpf;
 }

 public void setDataNasc(String dataNasc) {
     this.dataNasc = dataNasc;
 }

 // Método que retorna as informações em comum
 public String informacoes() {
     return " Nome: " + nome + "\n CPF: " + cpf + " \n Data de nascimento: " + dataNasc;
 }
}

class Vendedor extends Dados { //Classe 'Funcionario' que herda atributos da superclasse e adiciona atributos exclusivos
	 // Atributos exclusivos
	 private String dataContratacao;
	 private float salarioBase;
	 private double comissao;

	 public Vendedor(String nome, String cpf, String dataNasc, String dataContratacao, float salarioBase, double comissao) { // Construtor 'Funcionario' para inicializar os atributos
	     super(nome, cpf, dataNasc);
	     this.dataContratacao = dataContratacao;
	     this.salarioBase = salarioBase;
	     this.comissao = comissao;
	 }

	//Métodos getters e setters para chamar e alterar os valores dos atributos
	 public String getDataContratacao() {
	     return dataContratacao;
	 }

	 public float getSalaBase() {
	     return salarioBase;
	 }
	 
	 public double getComissao() {
	     return comissao;
	 }
	 
	 public void setDataContratacao(String dataContratacao) {
	     this.dataContratacao = dataContratacao;
	 }

	 public void setSalarioBase(float salarioBase) {
	     this.salarioBase = salarioBase;
	 }

	 public void setComissao(double comissao) {
	     this.comissao = comissao;
	 }

	 @Override
	 public String informacoes() { // Método para exibir as informações completas do vendedor
	     return super.informacoes() + "\n Data de Contratação: " + dataContratacao + "\n Salário Base: " + salarioBase + "\n Comissão: " + comissao + "%";
	 }
	}

class Gerente extends Dados { //Classe 'Gerente' que herda de 'Dados' e adiciona os atributos dataContrataco, salarioBase e departamento
 // Atributos exclusivos de Gerente
 private String dataContratacao;
 private float salarioBase;
 private String departamento;

 public Gerente(String nome, String cpf, String dataNasc, String dataContratacao, float salarioBase, String departamento) { // Construtor 'Gerente' para inicializar os atributos
     super(nome, cpf, dataNasc);
     this.dataContratacao = dataContratacao;
     this.salarioBase = salarioBase;
     this.departamento = departamento;
 }

 //Métodos getters e setters para chamar e alterar os valores dos atributos
 public String getDataContratacao() {
     return dataContratacao;
 }
 
 public float getSalarioBase() {
     return salarioBase;
 }

 public void setDataContratacao(String dataContratacao) {
     this.dataContratacao = dataContratacao;
 }

 public void setSalarioBase(float salarioBase) {
     this.salarioBase = salarioBase;
 }

 public void setDepartamento(String departamento) {
     this.departamento = departamento;
 }

 @Override
 public String informacoes() { // Método para exibir as informações completas do gerente
     return super.informacoes() + "\n Data de Contratação: " + dataContratacao + "\n Salário Base: " + salarioBase + "\n Departamento: " + departamento;
 }
}

class Cliente extends Dados { //Classe 'Consumidor' que herda atributos da superclasse e adiciona atributos exclusivos
 // Atributos exclusivos
 private String email;
 private String cartaoFidelidade;
 private String telefone;

 public Cliente(String nome, String cpf, String dataNasc, String email, String cartaoFidelidade, String telefone) { // Construtor 'Consumidor para inicializar os atributos
     super(nome, cpf, dataNasc);
     this.email = email;
     this.cartaoFidelidade = cartaoFidelidade;
     this.telefone = telefone;
 }

 //Métodos getters e setters para chamar e alterar os valores dos atributos
 public String getEmail() {
     return email;
 }

 public String getTelefone() {
     return telefone;
 }
 
 public String getCartaoFidelidade() {
     return cartaoFidelidade;
 }
 
 public void setEmail(String email) {
     this.email = email;
 }

 public void setCartaoFidelidade(String cartaoFidelidade) {
     this.cartaoFidelidade = cartaoFidelidade;
 }

 public void setTelefone(String telefone) {
     this.telefone = telefone;
 }

 @Override
 public String informacoes() { // Método para exibir as informações completas do cliente
     return super.informacoes() + "\n E-mail: " + email + "\n Cartão: " + cartaoFidelidade + " \n Telefone: " + telefone;
 }
}

public class Sistema { // Classe principal para apresentar e exibir no console as informações criadas nas classes
 public static void main(String[] args) {
     // Criando instâncias com valores atribuídos
	 Vendedor v1 = new Vendedor("Lucas", "123.456.789-00", "12/05/1987", "20/01/2021", 3200f, 6);
	 Gerente g1 = new Gerente("Fernanda", "444.555.666-77", "15/11/1980", "05/03/2019", 5500f, "Vendas");
	 Cliente c1 = new Cliente("Aryeli", "888.777.666-55", "30/04/1995", "aryeli@gmail.com", "1234 5678 9101 1121", "15 98762-5432");
     
     // Exibindo as informações formatadas de cada instância
     System.out.println(v1.informacoes());
     System.out.println(" ");
     System.out.println(g1.informacoes());
     System.out.println(" ");
     System.out.println(c1.informacoes());
 }
}
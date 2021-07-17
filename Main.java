class Main {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    cliente1.nome = "Marcos Camargo";
    cliente1.codigo = 1;
    System.out.println("Dados do primeiro cliente");
    System.out.println("Nome: " + cliente1.nome);
    System.out.println("Código: " + cliente1.codigo);
    System.out.println("____________________________\n");

    System.out.println("Teste Cartão de Credito");
    CartaoDeCredito cartao1 = new CartaoDeCredito();
    cartao1.numero = 1111111;
    cartao1.dataDeValidade = "15/06/2025";
    System.out.println("Numero do Cartão: " + cartao1.numero);
    System.out.println("Data de Validade: " +  cartao1.dataDeValidade);
    System.out.println("____________________________\n");
    System.out.println("Teste Agencia");
    Agencia agencia1 = new Agencia();
    agencia1.numero = 1;
    System.out.println("Número da Agencia: " + agencia1.numero);
    System.out.println("____________________________\n");
    System.out.println("Teste da Conta");
    Conta conta1 = new Conta();
    conta1.numero = 11;
    conta1.saldo = 3000;
    conta1.limite = 500;
    System.out.println("Numero ds Conta: " + conta1.numero);
    System.out.println("Saldo da Conta: " +  conta1.saldo);
    System.out.println("Limite da Conta: " +  conta1.limite);
    System.out.println("____________________________\n");
    System.out.println("Teste Cliente e Cartão");
    System.out.println("Cliente 2");
    Cliente cliente2 = new Cliente();
    cliente2.nome = "Messias Santos";
    cliente2.codigo = 2;
    System.out.println("Nome: " + cliente2.nome);
    System.out.println("Código: " + cliente2.codigo);
    System.out.println("____________________________\n");
    System.out.println("Teste Cartão de Credito 2");
    CartaoDeCredito cartao2 = new CartaoDeCredito();
    cartao2.numero = 2222222;
    cartao2.dataDeValidade = "05/06/2026";
    System.out.println("Numero do Cartão: " + cartao2.numero);
    System.out.println("Data de Validade: " +  cartao2.dataDeValidade);
    System.out.println("____________________________\n");
    cartao2.cliente = cliente2;
    System.out.println("Dados do cliente obtidos através do cartão");
    System.out.println("Nome do Cliente: " + cartao2.cliente.nome);
    System.out.println("Código do Cliente: " +  cartao2.cliente.codigo);
    System.out.println("____________________________\n");
    System.out.println("Teste da Conta 2 ");
    Conta conta2 = new Conta();
    conta2.numero = 22;
    conta2.saldo = 3500;
    conta2.limite = 750;
    System.out.println("Numero ds Conta: " + conta2.numero);
    System.out.println("Saldo da Conta: " +  conta2.saldo);
    System.out.println("Limite da Conta: " +  conta2.limite);
    System.out.println("____________________________\n");
    System.out.println("Teste agencia 2");
    Agencia agencia2 = new Agencia();
    agencia2.numero = 2;
    System.out.println("Número da Agencia: " + agencia2.numero);
    System.out.println("Dados do cliente obtidos através da conta");
    conta2.agencia = agencia2;
    System.out.println("Número da Agencia: " + conta2.agencia.numero);


 

  }
}
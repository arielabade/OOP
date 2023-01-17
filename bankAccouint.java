class Main {
  public static void main(String[] args) {
    class Account {

      //cria o objeto e executa algumas mudanças
      
      private double balance; //objeto balance

      //construtor: iniciação do objeto sem retorno
      public Account(double init_deposit) {
        balance = init_deposit; //inicializa o objeto com o depósito inicial
      }
      public Account() {
        // 0 by default
      }

      public void depositFunds(double amount)  {
      // método que age sobre o objeton e deposita dinheiro
        balance = balance + amount; //modifica o objeto com a adição de dinheiro
      
    }
      public double getBalance() {
        return balance; //retorna o estado atual do balance, com o deposito
      }

      public double withdrawFunds(double amount) {
        if(amount > balance) {
          amount = balance; //saca só até ter dinheiro na fconta
        }

        balance = balance - amount;
        return amount; 
      } 
  }
  }}

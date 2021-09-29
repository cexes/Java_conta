import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ContaPoupanca cp = new ContaPoupanca();
  do{
  System.out.println("\nCadastro em Conta Poupança \n");
 System.out.print("Numero da Conta :");
cp.numeroConta = input.nextInt();
 if (cp.numeroConta != 0){
 System.out.print("Numero do Cliente :");
 cp.numeroCliente = input.nextInt();
 System.out.print("Data de Abertura :");
 cp.dataAbertura = input.next();
 System.out.print("Datas de Aniversários :");
 input.nextLine();
  cp.datasAniversarios = input.nextLine();
  System.out.print("Valor do depósito :"); 
    cp.depositoConta( input.nextDouble() );
   System.out.println("o saldo é " + cp.saldo);
   System.out.print("Valor do saque :");
  cp.saqueConta( input.nextDouble() );
 System.out.println("o saldo é " + cp.saldo);

 ContaCorrente cc = new ContaCorrente();
 System.out.println("\n\nCadastro em Conta Corrrente \n");
 System.out.print("Numero da Conta :");
 cc.numeroConta = input.nextInt();
 System.out.print("Numero do Cliente :");
 cc.numeroCliente = input.nextInt();
 System.out.print("Data de Abertura :");
 cc.dataAbertura = input.next();
 System.out.print("Código do Gerente :");
 cc.gerente = input.nextInt();
 System.out.print("Limite de Crédito :");
 cc.limite = input.nextDouble();
 System.out.print("Taxa mensal :");
 cc.taxaMensal = input.nextDouble();
 System.out.print("Valor do depósito :");
 cc.depositoConta( input.nextDouble() );
 System.out.println("o saldo é " + cc.saldo);
 System.out.print("Valor do saque :");
 cc.saqueConta( input.nextDouble() );
 System.out.println("o saldo é " + cc.saldo);
}
 }while(cp.numeroConta != 0);
 input.close();
 }
 }

    


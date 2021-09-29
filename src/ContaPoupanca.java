public class ContaPoupanca extends Conta{
    
String datasAniversarios;

   void saqueConta(double valor){
       if((saldo - valor)<0){
            System.out.println("ERRO: Saldo ficaria a baixo de 0.00");}
             else{ saldo = saldo - valor;}
            
       
   }


}

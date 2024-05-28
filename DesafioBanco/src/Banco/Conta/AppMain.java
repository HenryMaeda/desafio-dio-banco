package Banco.Conta;

public class AppMain {
    public static void main(String[] args) {
        Cliente Henry = new Cliente() ; 
        Henry.setNome("Henry");
        Cliente Jorge = new Cliente() ; 
        Jorge.setNome("Jorge");



        Conta cc = new ContaCorrente(Henry) ; 
        Conta poupanca = new ContaPoupanca(Henry) ; 
        Conta cc2 = new ContaCorrente(Jorge) ; 


        cc.depositar(300) ; 
        cc.sacar(100) ; 
        cc.transferir(50, poupanca);
        cc.transferir(30, cc2);

        cc.imprimirExtrato(); 
        poupanca.depositar(20);
        poupanca.imprimirExtrato(); 
        cc2.imprimirExtrato();
    }

}

package Banco.Conta;

public class ContaCorrente extends Conta {
    
    public ContaCorrente (Cliente cliente) {
        super(cliente) ; 
    }

    public void imprimirExtrato() {
        System.out.println("-- Extrato da Conta Corrente --");
        super.imprimirInfosConta();  
    }
}

package Banco.Conta;

public abstract class Conta implements InterfaceConta {
    
    private static final int AGENCIA = 1 ; 
    private static int SEQUENCIAL = 1 ; 
    protected int agencia ; 
    protected int numeroConta ; 
    protected double saldo ; 
    protected Cliente cliente ; 

    public Conta (Cliente cliente) {
        this.agencia = Conta.AGENCIA ; 
        this.numeroConta = SEQUENCIAL ++ ; 
        this.cliente = cliente ; 
    }

    public void sacar (double valor)  {
        if (saldo < valor ) {
            System.out.println("Saldo insuficiente para saque");
        }
        else {
            saldo -= valor ; 
        }
    }
    
    public void depositar (double valor)  {
        saldo += valor ; 
    }

    public void transferir (double valor , Conta destinoConta )  {
        this.sacar(valor);
        if (saldo > valor) destinoConta.depositar(valor);
    }

    public void imprimirInfosConta () {
        System.out.println("-- Dono da conta -> " + this.cliente.getNome() + " --" );
        System.out.println("-- Agencia = " + agencia + " --" );
        System.out.println("-- Numero da Conta = " + numeroConta + " --" );
        System.out.println("-- Saldo = " + saldo + " --" );
    }

}

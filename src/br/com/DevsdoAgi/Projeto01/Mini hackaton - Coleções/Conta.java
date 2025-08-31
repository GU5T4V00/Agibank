import java.util.ArrayList;
import java.util.List;

public class Conta {
        private int numero;
        private Cliente titular;
        private double saldo;
        private List<Transacao> extrato;

        public Conta(int numero, Cliente titular) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = 0;
            this.extrato = new ArrayList<>();
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }
        public int getNumero() { return numero;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public double getSaldo() { return saldo;
        }

        // Dicas para os métodos a implementar:
        // - depositar(double valor): adicionar ao saldo, registrar transação
        // - sacar(double valor): verificar saldo, subtrair valor, registrar transação
        // - transferir(double valor, Conta destino): verificar saldo, atualizar saldos, registrar transações em ambas contas
        // - mostrarExtrato(): percorrer lista de transações e imprimir

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            extrato.add(new Transacao("Depósito", valor, numero, numero));
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            extrato.add(new Transacao("Saque", valor, numero, numero));
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.saldo += valor;
            // Registrar em ambas as contas
            this.extrato.add(new Transacao("Transferência Enviada", valor, numero, destino.numero));
            destino.extrato.add(new Transacao("Transferência Recebida", valor, numero, destino.numero));
            return true;
        }
        return false;
    }

    public void mostrarExtrato() {
        System.out.println("\n=== Extrato da Conta " + numero + " ===");
        for (Transacao t : extrato) {
            System.out.println(t);
        }
    }
}

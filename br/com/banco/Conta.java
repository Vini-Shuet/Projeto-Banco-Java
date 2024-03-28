package br.com.banco;

import java.util.Date;
import javax.swing.JOptionPane;

public class Conta {

	Cliente cliente;
	long numeroConta;
	double saldo;
	
	Date dataAbertura = new Date();
	public Conta(Cliente cliente, long numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
	}
	
	//metodos
	
	//sacar
	public boolean sacar (double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		System.out.println("Valor insuficiente para sacar");
		return false;
	}
	
	//depositar
	public void depositar (double valor) {
		this.saldo += valor;
	}
	//transferir
	public void transferir (double valor, Conta conta) {
		if(this.sacar(valor)) {
			conta.depositar(valor);
		}
	}
	//exibirSaldo
	public void exibirSaldo() {
		JOptionPane.showMessageDialog(null, "Cliente: " + this.cliente.getNome());
		JOptionPane.showMessageDialog(null, "Cliente desde: " + this.dataAbertura);
		JOptionPane.showMessageDialog(null, "Data Nascimento: " + this.cliente.getDataNascimento());
		JOptionPane.showMessageDialog(null, "Saldo: " + this.saldo);
	}
	
}

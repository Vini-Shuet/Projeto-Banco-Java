package br.com.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Executavel {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dataFormatada = new SimpleDateFormat("ddMMyyyy");
		Date dataVinicius = dataFormatada.parse("27012005");
		Date dataLeia = dataFormatada.parse("13011978");
		Date dataAdilson = dataFormatada.parse("27081970");
		Date dataIsabela = dataFormatada.parse("16032010");
		
		Cliente vinicius = new Cliente("Vinicius", "Perto", dataVinicius);
		Conta contaVinicius = new Conta(vinicius, 3);
		
		Cliente leia = new Cliente("Léia", "La mesmo", dataLeia);
		Conta contaLeia = new Conta(leia, 2);
		
		Cliente adilson = new Cliente("Adilson", "Perto", dataAdilson);
		Conta contaAdilson = new Conta(adilson, 1);
		
		Cliente isabela = new Cliente("Isabela", "La mesmo", dataIsabela);
		Conta contaIsabela = new Conta(isabela, 4);

		
		contaVinicius.exibirSaldo();
		contaVinicius.depositar(100);
		contaVinicius.exibirSaldo();
		
		contaAdilson.depositar(200);
		contaAdilson.transferir(25, contaLeia);
		contaAdilson.exibirSaldo();
		contaLeia.exibirSaldo();
		
		contaLeia.sacar(10);
		contaLeia.exibirSaldo();
	}

}

package br.com.fiap.bean.exercicios3004;

import java.time.LocalDate;

public class Garcom extends Funcionario{
	private float gorjeta;

	public Garcom() {}

	public Garcom(String nome, LocalDate dataNasc, float valorHoraTrabalho, float gorjeta) {
		super.setNome(nome);
		super.setDataNasc(dataNasc);
		super.setValorHoraTrabalho(valorHoraTrabalho);
		this.gorjeta = gorjeta;
	}

	public float getGorjeta() {
		return gorjeta;
	}

	public void setGorjeta(float gorjeta) {
		this.gorjeta = gorjeta;
	};
	
	public float calculaSalario() {
		float salario = (super.getValorHoraTrabalho() * 40) * 4 + gorjeta;
		return salario;
	}
}

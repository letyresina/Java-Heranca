package br.com.fiap.bean;

public class VigiaNoturno extends Funcionario{
	private float adicionalNoturno;

	public VigiaNoturno(float salario, float adicionalNoturno) {
		super.setValorHoraTrabalho(salario);
		this.adicionalNoturno = adicionalNoturno;
	}
	
	
}

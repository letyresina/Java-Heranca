package br.com.fiap.bean.exercicios3004;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Funcionario {
	private String nome;
	private LocalDate dataNasc;
	private float valorHoraTrabalho;
	
	public Funcionario() {};
	
	public Funcionario(String nome, LocalDate dataNasc, float valorHoraTrabalho) {
		this.nome = nome;
		setDataNasc(dataNasc);
		this.valorHoraTrabalho = valorHoraTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		LocalDate minimo = LocalDate.parse("1900-01-01");
		LocalDate dataAtual = LocalDate.now(); // Pega a data atual do sistema
        try {
            if (dataNasc.isAfter(minimo) && dataNasc.isBefore(dataAtual)) {
                this.dataNasc = dataNasc; 
            } else {
                throw new Exception("Data fora da faixa permitida (01/01/1900" + " - " 
                		+ dataAtual.getDayOfMonth() +"/0"+dataAtual.getMonthValue()+"/"
                		+dataAtual.getYear()+ ")");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
	}

	public float getValorHoraTrabalho() {
		return valorHoraTrabalho;
	}

	public void setValorHoraTrabalho(float valorHoraTrabalho) {
		this.valorHoraTrabalho = valorHoraTrabalho;
	}

	public float calculaSalario() {
		float salario = (valorHoraTrabalho * 40) * 4;
		return salario;
	}
	
	 public int calculaIdade() {
		 LocalDate dataAtual = LocalDate.now();
         Period periodo = Period.between(dataNasc, dataAtual);
         
         int idade = periodo.getYears();

         return idade;
     }
}

package br.com.fiap.main.exercicios3004;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.com.fiap.bean.exercicios3004.Funcionario;
import br.com.fiap.bean.exercicios3004.Garcom;
import br.com.fiap.bean.exercicios3004.Gerente;

public class Principal {

	public static void main(String[] args) {
		String escolha = "sim";
		int opcao,  idade;
		String nome;
		float valorHoraTrabalho, gorjeta, bonus, salario;
		LocalDate dataNasc;
		
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de funcionário deseja calcular o salário?"
						+ "\n1 - Funcionário Padrão; \n2 - Garçom; \n3 - Gerente."));

				switch (opcao) {
				case 1: {
					Funcionario func;
					nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
					dataNasc = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento do funcionário"));
					valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das horas trabalhadas"));
					func = new Funcionario(nome, dataNasc, valorHoraTrabalho);
					salario = func.calculaSalario();
					idade = func.calculaIdade();
					JOptionPane.showMessageDialog(null, "Dados do funcionário \nNome: " + func.getNome() + "\nIdade: " + idade
							+ "\nSalário: " + salario);
					break;
				}
				
				case 2: {
					Garcom garcom2;
					nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
					dataNasc = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento do funcionário"));
					valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das horas trabalhadas"));
					gorjeta = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor recebido de gorjeta"));
					garcom2 = new Garcom(nome, dataNasc, valorHoraTrabalho, gorjeta);
					salario = garcom2.calculaSalario();
					idade = garcom2.calculaIdade();
					JOptionPane.showMessageDialog(null, "Dados do garçom \nNome: " + garcom2.getNome() + "\nIdade: " + idade
							+ "\nSalário: " + salario);
					break;
				}
				
				case 3: {
					Gerente gerente2;
					nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
					dataNasc = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento do funcionário"));
					valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das horas trabalhadas"));
					bonus = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor recebido de bônus"));
					gerente2 = new Gerente(nome, dataNasc, valorHoraTrabalho, bonus);
					salario = gerente2.calculaSalario();
					idade = gerente2.calculaIdade();
					JOptionPane.showMessageDialog(null, "Dados do garçom \nNome: " + gerente2.getNome() + "\nIdade: " + idade
							+ "\nSalário: " + salario);
					break;
				}
				
				default:
					throw new Exception("Escolha incorreta.");
				}
				
				escolha = JOptionPane.showInputDialog("Deseja continuar? sim ou nao?");
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}

}

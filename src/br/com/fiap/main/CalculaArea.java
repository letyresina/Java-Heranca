package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

public class CalculaArea {
	public static void main(String[] args) {
		String aux, escolha = "sim";
		float area, lado, altura;
		int opcao;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Qual área deseja calcular?"
						+ "\n1 - Quadrado \n2 - Retângulo \n3 - Triângulo");
				
				opcao = Integer.parseInt(aux);
				
				switch (opcao) {
				case 1: {
					Quadrado quad;
					aux = JOptionPane.showInputDialog("Digite o valor do lado");
					lado = Float.parseFloat(aux);
					quad = new Quadrado(lado);
					area = quad.calculaArea();
					JOptionPane.showMessageDialog(null, "Área do quadrado: " + area);
					break;
				}
				case 2: {
					Retangulo ret;
					aux = JOptionPane.showInputDialog("Digite o valor do lado");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor da altura");
					altura = Float.parseFloat(aux);
					ret = new Retangulo(lado, altura);
					area = ret.calculaArea();
					JOptionPane.showMessageDialog(null, "Área do retângulo: " + area);
					break;
				}
				case 3: {
					Triangulo tri;
					aux = JOptionPane.showInputDialog("Digite o valor do lado");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor da altura");
					altura = Float.parseFloat(aux);
					tri = new Triangulo(lado, altura);
					area = tri.calculaArea();
					JOptionPane.showMessageDialog(null, "Área do retângulo: " + area);
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
		JOptionPane.showMessageDialog(null, "Encerrando...");
	}
}

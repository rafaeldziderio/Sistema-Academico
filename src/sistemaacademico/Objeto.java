package sistemaacademico;

import javax.swing.JOptionPane;

public class Objeto {
	
	public static void main(String[] args) {
		String nome;
		
		nome = JOptionPane.showInputDialog("Digite o nome: "); //Esse l� o que for digitado em formato string
		JOptionPane.showMessageDialog(null, "Nome digitado: " + nome, "Mostrar o nome digitado", 1); //este s� imprimi uma mensagem na tela
		
		int codigo;
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ")); //Faz a convers�o de String para inteiro
		JOptionPane.showMessageDialog(null, "Inteiro digitado: " + codigo, "Usar inteiro", 2);  //IMPRIMI NORMAL
		
		//dentro do JOptionane.showMENSAGEDIALOG tem  um numero la no final, esse numero � s� pra mudar o simbolo que aparece la na tela 
	}
}

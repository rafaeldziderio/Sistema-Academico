package sistemaacademico;

import javax.swing.JOptionPane;

public class Objeto {
	
	public static void main(String[] args) {
		String nome;
		
		nome = JOptionPane.showInputDialog("Digite o nome: "); //Esse lê o que for digitado em formato string
		JOptionPane.showMessageDialog(null, "Nome digitado: " + nome, "Mostrar o nome digitado", 1); //este só imprimi uma mensagem na tela
		
		int codigo;
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ")); //Faz a conversão de String para inteiro
		JOptionPane.showMessageDialog(null, "Inteiro digitado: " + codigo, "Usar inteiro", 2);  //IMPRIMI NORMAL
		
		//dentro do JOptionane.showMENSAGEDIALOG tem  um numero la no final, esse numero é só pra mudar o simbolo que aparece la na tela 
	}
}

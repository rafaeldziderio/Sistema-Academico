package sistemaacademico;

import java.sql.Date;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Academico extends Pessoa {
    private long matricula;
    private int situacaoAcademica;
    
    public Academico(long matricula, int situacaoAcademica, DocumentoIdentificacao documento
    		, String prenome , String sobrenome, Date dataNascimento, long municipioNascimento
    		, int ufNascimento, int paisNascimento, int estadoCivil, Endereco endereco, Telefone telefoneResidencial
    		, Telefone telefoneComercial, Telefone telefoneAlternativo, Email emailPessoal, Email emailComercial, Email emailAlternativo)
    {
    	this.matricula = matricula;
    	this.situacaoAcademica = situacaoAcademica;
    }
    
    public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public int getSituacaoAcademica() {
		return situacaoAcademica;
	}

	public void setSituacaoAcademica(int situacaoAcademica) {
		this.situacaoAcademica = situacaoAcademica;
	}

	public void cadastrar() {
		UnidadesFederativas UF = new UnidadesFederativas();
				int escolha = 0;
				String nome = "";
				long matricula=0;
				boolean a = true;
				
				while(a) {
					try {
						matricula =Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matrícula: "));
						break;
						
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite uma matrícula válida!");
						
					}
				}
				JOptionPane.showMessageDialog(null,matricula);
				this.matricula = matricula;
				
				while(a) {
					int z = 0;
					nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
					for(int i = 0; i < nome.length(); i++)
					{
						char x = nome.charAt(i);
						for(int j = 0; j < 10; j++)
						{
							if( x == j )
							{
								z++;
							}
						}
					}
					if(z == 0)
					{
						break;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Digite um nome válido!");
					}
					
		
				}
				JOptionPane.showMessageDialog(null,nome);
					
				while(a) {	
					try {
						escolha = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre as unidades a seguir a partir do CODIGO: \n" + UF.imprimirUF()));
						if(escolha<0 || escolha>27) {
							JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
						}
						else
							break;
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
					}
				}
				JOptionPane.showMessageDialog(null,(UF.getUfs(escolha).getDescricaoCompleta()));
				academico.
    }

    public void alterar(DocumentoIdentificacao documento) {
        
    }

    public void excluir(DocumentoIdentificacao documento) {
    
    }

    public Pessoa consultar(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
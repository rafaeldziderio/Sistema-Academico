package sistemaacademico;

import java.util.ArrayList;

public class ArrayAcademico {
	private ArrayList <Academico> academicos = new ArrayList<Academico>();
	
	public void cadastrarAcademico(long matricula, int situacaoAcademica, Pessoa pessoa) {
		Academico academico = new Academico(matricula, situacaoAcademica, pessoa);
		academicos.add(academico);
	}
	
}

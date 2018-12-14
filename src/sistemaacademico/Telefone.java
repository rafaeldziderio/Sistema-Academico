package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Telefone
* Objetivo...: Representar um número de telefone qualquer.
* Observacoes:
*/
public class Telefone {
    String tipo;
    String classe;
    int ddi;
    int ddd;
    long numero;
    int ramal;
	
    public Telefone(int tipo, int classe, int ddi, int ddd, long numero, int ramal) {
    	TiposTelefones t = new TiposTelefones();
    	ClassesTelefones c = new ClassesTelefones();
		this.tipo = t.tipoT(tipo);
		this.classe = c.classe(classe);
		this.ddi = ddi;
		this.ddd = ddd;
		this.numero = numero;
		this.ramal = ramal;
    }
	
	public String toString() {
		return ("Tipo: " + tipo + ";\nClasse: " + classe + ";\nDDI: +" + ddi + ";\nDDD: (" + ddd + ");\nNumero: "
				+ numero + "\nRamal : " + ramal);
	}
    
}
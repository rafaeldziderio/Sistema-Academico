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
    int tipo;
    int classe;
    int ddi;
    int ddd;
    int numero;
    int ramal;
	
    public Telefone(int tipo, int classe, int ddi, int ddd, int numero, int ramal) {
		this.tipo = tipo;
		this.classe = classe;
		this.ddi = ddi;
		this.ddd = ddd;
		this.numero = numero;
		this.ramal = ramal;
    }
	
	public String toString() {
		return ("Tipo: " + tipo + ";\nClasse: " + classe + ";\nDDI: " + ddi + ";\nDDD: " + ddd + ";\nNumero: "
				+ numero + "Ramal : " + ramal);
	}
    
}

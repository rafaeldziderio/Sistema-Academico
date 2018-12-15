package sistemaacademico;

 
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
		return ("\nTipo: " + tipo + "     Classe: " + classe + "\nNúmero: +" + ddi + " (" + ddd + ") "
				+ numero + "     Ramal : " + ramal);
	}
    
}

package sistemaacademico;

public class Endereco {
    int tipoLogradouro;         
    int codigoLogradouro;       // CEP
    String descricaoLogradouro;
    String complementoLogradouro;  // Por exemplo: esquina com Rua 26.
    int numero;                 // 0 quando inexistente
    String quadra;                 
    String lote;                         
    String bairro;
    long municipio;
    int unidadeFederacao;
    int pais;
    String referencia;
    
	public Endereco(int tipoLogradouro, int codigoLogradouro, String descricaoLogradouro, String complementoLogradouro,
			int numero, String quadra, String lote, String bairro, long municipio, int unidadeFederacao, int pais,
			String referencia) {
		this.tipoLogradouro = tipoLogradouro;
		this.codigoLogradouro = codigoLogradouro;
		this.descricaoLogradouro = descricaoLogradouro;
		this.complementoLogradouro = complementoLogradouro;
		this.numero = numero;
		this.quadra = quadra;
		this.lote = lote;
		this.bairro = bairro;
		this.municipio = municipio;
		this.unidadeFederacao = unidadeFederacao;
		this.pais = pais;
		this.referencia = referencia;
	}
	
	public String toString() {
		return ("Tipo logradouro: " + tipoLogradouro + ";\nCEP: " + codigoLogradouro + ";\nDescrição do logradouro: " + descricaoLogradouro
				+ ";\nComplemento: " + complementoLogradouro + ";\nNumero: " + numero + ";\nQuadra: " + quadra + ";\nLote" + lote 
				+ ";\nBairro: " + bairro + ";\nMunicípio: " + municipio + ";\nUF: " + unidadeFederacao + ";\nPais: " + pais
				+ ";\nReferencia: " + referencia);
	}
    
    
}



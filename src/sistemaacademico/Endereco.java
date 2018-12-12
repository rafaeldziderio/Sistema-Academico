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
    String pais;
    String referencia;
    String  tipoL;
    String m;
    String estado;
    
	public Endereco(int tipoLogradouro, int codigoLogradouro, String descricaoLogradouro, String complementoLogradouro,
			int numero, String quadra, String lote, String bairro, long municipio, int unidadeFederacao, String pais,
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
		TiposLogradouros tipo = new TiposLogradouros();
		Municipios municipioO = new Municipios();
		tipoL = tipo.tipo(tipoLogradouro);
		m = municipioO.muni(municipio);
		UnidadesFederativas UF = new UnidadesFederativas();
		estado = UF.estado(unidadeFederacao);
	}
	
	
	public String toString() {
		return ("Tipo logradouro: " + tipoL + ";\nCEP: " + codigoLogradouro + ";\nDescrição do logradouro: " + descricaoLogradouro
				+ ";\nComplemento: " + complementoLogradouro + ";\nNumero: " + numero + ";\nQuadra: " + quadra + ";\nLote: " + lote 
				+ ";\nBairro: " + bairro + ";\nMunicípio: " + m + ";\nUF: " + estado + ";\nPais: " + pais
				+ ";\nReferencia: " + referencia);
	}
}
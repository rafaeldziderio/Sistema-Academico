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
		return ("Tipo logradouro: " + tipoL + "     CEP: " + codigoLogradouro + "     Descrição do logradouro: " + descricaoLogradouro
				+ "\nComplemento: " + complementoLogradouro + "     Numero: " + numero + "     Quadra: " + quadra + "\nLote: " + lote 
				+ "     Bairro: " + bairro + "     Município: " + m + "\nUF: " + estado + "     Pais: " + pais
				+ "     Referencia: " + referencia);
	}


	public int getTipoLogradouro() {
		return tipoLogradouro;
	}


	public void setTipoLogradouro(int tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}


	public int getCodigoLogradouro() {
		return codigoLogradouro;
	}


	public void setCodigoLogradouro(int codigoLogradouro) {
		this.codigoLogradouro = codigoLogradouro;
	}


	public String getDescricaoLogradouro() {
		return descricaoLogradouro;
	}


	public void setDescricaoLogradouro(String descricaoLogradouro) {
		this.descricaoLogradouro = descricaoLogradouro;
	}


	public String getComplementoLogradouro() {
		return complementoLogradouro;
	}


	public void setComplementoLogradouro(String complementoLogradouro) {
		this.complementoLogradouro = complementoLogradouro;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getQuadra() {
		return quadra;
	}


	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}


	public String getLote() {
		return lote;
	}


	public void setLote(String lote) {
		this.lote = lote;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public long getMunicipio() {
		return municipio;
	}


	public void setMunicipio(long municipio) {
		Municipios municipioO = new Municipios();
		
		m = municipioO.muni(municipio);
	}


	public int getUnidadeFederacao() {
		return unidadeFederacao;
	}


	public void setUnidadeFederacao(int unidadeFederacao) {
		this.unidadeFederacao = unidadeFederacao;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getTipoL() {
		return tipoL;
	}


	public void setTipoL(int tipoLogradouro) {
		TiposLogradouros tipo = new TiposLogradouros();
		tipoL = tipo.tipo(tipoLogradouro);
	}


	public String getM() {
		return m;
	}


	public void setM(String m) {
		this.m = m;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
package it.alfasoft.martina.model;

public class Voce {
	
	private Rubrica rubrica;
	
	private String nome="";
	private String cognome="";
	private String telefono="";
	
	public Voce(){
		
	}

	public Voce(String nome, String cognome, String telefono) {
	
		this.setNome(nome);
		this.setCognome(cognome);
		this.setTelefono(telefono);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

    public String toString(){
    	return nome+" "+cognome+" "+telefono;
		
	}

	public Rubrica getRubrica() {
		return rubrica;
	}

	public void setRubrica(Rubrica rubrica) {
		this.rubrica = rubrica;
	}
	
    public boolean isValid() {
		
		boolean res = false;
		if((!nome.isEmpty() && nome != null) && 
				(!cognome.isEmpty() && cognome !=null) &&
				(!telefono.isEmpty() && telefono != null)){
			
			res = true;
		}
		
		return res;
	}

}

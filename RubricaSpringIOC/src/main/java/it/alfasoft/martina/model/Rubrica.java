package it.alfasoft.martina.model;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {
	
	private String nome="";
	
	private List<Voce> listaVoci = new ArrayList<Voce>();
	
	public Rubrica(){
		
	}
	
	public Rubrica(String nome) {
	
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Voce> getListaVoci() {
		return listaVoci;
	}

	public void setListaVoci(List<Voce> listaVoci) {
		this.listaVoci = listaVoci;
	}
	
	public void addVoce(Voce v){
		this.listaVoci.add(v);
	}
	
	public Voce getVoceByNome(String nome){
		
		Voce voce= null;
		for(Voce v : listaVoci){
			if(v.getNome().equals(nome)){
				voce=v;
			}
		}
		System.out.println(voce.getNome()+" "+voce.getCognome()+" "+voce.getTelefono());
		return voce;
	}
	
}
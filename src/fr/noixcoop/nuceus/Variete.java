package fr.noixcoop.nuceus;

public class Variete {
	private String libelle;
	private boolean aoc;

	public Variete(String libelle, boolean aoc) {
		super();
		this.libelle = libelle;
		this.aoc = aoc;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public boolean isAoc() {
		return aoc;
	}

	public void setAoc(boolean aoc) {
		this.aoc = aoc;
	}

	@Override
	public String toString() {
		return "Variete [libelle=" + libelle + ", aoc=" + aoc + "]";
	}

}

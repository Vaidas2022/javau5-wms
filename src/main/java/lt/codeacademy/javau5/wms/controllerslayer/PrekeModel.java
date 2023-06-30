package lt.codeacademy.javau5.wms.controllerslayer;

import java.util.List;

import lt.codeacademy.javau5.wms.repolayer.Preke;


public class PrekeModel {

    private Long id;

	private String artikelis;

	private String pavadinimas;

	private String aprasymas;

	private int kiekis;

	private String matvnt;

    private List<Long> locations_id;

	public PrekeModel(Preke preke) {
		this.id = preke.getId();
		this.artikelis = preke.getArtikelis();
		this.pavadinimas = preke.getPavadinimas();
		this.aprasymas = preke.getAprasymas();
		this.kiekis = preke.getKiekis();
		this.matvnt = preke.getMatvnt();
		this.locations_id = preke.getLocations().stream().map( e -> e.getId()).toList();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArtikelis() {
		return artikelis;
	}

	public void setArtikelis(String artikelis) {
		this.artikelis = artikelis;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public String getAprasymas() {
		return aprasymas;
	}

	public void setAprasymas(String aprasymas) {
		this.aprasymas = aprasymas;
	}

	public int getKiekis() {
		return kiekis;
	}

	public void setKiekis(int kiekis) {
		this.kiekis = kiekis;
	}

	public String getMatvnt() {
		return matvnt;
	}

	public void setMatvnt(String matvnt) {
		this.matvnt = matvnt;
	}

	public List<Long> getLocations_id() {
		return locations_id;
	}

	public void setLocations_id(List<Long> locations_id) {
		this.locations_id = locations_id;
	}

	@Override
	public String toString() {
		return "PrekeModel [id=" + id + ", artikelis=" + artikelis + ", pavadinimas=" + pavadinimas + ", aprasymas="
				+ aprasymas + ", kiekis=" + kiekis + ", matvnt=" + matvnt + ", locations_id=" + locations_id + "]";
	}
	
	
}

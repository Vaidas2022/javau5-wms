package lt.codeacademy.javau5.wms.controllerslayer;

import java.util.List;

import lt.codeacademy.javau5.wms.repolayer.Location;


public class LocationModel {

    private Long id;

	private String eiles_nr;

	private String stelazo_nr;

	private String lentynos_nr;

	private List<Long> prekiu_id;
	
	public LocationModel(Location location) {
		this.id = location.getId();
		this.eiles_nr = location.getEiles_nr();
		this.stelazo_nr = location.getStelazo_nr();
		this.lentynos_nr = location.getLentynos_nr();
		this.prekiu_id = location.getPrekes().stream().map(e -> e.getId()).toList();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEiles_nr() {
		return eiles_nr;
	}

	public void setEiles_nr(String eiles_nr) {
		this.eiles_nr = eiles_nr;
	}

	public String getStelazo_nr() {
		return stelazo_nr;
	}

	public void setStelazo_nr(String stelazo_nr) {
		this.stelazo_nr = stelazo_nr;
	}

	public String getLentynos_nr() {
		return lentynos_nr;
	}

	public void setLentynos_nr(String lentynos_nr) {
		this.lentynos_nr = lentynos_nr;
	}

	public List<Long> getPrekiu_id() {
		return prekiu_id;
	}

	public void setPrekiu_id(List<Long> prekiu_id) {
		this.prekiu_id = prekiu_id;
	}

	@Override
	public String toString() {
		return "LocationModel [id=" + id + ", eiles_nr=" + eiles_nr + ", stelazo_nr=" + stelazo_nr + ", lentynos_nr="
				+ lentynos_nr + ", prekiu_id=" + prekiu_id + "]";
	}
	
	
}

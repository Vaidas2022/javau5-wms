package lt.codeacademy.javau5.wms.repolayer;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.*;

@Entity
@Table(name="locations")
public class Location {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
	
	@Column(name="line")
	private String eiles_nr;
	
	@Column(name="c_number")
	private String stelazo_nr;
	
	@Column(name="r_number")
	private String lentynos_nr;
	
	@ManyToMany(mappedBy = "locations", cascade=CascadeType.PERSIST)
	private List<Preke> prekes;

	public Location(Long id, String eiles_nr, String stelazo_nr, String lentynos_nr, List<Preke> prekes) {
		this.id = id;
		this.eiles_nr = eiles_nr;
		this.stelazo_nr = stelazo_nr;
		this.lentynos_nr = lentynos_nr;
		this.prekes = prekes;
	}
	public Location(String eiles_nr, String stelazo_nr, String lentynos_nr) {
		this.eiles_nr = eiles_nr;
		this.stelazo_nr = stelazo_nr;
		this.lentynos_nr = lentynos_nr;
	}
	
	public Location() {}
		

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

	public List<Preke> getPrekes() {
		if(prekes == null)
			prekes = new ArrayList<>();
		return prekes;
	}

	public void setPrekes(List<Preke> prekes) {
		this.prekes = prekes;
	}

	@Override
	public String toString() {
		return "Location " + eiles_nr + stelazo_nr + lentynos_nr;
	}
	
	public void addPreke(Preke preke) {
		preke.addLocation(this);
		getPrekes().add(preke);		
	}
}

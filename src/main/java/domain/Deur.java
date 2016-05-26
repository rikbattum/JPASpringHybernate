package domain;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS)
public class Deur {

	
	private String merk;
	private int price;
	@ManyToOne (cascade =CascadeType.ALL)
	private Huis huis; 
	@Id
	private long  id;
	@ElementCollection
	private Set<String> emailadressen = new HashSet<String>();
	
	
	
	
	public Set<String> getEmailadressen() {
		return emailadressen;
	}
	public void setEmailadressen(Set<String> emailadressen) {
		this.emailadressen = emailadressen;
	}
	public Deur () {} 
	public Deur (int id) { 
		this.id = id;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Huis getHuis() {
		return huis;
	}
	public void setHuis(Huis huis) {
		this.huis = huis;
	}
	
}

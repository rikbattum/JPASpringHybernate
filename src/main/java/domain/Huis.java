package domain;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity

public class Huis { 
	private String stad;
	private long prijs;
	private int aantalKamers;
	@OneToMany(mappedBy = "huis")
	private List <Deur> deuren = new ArrayList<Deur> (); 
	private String huisNaam;
	private Date aankoopdatum; 
		@Id
	private int id;
	private HuisType huisType;	

public Huis () {};


public Huis (String stad, long prijs,  int aantalKamers,String huisNaam, Date aankoopdatum, int id, HuisType h) {
this.aankoopdatum= aankoopdatum;
this.aantalKamers= aantalKamers;
this.id=id;
this.huisNaam=huisNaam;
this.prijs=prijs;
this.stad=stad; 
this.huisType=h;
	
}

public List<Deur> getDeuren() {
	return deuren;
}

public void setDeuren(List<Deur> deuren) {
	this.deuren = deuren;
}


public HuisType getHuisType() {
	return huisType;
}


public void setHuisType(HuisType huisType) {
	this.huisType = huisType;
}

	public String getStad() {
		return stad;
	}
	public void setStad(String stad) {
		this.stad = stad;
	}
	public long getPrijs() {
		return prijs;
	}
	public void setPrijs(long prijs) {
		this.prijs = prijs;
	}
	public int getAantalKamers() {
		return aantalKamers;
	}
	public void setAantalKamers(int aantalKamers) {
		this.aantalKamers = aantalKamers;
	}
	public String getHuisNaam() {
		return huisNaam;
	}
	public void setHuisNaam(String huisNaam) {
		this.huisNaam = huisNaam;
	}
	public Date getAankoopdatum() {
		return aankoopdatum;
	}
	public void setAankoopdatum(Date aankoopdatum) {
		this.aankoopdatum = aankoopdatum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Huis [stad=" + stad + ", prijs=" + prijs + ", aantalKamers=" + aantalKamers + ", huisNaam=" + huisNaam
				+ ", aankoopdatum=" + aankoopdatum + ", id=" + id + "]";
	}

}




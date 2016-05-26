package domain;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity


public class DeurKlink extends Deur{

	private int size;

	public DeurKlink() {} 
	
	public DeurKlink(int size) {
		this.size = size; 
	}

	public int getPrice() {
		return size;
	}

	public void setPrice(int size) {
		this.size = size;
	}
	
}

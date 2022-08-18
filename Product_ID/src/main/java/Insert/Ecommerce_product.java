package Insert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Ecommerce_product 
{
	@Id
	private int id;
	@Column(length=20)
	private String name;
	@Column
	private double price;
	public String getname() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public double getprice() {
	return price;
	}
	public void setPrice(double price2) {
	this.price = price2;
	}
}

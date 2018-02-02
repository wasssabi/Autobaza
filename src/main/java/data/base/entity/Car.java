package data.base.entity;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name="car")
public class Car extends BaseEntity {
	@Column(name = "sell_price", columnDefinition = "DECIMAL(5,2)")
	private BigDecimal sell_price;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="make_id")
	private Carmake carMakeq;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="seller_id")
	private CarSeller carSeller;
	
	
	public BigDecimal getSell_price() {
		return sell_price;
	}

	public void setSell_price(BigDecimal sell_price) {
		this.sell_price = sell_price;
	}

	@Override
	public String toString() {
		return "Car [sell_price=" + sell_price + "]";
	}

	public Car(BigDecimal sell_price) {
		super();
		this.sell_price = sell_price;
	} 
	
}

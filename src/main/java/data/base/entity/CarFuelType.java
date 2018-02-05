package data.base.entity;
import javax.persistence.*;



@Entity
@Table(name="car_fuel_type")
public class CarFuelType extends BaseEntity {


	@Column(name="fuel_type")
	private String fuelType;
	
	
	
	@OneToOne(mappedBy="carFuelType",cascade=CascadeType.ALL)
	private CarModel carModelt;

	public CarFuelType(String fuelType) {
		super();
		this.fuelType = fuelType;
	}
	public CarFuelType() {
		
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "CarFuelType [fuelType=" + fuelType + "]";
	}
	
}

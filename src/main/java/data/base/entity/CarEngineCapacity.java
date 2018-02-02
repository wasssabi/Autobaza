package data.base.entity;
import javax.persistence.*;


@Entity
@Table(name="car_engine_capacity")
public class CarEngineCapacity extends BaseEntity {

	
	@Column(name="engine_capacity")
	private String engineCapacity;
	
	
	@OneToOne(mappedBy ="carEngineCapacity", cascade = CascadeType.ALL)
	private CarModel carModel;

	public CarEngineCapacity(String engineCapacity) {
		super();
		this.engineCapacity = engineCapacity;
	}

	public String getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "CarEngineCapacity [engineCapacity=" + engineCapacity + "]";
	}
	
}

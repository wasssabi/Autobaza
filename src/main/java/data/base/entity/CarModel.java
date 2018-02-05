package data.base.entity;
import javax.persistence.*;



@Entity
@Table(name ="car_model")
public class CarModel extends BaseEntity {

	@Column(name ="model_title")
	private int modelTitle;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="engine_capacity_id")
	private CarEngineCapacity carEngineCapacity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fuel_type_id")
	private CarFuelType carFuelType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="color_id")
	private CarColor carColor;
	
	
	@OneToOne(mappedBy ="carModel",cascade=CascadeType.ALL)
	private Carmake carMake;
	
	
	public CarModel() {
		
	}

	public int getModelTitle() {
		return modelTitle;
	}

	public void setModelTitle(int modelTitle) {
		this.modelTitle = modelTitle;
	}
	
	

	@Override
	public String toString() {
		return "CarModel [modelTitle=" + modelTitle + "]";
	}

	public CarModel(int modelTitle) {
		super();
		this.modelTitle = modelTitle;
	}

	public CarEngineCapacity getCarEngineCapacity() {
		return carEngineCapacity;
	}

	public void setCarEngineCapacity(CarEngineCapacity carEngineCapacity) {
		this.carEngineCapacity = carEngineCapacity;
	}

	public CarFuelType getCarFuelType() {
		return carFuelType;
	}

	public void setCarFuelType(CarFuelType carFuelType) {
		this.carFuelType = carFuelType;
	}

	public CarColor getCarColor() {
		return carColor;
	}

	public void setCarColor(CarColor carColor) {
		this.carColor = carColor;
	}
	
	
}

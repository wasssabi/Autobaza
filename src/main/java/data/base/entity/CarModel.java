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
	
	
}

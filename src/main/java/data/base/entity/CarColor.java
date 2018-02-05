package data.base.entity;
import javax.persistence.*;


@Entity
@Table(name = "car_color")
public class CarColor extends BaseEntity {

	@Column(name = "color")
	private String color;
	
	@OneToOne(mappedBy ="carColor",cascade=CascadeType.ALL)
	private CarModel carModelo;

	public CarColor(String color) {
		super();
		this.color = color;
	}
	public CarColor() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CarColor [color=" + color + "]";
	}
	
}

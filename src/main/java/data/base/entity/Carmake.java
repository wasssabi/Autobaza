package data.base.entity;
import javax.persistence.*;

@Entity
@Table(name = "car_make")
public class Carmake extends BaseEntity {
	
	@Column(name = "make_title")
	private int makeTitle;
	
	@Column(name = "manufacture_year")
	private int manufactureYear;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="model_id")
	private CarModel carModel;
	
	
	@OneToOne(mappedBy="carMakeq",cascade=CascadeType.ALL)
	private Car car;
	

	public int getMakeTitle() {
		return makeTitle;
	}

	public void setMakeTitle(int makeTitle) {
		this.makeTitle = makeTitle;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	@Override
	public String toString() {
		return "Carmake [makeTitle=" + makeTitle + ", manufactureYear=" + manufactureYear + "]";
	}

	public Carmake(int makeTitle, int manufactureYear) {
		super();
		this.makeTitle = makeTitle;
		this.manufactureYear = manufactureYear;
	}
	
}

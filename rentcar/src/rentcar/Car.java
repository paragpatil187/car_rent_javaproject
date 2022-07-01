package rentcar;

public class Car {
	private int id;
    private String maker, name, colour, type;
    int seatingCapacity;
    String model, condition, regNo;
    private int rentPerHour;
    private Carowner carOwner;

}
public Car(int id,String maker, String colour, String type, int seatingCapacity,String model, String condition, String regNo, int rentPerHour, CarOwner carOwner) {
	this.id = id;
    this.maker = maker;
    this.name = name;
    this.colour = colour;
    this.type = type;
    this.seatingCapacity = seatingCapacŚity;
    this.model = model;
    this.condition = condition;
    this.regNo = regNo;
    this.rentPerHour = rentPerHour;
    this.carOwner = carOwner;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMaker() {
	return maker;
}
public void setMaker(String maker) {
	this.maker = maker;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getSeatingCapacity() {
	return seatingCapacity;
}
public void setSeatingCapacity(int seatingCapacity) {
	this.seatingCapacity = seatingCapacity;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getCondition() {
	return condition;
}
public void setCondition(String condition) {
	this.condition = condition;
}
public String getRegNo() {
	return regNo;
}
public void setRegNo(String regNo) {
	this.regNo = regNo;
}
public int getRentPerHour() {
	return rentPerHour;
}
public void setRentPerHour(int rentPerHour) {
	this.rentPerHour = rentPerHour;
}
public Carowner getCarOwner() {
	return carOwner;
}
public void setCarOwner(Carowner carOwner) {
	this.carOwner = carOwner;
}
@Override
public String toString() {
	return "Car [id=" + id + ", maker=" + maker + ", name=" + name + ", colour=" + colour + ", type=" + type
			+ ", seatingCapacity=" + seatingCapacity + ", model=" + model + ", condition=" + condition + ", regNo="
			+ regNo + ", rentPerHour=" + rentPerHour + "]";
}


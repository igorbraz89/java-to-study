package SampleClasses;

public class Doggo {
	
	private String name;
	private String description;	
	
	public Doggo(String name, String color) {
		this.name = name;
		this.description = color;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return description;
	}
	public void setColor(String color) {
		this.description = color;
	}	 

}

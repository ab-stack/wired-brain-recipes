package duke.choice;

public class Clothing implements Comparable<Clothing>{
	private String description;
	private double price;
	private String size="M";
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Clothing [description=" + getDescription() + ", price=" + getPrice() + ", size=" + getSize() + "]";
	}
	@Override
	public int compareTo(Clothing o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

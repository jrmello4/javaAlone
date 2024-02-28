package entities;

public class OrderItem {

	private Integer quantity;
	private double price;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double subTotal() {
		return price * quantity;
	}
}

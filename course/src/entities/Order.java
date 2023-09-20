package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus stauts;
	
	public Order() {
		
	}

	public Order(Integer id, Date moment, OrderStatus stauts) {
		this.id = id;
		this.moment = moment;
		this.stauts = stauts;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStauts() {
		return stauts;
	}

	public void setStauts(OrderStatus stauts) {
		this.stauts = stauts;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", stauts=" + stauts + "]";
	}
	
}

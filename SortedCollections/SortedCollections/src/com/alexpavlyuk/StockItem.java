package com.alexpavlyuk;

public class StockItem implements Comparable<StockItem> {
	private final String name;
	private double price;
	private int quantityStock;

	public StockItem(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantityStock = 0;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	public void setPrice(double price) {
		if (price > 0.0) {
			this.price = price;
		}
	}

	public void adjustStock(int quantity) {
		int newQuantity = this.quantityStock + quantity;
		if (newQuantity >= 0.0) {
			this.quantityStock = newQuantity;
		}
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Entering StockItem.equals()");
		if (this == obj) return true;
		if (!(obj instanceof StockItem)) return false;
		String thatName = ((StockItem) obj).getName();
		return this.name.equals(thatName);
	}

	@Override
	public int compareTo(StockItem o) {
		return 0;
	}
}

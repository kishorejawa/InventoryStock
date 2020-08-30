package com.inventory.InventorySystemSample.Entity;
import javax.persistence.*;

@Entity
@Table(name = "InventoryData")
public class InventoryVO {

	  	@Id
	    public int InventoryId;
	    @Column(name = "pId")
	    public int ProductId;
	    @Column(name = "Iname")
	    public String InventoryName;
	    @Column (name ="quantity")
	    public int Quantity;
	    @Column (name = "lId")
	    public int LocationId;
	    @Column( name = "rate")
	    public double Rate;
	    @Column(name = "QInHand")
	    public int QuantityInHand;
	    
	    public InventoryVO() {}
		public int getInventoryId() {
			return InventoryId;
		}
		public void setInventoryId(int inventoryId) {
			InventoryId = inventoryId;
		}
		public int getProductId() {
			return ProductId;
		}
		public void setProductId(int productId) {
			ProductId = productId;
		}
		public int getQuantity() {
			return Quantity;
		}
		public void setQuantity(int quantity) {
			Quantity = quantity;
		}
		public int getLocationId() {
			return LocationId;
		}
		public void setLocationId(int locationId) {
			LocationId = locationId;
		}
		public double getRate() {
			return Rate;
		}
		public void setRate(double rate) {
			Rate = rate;
		}
		public int getQuantityInHand() {
			return QuantityInHand;
		}
		public void setQuantityInHand(int quantityInHand) {
			QuantityInHand = quantityInHand;
		}
		@Override
		public String toString() {
			return "InventoryVO [InventoryId=" + InventoryId + ", ProductId=" + ProductId + ", Quantity=" + Quantity
					+ ", LocationId=" + LocationId + ", Rate=" + Rate + ", QuantityInHand=" + QuantityInHand + "]";
		}
		public InventoryVO(int inventoryId, int productId, int quantity, int locationId, double rate,
				int quantityInHand) {
			super();
			InventoryId = inventoryId;
			ProductId = productId;
			Quantity = quantity;
			LocationId = locationId;
			Rate = rate;
			QuantityInHand = quantityInHand;
		}
		
	    
	    
	    
}

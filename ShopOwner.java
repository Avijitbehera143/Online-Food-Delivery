package Anudip.project.Online_food_delivery.entities;
import javax.persistence.*;

@Entity
public class ShopOwner {
	@Id
	private String OwnerID;
	private String Ownername;
	private String OwnerAddress;
	private java.lang.String shopId;
	public ShopOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopOwner(String ownerId, String shopId, String ownerName, String ownerAddress, String ownerPhone) {
	    this.OwnerID = ownerId;
	    this.shopId = shopId;
	    this.Ownername = ownerName;
	    this.OwnerAddress = ownerAddress;
	    this.OwnerID = ownerPhone;
	}
	

	public String getOwnerID() {
		return OwnerID;
	}
	public void setOwnerID(String ownerID) {
		OwnerID = ownerID;
	}
	public String getOwnername() {
		return Ownername;
	}
	public void setOwnername(String ownername) {
		Ownername = ownername;
	}
	public String getOwnerAddress() {
		return OwnerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		OwnerAddress = ownerAddress;
	}
	public java.lang.String getShopId() {
		return shopId;
	}
	public void setShopId(java.lang.String shopId) {
		this.shopId = shopId;
	}
	
	
	
	

}

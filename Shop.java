package Anudip.project.Online_food_delivery.entities;
import javax.persistence.*;

@Entity
public class Shop {
	@Id
	@Column(name="ShopID")
	private String ShopId;
	private String ShopName;
	private String ShopAddress;
	private int BankAccount;
	private int GstNo;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(String shopId, String shopName, String shopAddress, int bankAccount, int gstNo) {
		super();
		ShopId = shopId;
		ShopName = shopName;
		ShopAddress = shopAddress;
		BankAccount = bankAccount;
		GstNo = gstNo;
	}
	public String getShopId() {
		return ShopId;
	}
	public void setShopId(String shopId) {
		ShopId = shopId;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public String getShopAddress() {
		return ShopAddress;
	}
	public void setShopAddress(String shopAddress) {
		ShopAddress = shopAddress;
	}
	public int getBankAccount() {
		return BankAccount;
	}
	public void setBankAccount(int bankAccount) {
		BankAccount = bankAccount;
	}
	public int getGstNo() {
		return GstNo;
	}
	public void setGstNo(int gstNo) {
		GstNo = gstNo;
	}
	@Override
	public String toString() {
		return "Shop [ShopId=" + ShopId + ", ShopName=" + ShopName + ", ShopAddress=" + ShopAddress + ", BankAccount="
				+ BankAccount + ", GstNo=" + GstNo + ", getShopId()=" + getShopId() + ", getShopName()=" + getShopName()
				+ ", getShopAddress()=" + getShopAddress() + ", getBankAccount()=" + getBankAccount() + ", getGstNo()="
				+ getGstNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}

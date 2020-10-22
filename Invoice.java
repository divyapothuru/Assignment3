package Salary;

public class Invoice implements Payable{
	String partnum;
	String partdescription;
	int quality;
	double pricepayperitem;
	public Invoice(String partnum, String partdescription, int quality, double pricepayperitem) {
		super();
		this.partnum = partnum;
		this.partdescription = partdescription;
		this.quality = quality;
		this.pricepayperitem = pricepayperitem;
	}
	public String getPartnum() {
		return partnum;
	}
	public void setPartnum(String partnum) {
		this.partnum = partnum;
	}
	public String getPartdescription() {
		return partdescription;
	}
	public void setPartdescription(String partdescription) {
		this.partdescription = partdescription;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public double getPricepayperitem() {
		return pricepayperitem;
	}
	public void setPricepayperitem(double pricepayperitem) {
		this.pricepayperitem = pricepayperitem;
	}
	@Override
	public String toString() {
		return "Invoice [partnum=" + partnum + ", partdescription=" + partdescription + ", quality=" + quality
				+ ", pricepayperitem=" + pricepayperitem + "]";
	}
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		super.toString();
		return getQuality()*getPricepayperitem();
	}
	

}

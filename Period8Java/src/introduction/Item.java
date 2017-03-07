package introduction;

public class Item {

	private String description;
	private boolean purchased;
	
	public Item(String description) {
		this.description = description;
		purchased = false;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPurchased() {
		return purchased;
	}

	public void setPurchased(boolean purchased) {
		this.purchased = purchased;
	}
	
	
	
}
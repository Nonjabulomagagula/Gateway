package getIDrequest;

public class PolicyHolderz {
	
	public String rolePlayerId;
	public int percentage;
	
	public PolicyHolderz() {
		
	}
	
	public PolicyHolderz(String rolePlayerId, int percentage) {

		this.rolePlayerId = rolePlayerId;
		this.percentage = percentage;
	}
	
    public String getRolePlayerId() {
		return rolePlayerId;
	}
	public void setRolePlayerId(String rolePlayerId) {
		this.rolePlayerId = rolePlayerId;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
}

package getIDrequest;

public class RoleplayerResponse {

	 public RoleplayerResponse() {
			
		}
	  public RoleplayerResponse(String type, String rolePlayerId, String clientNumber, String system, String dateOfBirth) {
		super();
		this.type = type;
		this.rolePlayerId = rolePlayerId;
		this.clientNumber = clientNumber;
		this.system = system;
		this.dateOfBirth = dateOfBirth;
	}
	public String type;
	    public String rolePlayerId;
	    public String clientNumber;
	    public String system;
	    public String dateOfBirth;
	    public boolean natural;
}

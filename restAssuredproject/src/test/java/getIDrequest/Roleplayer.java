package getIDrequest;

import java.sql.Date;
import java.util.List;

public class Roleplayer {
	 public String type;
	    public String rolePlayerId;
	    public boolean natural;
	    public String system;
	    public List<Object> addresses;
	    public List<Object> contactNumbers;
	    public String dateOfBirth;
	    public String firstName;
	    public String surname;
	    public String gender;
		public Roleplayer(String type, String rolePlayerId, boolean natural, String system, List<Object> addresses,
				List<Object> contactNumbers, String dateOfBirth, String firstName, String surname, String gender) {
			super();
			this.type = type;
			this.rolePlayerId = rolePlayerId;
			this.natural = natural;
			this.system = system;
			this.addresses = addresses;
			this.contactNumbers = contactNumbers;
			this.dateOfBirth = dateOfBirth;
			this.firstName = firstName;
			this.surname = surname;
			this.gender = gender;
		}

}

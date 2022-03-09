package getIDrequest;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Root {
	public Root()
	{
		benefits = new ArrayList<Benefit>();
		roleplayers = new ArrayList<Roleplayer>();
	}
	 public String inceptionDate;
	    public String schemeCode;
	    public String user;
	    public ArrayList<policyHolder> policyHolders;
	    public String quoteStatus;
	    public ArrayList<Benefit> benefits;
	    public ArrayList<Roleplayer> roleplayers;

}

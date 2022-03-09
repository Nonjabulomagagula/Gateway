package getIDrequest;


import java.util.ArrayList;

public class NewQuote {

	public NewQuote()
	{
		policyHolders = new ArrayList<PolicyHolderz>();
		benefits = new  ArrayList<Benefitszz>();
		roleplayers = new ArrayList<Rolaplayerszz>();
	}
	 public String quoteNumber;
     public String inceptionDate ;
     public String quoteCreateDate ;
     public String schemeCode ;
     public int premiumDebt ;
     public int outstandingDebt ;
     public int premiumSkipCount ;
     public String sourceOfBusiness ;
     public String user ;
     public ArrayList<PolicyHolderz> policyHolders ;
     public String quoteStatus ;
     public ArrayList<Benefitszz> benefits ;
     public ArrayList<Rolaplayerszz> roleplayers ;
     public Boolean flagSubmitNewBusiness ;
     public String subChannel ;
     public String partnerCommsChannel ;
}

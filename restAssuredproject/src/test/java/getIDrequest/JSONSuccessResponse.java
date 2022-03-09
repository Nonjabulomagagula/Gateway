package getIDrequest;

import java.util.ArrayList;

public class JSONSuccessResponse {
	
	 public JSONSuccessResponse() 
	 {
		 policyHolders = new ArrayList<PolicyHolderz>();
		 benefits = new  ArrayList<Benefitszz>();
		 roleplayers = new ArrayList<RoleplayerResponse>();
		 
	 }
	 public String getQuoteNumber() {
		return quoteNumber;
	}
	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}
	public String getInceptionDate() {
		return inceptionDate;
	}
	public void setInceptionDate(String inceptionDate) {
		this.inceptionDate = inceptionDate;
	}
	public String getQuoteCreateDate() {
		return quoteCreateDate;
	}
	public void setQuoteCreateDate(String quoteCreateDate) {
		this.quoteCreateDate = quoteCreateDate;
	}
	public String getSchemeCode() {
		return schemeCode;
	}
	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}
	public int getPremiumDebt() {
		return premiumDebt;
	}
	public void setPremiumDebt(int premiumDebt) {
		this.premiumDebt = premiumDebt;
	}
	public int getOutstandingDebt() {
		return outstandingDebt;
	}
	public void setOutstandingDebt(int outstandingDebt) {
		this.outstandingDebt = outstandingDebt;
	}
	public int getPremiumSkipCount() {
		return premiumSkipCount;
	}
	public void setPremiumSkipCount(int premiumSkipCount) {
		this.premiumSkipCount = premiumSkipCount;
	}
	public String getSourceOfBusiness() {
		return sourceOfBusiness;
	}
	public void setSourceOfBusiness(String sourceOfBusiness) {
		this.sourceOfBusiness = sourceOfBusiness;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public ArrayList<PolicyHolderz> getPolicyHolders() {
		return policyHolders;
	}
	public void setPolicyHolders(ArrayList<PolicyHolderz> policyHolders) {
		this.policyHolders = policyHolders;
	}
	public String getQuoteStatus() {
		return quoteStatus;
	}
	public void setQuoteStatus(String quoteStatus) {
		this.quoteStatus = quoteStatus;
	}
	public ArrayList<Benefitszz> getBenefits() {
		return benefits;
	}
	public void setBenefits(ArrayList<Benefitszz> benefits) {
		this.benefits = benefits;
	}
	public ArrayList<RoleplayerResponse> getRoleplayers() {
		return roleplayers;
	}
	public void setRoleplayers(ArrayList<RoleplayerResponse> roleplayers) {
		this.roleplayers = roleplayers;
	}
	public Boolean getFlagSubmitNewBusiness() {
		return flagSubmitNewBusiness;
	}
	public void setFlagSubmitNewBusiness(Boolean flagSubmitNewBusiness) {
		this.flagSubmitNewBusiness = flagSubmitNewBusiness;
	}
	public String getSubChannel() {
		return subChannel;
	}
	public void setSubChannel(String subChannel) {
		this.subChannel = subChannel;
	}
	public String getPartnerCommsChannel() {
		return partnerCommsChannel;
	}
	public void setPartnerCommsChannel(String partnerCommsChannel) {
		this.partnerCommsChannel = partnerCommsChannel;
	}
	public int getTotalPremium() {
		return totalPremium;
	}
	public void setTotalPremium(int totalPremium) {
		this.totalPremium = totalPremium;
	}
	public int getTotalWaiverDeathDisabilityPremium() {
		return totalWaiverDeathDisabilityPremium;
	}
	public void setTotalWaiverDeathDisabilityPremium(int totalWaiverDeathDisabilityPremium) {
		this.totalWaiverDeathDisabilityPremium = totalWaiverDeathDisabilityPremium;
	}
	public int getTotalWaiverRetirementPremium() {
		return totalWaiverRetirementPremium;
	}
	public void setTotalWaiverRetirementPremium(int totalWaiverRetirementPremium) {
		this.totalWaiverRetirementPremium = totalWaiverRetirementPremium;
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
     public ArrayList<RoleplayerResponse> roleplayers ;
     public Boolean flagSubmitNewBusiness ;
     public String subChannel ;
     public String partnerCommsChannel ;

     public int totalPremium;
     public int totalWaiverDeathDisabilityPremium;
     public int totalWaiverRetirementPremium;

}

package getIDrequest;

import java.util.ArrayList;

public class Policy {
	 private String name;
	 private String surname;
	 private String idNumber;
	 private String gender;
	 private String title;
	 private String maritalStatus;
	 private String cellNumber;
	 private String email;
	 private String coverAmount;
	 private String benefitType;
	 private boolean paymentProtectionOnDeathOrDisability;
	 private boolean paymentProtectionOnRetirement;
	 private boolean valueProtection;
	 private boolean cashback;
	 private String totalPremium;
	 private String totalCover;
	 ArrayList <Benefits> benefits = new ArrayList <Benefits> ();
	 Beneficiary Beneficiary;
	 BankingReference BankingReference;
	 AdditionalBenefits AdditionalBenefits;
	 private boolean policyReplacement;
	 private boolean pip;
	 private String advisor;
	 private String advisorNumber;
	 private String split;
	 private String source;
	 private String channel;
	 private String subChannel;
	 private String transcript;
	 private String facebookUserId;
	 private String facebookPage;
	 private String facebookAdId;


	 // Getter Methods 

	 public String getName() {
	  return name;
	 }

	 public String getSurname() {
	  return surname;
	 }

	 public String getIdNumber() {
	  return idNumber;
	 }

	 public String getGender() {
	  return gender;
	 }

	 public String getTitle() {
	  return title;
	 }

	 public String getMaritalStatus() {
	  return maritalStatus;
	 }

	 public String getCellNumber() {
	  return cellNumber;
	 }

	 public String getEmail() {
	  return email;
	 }

	 public String getCoverAmount() {
	  return coverAmount;
	 }

	 public String getBenefitType() {
	  return benefitType;
	 }

	 public boolean getPaymentProtectionOnDeathOrDisability() {
	  return paymentProtectionOnDeathOrDisability;
	 }

	 public boolean getPaymentProtectionOnRetirement() {
	  return paymentProtectionOnRetirement;
	 }

	 public boolean getValueProtection() {
	  return valueProtection;
	 }

	 public boolean getCashback() {
	  return cashback;
	 }

	 public String getTotalPremium() {
	  return totalPremium;
	 }

	 public String getTotalCover() {
	  return totalCover;
	 }

	 public Beneficiary getBeneficiary() {
	  return Beneficiary;
	 }

	 public BankingReference getBankingReference() {
	  return BankingReference;
	 }

	 public AdditionalBenefits getAdditionalBenefits() {
	  return AdditionalBenefits;
	 }

	 public boolean getPolicyReplacement() {
	  return policyReplacement;
	 }

	 public boolean getPip() {
	  return pip;
	 }

	 public String getAdvisor() {
	  return advisor;
	 }

	 public String getAdvisorNumber() {
	  return advisorNumber;
	 }

	 public String getSplit() {
	  return split;
	 }

	 public String getSource() {
	  return source;
	 }

	 public String getChannel() {
	  return channel;
	 }

	 public String getSubChannel() {
	  return subChannel;
	 }

	 public String getTranscript() {
	  return transcript;
	 }

	 public String getFacebookUserId() {
	  return facebookUserId;
	 }

	 public String getFacebookPage() {
	  return facebookPage;
	 }

	 public String getFacebookAdId() {
	  return facebookAdId;
	 }

	 // Setter Methods 

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setSurname(String surname) {
	  this.surname = surname;
	 }

	 public void setIdNumber(String idNumber) {
	  this.idNumber = idNumber;
	 }

	 public void setGender(String gender) {
	  this.gender = gender;
	 }

	 public void setTitle(String title) {
	  this.title = title;
	 }

	 public void setMaritalStatus(String maritalStatus) {
	  this.maritalStatus = maritalStatus;
	 }

	 public void setCellNumber(String cellNumber) {
	  this.cellNumber = cellNumber;
	 }

	 public void setEmail(String email) {
	  this.email = email;
	 }

	 public void setCoverAmount(String coverAmount) {
	  this.coverAmount = coverAmount;
	 }

	 public void setBenefitType(String benefitType) {
	  this.benefitType = benefitType;
	 }

	 public void setPaymentProtectionOnDeathOrDisability(boolean paymentProtectionOnDeathOrDisability) {
	  this.paymentProtectionOnDeathOrDisability = paymentProtectionOnDeathOrDisability;
	 }

	 public void setPaymentProtectionOnRetirement(boolean paymentProtectionOnRetirement) {
	  this.paymentProtectionOnRetirement = paymentProtectionOnRetirement;
	 }

	 public void setValueProtection(boolean valueProtection) {
	  this.valueProtection = valueProtection;
	 }

	 public void setCashback(boolean cashback) {
	  this.cashback = cashback;
	 }

	 public void setTotalPremium(String totalPremium) {
	  this.totalPremium = totalPremium;
	 }

	 public void setTotalCover(String totalCover) {
	  this.totalCover = totalCover;
	 }

	 public void setBeneficiary(Beneficiary beneficiaryObject) {
	  this.Beneficiary = beneficiaryObject;
	 }

	 public void setBankingReference(BankingReference bankingReferenceObject) {
	  this.BankingReference = bankingReferenceObject;
	 }

	 public void setAdditionalBenefits(AdditionalBenefits additionalBenefitsObject) {
	  this.AdditionalBenefits = additionalBenefitsObject;
	 }

	 public void setPolicyReplacement(boolean policyReplacement) {
	  this.policyReplacement = policyReplacement;
	 }

	 public void setPip(boolean pip) {
	  this.pip = pip;
	 }

	 public void setAdvisor(String advisor) {
	  this.advisor = advisor;
	 }

	 public void setAdvisorNumber(String advisorNumber) {
	  this.advisorNumber = advisorNumber;
	 }

	 public void setSplit(String split) {
	  this.split = split;
	 }

	 public void setSource(String source) {
	  this.source = source;
	 }

	 public void setChannel(String channel) {
	  this.channel = channel;
	 }

	 public void setSubChannel(String subChannel) {
	  this.subChannel = subChannel;
	 }

	 public void setTranscript(String transcript) {
	  this.transcript = transcript;
	 }

	 public void setFacebookUserId(String facebookUserId) {
	  this.facebookUserId = facebookUserId;
	 }

	 public void setFacebookPage(String facebookPage) {
	  this.facebookPage = facebookPage;
	 }

	 public void setFacebookAdId(String facebookAdId) {
	  this.facebookAdId = facebookAdId;
	 }
}

	

	


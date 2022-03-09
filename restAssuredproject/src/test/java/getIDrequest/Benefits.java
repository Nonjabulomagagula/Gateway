package getIDrequest;

public class Benefits {
	 private String name;
	 private String surname;
	 private String gender;
	 private String coverAmount;
	 private String dob;
	 private String benefitType;
	 private String relation;
	 private boolean paymentProtectionOnDeathOrDisability;
	 private boolean paymentProtectionOnRetirement;
	 private boolean valueProtection;
	 private boolean cashback;
	 private boolean isBeneficiary;


	 public Benefits(String name, String surname, String gender, String coverAmount, String dob, String benefitType, String relation, Boolean paymentProtectionOnDeathOrDisability, Boolean paymentProtectionOnRetirement, Boolean valueProtection, Boolean cashback, Boolean isBeneficiary)
	 {
		 this.name = name;
			this.surname = surname;
			this.gender = gender;
			this.coverAmount = coverAmount;
			this.dob = dob;
			this.benefitType = benefitType;
			this.relation = relation;
			this.paymentProtectionOnDeathOrDisability = paymentProtectionOnDeathOrDisability;
			this.paymentProtectionOnRetirement= paymentProtectionOnRetirement;
			this.valueProtection = valueProtection;
			this.cashback = cashback;
			this.isBeneficiary = isBeneficiary;
	 }
	 // Getter Methods 

	 public String getName() {
	  return name;
	 }

	 public String getSurname() {
	  return surname;
	 }

	 public String getGender() {
	  return gender;
	 }

	 public String getCoverAmount() {
	  return coverAmount;
	 }

	 public String getDob() {
	  return dob;
	 }

	 public String getBenefitType() {
	  return benefitType;
	 }

	 public String getRelation() {
	  return relation;
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

	 public boolean getIsBeneficiary() {
	  return isBeneficiary;
	 }

	 // Setter Methods 

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setSurname(String surname) {
	  this.surname = surname;
	 }

	 public void setGender(String gender) {
	  this.gender = gender;
	 }

	 public void setCoverAmount(String coverAmount) {
	  this.coverAmount = coverAmount;
	 }

	 public void setDob(String dob) {
	  this.dob = dob;
	 }

	 public void setBenefitType(String benefitType) {
	  this.benefitType = benefitType;
	 }

	 public void setRelation(String relation) {
	  this.relation = relation;
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

	 public void setIsBeneficiary(boolean isBeneficiary) {
	  this.isBeneficiary = isBeneficiary;
	 }
}

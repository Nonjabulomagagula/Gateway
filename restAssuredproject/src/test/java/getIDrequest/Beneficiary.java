package getIDrequest;

public class Beneficiary {
	private String name;
	 private String surname;
	 private String dob;
	 private String gender;
	 private String benefitType;
	 private String relation;
	 private String cellNumber;
	 private boolean takesOverPlan;
	 private boolean willGetTheMoney;
	 private boolean trustedToArrangeYourFuneral;


	 // Getter Methods 

	 public String getName() {
	  return name;
	 }

	 public String getSurname() {
	  return surname;
	 }

	 public String getDob() {
	  return dob;
	 }

	 public String getGender() {
	  return gender;
	 }

	 public String getBenefitType() {
	  return benefitType;
	 }

	 public String getRelation() {
	  return relation;
	 }

	 public String getCellNumber() {
	  return cellNumber;
	 }

	 public boolean getTakesOverPlan() {
	  return takesOverPlan;
	 }

	 public boolean getWillGetTheMoney() {
	  return willGetTheMoney;
	 }

	 public boolean getTrustedToArrangeYourFuneral() {
	  return trustedToArrangeYourFuneral;
	 }

	 // Setter Methods 

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setSurname(String surname) {
	  this.surname = surname;
	 }

	 public void setDob(String dob) {
	  this.dob = dob;
	 }

	 public void setGender(String gender) {
	  this.gender = gender;
	 }

	 public void setBenefitType(String benefitType) {
	  this.benefitType = benefitType;
	 }

	 public void setRelation(String relation) {
	  this.relation = relation;
	 }

	 public void setCellNumber(String cellNumber) {
	  this.cellNumber = cellNumber;
	 }

	 public void setTakesOverPlan(boolean takesOverPlan) {
	  this.takesOverPlan = takesOverPlan;
	 }

	 public void setWillGetTheMoney(boolean willGetTheMoney) {
	  this.willGetTheMoney = willGetTheMoney;
	 }

	 public void setTrustedToArrangeYourFuneral(boolean trustedToArrangeYourFuneral) {
	  this.trustedToArrangeYourFuneral = trustedToArrangeYourFuneral;
	 }
}

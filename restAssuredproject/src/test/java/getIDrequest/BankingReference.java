package getIDrequest;

public class BankingReference {
	 private String bank;
	 private String accountNumber;
	 private String accountType;
	 private String salaryDay;
	 private String deductionDay;


	 // Getter Methods 

	 public String getBank() {
	  return bank;
	 }

	 public String getAccountNumber() {
	  return accountNumber;
	 }

	 public String getAccountType() {
	  return accountType;
	 }

	 public String getSalaryDay() {
	  return salaryDay;
	 }

	 public String getDeductionDay() {
	  return deductionDay;
	 }

	 // Setter Methods 

	 public void setBank(String bank) {
	  this.bank = bank;
	 }

	 public void setAccountNumber(String accountNumber) {
	  this.accountNumber = accountNumber;
	 }

	 public void setAccountType(String accountType) {
	  this.accountType = accountType;
	 }

	 public void setSalaryDay(String salaryDay) {
	  this.salaryDay = salaryDay;
	 }

	 public void setDeductionDay(String deductionDay) {
	  this.deductionDay = deductionDay;
	 }
}

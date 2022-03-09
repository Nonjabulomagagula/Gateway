package getIDrequest;

public class AdditionalBenefits {
	 private boolean repatriation;
	 private boolean paymentProtectionAtAge85;
	 private String valueProtectionPercentage;


	 // Getter Methods 

	 public boolean getRepatriation() {
	  return repatriation;
	 }

	 public boolean getPaymentProtectionAtAge85() {
	  return paymentProtectionAtAge85;
	 }

	 public String getValueProtectionPercentage() {
	  return valueProtectionPercentage;
	 }

	 // Setter Methods 

	 public void setRepatriation(boolean repatriation) {
	  this.repatriation = repatriation;
	 }

	 public void setPaymentProtectionAtAge85(boolean paymentProtectionAtAge85) {
	  this.paymentProtectionAtAge85 = paymentProtectionAtAge85;
	 }

	 public void setValueProtectionPercentage(String valueProtectionPercentage) {
	  this.valueProtectionPercentage = valueProtectionPercentage;
	 }
}

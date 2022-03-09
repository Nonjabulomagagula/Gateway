package getIDrequest;

public class BenefitIdentifierss {
	
	  public BenefitIdentifierss() {
			
		}

    public BenefitIdentifierss(String countryCode, int packageCode, String rangeCode, String benefitCode,
			String rateDate, String fundingOption) {
		super();
		this.countryCode = countryCode;
		this.packageCode = packageCode;
		this.rangeCode = rangeCode;
		this.benefitCode = benefitCode;
		this.rateDate = rateDate;
		this.fundingOption = fundingOption;
	}
	public String countryCode;
    public int packageCode;
    public String rangeCode;
    public String benefitCode;
    public String rateDate;
    public String fundingOption;
	

}

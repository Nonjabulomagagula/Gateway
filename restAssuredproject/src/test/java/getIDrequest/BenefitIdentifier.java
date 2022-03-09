package getIDrequest;

public class BenefitIdentifier {
	public String countryCode;
    public int packageCode;
    public String rangeCode;
    public String benefitCode;
    public String rateDate;
    public String fundingOption;
    
    public BenefitIdentifier
    (String countryCode,
    		int packageCode,String rangeCode,
    		String benefitCode,String rateDate,
    		String fundingOption)
    {
    	this.countryCode = countryCode;
    	this.packageCode = packageCode;
    	this.rangeCode = rangeCode;
    	this.benefitCode = benefitCode;
    	this.rateDate = rateDate;
    	this.fundingOption = fundingOption;
    }

}

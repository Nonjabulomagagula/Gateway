package getIDrequest;

import java.util.List;

public class Benefit {
	    public BenefitIdentifier benefitIdentifier;
	    public int benefitAmount;
	    public int coverGrowthPercentage;
	    public int premiumGrowthPercentage;
	    public String growthType;
	    public boolean coverTermWholeLife;
	    public List<Life> lives;
		public Benefit(BenefitIdentifier benefitIdentifier, int benefitAmount, int coverGrowthPercentage,
				int premiumGrowthPercentage, String growthType, boolean coverTermWholeLife, List<Life> lives) {
			super();
			this.benefitIdentifier = benefitIdentifier;
			this.benefitAmount = benefitAmount;
			this.coverGrowthPercentage = coverGrowthPercentage;
			this.premiumGrowthPercentage = premiumGrowthPercentage;
			this.growthType = growthType;
			this.coverTermWholeLife = coverTermWholeLife;
			this.lives = lives;
		}

	   
	    
	    
}

package getIDrequest;

import java.util.ArrayList;

public class Benefitszz {
	
	private int benefitAmount;
    private int coverGrowthPercentage;
    private int premiumGrowthPercentage;
    private String growthType;
    private ArrayList<Lifezz> lives;
	private BenefitIdentifierss benefitIdentifier;
    public int premium;
    public boolean coverTermWholeLife;
    public boolean replacementPenaltyIndicator;
	
    public Benefitszz() {
	
	
	}
	
    
    public Benefitszz(BenefitIdentifierss benefitIdentifier, int benefitAmount, int coverGrowthPercentage,
			int premiumGrowthPercentage, String growthType, ArrayList<Lifezz> lives) {
	
		this.benefitIdentifier = benefitIdentifier;
		this.benefitAmount = benefitAmount;
		this.coverGrowthPercentage = coverGrowthPercentage;
		this.premiumGrowthPercentage = premiumGrowthPercentage;
		this.growthType = growthType;
		this.lives = lives;
	}
	

    public BenefitIdentifierss getBenefitIdentifier() {
		return benefitIdentifier;
	}
	public void setBenefitIdentifier(BenefitIdentifierss benefitIdentifier) {
		this.benefitIdentifier = benefitIdentifier;
	}
	public int getBenefitAmount() {
		return benefitAmount;
	}
	public void setBenefitAmount(int benefitAmount) {
		this.benefitAmount = benefitAmount;
	}
	public int getCoverGrowthPercentage() {
		return coverGrowthPercentage;
	}
	public void setCoverGrowthPercentage(int coverGrowthPercentage) {
		this.coverGrowthPercentage = coverGrowthPercentage;
	}
	public int getPremiumGrowthPercentage() {
		return premiumGrowthPercentage;
	}
	public void setPremiumGrowthPercentage(int premiumGrowthPercentage) {
		this.premiumGrowthPercentage = premiumGrowthPercentage;
	}
	public String getGrowthType() {
		return growthType;
	}
	public void setGrowthType(String growthType) {
		this.growthType = growthType;
	}
	public ArrayList<Lifezz> getLives() {
		return lives;
	}
	public void setLives(ArrayList<Lifezz> lives) {
		this.lives = lives;
	}
	
}

package getIDrequest;

public class RelMember {
	   public String name;
	    public String surname;
	    public String gender;
	    public String benefitType;
	    public String coverMember;
	    public int covermemberPremium;
	    public String dob;
	    public String relation;
	    public boolean biologicalChild;
	    public String biologicalReason;
		public RelMember(String name, String surname, String gender, String benefitType, String coverMember,
				int covermemberPremium, String dob, String relation, boolean biologicalChild, String biologicalReason) {
			super();
			this.name = name;
			this.surname = surname;
			this.gender = gender;
			this.benefitType = benefitType;
			this.coverMember = coverMember;
			this.covermemberPremium = covermemberPremium;
			this.dob = dob;
			this.relation = relation;
			this.biologicalChild = biologicalChild;
			this.biologicalReason = biologicalReason;
		}
		public RelMember(String string, String string2, String string3, String string4, String string5, String string6,
				String string7, boolean b, boolean c) {
			// TODO Auto-generated constructor stub
		}

}

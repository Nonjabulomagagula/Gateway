package getIDrequest;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SubmitNewBusi {
	@Test(priority=1)
public void mfpNewBusinessQuote(){
	Root root = new Root();
	root.inceptionDate = "2022-04-01T00:00:00+02:00";
	root.schemeCode = "7009005";
	root.user = "MetRetailNewBusinessAPIUser";
	
	ArrayList<policyHolder> policyHolders = new ArrayList<policyHolder>();
	policyHolders.add(new policyHolder("1"));
	root.policyHolders = policyHolders;
	root.quoteStatus = "QUOTE";
	
	
	ArrayList<Life> Lives = new ArrayList<Life>();
	ArrayList<Life> Lives2 = new ArrayList<Life>();
	ArrayList<Life> Lives3 = new ArrayList<Life>();
	ArrayList<Life> Lives4 = new ArrayList<Life>();
	ArrayList<Life> Lives5 = new ArrayList<Life>();
	ArrayList<Life> Lives6 = new ArrayList<Life>();
	ArrayList<Life> Lives7 = new ArrayList<Life>();
	ArrayList<Life> Lives8 = new ArrayList<Life>();
	ArrayList<Life> Lives9 = new ArrayList<Life>();
	ArrayList<Life> Lives10 = new ArrayList<Life>();
	ArrayList<Life> Lives11 = new ArrayList<Life>();
	ArrayList<Life> Lives12 = new ArrayList<Life>();
	ArrayList<Life> Lives13 = new ArrayList<Life>();
	ArrayList<Life> Lives14 = new ArrayList<Life>();
	
	
	Lives.add(new Life("1"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFMM","20200401","STLV"), 80000,6,6,"MFIX",false,Lives));
	Lives2.add(new Life("2"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 70000,6,6,"MFIX",false,Lives2));
    Lives3.add(new Life("3"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 15000,6,6,"MFIX",false,Lives3));
	Lives4.add(new Life("4"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 75000,6,6,"MFIX",false,Lives4));
	Lives5.add(new Life("5"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 25000,6,6,"MFIX",false,Lives5));
	Lives6.add(new Life("6"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 25000,6,6,"MFIX",false,Lives6));
	Lives7.add(new Life("7"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 40000,6,6,"MFIX",false,Lives7));
	Lives8.add(new Life("8"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFUC","20200401","STLV"), 35000,6,6,"MFIX",false,Lives8));
	Lives9.add(new Life("9"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 35000,6,6,"MFIX",false,Lives9));
	Lives10.add(new Life("10"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 25000,6,6,"MFIX",false,Lives10));
	Lives11.add(new Life("11"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 10000,6,6,"MFIX",false,Lives11));
	Lives12.add(new Life("12"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 15000,6,6,"MFIX",false,Lives12));
	Lives13.add(new Life("13"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 5000,6,6,"MFIX",false,Lives13));
	Lives14.add(new Life("14"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 5000,6,6,"MFIX",false,Lives14));
	 
	
	ArrayList<Object> Address = new ArrayList<Object>();
	ArrayList<Object> ContactNumbers = new ArrayList<Object>();
	root.roleplayers.add(new Roleplayer("natural", "1", true, "cms", Address, ContactNumbers,"1963-01-01T00:00:00+02:00","","","Male"));
	root.roleplayers.add(new Roleplayer("natural", "2", true, "cms", Address, ContactNumbers,"1963-02-01T00:00:00+02:00","Radia","Kalam","Female"));
	root.roleplayers.add(new Roleplayer("natural", "3", true, "cms", Address, ContactNumbers,"1942-01-01T00:00:00+02:00","Yhjkf","Kalam","Male"));
	root.roleplayers.add(new Roleplayer("natural", "4", true, "cms", Address, ContactNumbers,"1947-01-01T00:00:00+02:00","yuy","Kalamd","Male"));
	root.roleplayers.add(new Roleplayer("natural", "5", true, "cms", Address, ContactNumbers,"1962-01-01T00:00:00+02:00","jh","Kalams","Male"));
	root.roleplayers.add(new Roleplayer("natural", "6", true, "cms", Address, ContactNumbers,"2004-01-01T00:00:00+02:00","yukj","Kalamg","Male"));
	root.roleplayers.add(new Roleplayer("natural", "7", true, "cms", Address, ContactNumbers,"2020-01-01T00:00:00+02:00","wasd","Kala","Male"));
	root.roleplayers.add(new Roleplayer("natural", "8", true, "cms", Address, ContactNumbers,"2005-01-01T00:00:00+02:00","sdf","Kalayu","Male"));
	root.roleplayers.add(new Roleplayer("natural", "9", true, "cms", Address, ContactNumbers,"2002-01-01T00:00:00+02:00","awserdft","Kalff","Male"));
	root.roleplayers.add(new Roleplayer("natural", "10", true, "cms", Address, ContactNumbers,"2006-01-01T00:00:00+02:00","fgh","rtfvygbh","Male"));
	root.roleplayers.add(new Roleplayer("natural", "11", true, "cms", Address, ContactNumbers,"1998-01-01T00:00:00+02:00","ghj","Kalam","Female"));
	root.roleplayers.add(new Roleplayer("natural", "12", true, "cms", Address, ContactNumbers,"2020-01-01T00:00:00+02:00","rtfg","Kalam","Female"));
	root.roleplayers.add(new Roleplayer("natural", "13", true, "cms", Address, ContactNumbers,"2017-01-01T00:00:00+02:00","fchbj","Kalam","Female"));
	root.roleplayers.add(new Roleplayer("natural", "14", true, "cms", Address, ContactNumbers,"1961-01-01T00:00:00+02:00","qwer","Kalam","Female"));
	
	
	 Response postResp=RestAssured.given()
			 .auth().preemptive()
			 .basic("getup","password123#")
			 .contentType(ContentType.JSON)
			 .when()
			 .body(root).log().all()
			 .post("/");
	 
	 System.out.println("Post response for Quote is "+postResp.asString());
	 System.out.println("Post response code for Quote  is "+postResp.statusCode());
}

	@Test(priority=2)
public void mfpNewBusinessQuote1(){
	Root root = new Root();
	root.inceptionDate = "2022-04-01T00:00:00+02:00";
	root.schemeCode = "7009005";
	root.user = "MetRetailNewBusinessAPIUser";
	
	ArrayList<policyHolder> policyHolders = new ArrayList<policyHolder>();
	policyHolders.add(new policyHolder("1"));
	root.policyHolders = policyHolders;
	root.quoteStatus = "QUOTE";
	
	
	
	
	ArrayList<Life> Lives = new ArrayList<Life>();
	ArrayList<Life> Lives2 = new ArrayList<Life>();
	ArrayList<Life> Lives3 = new ArrayList<Life>();
	ArrayList<Life> Lives4 = new ArrayList<Life>();
	ArrayList<Life> Lives5 = new ArrayList<Life>();
	ArrayList<Life> Lives6 = new ArrayList<Life>();
	ArrayList<Life> Lives7 = new ArrayList<Life>();
	ArrayList<Life> Lives8 = new ArrayList<Life>();
	ArrayList<Life> Lives9 = new ArrayList<Life>();
	ArrayList<Life> Lives10 = new ArrayList<Life>();
	ArrayList<Life> Lives11 = new ArrayList<Life>();
	ArrayList<Life> Lives12 = new ArrayList<Life>();
	ArrayList<Life> Lives13 = new ArrayList<Life>();
	ArrayList<Life> Lives14 = new ArrayList<Life>();
	ArrayList<Life> Lives15 = new ArrayList<Life>();
	
	
	Lives.add(new Life("1"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFMM","20200401","STLV"), 70000,6,6,"MFIX",false,Lives));
	Lives2.add(new Life("2"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 35000,6,6,"MFIX",false,Lives2));
    Lives3.add(new Life("3"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 80000,6,6,"MFIX",false,Lives3));
	Lives4.add(new Life("4"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 20000,6,6,"MFIX",false,Lives4));
	Lives5.add(new Life("5"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 25000,6,6,"MFIX",false,Lives5));
	Lives6.add(new Life("6"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 5000,6,6,"MFIX",false,Lives6));
	Lives7.add(new Life("7"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 65000,6,6,"MFIX",false,Lives7));
	Lives8.add(new Life("8"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 50000,6,6,"MFIX",false,Lives8));
	Lives9.add(new Life("9"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 15000,6,6,"MFIX",false,Lives9));
	Lives10.add(new Life("10"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 20000,6,6,"MFIX",false,Lives10));
	Lives11.add(new Life("11"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFUC","20200401","STLV"), 50000,6,6,"MFIX",false,Lives11));
	Lives12.add(new Life("12"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 50000,6,6,"MFIX",false,Lives12));
	Lives13.add(new Life("13"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 30000,6,6,"MFIX",false,Lives13));
	Lives14.add(new Life("14"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 25000,6,6,"MFIX",false,Lives14));
	Lives15.add(new Life("15"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 45000,6,6,"MFIX",false,Lives15));
	 
	
	ArrayList<Object> Address = new ArrayList<Object>();
	ArrayList<Object> ContactNumbers = new ArrayList<Object>();
	root.roleplayers.add(new Roleplayer("natural", "1", true, "cms", Address, ContactNumbers,"1968-01-01T00:00:00+02:00","","","Male"));
	root.roleplayers.add(new Roleplayer("natural", "2", true, "cms", Address, ContactNumbers,"1968-01-01T00:00:00+02:00","Radia","Kalam","Female"));
	root.roleplayers.add(new Roleplayer("natural", "3", true, "cms", Address, ContactNumbers,"2004-01-01T00:00:00+02:00","Yhjkf","Kalam","Male"));
	root.roleplayers.add(new Roleplayer("natural", "4", true, "cms", Address, ContactNumbers,"1940-01-01T00:00:00+02:00","yuy","Kalamd","Male"));
	root.roleplayers.add(new Roleplayer("natural", "5", true, "cms", Address, ContactNumbers,"1992-01-01T00:00:00+02:00","jh","Kalams","Male"));
	root.roleplayers.add(new Roleplayer("natural", "6", true, "cms", Address, ContactNumbers,"1964-01-01T00:00:00+02:00","yukj","Kalamg","Male"));
	root.roleplayers.add(new Roleplayer("natural", "7", true, "cms", Address, ContactNumbers,"1973-01-01T00:00:00+02:00","wasd","Kala","Male"));
	root.roleplayers.add(new Roleplayer("natural", "8", true, "cms", Address, ContactNumbers,"1964-01-01T00:00:00+02:00","sdf","Kalayu","Male"));
	root.roleplayers.add(new Roleplayer("natural", "9", true, "cms", Address, ContactNumbers,"1962-01-01T00:00:00+02:00","awserdft","Kalff","Male"));
	root.roleplayers.add(new Roleplayer("natural", "10", true, "cms", Address, ContactNumbers,"2020-01-01T00:00:00+02:00","fgh","rtfvygbh","Male"));
	root.roleplayers.add(new Roleplayer("natural", "11", true, "cms", Address, ContactNumbers,"2007-01-01T00:00:00+02:00","ghj","Kalam","Female"));
	root.roleplayers.add(new Roleplayer("natural", "12", true, "cms", Address, ContactNumbers,"2004-01-01T00:00:00+02:00","rtfg","Kalam","Female"));
	root.roleplayers.add(new Roleplayer("natural", "13", true, "cms", Address, ContactNumbers,"2015-01-01T00:00:00+02:00","fchbj","Kalam","Female"));
	root.roleplayers.add(new Roleplayer("natural", "14", true, "cms", Address, ContactNumbers,"2012-01-01T00:00:00+02:00","qwer","Kalam","Female"));
	root.roleplayers.add(new Roleplayer("natural", "15", true, "cms", Address, ContactNumbers,"2006-01-01T00:00:00+02:00","qwer","Kalam","Female"));
	
	
	 Response postResp=RestAssured.given()
			 .auth().preemptive()
			 .basic("getup","password123#")
			 .contentType(ContentType.JSON)
			 .when()
			 .body(root).log().all()
			 .post("https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/newBusinessQuote");
	 
	 System.out.println("Post response for Quote is "+postResp.asString());
	 System.out.println("Post response code for Quote  is "+postResp.statusCode());
}
		@Test(priority=3)
	public void mfpNewBusinessQuote3(){
		Root root = new Root();
		root.inceptionDate = "2022-04-01T00:00:00+02:00";
		root.schemeCode = "7009005";
		root.user = "MetRetailNewBusinessAPIUser";
		
		ArrayList<policyHolder> policyHolders = new ArrayList<policyHolder>();
		policyHolders.add(new policyHolder("1"));
		root.policyHolders = policyHolders;
		root.quoteStatus = "QUOTE";
		
		
		ArrayList<Life> Lives = new ArrayList<Life>();
		ArrayList<Life> Lives2 = new ArrayList<Life>();
		ArrayList<Life> Lives3 = new ArrayList<Life>();
		ArrayList<Life> Lives4 = new ArrayList<Life>();
		ArrayList<Life> Lives5 = new ArrayList<Life>();
		ArrayList<Life> Lives6 = new ArrayList<Life>();
		ArrayList<Life> Lives7 = new ArrayList<Life>();
		ArrayList<Life> Lives8 = new ArrayList<Life>();
		ArrayList<Life> Lives9 = new ArrayList<Life>();
		ArrayList<Life> Lives10 = new ArrayList<Life>();
		ArrayList<Life> Lives11 = new ArrayList<Life>();
		ArrayList<Life> Lives12 = new ArrayList<Life>();
		ArrayList<Life> Lives13 = new ArrayList<Life>();
		ArrayList<Life> Lives14 = new ArrayList<Life>();
		ArrayList<Life> Lives15 = new ArrayList<Life>();
		
		
		Lives.add(new Life("1"));
		Lives.add(new Life("1"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFMM","20200401","STLV"), 25000,6,6,"MFIX",false,Lives));
		Lives2.add(new Life("2"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 35000,6,6,"MFIX",false,Lives2));
	    Lives3.add(new Life("3"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 80000,6,6,"MFIX",false,Lives3));
		Lives4.add(new Life("4"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 20000,6,6,"MFIX",false,Lives4));
		Lives5.add(new Life("5"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 25000,6,6,"MFIX",false,Lives5));
		Lives6.add(new Life("6"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 5000,6,6,"MFIX",false,Lives6));
		Lives7.add(new Life("7"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 65000,6,6,"MFIX",false,Lives7));
		Lives8.add(new Life("8"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 50000,6,6,"MFIX",false,Lives8));
		Lives9.add(new Life("9"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 15000,6,6,"MFIX",false,Lives9));
		Lives10.add(new Life("10"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 20000,6,6,"MFIX",false,Lives10));
		Lives11.add(new Life("11"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFUC","20200401","STLV"), 50000,6,6,"MFIX",false,Lives11));
		Lives12.add(new Life("12"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 50000,6,6,"MFIX",false,Lives12));
		Lives13.add(new Life("13"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 30000,6,6,"MFIX",false,Lives13));
		Lives14.add(new Life("14"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 25000,6,6,"MFIX",false,Lives14));
		Lives15.add(new Life("15"));
		root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 45000,6,6,"MFIX",false,Lives15));
		 
		
		ArrayList<Object> Address = new ArrayList<Object>();
		ArrayList<Object> ContactNumbers = new ArrayList<Object>();
		root.roleplayers.add(new Roleplayer("natural", "1", true, "cms", Address, ContactNumbers,"1968-01-01T00:00:00+02:00","","","Male"));
		root.roleplayers.add(new Roleplayer("natural", "2", true, "cms", Address, ContactNumbers,"1968-01-01T00:00:00+02:00","Radia","Kalam","Female"));
		root.roleplayers.add(new Roleplayer("natural", "3", true, "cms", Address, ContactNumbers,"2004-01-01T00:00:00+02:00","Yhjkf","Kalam","Male"));
		root.roleplayers.add(new Roleplayer("natural", "4", true, "cms", Address, ContactNumbers,"1940-01-01T00:00:00+02:00","yuy","Kalamd","Male"));
		root.roleplayers.add(new Roleplayer("natural", "5", true, "cms", Address, ContactNumbers,"1992-01-01T00:00:00+02:00","jh","Kalams","Male"));
		root.roleplayers.add(new Roleplayer("natural", "6", true, "cms", Address, ContactNumbers,"1964-01-01T00:00:00+02:00","yukj","Kalamg","Male"));
		root.roleplayers.add(new Roleplayer("natural", "7", true, "cms", Address, ContactNumbers,"1973-01-01T00:00:00+02:00","wasd","Kala","Male"));
		root.roleplayers.add(new Roleplayer("natural", "8", true, "cms", Address, ContactNumbers,"1964-01-01T00:00:00+02:00","sdf","Kalayu","Male"));
		root.roleplayers.add(new Roleplayer("natural", "9", true, "cms", Address, ContactNumbers,"1962-01-01T00:00:00+02:00","awserdft","Kalff","Male"));
		root.roleplayers.add(new Roleplayer("natural", "10", true, "cms", Address, ContactNumbers,"2020-01-01T00:00:00+02:00","fgh","rtfvygbh","Male"));
		root.roleplayers.add(new Roleplayer("natural", "11", true, "cms", Address, ContactNumbers,"2007-01-01T00:00:00+02:00","ghj","Kalam","Female"));
		root.roleplayers.add(new Roleplayer("natural", "12", true, "cms", Address, ContactNumbers,"2004-01-01T00:00:00+02:00","rtfg","Kalam","Female"));
		root.roleplayers.add(new Roleplayer("natural", "13", true, "cms", Address, ContactNumbers,"2015-01-01T00:00:00+02:00","fchbj","Kalam","Female"));
		root.roleplayers.add(new Roleplayer("natural", "14", true, "cms", Address, ContactNumbers,"2012-01-01T00:00:00+02:00","qwer","Kalam","Female"));
		root.roleplayers.add(new Roleplayer("natural", "15", true, "cms", Address, ContactNumbers,"2006-01-01T00:00:00+02:00","qwer","Kalam","Female"));
		
		
		 Response postResp=RestAssured.given()
				 .auth().preemptive()
				 .basic("getup","password123#")
				 .contentType(ContentType.JSON)
				 .when()
				 .body(root).log().all()
				 .post("https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/newBusinessQuote");
		 
		 System.out.println("Post response for Quote is "+postResp.asString());
		 System.out.println("Post response code for Quote  is "+postResp.statusCode());
	}
		
		@Test(priority=4)
		public void mfpNewBusinessQuote4(){
			Root root = new Root();
			root.inceptionDate = "2022-04-01T00:00:00+02:00";
			root.schemeCode = "7009005";
			root.user = "MetRetailNewBusinessAPIUser";
			
			ArrayList<policyHolder> policyHolders = new ArrayList<policyHolder>();
			policyHolders.add(new policyHolder("1"));
			root.policyHolders = policyHolders;
			root.quoteStatus = "QUOTE";
			
			
			ArrayList<Life> Lives = new ArrayList<Life>();
			ArrayList<Life> Lives2 = new ArrayList<Life>();
			ArrayList<Life> Lives3 = new ArrayList<Life>();
			ArrayList<Life> Lives4 = new ArrayList<Life>();
			ArrayList<Life> Lives5 = new ArrayList<Life>();
			ArrayList<Life> Lives6 = new ArrayList<Life>();
			ArrayList<Life> Lives7 = new ArrayList<Life>();
			ArrayList<Life> Lives8 = new ArrayList<Life>();
			ArrayList<Life> Lives9 = new ArrayList<Life>();
			ArrayList<Life> Lives10 = new ArrayList<Life>();
			ArrayList<Life> Lives11 = new ArrayList<Life>();
			ArrayList<Life> Lives12 = new ArrayList<Life>();
			ArrayList<Life> Lives13 = new ArrayList<Life>();
			ArrayList<Life> Lives14 = new ArrayList<Life>();
			ArrayList<Life> Lives15 = new ArrayList<Life>();
			
			
			Lives.add(new Life("1"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFMM","20200401","STLV"), 45000,6,6,"MFIX",false,Lives));
			Lives2.add(new Life("2"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 45000,6,6,"MFIX",false,Lives2));
		    Lives3.add(new Life("3"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 45000,6,6,"MFIX",false,Lives3));
			Lives4.add(new Life("4"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 45000,6,6,"MFIX",false,Lives4));
			Lives5.add(new Life("5"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 45000,6,6,"MFIX",false,Lives5));
			Lives6.add(new Life("6"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 45000,6,6,"MFIX",false,Lives6));
			Lives7.add(new Life("7"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 45000,6,6,"MFIX",false,Lives7));
			Lives8.add(new Life("8"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFUC","20200401","STLV"), 45000,6,6,"MFIX",false,Lives8));
			Lives9.add(new Life("9"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 45000,6,6,"MFIX",false,Lives9));
			Lives10.add(new Life("10"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 45000,6,6,"MFIX",false,Lives10));
			Lives11.add(new Life("11"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 45000,6,6,"MFIX",false,Lives11));
			Lives12.add(new Life("12"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 45000,6,6,"MFIX",false,Lives12));
			Lives13.add(new Life("13"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 45000,6,6,"MFIX",false,Lives13));
			Lives14.add(new Life("14"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 45000,6,6,"MFIX",false,Lives14));
			Lives15.add(new Life("15"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 45000,6,6,"MFIX",false,Lives15));
			 
			
			ArrayList<Object> Address = new ArrayList<Object>();
			ArrayList<Object> ContactNumbers = new ArrayList<Object>();
			root.roleplayers.add(new Roleplayer("natural", "1", true, "cms", Address, ContactNumbers,"1989-09-27T00:00:00+02:00","","","Male"));
			root.roleplayers.add(new Roleplayer("natural", "2", true, "cms", Address, ContactNumbers,"1995-06-12T00:00:00+02:00","Radia","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "3", true, "cms", Address, ContactNumbers,"1970-04-04T00:00:00+02:00","Yhjkf","Kalam","Male"));
			root.roleplayers.add(new Roleplayer("natural", "4", true, "cms", Address, ContactNumbers,"1999-04-04T00:00:00+02:00","yuy","Kalamd","Male"));
			root.roleplayers.add(new Roleplayer("natural", "5", true, "cms", Address, ContactNumbers,"1979-04-04T00:00:00+02:00","jh","Kalams","Male"));
			root.roleplayers.add(new Roleplayer("natural", "6", true, "cms", Address, ContactNumbers,"1980-04-04T00:00:00+02:00","yukj","Kalamg","Male"));
			root.roleplayers.add(new Roleplayer("natural", "7", true, "cms", Address, ContactNumbers,"1999-04-04T00:00:00+02:00","wasd","Kala","Male"));
			root.roleplayers.add(new Roleplayer("natural", "8", true, "cms", Address, ContactNumbers,"2018-04-04T00:00:00+02:00","sdf","Kalayu","Male"));
			root.roleplayers.add(new Roleplayer("natural", "9", true, "cms", Address, ContactNumbers,"1979-04-04T00:00:00+02:00","awserdft","Kalff","Male"));
			root.roleplayers.add(new Roleplayer("natural", "10", true, "cms", Address, ContactNumbers,"1995-04-04T00:00:00+02:00","fgh","rtfvygbh","Male"));
			root.roleplayers.add(new Roleplayer("natural", "11", true, "cms", Address, ContactNumbers,"1985-04-04T00:00:00+02:00","ghj","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "12", true, "cms", Address, ContactNumbers,"2001-04-04T00:00:00+02:00","rtfg","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "13", true, "cms", Address, ContactNumbers,"2002-04-04T00:00:00+02:00","fchbj","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "14", true, "cms", Address, ContactNumbers,"1988-04-04T00:00:00+02:00","qwer","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "15", true, "cms", Address, ContactNumbers,"1976-04-04T00:00:00+02:00","qwer","Kalam","Female"));
			
			
			 Response postResp=RestAssured.given()
					 .auth().preemptive()
					 .basic("getup","password123#")
					 .contentType(ContentType.JSON)
					 .when()
					 .body(root).log().all()
					 .post("https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/newBusinessQuote");
			 
			 System.out.println("Post response for Quote is "+postResp.asString());
			 System.out.println("Post response code for Quote  is "+postResp.statusCode());
		}
		
		
		@Test(priority=5)
		public void mfpNewBusinessQuote5(){
			Root root = new Root();
			root.inceptionDate = "2022-04-01T00:00:00+02:00";
			root.schemeCode = "7009005";
			root.user = "MetRetailNewBusinessAPIUser";
			
			ArrayList<policyHolder> policyHolders = new ArrayList<policyHolder>();
			policyHolders.add(new policyHolder("1"));
			root.policyHolders = policyHolders;
			root.quoteStatus = "QUOTE";
			
			
			ArrayList<Life> Lives = new ArrayList<Life>();
			ArrayList<Life> Lives2 = new ArrayList<Life>();
			ArrayList<Life> Lives3 = new ArrayList<Life>();
			ArrayList<Life> Lives4 = new ArrayList<Life>();
			ArrayList<Life> Lives5 = new ArrayList<Life>();
			ArrayList<Life> Lives6 = new ArrayList<Life>();
			ArrayList<Life> Lives7 = new ArrayList<Life>();
			ArrayList<Life> Lives8 = new ArrayList<Life>();
			ArrayList<Life> Lives9 = new ArrayList<Life>();
			ArrayList<Life> Lives10 = new ArrayList<Life>();
			ArrayList<Life> Lives11 = new ArrayList<Life>();
			ArrayList<Life> Lives12 = new ArrayList<Life>();
			ArrayList<Life> Lives13 = new ArrayList<Life>();
			ArrayList<Life> Lives14 = new ArrayList<Life>();
			ArrayList<Life> Lives15 = new ArrayList<Life>();
			
			
			Lives.add(new Life("1"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFMM","20200401","STLV"), 50000,6,6,"MFIX",false,Lives));
			Lives2.add(new Life("2"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 50000,6,6,"MFIX",false,Lives2));
		    Lives3.add(new Life("3"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 50000,6,6,"MFIX",false,Lives3));
			Lives4.add(new Life("4"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 50000,6,6,"MFIX",false,Lives4));
			Lives5.add(new Life("5"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 50000,6,6,"MFIX",false,Lives5));
			Lives6.add(new Life("6"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 50000,6,6,"MFIX",false,Lives6));
			Lives7.add(new Life("7"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 50000,6,6,"MFIX",false,Lives7));
			Lives8.add(new Life("8"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFUC","20200401","STLV"), 50000,6,6,"MFIX",false,Lives8));
			Lives9.add(new Life("9"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 50000,6,6,"MFIX",false,Lives9));
			Lives10.add(new Life("10"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 50000,6,6,"MFIX",false,Lives10));
			Lives11.add(new Life("11"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 50000,6,6,"MFIX",false,Lives11));
			Lives12.add(new Life("12"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 50000,6,6,"MFIX",false,Lives12));
			Lives13.add(new Life("13"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 50000,6,6,"MFIX",false,Lives13));
			Lives14.add(new Life("14"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 50000,6,6,"MFIX",false,Lives14));
			Lives15.add(new Life("15"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 50000,6,6,"MFIX",false,Lives15));
			 
			
			ArrayList<Object> Address = new ArrayList<Object>();
			ArrayList<Object> ContactNumbers = new ArrayList<Object>();
			root.roleplayers.add(new Roleplayer("natural", "1", true, "cms", Address, ContactNumbers,"1989-09-27T00:00:00+02:00","","","Male"));
			root.roleplayers.add(new Roleplayer("natural", "2", true, "cms", Address, ContactNumbers,"1995-06-12T00:00:00+02:00","Radia","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "3", true, "cms", Address, ContactNumbers,"1970-04-04T00:00:00+02:00","Yhjkf","Kalam","Male"));
			root.roleplayers.add(new Roleplayer("natural", "4", true, "cms", Address, ContactNumbers,"1999-04-04T00:00:00+02:00","yuy","Kalamd","Male"));
			root.roleplayers.add(new Roleplayer("natural", "5", true, "cms", Address, ContactNumbers,"1979-04-04T00:00:00+02:00","jh","Kalams","Male"));
			root.roleplayers.add(new Roleplayer("natural", "6", true, "cms", Address, ContactNumbers,"1980-04-04T00:00:00+02:00","yukj","Kalamg","Male"));
			root.roleplayers.add(new Roleplayer("natural", "7", true, "cms", Address, ContactNumbers,"1999-04-04T00:00:00+02:00","wasd","Kala","Male"));
			root.roleplayers.add(new Roleplayer("natural", "8", true, "cms", Address, ContactNumbers,"2018-04-04T00:00:00+02:00","sdf","Kalayu","Male"));
			root.roleplayers.add(new Roleplayer("natural", "9", true, "cms", Address, ContactNumbers,"1979-04-04T00:00:00+02:00","awserdft","Kalff","Male"));
			root.roleplayers.add(new Roleplayer("natural", "10", true, "cms", Address, ContactNumbers,"1995-04-04T00:00:00+02:00","fgh","rtfvygbh","Male"));
			root.roleplayers.add(new Roleplayer("natural", "11", true, "cms", Address, ContactNumbers,"1985-04-04T00:00:00+02:00","ghj","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "12", true, "cms", Address, ContactNumbers,"2001-04-04T00:00:00+02:00","rtfg","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "13", true, "cms", Address, ContactNumbers,"2002-04-04T00:00:00+02:00","fchbj","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "14", true, "cms", Address, ContactNumbers,"1988-04-04T00:00:00+02:00","qwer","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "15", true, "cms", Address, ContactNumbers,"1976-04-04T00:00:00+02:00","qwer","Kalam","Female"));
			
			
			 Response postResp=RestAssured.given()
					 .auth().preemptive()
					 .basic("getup","password123#")
					 .contentType(ContentType.JSON)
					 .when()
					 .body(root).log().all()
					 .post("https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/newBusinessQuote");
			 
			 System.out.println("Post response for Quote is "+postResp.asString());
			 System.out.println("Post response code for Quote  is "+postResp.statusCode());
		}
		@Test(priority=6)
		public void mfpNewBusinessQuote6(){
			Root root = new Root();
			root.inceptionDate = "2022-04-01T00:00:00+02:00";
			root.schemeCode = "7009005";
			root.user = "MetRetailNewBusinessAPIUser";
			
			ArrayList<policyHolder> policyHolders = new ArrayList<policyHolder>();
			policyHolders.add(new policyHolder("1"));
			root.policyHolders = policyHolders;
			root.quoteStatus = "QUOTE";
			
			
			ArrayList<Life> Lives = new ArrayList<Life>();
			ArrayList<Life> Lives2 = new ArrayList<Life>();
			ArrayList<Life> Lives3 = new ArrayList<Life>();
			ArrayList<Life> Lives4 = new ArrayList<Life>();
			ArrayList<Life> Lives5 = new ArrayList<Life>();
			ArrayList<Life> Lives6 = new ArrayList<Life>();
			ArrayList<Life> Lives7 = new ArrayList<Life>();
			ArrayList<Life> Lives8 = new ArrayList<Life>();
			ArrayList<Life> Lives9 = new ArrayList<Life>();
			ArrayList<Life> Lives10 = new ArrayList<Life>();
			ArrayList<Life> Lives11 = new ArrayList<Life>();
			ArrayList<Life> Lives12 = new ArrayList<Life>();
			ArrayList<Life> Lives13 = new ArrayList<Life>();
			ArrayList<Life> Lives14 = new ArrayList<Life>();
			ArrayList<Life> Lives15 = new ArrayList<Life>();
			
			
			Lives.add(new Life("1"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFMM","20200401","STLV"), 50000,6,6,"MFIX",false,Lives));
			Lives2.add(new Life("2"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 50000,6,6,"MFIX",false,Lives2));
		    Lives3.add(new Life("3"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 50000,6,6,"MFIX",false,Lives3));
			Lives4.add(new Life("4"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 50000,6,6,"MFIX",false,Lives4));
			Lives5.add(new Life("5"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 50000,6,6,"MFIX",false,Lives5));
			Lives6.add(new Life("6"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 50000,6,6,"MFIX",false,Lives6));
			Lives7.add(new Life("7"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 50000,6,6,"MFIX",false,Lives7));
			Lives8.add(new Life("8"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFUC","20200401","STLV"), 50000,6,6,"MFIX",false,Lives8));
			Lives9.add(new Life("9"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 25000,6,6,"MFIX",false,Lives9));
			Lives10.add(new Life("10"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 25000,6,6,"MFIX",false,Lives10));
			Lives11.add(new Life("11"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 10000,6,6,"MFIX",false,Lives11));
			Lives12.add(new Life("12"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 35000,6,6,"MFIX",false,Lives12));
			Lives13.add(new Life("13"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFCL","20200401","STLV"), 15000,6,6,"MFIX",false,Lives13));
			Lives14.add(new Life("14"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 15000,6,6,"MFIX",false,Lives14));
			Lives15.add(new Life("15"));
			root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFEF","20200401","STLV"), 35000,6,6,"MFIX",false,Lives15));
			 
			
			ArrayList<Object> Address = new ArrayList<Object>();
			ArrayList<Object> ContactNumbers = new ArrayList<Object>();
			root.roleplayers.add(new Roleplayer("natural", "1", true, "cms", Address, ContactNumbers,"1989-09-27T00:00:00+02:00","","","Male"));
			root.roleplayers.add(new Roleplayer("natural", "2", true, "cms", Address, ContactNumbers,"1995-06-12T00:00:00+02:00","Radia","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "3", true, "cms", Address, ContactNumbers,"1970-04-04T00:00:00+02:00","Yhjkf","Kalam","Male"));
			root.roleplayers.add(new Roleplayer("natural", "4", true, "cms", Address, ContactNumbers,"1999-04-04T00:00:00+02:00","yuy","Kalamd","Male"));
			root.roleplayers.add(new Roleplayer("natural", "5", true, "cms", Address, ContactNumbers,"1979-04-04T00:00:00+02:00","jh","Kalams","Male"));
			root.roleplayers.add(new Roleplayer("natural", "6", true, "cms", Address, ContactNumbers,"1980-04-04T00:00:00+02:00","yukj","Kalamg","Male"));
			root.roleplayers.add(new Roleplayer("natural", "7", true, "cms", Address, ContactNumbers,"1999-04-04T00:00:00+02:00","wasd","Kala","Male"));
			root.roleplayers.add(new Roleplayer("natural", "8", true, "cms", Address, ContactNumbers,"2018-04-04T00:00:00+02:00","sdf","Kalayu","Male"));
			root.roleplayers.add(new Roleplayer("natural", "9", true, "cms", Address, ContactNumbers,"1979-04-04T00:00:00+02:00","awserdft","Kalff","Male"));
			root.roleplayers.add(new Roleplayer("natural", "10", true, "cms", Address, ContactNumbers,"1995-04-04T00:00:00+02:00","fgh","rtfvygbh","Male"));
			root.roleplayers.add(new Roleplayer("natural", "11", true, "cms", Address, ContactNumbers,"1985-04-04T00:00:00+02:00","ghj","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "12", true, "cms", Address, ContactNumbers,"2001-04-04T00:00:00+02:00","rtfg","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "13", true, "cms", Address, ContactNumbers,"2002-04-04T00:00:00+02:00","fchbj","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "14", true, "cms", Address, ContactNumbers,"1988-04-04T00:00:00+02:00","qwer","Kalam","Female"));
			root.roleplayers.add(new Roleplayer("natural", "15", true, "cms", Address, ContactNumbers,"1976-04-04T00:00:00+02:00","qwer","Kalam","Female"));
			
			
			 Response postResp=RestAssured.given()
					 .auth().preemptive()
					 .basic("getup","password123#")
					 .contentType(ContentType.JSON)
					 .when()
					 .body(root).log().all()
					 .post("https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/newBusinessQuote");
			 
			 System.out.println("Post response for Quote is "+postResp.asString());
			 System.out.println("Post response code for Quote  is "+postResp.statusCode());
		}
}


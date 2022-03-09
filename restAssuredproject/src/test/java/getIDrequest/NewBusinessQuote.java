package getIDrequest;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class NewBusinessQuote 
{
	private NewQuote NewQuote;
	
	public NewBusinessQuote() 
	{
		NewQuote = new NewQuote();

	}
	@Test(priority=1)
	private void SetupData()
	{
		NewQuote.quoteNumber = "6ea2220d-4833-4a75-b800-f8fc7f13acb2";
		NewQuote.inceptionDate = "2022-04-01";
		NewQuote.quoteCreateDate = "2022-03-04";
		NewQuote.schemeCode = "7009005";
		NewQuote.premiumDebt = 0;
		NewQuote.outstandingDebt = 0;
		NewQuote.premiumSkipCount = 0;
		NewQuote.sourceOfBusiness = "Metropolitan";
		NewQuote.user = "MetRetailNewBusinessAPIUser";
		NewQuote.policyHolders.add(new PolicyHolderz("1",0));
		NewQuote.quoteStatus = "QUOTE";
		BenefitIdentifierss BenefitIdentification = new BenefitIdentifierss("RSA",863,"METF","MFMM","20200401","STLV");
		BenefitIdentifierss BenefitIdentification2 = new BenefitIdentifierss("RSA",863,"METF","MFSP","20200401","STLV");
		BenefitIdentifierss BenefitIdentification3 = new BenefitIdentifierss("RSA",863,"METF","MFSP","20200401","STLV");
		BenefitIdentifierss BenefitIdentification4 = new BenefitIdentifierss("RSA",863,"METF","MFPA","20200401","STLV");
		BenefitIdentifierss BenefitIdentification5 = new BenefitIdentifierss("RSA",863,"METF","MFPA","20200401","STLV");
		BenefitIdentifierss BenefitIdentification6 = new BenefitIdentifierss("RSA",863,"METF","MFEF","20200401","STLV");
		BenefitIdentifierss BenefitIdentification7 = new BenefitIdentifierss("RSA",863,"METF","MFEF","20200401","STLV");
		BenefitIdentifierss BenefitIdentification8 = new BenefitIdentifierss("RSA",863,"METF","MFUC","20200401","STLV");
		BenefitIdentifierss BenefitIdentification9 = new BenefitIdentifierss("RSA",863,"METF","MFCL","20200401","STLV");
		BenefitIdentifierss BenefitIdentification10 = new BenefitIdentifierss("RSA",863,"METF","MFCL","20200401","STLV");
		
		
		
		ArrayList<Lifezz> lives = new  ArrayList<Lifezz>();
		 lives.add(new Lifezz("1"));
		 
		 ArrayList<Lifezz> lives2 = new  ArrayList<Lifezz>();
		 lives2.add(new Lifezz("2"));
		 
		 ArrayList<Lifezz> lives3 = new  ArrayList<Lifezz>();
		 lives3.add(new Lifezz("3"));
		 
		 ArrayList<Lifezz> lives4 = new  ArrayList<Lifezz>();
		 lives4.add(new Lifezz("4"));
		 
		 ArrayList<Lifezz> lives5 = new  ArrayList<Lifezz>();
		 lives5.add(new Lifezz("5"));
		 
		 ArrayList<Lifezz> lives6 = new  ArrayList<Lifezz>();
		 lives6.add(new Lifezz("6"));
		 
		 ArrayList<Lifezz> lives7 = new  ArrayList<Lifezz>();
		 lives7.add(new Lifezz("7"));
		 
		 ArrayList<Lifezz> lives8 = new  ArrayList<Lifezz>();
		 lives8.add(new Lifezz("8"));
		 
		 ArrayList<Lifezz> lives9 = new  ArrayList<Lifezz>();
		 lives9.add(new Lifezz("9"));
		 
		 ArrayList<Lifezz> lives10 = new  ArrayList<Lifezz>();
		 lives10.add(new Lifezz("10"));
		 
		Benefitszz Benefits = new Benefitszz(BenefitIdentification,80000,6,6,"MFIX",lives);
		Benefitszz Benefits2 = new Benefitszz(BenefitIdentification2,70000,6,6,"MFIX",lives2);
		Benefitszz Benefits3 = new Benefitszz(BenefitIdentification3,25000,6,6,"MFIX",lives3);
		Benefitszz Benefits4 = new Benefitszz(BenefitIdentification4,15000,6,6,"MFIX",lives4);
		Benefitszz Benefits5 = new Benefitszz(BenefitIdentification5,75000,6,6,"MFIX",lives5);
		Benefitszz Benefits6 = new Benefitszz(BenefitIdentification6,25000,6,6,"MFIX",lives6);
		Benefitszz Benefits7 = new Benefitszz(BenefitIdentification7,40000,6,6,"MFIX",lives7);
		Benefitszz Benefits8 = new Benefitszz(BenefitIdentification8,35000,6,6,"MFIX",lives8);
		Benefitszz Benefits9 = new Benefitszz(BenefitIdentification9,35000,6,6,"MFIX",lives9);
		Benefitszz Benefits10 = new Benefitszz(BenefitIdentification10,15000,6,6,"MFIX",lives10);
	
		
		NewQuote.benefits.add(Benefits);
		Rolaplayerszz roleplayers = new Rolaplayerszz("natural","1","1","cms","1963-01-01");
		
		NewQuote.benefits.add(Benefits2);
		Rolaplayerszz roleplayers2 = new Rolaplayerszz("natural","2","1","cms","1963-01-01");
		
		NewQuote.benefits.add(Benefits3);
		Rolaplayerszz roleplayers3 = new Rolaplayerszz("natural","3","1","cms","2004-01-01");
		NewQuote.benefits.add(Benefits4);
		Rolaplayerszz roleplayers4 = new Rolaplayerszz("natural","4","1","cms","1942-01-01");
		
		NewQuote.benefits.add(Benefits5);
		Rolaplayerszz roleplayers5 = new Rolaplayerszz("natural","5","1","cms","1947-01-01");
		
		NewQuote.benefits.add(Benefits6);
		Rolaplayerszz roleplayers6 = new Rolaplayerszz("natural","6","1","cms","1962-01-01");
		
		NewQuote.benefits.add(Benefits7);
		Rolaplayerszz roleplayers7 = new Rolaplayerszz("natural","7","1","cms","2020-01-01");
		
		NewQuote.benefits.add(Benefits8);
		Rolaplayerszz roleplayers8 = new Rolaplayerszz("natural","8","1","cms","2005-01-01");
		
		NewQuote.benefits.add(Benefits9);
		Rolaplayerszz roleplayers9 = new Rolaplayerszz("natural","9","1","cms","2002-01-01");
		
		NewQuote.benefits.add(Benefits10);
		Rolaplayerszz roleplayers10 = new Rolaplayerszz("natural","10","1","cms","2020-01-01");
		
		
		NewQuote.roleplayers.add(roleplayers);
		NewQuote.roleplayers.add(roleplayers2);
		NewQuote.roleplayers.add(roleplayers3);
		NewQuote.roleplayers.add(roleplayers4);
		NewQuote.roleplayers.add(roleplayers5);
		NewQuote.roleplayers.add(roleplayers6);
		NewQuote.roleplayers.add(roleplayers7);
		NewQuote.roleplayers.add(roleplayers8);
		NewQuote.roleplayers.add(roleplayers9);
		NewQuote.roleplayers.add(roleplayers10);
		
		NewQuote.flagSubmitNewBusiness = false;
		NewQuote.subChannel = "Comparisure Marketplace Chatbot";
		NewQuote.partnerCommsChannel = "Facebook";
		
		 Response response=RestAssured.given()
				 .auth().preemptive()
				 .basic("getup","password123#")
				 .contentType(ContentType.JSON)
				 .when()
				 .body(NewQuote).log().all()
				 .post("https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/newBusinessQuote");
		 
		
		 System.out.println("Post response for Quote is "+response.asString());
		 System.out.println("Post response code for Quote  is "+response.statusCode());
		 
		 ResponseBody body = response.getBody(); 
		 JSONSuccessResponse responseBody = body.as(JSONSuccessResponse.class); 
		 
		 System.out.println("Flag success"+ responseBody.flagSubmitNewBusiness);
		
		
	}
}

package getIDrequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import  io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetData {
	
	@Test(priority=1)
	public void auditRetrieveFBData()
	{
		Response resp=RestAssured.get("https://api-dev.getup.metropolitan.co.za/gu-gateway/audit/retrieveFacebookData/9111096873084");
		int code=resp.getStatusCode();
		
		System.out.println("Status code for auditRetrieveFBData is " +code);
		
		Assert.assertEquals(code, 200);
	}
	@Test(priority=2)
	public void validateBankingDetails()
	{
		
    		   //RestAssured.baseURI="https://api-dev.getup.metropolitan.co.za/gu-gateway/validation/validateBankingDetails?accountNumber=1754978205&accountType=Savings&bankName=CAPITEC&firstName=Althea&idNumber=9612163160081&lastName=Richards&subChannel=Funeral%20Fusion%20Chatbot";
		//Basic authorization
		PreemptiveBasicAuthScheme authScheme= new PreemptiveBasicAuthScheme();
		authScheme.setUserName("getup");
		authScheme.setPassword("password123#");
		RestAssured.authentication=authScheme;
		
	
		
		//Request object
		//RequestSpecification httpRequest=RestAssured.given();
		Response resp=RestAssured.get("https://api-dev.getup.metropolitan.co.za/gu-gateway/validation/validateBankingDetails?accountNumber=1754978205&accountType=Savings&bankName=CAPITEC&firstName=Althea&idNumber=9612163160081&lastName=Richards&subChannel=Funeral%20Fusion%20Chatbot");
		//Response Object
int code=resp.getStatusCode();
		
		System.out.println("Status code for bank is " +code);
		
		//Response response=httpRequest.request(Method.GET,"/");
		
		//Print request in console window
		
      
		
		
	}
	
	@Test (priority=3)
	public void validateClientInfo()
	{
		
	
		  
			RestAssured.baseURI="https://api-dev.getup.metropolitan.co.za/gu-gateway/validation/validateClientInfo?firstName=Althea&idNumber=9612163160081&lastName=Richards&subChannel=Funeral%20Fusion%20Chatbot";
			
			//Basic authorization
			PreemptiveBasicAuthScheme authScheme= new PreemptiveBasicAuthScheme();
			authScheme.setUserName("getup");
			authScheme.setPassword("password123#");
			RestAssured.authentication=authScheme;
			
			//Request object
			RequestSpecification httpRequest=RestAssured.given();
			
			//Response Object
			Response response=httpRequest.request(Method.GET,"/");
			
			//Print request in console window
			String responseBody=response.getBody().asString();
		    System.out.println("Response body for validate Client Info  is "+responseBody);
		    
		    //Status code validation
		    int statusCode=response.getStatusCode();
		    System.out.println("Response code for validate Client Info is "+statusCode);
	    
	       
	}
	
	@Test(priority=4)
	public void mfpFindPolByPolnum()
	
	{
		RestAssured.baseURI="https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/findPolicyByPolicyNumber/985253949";
		
		//Basic authorization
		PreemptiveBasicAuthScheme authScheme= new PreemptiveBasicAuthScheme();
		authScheme.setUserName("getup");
		authScheme.setPassword("password123#");
		RestAssured.authentication=authScheme;
		
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
		
		//Response Object
		Response response=httpRequest.request(Method.GET,"/");
		
		//Print request in console window
		String responseBody=response.getBody().asString();
	    System.out.println("Response body for the find Policy is "+responseBody);
	    
	    //Status code validation
	    int statusCode=response.getStatusCode();
	    System.out.println("Response code of find policy is "+statusCode);
	    Assert.assertEquals(statusCode, 200);
		
		
	       }
	
	/*@Test(priority=1)
	public void updatePolnum()
	
	{
		HashMap data = new HashMap();
		 //data.put("9607283333333", "A124568");
		 data.put("policyNumber", "985253949");
		 data.put("coverAmount","20000");
		 
		 
			given()
			    .contentType("application/json")
			    .body(data)
			  .when()
			     .post("https://api-dev.getup.metropolitan.co.za/gu-gateway/audit/updatePolicyNum")
			   .then()
			     .statusCode(200)
			     .log().body()
			     .body("policyNumber",equalTo( "985253949"))
			     .body("coverAmount",equalTo("30000"));
			    
			     */
			   
	@Test(priority=5)
	public void cdiProdCheck()
	
	{RestAssured.baseURI="https://api-dev.getup.metropolitan.co.za/gu-gateway/cdi/agreement/9612163160081";
	
	//Basic authorization
	PreemptiveBasicAuthScheme authScheme= new PreemptiveBasicAuthScheme();
	authScheme.setUserName("getup");
	authScheme.setPassword("password123#");
	RestAssured.authentication=authScheme;
	
	//Request object
	RequestSpecification httpRequest=RestAssured.given();
	
	//Response Object
	Response response=httpRequest.request(Method.GET,"/");
	
	//Print request in console window
	String responseBody=response.getBody().asString();
    System.out.println("Response body for mfp Product check is "+responseBody);
    
    //Status code validation
    int statusCode=response.getStatusCode();
    System.out.println("Response code of mfp Product Check is "+statusCode);
    Assert.assertEquals(statusCode, 200);
 
}
	@Test(priority=6)
	public void cdiSearchByBusinessType()
	
	{RestAssured.baseURI="https://api-dev.getup.metropolitan.co.za/gu-gateway/cdi/business/100/MET462490836";
	
	//Basic authorization
	PreemptiveBasicAuthScheme authScheme= new PreemptiveBasicAuthScheme();
	authScheme.setUserName("getup");
	authScheme.setPassword("password123#");
	RestAssured.authentication=authScheme;
	
	//Request object
	RequestSpecification httpRequest=RestAssured.given();
	
	//Response Object
	Response response=httpRequest.request(Method.GET,"/");
	
	//Print request in console window
	String responseBody=response.getBody().asString();
    System.out.println("Response body for mfp Product check is "+responseBody);
    
    //Status code validation
    int statusCode=response.getStatusCode();
    System.out.println("Response code of mfp Product Check is "+statusCode);
    Assert.assertEquals(statusCode, 200);
  
}
	@Test(priority=7)
	public void cdiIDnumSearch()
	
	{RestAssured.baseURI="https://api-dev.getup.metropolitan.co.za/gu-gateway/cdi/idNumberSearch/9612163160081";
	
	//Basic authorization
	PreemptiveBasicAuthScheme authScheme= new PreemptiveBasicAuthScheme();
	authScheme.setUserName("getup");
	authScheme.setPassword("password123#");
	RestAssured.authentication=authScheme;
	
	//Request object
	RequestSpecification httpRequest=RestAssured.given();
	
	//Response Object
	Response response=httpRequest.request(Method.GET,"/");
	
	//Print request in console window
	String responseBody=response.getBody().asString();
    System.out.println("Response body for mfp Product check is "+responseBody);
    
    //Status code validation
    int statusCode=response.getStatusCode();
    System.out.println("Response code of mfp Product Check is "+statusCode);
    Assert.assertEquals(statusCode, 200);
  
}
	
		@Test(priority=8)
	public void mfpFindQuote()
	
	{RestAssured.baseURI="https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/findQuoteByQuoteNumber/3b8bcaeb-2201-4b16-8c8f-35b7f66b8401";
	
	
	//Request object
	RequestSpecification httpRequest=RestAssured.given();
	
	//Response Object
	Response response=httpRequest.request(Method.GET,"/");
	
	//Print request in console window
	String responseBody=response.getBody().asString();
    System.out.println("Response body for mfp find Quote is "+responseBody);
    
    //Status code validation
    int statusCode=response.getStatusCode();
    System.out.println("Response code of mfp findQuote is "+statusCode);
    Assert.assertEquals(statusCode, 200);
    
}
		//public  Benefits(POST.("https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/getup/applyNewBusiness request")
//		public class Benefits
//		{
//			public String name;
//			public String surname;
//			public String gender;
//			public String coverAmount;
//			public String dob;
//			public String benefitType;
//			public String relation;
//			public Boolean paymentProtectionOnDeathOrDisability;
//			public Boolean paymentProtectionOnRetirement;
//			public Boolean valueProtection;
//			public Boolean cashback;
//			public Boolean isBeneficiary;
//			
//			public Benefits(String name, String surname, String gender, String coverAmount, String dob, String benefitType, String relation, Boolean paymentProtectionOnDeathOrDisability, Boolean paymentProtectionOnRetirement, Boolean valueProtection, Boolean cashback, Boolean isBeneficiary)
//			{
//				this.name = name;
//				this.surname = surname;
//				this.gender = gender;
//				this.coverAmount = coverAmount;
//				this.dob = dob;
//				this.benefitType = benefitType;
//				this.relation = relation;
//				this.paymentProtectionOnDeathOrDisability = paymentProtectionOnDeathOrDisability;
//				this.paymentProtectionOnRetirement= paymentProtectionOnRetirement;
//				this.valueProtection = valueProtection;
//				this.cashback = cashback;
//				this.isBeneficiary = isBeneficiary;
//			}
//		}
		/*
		public class Benefitiary
		{
			public String name;
			public String surname;
			public String dob;
			public String gender;
			public String benefitType;
			public String relation;
			public String cellNumber;
			public Boolean takesOverPlan;
			public Boolean WillGetTheMoney;
			public Boolean trustedToArrangeYourFuneral;
			
			
			public Benefitiary(String name, String Surname, String dob, String gender, String benefitType, String relation, String string, Boolean takesOverPlan, Boolean willGetTheMoney, Boolean trustedToArrangeYourFuneral)
			{
				this.name = name;
				this.surname = surname;
				this.dob = dob;
				this.gender = gender;
				this.benefitType = benefitType;
				this.relation = relation;
				this.cellNumber = string;
				this.takesOverPlan= takesOverPlan;
				this.WillGetTheMoney = willGetTheMoney;
				this.trustedToArrangeYourFuneral = trustedToArrangeYourFuneral;

			}
		}
		*/
		@Test(priority=9)
		public void mfpApplyNewBusiness(){
			
			Policy policy = new Policy();
			policy.setName("Victoria");
			policy.setSurname("Miles");
			policy.setIdNumber("6507093079083");
			policy.setGender("Female");
			policy.setTitle("Ms");
			policy.setMaritalStatus("Single");
			policy.setCellNumber("0844474412");
			policy.setEmail("prichar@gmail.com");
			policy.setCoverAmount("50000");
			policy.setBenefitType("MFMM");
			policy.setPaymentProtectionOnDeathOrDisability(false);
			policy.setPaymentProtectionOnRetirement(false);
			policy.setValueProtection( true);
			policy.setCashback(false);
			policy.setTotalPremium("169");
			policy.setTotalCover("90000");
		
			
			 ArrayList<Benefits> benefit1=new ArrayList<Benefits>();
			
			 
			benefit1.add(new Benefits("Jaja","Howell","Male","20000","2020-10-08","MFUC","Child",false,false,true,false,false));
			benefit1.add(new Benefits("Nork","Howell","Male","20000","2020-09-02","MFUC","Child",false,false,true,false,false));
			 policy.benefits = benefit1;
			/* 
			ArrayList<Benefitiary> benefitiary=new ArrayList<Benefitiary>();
			benefitiary.add(new Benefitiary("Jennifer","Howell","1949-06-01","Female","MFPA","Parent","0738474315",true,true,true));
			 
			HashMap <String,Object> benefit2=new HashMap<String,Object>();
			 benefit2.put("name" ,"Noah");
			 benefit2.put("surname", "Miles");
			 benefit2.put( "gender", "Male");
			 benefit2.put("coverAmount", "20000");
			 benefit2.put("dob", "2011-09-02");
			 benefit2.put("benefitType" ,"MFUC");
			 benefit2.put("relation", "Child");
			 benefit2.put("paymentProtectionOnDeathOrDisability" ,false);
			 benefit2.put("paymentProtectionOnRetirement", false);
			 benefit2.put("valueProtection", true);
			 benefit2.put("cashback", false);
			 benefit2.put("isBeneficiary" ,false);
			 
			 map.put("benefits", benefit2);*/
			 policy.Beneficiary=new Beneficiary();
			 policy.Beneficiary.setName("Jennifer");
			 policy.Beneficiary.setSurname ("Miles");
			 policy.Beneficiary.setDob("2011-09-02");
			 policy.Beneficiary.setGender( "Female");
			 policy.Beneficiary.setBenefitType("MFPA");
			 policy.Beneficiary.setRelation("Parent");
			 policy.Beneficiary.setCellNumber( "0738474315");
			 policy.Beneficiary.setTakesOverPlan(true);
			 policy.Beneficiary.setWillGetTheMoney(true);
			 policy.Beneficiary.setTrustedToArrangeYourFuneral(true);
			 
			 policy.BankingReference=new BankingReference();
			 
		policy.BankingReference.setBank("CAPITECBANK");
		policy.BankingReference.setAccountNumber("1754978205");
		policy.BankingReference.setAccountType("Savings");
		policy.BankingReference.setSalaryDay("7");
		policy.BankingReference.setDeductionDay("7");
			 
		
		 policy.AdditionalBenefits=new AdditionalBenefits();
			
			 policy.AdditionalBenefits.setRepatriation(true);
			 policy.AdditionalBenefits.setPaymentProtectionAtAge85(true);
			 policy.AdditionalBenefits.setValueProtectionPercentage("6");
			 
	
			 
			
			 policy.setPolicyReplacement(false);
			 policy.setPip(false);
			 policy.setAdvisor("Basetsana Letlape");
			 policy.setAdvisorNumber("008271");
			 policy.setSplit("100");
			 policy.setSource("GetUp");
			 policy.setChannel("EXTERNALBROKER");
			 policy.setSubChannel("COMPARISUREMARKETPLACECHATBOT");
			 policy.setTranscript("");
			 policy.setFacebookUserId("");
			 policy.setFacebookPage("");
			 policy.setFacebookAdId("");
			 
		
			 /*{RestAssured.baseURI="https://api-dev.getup.metropolitan.co.za/gu-gateway/cdi/idNumberSearch/9612163160081";
				
			    RequestSpecification httpRequest=RestAssured.given();
			    Response response=httpRequest.request(Method.POST,"/");*/
			 
			
				
			 Response postResp=RestAssured.given()
					 .auth().preemptive()
					 .basic("getup","password123#")
					 .contentType(ContentType.JSON)
					 .when()
					 .body(policy).log().all()
					 .post("https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/getup/applyNewBusiness");
			 
			 System.out.println("Post response is "+postResp.asString());
			 System.out.println("Post response code is "+postResp.statusCode());
			
	}
		@Test(priority=10)
public void mfpNewBusinessQuote(){
	Root root = new Root();
	root.inceptionDate = "2021-07-01T00:00:00+02:00";
	root.schemeCode = "7009005";
	root.user = "MetRetailNewBusinessAPIUser";
	
	ArrayList<policyHolder> policyHolders = new ArrayList<policyHolder>();
	policyHolders.add(new policyHolder("1"));
	root.policyHolders = policyHolders;
	root.quoteStatus = "QUOTE";
	
	
	
	
	ArrayList<Life> Lives = new ArrayList<Life>();
	ArrayList<Life> Lives2 = new ArrayList<Life>();
	ArrayList<Life> Lives3 = new ArrayList<Life>();
	Lives.add(new Life("1"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFMM","20200401","STLV"), 50000,6,6,"MFIX",false,Lives));
	Lives2.add(new Life("2"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFSP","20200401","STLV"), 30000,6,6,"MFIX",false,Lives2));
    Lives3.add(new Life("3"));
	root.benefits.add(new Benefit(new BenefitIdentifier("RSA",863,"METF","MFPA","20200401","STLV"), 50000,6,6,"MFIX",false,Lives3));
	 
	ArrayList<Object> Address = new ArrayList<Object>();
	ArrayList<Object> ContactNumbers = new ArrayList<Object>();
	root.roleplayers.add(new Roleplayer("natural", "1", true, "cms", Address, ContactNumbers,"1993-09-27T00:00:00+02:00","","","Male"));
	root.roleplayers.add(new Roleplayer("natural", "2", true, "cms", Address, ContactNumbers,"1995-01-12T00:00:00+02:00","Radia","Kalam","Female"));
	root.roleplayers.add(new Roleplayer("natural", "3", true, "cms", Address, ContactNumbers,"1960-04-04T00:00:00+02:00","Yusuf","Kalam","Male"));
	
	
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
		@Test(priority=11)
		public void mfpsubmitNewBusinessClient(){
			ClientSub clientSub = new ClientSub();
			clientSub.firstname = "Llewellyn";
			clientSub.lastname= "Busby";
			clientSub.initials = "L";
			clientSub.dob= "13-04-1977";
			clientSub.pholderID = "7704135204089";
			clientSub.gender = "M";
			clientSub.title = "Mr";
			clientSub.phoneNo = "0748191186";
			clientSub.email = "";
			clientSub.streetNoNameComplexNoName = "Building 6.2, Parc Du Cap";
			clientSub.suburb = "Mispel Road";
			clientSub.cityTownArea = "Bellville";
			clientSub.postalCode = "7535";
			clientSub.province = "W Cape";
			clientSub.lifeGoal = "A dignified funeral when you pass away";
			clientSub.need = "Cash";
			clientSub.importanceOfNeed = "To cover funeral expenses";
			clientSub.coverAmount = "20000";
			clientSub.makeALiving = "N/A";
			clientSub.belongToTradeUnion = "N/A";
			clientSub.tradeUnionName = "N/A";
			clientSub.nameOfEmployer = "N/A";
			clientSub.industryWorkIn = "N/A";
			clientSub.groupSchemeYouQualifyForRel = "natu";
			clientSub.relationship = "main";
			clientSub.fbConversationLink = "https://www.facebook.com/CompariSureParent/manager/messages/?threadid=1901851156645536&folder=inbox";
			clientSub.transcript = "b'W1tdLCAiU3RhcnQiLCBbXSwgInJlZmVycmFsIiwgWyJHcmVhdCBbZmlyc3RuYW1lXSEgWW91J3JlIG9uIHlvdXIgd2F5IHRvIHNlY3VyaW5nIHlvdXIgZW50cnkgaW50byB0aGUgY29tcGV0aXRpb24gZHJhdy4iLCAiXHVkODNkXHVkYzQ5IFRvIGVudGVyLCB5b3UgbmVlZCB0byBjb21wbGV0ZSBhIHNob3J0IE9CTElHQVRJT04tRlJFRSBRVU9URSBiZWxvdy4gW1x1ZDgzNVx1ZGRmYlx1ZDgzNVx1ZGRmYyBcdWQ4MzVcdWRkZmRcdWQ4MzVcdWRlMDJcdWQ4MzVcdWRkZmZcdWQ4MzVcdWRkZjBcdWQ4MzVcdWRkZjVcdWQ4MzVcdWRkZWVcdWQ4MzVcdWRlMDBcdWQ4MzVcdWRkZjIgXHVkODM1XHVkZGZmXHVkODM1XHVkZGYyXHVkODM1XHVkZGZlXHVkODM1XHVkZTAyXHVkODM1XHVkZGY2XHVkODM1XHVkZGZmXHVkODM1XHVkZGYyXHVkODM1XHVkZGYxXSIsICJUaGUgd2lubmVyIHdpbGwgYmUgYW5ub3VuY2VkIG9uIG91ciBGYWNlYm9vayBwYWdlLiIsICJWaWV3IFQmQydzIGZvciB0aGUgZHJhdyBkYXRlIGFuZCBwcmV2aW91cyB3aW5uZXJzOiBodHRwczovL3RzYW5kY3Mub25saW5lL2NvbXBhcmlzdXJlLWNvbXBldGl0aW9uLXRzLWFuZC1jcy0yMDIxLyIsICJcdTI3MDUgIFx1ZDgzNVx1ZGRkZlx1ZDgzNVx1ZGRmMlx1ZDgzNVx1ZGUwMSdcdWQ4MzVcdWRlMDAgXHVkODM1XHVkZGU2XHVkODM1XHVkZGU3XHVkODM1XHVkZGQ0XHVkODM1XHVkZGU1XHVkODM1XHVkZGU3IFx1ZDgzNVx1ZGUwNlx1ZDgzNVx1ZGRmY1x1ZDgzNVx1ZGUwMlx1ZDgzNVx1ZGRmZiBcdWQ4MzVcdWRkZjJcdWQ4MzVcdWRkZmJcdWQ4MzVcdWRlMDFcdWQ4MzVcdWRkZmZcdWQ4MzVcdWRlMDYhIiwgIllvdSBoYXZlIHRvIGJlIGJldHdlZW4gdGhlIGFnZSBvZiAxOCBhbmQgNjAgeWVhcnMgdG8gZW50ZXIgdGhlIGNvbXBldGl0aW9uLiBXaGF0IGlzIHRoZSBkYXksIG1vbnRoIGFuZCB5ZWFyIHRoYXQgeW91IHdlcmUgYm9ybiBpbj8gKEZvciBleGFtcGxlLCBpZiB5b3Ugd2VyZSBib3JuIDE2IEF1Z3VzdCAxOTg2LCB5b3Ugc2hvdWxkIHR5cGU6IDE2LzA4LzE5ODYpIl0sICIxMyBBcHJpbCAxOTc3IiwgWyJBcmUgeW91IGEgU291dGggQWZyaWNhbiBjaXRpemVuPyJdLCAieWVzIiwgWyJXaGF0IGlzIHlvdXIgdGl0bGU/IiwgIk1zLCBNcnMsIE1yIG9yIERyIl0sICJNcnMiLCBbIkhvdyBtYW55IGNoaWxkcmVuIGRvIHlvdSBoYXZlIFtmaXJzdG5hbWVdPyJdLCAiMSIsIFsiV2hhdCBpcyB5b3VyIGhpZ2hlc3QgcXVhbGlmaWNhdGlvbj8iXSwgIk1hdHJpYyIsIFsiRG8geW91IG93biBhIG1vdG9yIHZlaGljbGUgW2ZpcnN0bmFtZV0gXHVkODNkXHVkZTk3PyJdLCAibm8iLCBbIkRvIHlvdSBoYXZlIGEgbWVkaWNhbCBhaWQgb3IgbWVkaWNhbCBpbnN1cmFuY2UgaW4gcGxhY2UgW2ZpcnN0bmFtZV0/Il0sICJObyIsIFsiUGxlYXNlIHNlbGVjdCB5b3VyIG1vbnRobHkgaW5jb21lIHJhbmdlIGJlbG93Il0sICJOb3Qgd29ya2luZyIsIFsiSGkgW0ZCX2ZpcnN0bmFtZV0sIHlvdSdyZSB0YWxraW5nIHRvIEJhc2khIiwgIkknbSBnb2luZyB0byBoZWxwIHlvdSB3aXRoIHlvdXIgTWV0cm9wb2xpdGFuIEdldFVwIGZ1bmVyYWwgcXVvdGUiLCAiWW91IHF1YWxpZnkgZm9yIHNwZWNpYWwgZGlzY291bnRzIGlmIHlvdSBwdXJjaGFzZSB0aGUgcG9saWN5IGhlcmUgaW4gW3VzZXJfcGxhdGZvcm1dIiwgIkkgbmVlZCB0byBhc2sgeW91IGEgZmV3IHF1ZXN0aW9ucyB0byBnaXZlIHlvdSBhbiBhY2N1cmF0ZSBmdW5lcmFsIHF1b3RlIiwgIllvdXIgcGVyc29uYWwgaW5mb3JtYXRpb24gaXMgaW1wb3J0YW50IHRvIHVzIGFuZCB3ZSBtYWtlIHN1cmUgd2Uga2VlcCBpdCBzYWZlIGFuZCBzZWN1cmUuIENsaWNrIGhlcmUgZm9yIG91ciBmdWxsIFByaXZhY3kgUG9saWN5OiBodHRwczovL3d3dy5jb21wYXJpc3VyZS5jby56YS9wcml2YWN5LyIsICJXaGF0IGlzIHRoZSBtYWluIGxhbmd1YWdlIHRoYXQgeW91IHNwZWFrIGF0IGhvbWUgW0ZCX2ZpcnN0bmFtZV0/Il0sICJFbmciLCBbIkRvIHlvdSB3b3JrIGZvciB0aGUgZ292ZXJubWVudCBbZmlyc3RuYW1lXT8iXSwgIk5vIiwgWyJZb3VyIE1ldHJvcG9saXRhbiBHZXRVcCBGdW5lcmFsIFBvbGljeSBpbmNsdWRlcyB0aGVzZSB3b3JsZCBjbGFzcyBmZWF0dXJlczoiLCAieydhdHRhY2htZW50Jzogeyd0eXBlJzogJ3RlbXBsYXRlJywgJ3BheWxvYWQnOiB7J3RlbXBsYXRlX3R5cGUnOiAnZ2VuZXJpYycsICdpbWFnZV9hc3BlY3RfcmF0aW8nOiAnc3F1YXJlJywgJ2VsZW1lbnRzJzogW3sndGl0bGUnOiAnU3BlY2lhbCBkaXNjb3VudHMnLCAnaW1hZ2VfdXJsJzogJ2h0dHBzOi8vcmVzLmNsb3VkaW5hcnkuY29tL2RhcjNiazZ4dS9pbWFnZS91cGxvYWQvdjE1ODMzMTUxODIvTWV0cm9HZXRVcC9JbmR1c3RyeS5qcGcnLCAnc3VidGl0bGUnOiAnV2hlbiB5b3UgcHVyY2hhc2UgeW91ciBwb2xpY3kgdmlhIEZhY2Vib29rIE1lc3Nlbmdlcid9LCB7J3RpdGxlJzogJ0dldCBmcmVlIGJlbmVmaXRzJywgJ2ltYWdlX3VybCc6ICdodHRwczovL3Jlcy5jbG91ZGluYXJ5LmNvbS9kYXIzYms2eHUvaW1hZ2UvdXBsb2FkL3YxNTgzMzE1MTgyL01ldHJvR2V0VXAvRXNzZW50aWFsLmpwZycsICdzdWJ0aXRsZSc6ICdJbmNsdWRpbmcgcmVwYXRyaWF0aW9uIGFuZCBwYXltZW50IHByb3RlY3Rpb24gYXQgYWdlIDg1J30sIHsndGl0bGUnOiAnQ292ZXIgZm9yIHlvdXIgd2hvbGUgZmFtaWx5JywgJ2ltYWdlX3VybCc6ICdodHRwczovL3Jlcy5jbG91ZGluYXJ5LmNvbS9kYXIzYms2eHUvaW1hZ2UvdXBsb2FkL3YxNTgzMzE1MTg0L01ldHJvR2V0VXAvVW5pb24uanBnJywgJ3N1YnRpdGxlJzogJ1VwIHRvIDIwIGZhbWlseSBtZW1iZXJzJ30sIHsndGl0bGUnOiAnRGlmZmVyZW50IGNvdmVyIGxldmVscyBmb3IgcG9saWN5IG1lbWJlcnMnLCAnaW1hZ2VfdXJsJzogJ2h0dHBzOi8vcmVzLmNsb3VkaW5hcnkuY29tL2RhcjNiazZ4dS9pbWFnZS91cGxvYWQvdjE1ODMzMTUxODEvTWV0cm9HZXRVcC9mdW5lcmFsLmpwZycsICdzdWJ0aXRsZSc6ICdPZiB1cCB0byBSODAsMDAwJ30sIHsndGl0bGUnOiAnUHJvdGVjdGlvbiBhZ2FpbnN0IHByZW1pdW0gaW5jcmVhc2VzJywgJ2ltYWdlX3VybCc6ICdodHRwczovL3Jlcy5jbG91ZGluYXJ5LmNvbS9kYXIzYms2eHUvaW1hZ2UvdXBsb2FkL3YxNTg1NzQzNjU4L01ldHJvR2V0VXAvdmFsdWVwcm90ZWN0aW9uLmpwZycsICdzdWJ0aXRsZSc6ICdWYWx1ZSBwcm90ZWN0aW9uIG9mIDYlJ31dfX19IiwgIkRvIHlvdSBjdXJyZW50bHkgaGF2ZSBmdW5lcmFsIGNvdmVyIGluIHBsYWNlPyJdLCAiTm9cbiBObyIsIFsiWW91ciBNZXRyb3BvbGl0YW4gR2V0VXAgRnVuZXJhbCBQb2xpY3kgaW5jbHVkZXMgdGhlc2Ugd29ybGQgY2xhc3MgZmVhdHVyZXM6IiwgInsnYXR0YWNobWVudCc6IHsndHlwZSc6ICd0ZW1wbGF0ZScsICdwYXlsb2FkJzogeyd0ZW1wbGF0ZV90eXBlJzogJ2dlbmVyaWMnLCAnaW1hZ2VfYXNwZWN0X3JhdGlvJzogJ3NxdWFyZScsICdlbGVtZW50cyc6IFt7J3RpdGxlJzogJ1NwZWNpYWwgZGlzY291bnRzJywgJ2ltYWdlX3VybCc6ICdodHRwczovL3Jlcy5jbG91ZGluYXJ5LmNvbS9kYXIzYms2eHUvaW1hZ2UvdXBsb2FkL3YxNTgzMzE1MTgyL01ldHJvR2V0VXAvSW5kdXN0cnkuanBnJywgJ3N1YnRpdGxlJzogJ1doZW4geW91IHB1cmNoYXNlIHlvdXIgcG9saWN5IHZpYSBGYWNlYm9vayBNZXNzZW5nZXInfSwgeyd0aXRsZSc6ICdHZXQgZnJlZSBiZW5lZml0cycsICdpbWFnZV91cmwnOiAnaHR0cHM6Ly9yZXMuY2xvdWRpbmFyeS5jb20vZGFyM2JrNnh1L2ltYWdlL3VwbG9hZC92MTU4MzMxNTE4Mi9NZXRyb0dldFVwL0Vzc2VudGlhbC5qcGcnLCAnc3VidGl0bGUnOiAnSW5jbHVkaW5nIHJlcGF0cmlhdGlvbiBhbmQgcGF5bWVudCBwcm90ZWN0aW9uIGF0IGFnZSA4NSd9LCB7J3RpdGxlJzogJ0NvdmVyIGZvciB5b3VyIHdob2xlIGZhbWlseScsICdpbWFnZV91cmwnOiAnaHR0cHM6Ly9yZXMuY2xvdWRpbmFyeS5jb20vZGFyM2JrNnh1L2ltYWdlL3VwbG9hZC92MTU4MzMxNTE4NC9NZXRyb0dldFVwL1VuaW9uLmpwZycsICdzdWJ0aXRsZSc6ICdVcCB0byAyMCBmYW1pbHkgbWVtYmVycyd9LCB7J3RpdGxlJzogJ0RpZmZlcmVudCBjb3ZlciBsZXZlbHMgZm9yIHBvbGljeSBtZW1iZXJzJywgJ2ltYWdlX3VybCc6ICdodHRwczovL3Jlcy5jbG91ZGluYXJ5LmNvbS9kYXIzYms2eHUvaW1hZ2UvdXBsb2FkL3YxNTgzMzE1MTgxL01ldHJvR2V0VXAvZnVuZXJhbC5qcGcnLCAnc3VidGl0bGUnOiAnT2YgdXAgdG8gUjgwLDAwMCd9LCB7J3RpdGxlJzogJ1Byb3RlY3Rpb24gYWdhaW5zdCBwcmVtaXVtIGluY3JlYXNlcycsICdpbWFnZV91cmwnOiAnaHR0cHM6Ly9yZXMuY2xvdWRpbmFyeS5jb20vZGFyM2JrNnh1L2ltYWdlL3VwbG9hZC92MTU4NTc0MzY1OC9NZXRyb0dldFVwL3ZhbHVlcHJvdGVjdGlvbi5qcGcnLCAnc3VidGl0bGUnOiAnVmFsdWUgcHJvdGVjdGlvbiBvZiA2JSd9XX19fSIsICJEbyB5b3UgY3VycmVudGx5IGhhdmUgZnVuZXJhbCBjb3ZlciBpbiBwbGFjZT8iXSwgIm5vIiwgWyJCYXNlZCBvbiB5b3VyIHByb2ZpbGUsIHlvdSBxdWFsaWZ5IGZvciB0aGUgZm9sbG93aW5nIGNvdmVyOiIsICJbTWV0cm9fb3B0aW9uc10iLCAiWW91J2xsIHJlY2VpdmUgdXAgdG8gNDAlICBkaXNjb3VudCBpZiB5b3UgcHVyY2hhc2UgdGhpcyBwb2xpY3kgb24gW3VzZXJfcGxhdGZvcm1dIiwgIlNlbGVjdCB5b3VyIGNvdmVyIGFtb3VudCB0byByZXZlYWwgeW91ciBkaXNjb3VudCJdLCAiUjIwayIsIFsiQSBzcGVjaWFsIGZlYXR1cmUgb2YgTWV0cm9wb2xpdGFuIEdldFVwIEZ1bmVyYWwgcHJvZHVjdHMgaXMgdGhhdCBhbGwgY2hpbGRyZW4gdW5kZXIgdGhlIGFnZSBvZiAxOCBhcmUgY292ZXJlZCB1bmRlciBhIHNpbmdsZSBwcmVtaXVtIiwgIldvdWxkIHlvdSBsaWtlIHRvIGFkZCBbY2hpbGRyZW5fbm9dIHRvIHlvdXIgcXVvdGU/Il0sICJZZXMiLCBbIlBsZWFzZSBzZWxlY3QgdGhlIGFtb3VudCBvZiBjb3ZlciB5b3Ugd291bGQgbGlrZSB0byBhZGQgZm9yIHlvdXIgY2hpbGRyZW4uIiwgIltNZXRyb19vcHRpb25zXSJdLCAiUjIwayIsIFsiV2hhdCBpcyBbRk1lbWJlcl0ncyBuYW1lPyJdLCAiTm8iLCBbIlBsZWFzZSBzZWxlY3QgdGhlIGFtb3VudCBvZiBjb3ZlciB5b3Ugd291bGQgbGlrZSB0byBhZGQgZm9yIHlvdXIgY2hpbGRyZW4uIiwgIltNZXRyb19vcHRpb25zXSJdLCAiUjIwayIsIFsiV2hhdCBpcyBbRk1lbWJlcl0ncyBuYW1lPyJdLCAiRGV2YW50ZSBzaWJhbmRlIiwgWyJQbGVhc2UgY29uZmlybSBbRk1lbWJlcl0ncyBnZW5kZXIgZm9yIHF1b3RpbmcgcHVycG9zZXM6Il0sICJNYWxlIiwgWyJXaGF0IGlzIFtGTWVtYmVyXSdzIHN1cm5hbWU/Il0sICJCdXNieSIsIFsiV2hhdCBpcyBbRk1lbWJlcl0ncyBkYXRlIG9mIGJpcnRoIChpbiB0aGUgZm9ybWF0IGRkL21tL3l5eXkpPyJdLCAiRGV2YW50ZSBzaWJhbmRlIiwgWyJXaGF0IGlzIFtGTWVtYmVyXSdzIGRhdGUgb2YgYmlydGggKGluIHRoZSBmb3JtYXQgZGQvbW0veXl5eSk/Il0sICIwNy8wMy8yMDA5IiwgWyJXb3VsZCB5b3UgbGlrZSB0byBhZGQgY292ZXIgZm9yIGEgcGFydG5lciAoeW91ciBIdXNiYW5kLCBXaWZlLCBMaWZlIFBhcnRuZXIpPyJdLCAiWWVzIiwgWyJXaGF0IGlzIFtGTWVtYmVyXSdzIG5hbWU/Il0sICJObyIsIFsiV291bGQgeW91IGxpa2UgdG8gYWRkIGNvdmVyIGZvciBhIHBhcnRuZXIgKHlvdXIgSHVzYmFuZCwgV2lmZSwgTGlmZSBQYXJ0bmVyKT8iXSwgIk5vIiwgWyJUaGUgdG90YWwgcHJlbWl1bSBvbiB5b3VyIHBvbGljeSBpcyBjdXJyZW50bHkgUltUb3RhbF9wcmVtX21ldHJvX2FiXSIsICJXb3VsZCB5b3UgbGlrZSB0byBhZGQgYW5vdGhlciBmYW1pbHkgbWVtYmVyIHRvIHlvdXIgcXVvdGU/Il0sICJObyB0aGFua3MiLCBbIldoYXQgaXMgeW91ciBmaXJzdG5hbWUgYXMgcGVyIHlvdXIgU0EgSUQ/Il0sICJMbGV3ZWxseW4gQnVzYnkiLCBbIldoYXQgaXMgeW91ciBmaXJzdG5hbWUgYXMgcGVyIHlvdXIgU0EgSUQ/Il0sICJMbGV3ZWxseW4iLCBbIldoYXQgaXMgeW91ciBzdXJuYW1lIGFzIHBlciB5b3VyIFNBIElEPyJdLCAiQnVzYnkiLCBbIkNhbiB5b3UgY29uZmlybSB5b3VyIGRhdGUgb2YgYmlydGggaXMgW01haW5fRE9CX2Z1bGxdPyJdLCAiWWVzIiwgWyJDb3VsZCB5b3Uga2luZGx5IHByb3ZpZGUgeW91ciBjZWxsIG51bWJlciBbZmlyc3RuYW1lXT8iXSwgIlBob25lIE51bWJlciIsIFsiQ291bGQgeW91IGtpbmRseSBwcm92aWRlIHlvdXIgY2VsbCBudW1iZXIgW2ZpcnN0bmFtZV0/Il0sICIwNzQ4MTkxMTg2IiwgWyJHaXZlIG1lIGEgc2Vjb25kIiwgIlx1ZDgzZFx1ZGQ1MiIsICJIZXJlIGlzIHlvdXIgZmluYWwgcXVvdGUgZGV0YWlsIHdpdGggZGlzY291bnRzIiwgIltjb3Zlcl9zdW1tYXJ5X21ldHJvMl0iLCAiW01ldHJvX3NhdmluZ3NdIiwgIldvdWxkIHlvdSBsaWtlIHRvIGJ1eSB0aGlzIHBvbGljeSBub3c/Il0sICJCdXkgbm93IiwgWyJCZWZvcmUgd2UgcHJvY2VlZCwgcGxlYXNlIGNoZWNrIGFuZCBjb25maXJtIHRoYXQgdGhlIGRldGFpbHMgb2YgYWxsIGZhbWlseSBtZW1iZXJzIGluIHRoZSBhYm92ZSBxdW90ZSBhcmUgMTAwJSBjb3JyZWN0LCBhcyBtaXN0YWtlcyBjYW4gY2F1c2UgcHJvYmxlbXMgYXQgY2xhaW1zIHN0YWdlLiJdLCAiRGV0YWlscyBjb3JyZWN0IiwgWyJJZiB5b3Ugd2VyZSB0byBwYXNzIGF3YXksIHdobyB3b3VsZCB5b3UgbGlrZSB0byByZWNlaXZlIHRoZSBiZW5lZml0IHBheW1lbnQ/Il0sICJEZXZhbnRlIiwgWyJNZXRyb3BvbGl0YW4gR2V0VXAgYWxzbyByZXF1aXJlIFtGTWVtYmVyXSdzIGNlbGwgbnVtYmVyIGZvciBjbGFpbXMgc3RhZ2UgY29tbXVuaWNhdGlvbiIsICJQbGVhc2UgcHJvdmlkZSBpdCBiZWxvdzoiXSwgIjA2MiA2NTUgOTQxMSIsIFsiRG8geW91IGhhdmUgYW4gZW1haWwgYWRkcmVzcz8gSWYgbm90LCBwbGVhc2Ugc2VsZWN0ICdObycgdG8gY29udGludWUiXSwgIk5vIiwgWyJXaGF0IGlzIHlvdXIgU0EgSUQgTnVtYmVyIFtmaXJzdG5hbWVdPyJdLCAiNzcwNDEzNTIwNDA4OSIsIFsiUGxlYXNlIGNvbmZpcm0geW91ciBtYXJpdGFsIHN0YXR1cyJdLCAiU2luZ2xlIiwgWyJQbGVhc2Ugc2VsZWN0IHlvdXIgdGl0bGU6Il0sICJNciIsIFsiVG8gdGFrZSBvdXQgdGhpcyBwb2xpY3ksIHlvdSBuZWVkIHRvIGFncmVlIHRvIHRoZSBNZXRyb3BvbGl0YW4gR2V0VXAgZnVuZXJhbCBwb2xpY3kgVCZDczogaHR0cHM6Ly90c2FuZGNzLm9ubGluZS9tZXRnZXR1cC8iLCAiRG8geW91IGFncmVlPyJdLCAiSSBhZ3JlZSIsIFsiTWV0cm9wb2xpdGFuIEdldFVwIGlzIGFuIGF1dGhvcmlzZWQgZmluYW5jaWFsIHNlcnZpY2VzIHByb3ZpZGVyIChGU1AgNDQ2NzMpIHRoYXQgaXMgc2VyaW91cyBhYm91dCBwcm90ZWN0aW5nIHlvdXIgcGVyc29uYWwgZGV0YWlscy4gSW4gb3JkZXIgdG8gYWN0aXZhdGUgeW91ciBjb3ZlciwgaXQgaXMgaW1wb3J0YW50IHRoYXQgdGhlc2UgZGV0YWlscyBhcmUgY29ycmVjdCEiLCAiV2hpY2ggYmFuayBpcyB5b3VyIG1vbnRobHkgaW5jb21lIGRlcG9zaXRlZCBpbnRvIFtmaXJzdG5hbWVdPyJdLCAiT3RoZXIiLCBbIldoaWNoIGJhbmsgZG8geW91IHVzZT8iXSwgIlR5bWUgRGlnaXRhbCIsIFsiV2hhdCB0eXBlIG9mIGFjY291bnQgaXMgaXQ/Il0sICJTYXZpbmdzIiwgWyJPbiB3aGF0IGRheSBvZiB0aGUgbW9udGggZG8geW91IGdldCBwYWlkPyIsICJUaGlzIHdpbGwgYmUgdGhlIGRheSB5b3VyIHByZW1pdW0gZ2V0cyBkZWR1Y3RlZC4iXSwgIjEiLCAiIiwgWyJbcGxhdGZvcm1fYWNjb3VudF93ZWJ2aWV3XSIsICJbYWNjb3VudF93ZWJ2aWV3X2J1dHRvbl0iXSwgIkFjY291bnQgbnVtYmVyIDUxMDE4OTM4OTU1IiwgWyJOZWFybHkgZG9uZSEgTWV0cm9wb2xpdGFuIHdpbGwgY29sbGVjdCBbYmFua19wcmVtaXVtX21ldHJvXSBwL20gdmlhIEJhbmsgRGViaXQgT3JkZXIgb24gdGhlIGFncmVlZCBkYXRlIGVhY2ggbW9udGggZnJvbSB5b3VyIFtBY2NfTmFtZV0gYWNjb3VudC4iLCAiUGxlYXNlIGNvbmZpcm0gdGhhdCB5b3UgY2FuIGFmZm9yZCB0aGlzIHByZW1pdW0gYW5kIHRoYXQgTWV0cm9wb2xpdGFuIG1heSBkZWR1Y3QgdGhlIG1vbnRobHkgcHJlbWl1bSBmcm9tIHlvdXIgYWNjb3VudDoiXSwgIkNvbmZpcm1lZCIsIFsiT25lIGxhc3QgcXVlc3Rpb24gLi4uIiwgIkFyZSB5b3UsIG9yIHNvbWVvbmUgeW91IGFyZSBjbG9zZSB0bywgaW4gYSBwcm9taW5lbnQgb3IgaW5mbHVlbnRpYWwgcG9zaXRpb24gaW4gYW55IGNvdW50cnksIG5vdywgb3IgaW4gdGhlIHJlY2VudCBwYXN0PyJdLCAiWWVzIiwgWyJJcyB0aGVyZSBhbnl0aGluZyBlbHNlIHdlIGNhbiBoZWxwIHlvdSB3aXRoPyJdLCAiQXNrIHF1ZXN0aW9uIiwgWyJ7J2F0dGFjaG1lbnQnOiB7J3R5cGUnOiAndGVtcGxhdGUnLCAncGF5bG9hZCc6IHsndGVtcGxhdGVfdHlwZSc6ICdnZW5lcmljJywgJ2ltYWdlX2FzcGVjdF9yYXRpbyc6ICdzcXVhcmUnLCAnZWxlbWVudHMnOiBbeyd0aXRsZSc6ICdXYWl0aW5nIGZvciBwb2xpY3kgZG9jdW1lbnRzPycsICdpbWFnZV91cmwnOiAnaHR0cHM6Ly9yZXMuY2xvdWRpbmFyeS5jb20vZGFyM2JrNnh1L2ltYWdlL3VwbG9hZC92MTU4NDAyODcxOS9NZXRyb19GQVEvRkFRX01ldF9HZXRVcF9Qb2xpY3lfRG9jcy5wbmcnLCAnc3VidGl0bGUnOiAnJywgJ2J1dHRvbnMnOiBbeyd0eXBlJzogJ3Bvc3RiYWNrJywgJ3RpdGxlJzogJ1BvbGljeSBkb2N1bWVudHMnLCAncGF5bG9hZCc6ICdQb2xpY3kgZG9jdW1lbnRzJ31dfSwgeyd0aXRsZSc6ICdIb3cgdG8gY2xhaW0/JywgJ2ltYWdlX3VybCc6ICdodHRwczovL3Jlcy5jbG91ZGluYXJ5LmNvbS9kYXIzYms2eHUvaW1hZ2UvdXBsb2FkL3YxNTg0MDI4NzE5L01ldHJvX0ZBUS9GQVFfTWV0X0dldFVwX0NsYWltLnBuZycsICdzdWJ0aXRsZSc6ICcnLCAnYnV0dG9ucyc6IFt7J3R5cGUnOiAncG9zdGJhY2snLCAndGl0bGUnOiAnQ2xhaW1zJywgJ3BheWxvYWQnOiAnQ2xhaW1zJ31dfSwgeyd0aXRsZSc6ICdXaGF0IGlzIHRoZSB3YWl0aW5nIHBlcmlvZD8nLCAnaW1hZ2VfdXJsJzogJ2h0dHBzOi8vcmVzLmNsb3VkaW5hcnkuY29tL2RhcjNiazZ4dS9pbWFnZS91cGxvYWQvdjE1ODQwMjg3MTkvTWV0cm9fRkFRL0ZBUV9NZXRfR2V0VXBfV2FpdGluZy5wbmcnLCAnc3VidGl0bGUnOiAnJywgJ2J1dHRvbnMnOiBbeyd0eXBlJzogJ3Bvc3RiYWNrJywgJ3RpdGxlJzogJ1dhaXRpbmcgcGVyaW9kJywgJ3BheWxvYWQnOiAnV2FpdGluZyBwZXJpb2QnfV19LCB7J3RpdGxlJzogJ1doZXJlIGlzIHRoZSBuZWFyZXN0IGJyYW5jaD8nLCAnaW1hZ2VfdXJsJzogJ2h0dHBzOi8vcmVzLmNsb3VkaW5hcnkuY29tL2RhcjNiazZ4dS9pbWFnZS91cGxvYWQvdjE2MTM2MzA4MTAvTWV0cm9fRkFRL3N0b3JlX2Zyb250X21ldHJvLnBuZycsICdzdWJ0aXRsZSc6ICcnLCAnYnV0dG9ucyc6IFt7J3R5cGUnOiAncG9zdGJhY2snLCAndGl0bGUnOiAnQnJhbmNoJywgJ3BheWxvYWQnOiAnQnJhbmNoJ31dfSwgeyd0aXRsZSc6ICdIYXZlIG90aGVyIHF1ZXN0aW9ucz8nLCAnaW1hZ2VfdXJsJzogJ2h0dHBzOi8vcmVzLmNsb3VkaW5hcnkuY29tL2RhcjNiazZ4dS9pbWFnZS91cGxvYWQvdjE1ODQwMjg3MTgvTWV0cm9fRkFRL0ZBUV9NZXRfR2V0VXBfUXVlc3Rpb24ucG5nJywgJ3N1YnRpdGxlJzogJycsICdidXR0b25zJzogW3sndHlwZSc6ICdwb3N0YmFjaycsICd0aXRsZSc6ICdPdGhlcicsICdwYXlsb2FkJzogJ090aGVyJ31dfV19fX0iLCAiW29wdGlvbnNfbGlzdF0iXSwgIlBvbGljeSBkb2N1bWVudHMiLCBbIklzIHRoZXJlIGFueXRoaW5nIGVsc2Ugd2UgY2FuIGhlbHAgeW91IHdpdGg/Il0sICJObywgSSdtIGRvbmUiLCBbIltmaXJzdG5hbWVdLCB3ZSdkIGxvdmUgeW91ciBmZWVkYmFjay4gSG93IHdvdWxkIHlvdSByYXRlIHlvdXIgZXhwZXJpZW5jZSB3aXRoIENvbXBhcmlTdXJlP1xuXG4xIFx1MmI1MCBiZWluZyBwb29yIGFuZCA1IFx1MmI1MFx1MmI1MFx1MmI1MFx1MmI1MFx1MmI1MCBiZWluZyBleGNlbGxlbnQiLCAiW29wdGlvbnNfbGlzdF0iXSwgIjVcdWZmZmRcdWZmZmRcdWZmZmRcdWZmZmRcdWZmZmQiXQ=='";
			clientSub.source = "CompariSure";
			
			clientSub.mainMember = new MainMember();
			clientSub.mainMember.name = "Llewellyn";
			clientSub.mainMember.surname = "Busby";
			clientSub.mainMember.dob = "13-04-1977";
			clientSub.mainMember.benefitType = "MFMM";
			clientSub.mainMember.coverMain = "20000";
			clientSub.mainMember.coverMainPremium = "62";
		
			
			 ArrayList<RelMember> member=new ArrayList<RelMember>();
				
			 member.add(new RelMember("Devante","Busby","M","MFUC","20000","7","07-03-2009",true,false));
				
			 clientSub.repatriation = "repatriation";
			 clientSub.paymentProtectionAtAge85 = "PaymentProtectionAtAge85";
			 clientSub.valueProtection="Accept default tick (defaults to 6% option)";
			 clientSub.affordAgreedPaymentWithoutABudget = "Default";
			 clientSub.finAdvisorNotInvolvedInTrans = "No";
			 clientSub.ihaveNotGivenAFAInformation= "Yes";
			 clientSub.haveNotAcceptedAdvice = "No";
			 clientSub.replaceInsuranceYouDiscontinuedInThePast4Months = "No";
			 clientSub.replacementPolicyName = "N/A";
			 clientSub.replacementPolicyNumber = "N/A";
			 clientSub.reasonForDO = "I prefer to pay via bank DO";
			 clientSub.accountHolderInitials = "L";
			 clientSub.accountHolderSurname = "Busby";
			 clientSub.bank = "Tyme Digital";
			 clientSub.branchCode = "678910";
			 clientSub.accountNumber = "51018938955";
			 clientSub.accountType = "Savings";
			 clientSub.salaryDate = "1";
			 clientSub.deductionDate = "1";
			 clientSub.maritalStatus = "Single";
			 clientSub.whereToSendDocuments = "Email/Messenger";
			 clientSub.benLname = "Busby";
			 clientSub.benFname = "Devante";
			 clientSub.benType = "MFUC";
			 clientSub.benRelation = "Child";
			 clientSub.benInitials = "D";
			 clientSub.benDOB = "07-03-2009";
			 clientSub.benGender = "M";
			 clientSub.benCell = "0626559411";
			 clientSub.trustedToArrangeYourFuneral = "Tick";
			 clientSub.takesOverYourPlan = "Tick";
			 clientSub.willGetTheMoney = "Tick";
			 clientSub.userGuideAndContractWillBeSentToMe = "Yes";
			 clientSub.marketingConsent1 ="Yes";
			 clientSub.marketingConsent2 ="Yes";
			 clientSub.youOrCloseFamilyAreNotAProminentInfluPerson = "Yes";
			 clientSub.agreeToApplication= "Electronic agreement";
			 clientSub.advisorNumber = "CompariSure";
			 clientSub.split = "100%";
			 clientSub.faname ="CompariSure";
			 clientSub.adRef = "23847543079330479";
			 clientSub.subChannel = "Comparisure Marketplace Chatbot";
			 clientSub.facebookUserId = "4478715712161520";
			 clientSub.facebookPageId = "100239198450016";
			 
			 
			 Response postResp=RestAssured.given()
					 .auth().preemptive()
					 .basic("getup","password123#")
					 .contentType(ContentType.JSON)
					 .when()
					 .body(clientSub).log().all()
					 .post("https://api-dev.getup.metropolitan.co.za/gu-gateway/mfp/submitNewBusinessClient");
			 
			 System.out.println("Post response for Submit new Client is "+postResp.asString());
			 System.out.println("Post response code for Submit new client  is "+postResp.statusCode());
		}
		
			
		@Test(priority=12)
		public void validateBankingDetailsErrorcodes()
		{

	    		   RestAssured.baseURI="https://api-dev.getup.metropolitan.co.za/gu-gateway/validation/validateBankingDetails?accountNumber=1754978205&accountType=Savings&bankName=CAPITEC&firstName=Althea&idNumber=9612163160081&lastName=Richards&subChannel=Funeral%20Fusion%20Chatbot";
			//Basic authorization
			PreemptiveBasicAuthScheme authScheme= new PreemptiveBasicAuthScheme();
			authScheme.setUserName("getup");
			authScheme.setPassword("password123#");
			RestAssured.authentication=authScheme;
			
			given()
			.pathParam("accountNumber", "1754978205")
			.pathParam("accountType", "Savings")
			.pathParam("bankName", "CAPITEC")
			.pathParam("firstName", "Althea")
			.pathParam("idNumber", "9612163160081")
			.pathParam("lastName", "Richards")
			.pathParam("subChannel", "Funeral Fusion Chatbot")
			.when().get("https://api-dev.getup.metropolitan.co.za/gu-gateway/validation/validateBankingDetails")
			.then().statusCode(200);
			
			//Request object
			RequestSpecification httpRequest=RestAssured.given();
			
			//Response Object
			Response response=httpRequest.request(Method.GET,"/");
			
			//Print request in console window
			String responseBody=response.getBody().asString();
		    System.out.println("Response body for validate Banking Details is "+responseBody);
		    
		    //Status code validation
		    int statusCode=response.getStatusCode();
		    System.out.println("Response code for validate Banking Details is "+statusCode);
	   
	      
			
			
		}
		
		
	private RequestSpecification given() {
		// TODO Auto-generated method stub
		return null;
	}}




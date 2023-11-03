package com.rudra.Etv;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class EtvWin extends URL{
	
	@Test(priority =0)
	void Url1()
	{			
		given()
		 .header("content-Type","Application/json")
		.when().get(Url1)
		.then().statusCode(200)
		.body("data.title",equalTo("footer"))
		.log().all();
		} 
	
	@Test(priority =1)
	void Url2()
	{		
		given()
		 .header("content-Type","Application/json")
		.when().get(Url2)
		.then().statusCode(200)
		.body("data.title",equalTo("top menu web"))
		.log().all();
	}
	
	
@Test(priority =2)
	void Url3()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url3)
		.then().statusCode(200)
		.body("data.title",equalTo("channels"))
		.log().all();
	}
	
	@Test(priority =3)
	void Url4()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url4)
		.then().statusCode(200)
		.body("data.title",equalTo("live"))
		.log().all();
	}
	
	@Test(priority =4)
	void Url5()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url5)
		.then().statusCode(200)
		.body("data.title",equalTo("health"))
		.log().all();
	}
	
	@Test(priority =5)
	void Url6()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url6)
		.then().statusCode(200)
		.body("data.title",equalTo("top menu"))
		.log().all();
	}
	
	@Test(priority =6)
	void Url7()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url7)
		.then().statusCode(200)
	   .body("data.title",equalTo("featured_before_tv"))
		.log().all();
	}
	
	@Test(priority =7)
	void Url8()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url8)
		.then().statusCode(200)
		.body("data.title",equalTo("recipes"))
		.log().all();
	}
	
	@Test(priority=8)
	void Url9()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url9)
		.then().statusCode(200)
		.body("data.title",equalTo("news"))
		.log().all();
	}
	
	@Test(priority =9)
	void Url10()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url10)
		
		.then().statusCode(200)
		.body("data.title",equalTo("movies"))
		
		.log().all();
	}
	
	@Test(priority =10)
	void Url11()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url11)
		
		.then().statusCode(200)
		.body("data.title",equalTo("Epi 97"))
		
		.log().all();
	}
	
	@Test(priority=11)
	void Url12()
	{
		given()
		 .header("content-Type","Application/json")
		  
		.when().get(Url12)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("detect user region"))
		.log().all();
	}
	
	@Test(priority =12)
	void Url13()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url13)
		
		.then().statusCode(200)
		//.body("data.title",equalTo("Default Access Control"))
		
		.log().all();
	}
	
	@Test(priority =13)
	void Url14() 
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url14)
		
		.then().statusCode(200)
		//.body("data.title",equalTo("Season 1"))
		 
		.log().all();
	}
	
	@Test(priority =14)
	void Url15()
	{
		given()
		 .header("content-Type","Application/json")
		  
		.when().get(Url15)
		
		.then().statusCode(200)
		//.body("region",equalTo("united states"))
		
		.log().all();
	}
	
	@Test(priority =15) 
	void Url16()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url16)
		
		.then().statusCode(200)
	//	.body("data.name",equalTo("catalog"))
		
		.log().all();
	}
	
	@Test(priority =16)
	void Url17()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url17)
		
		.then().statusCode(200)
		//.body("Title",equalTo("Top-menu for Web"))
		
		.log().all();
	}
	
	@Test(priority =17)
	void Url18() {
	
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url18)
		
		.then().statusCode(200)
		//.body("Title",equalTo("Top-menu for Web"))
		  
		.log().all();
	}
	
	@Test(priority =18)
	void Url19()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url19)
		
		.then().statusCode(200)
		//.body("Title",equalTo("Top-menu for Web"))
		
		.log().all();
	}
	
	@Test(priority =19)
	void Url20()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url20)
		
		.then().statusCode(200)
		//.body("Title",equalTo("Top-menu for Web"))
		
		.log().all();
	}
	
	@Test(priority=20)
	void Url21()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url21)
		
		.then().statusCode(200)
		//.body("title",equalTo(""))
		
		.log().all();
	}
	
	@Test(priority=21)
	void Url22()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url22)
		
		.then().statusCode(200)
	//	.body("data.name",equalTo("home"))
		
		.log().all();
	}
	
	@Test(priority =23)
	void Url25()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url25)
		.then().statusCode(200)
		.body("data.title",equalTo("Beeruva"))
		.log().all();
	}

	@Test(priority=22)
	void Url23()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url23)
		
		.then().statusCode(200)
		//.body("Title",equalTo("Top-menu for Web"))
		
		.log().all();
	}
	
	@Test(priority =24)
	void Url26()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url26)
		.then().statusCode(200)
//		.body("data.title",equalTo("Beeruva"))
		.log().all();
	}
	
	@Test(priority =25)
	void Url27()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url27)
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		.log().all();

	}
	
	@Test(priority =26)
	void Url28()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url28)
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		.log().all();
	}
	
	@Test(priority =29)
	void Url31()
	{
		given()
		 .header("content-Type","Application/json")
		.when().get(Url31)
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		.log().all();
	}

	@Test(priority =27)
	void Url29()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url29)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		
		.log().all();

	}
	
	@Test(priority =28)
	void Url30()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url30)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		
		.log().all();

	}
	
	@Test(priority =30)
	void Url32()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url32)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		
		.log().all();

	}
	
	@Test(priority =31)
	void Url33()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url33)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		.log().all();
	}
	
	@Test(priority =32)
	void Url34()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url34)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		
		.log().all();
	}
	
	@Test(priority =33)
	void Url35()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url35)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		.log().all();
	}
	
	@Test(priority =34)
	void Url36()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url36)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		
		.log().all();

	}
	
	@Test(priority =35)
	void Url37()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url37)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		
		.log().all();

	}
	
	@Test(priority =36)
	void Url38()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url38)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		.log().all();
	}
	
	@Test(priority =37)
	void Url39()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url39)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		.log().all();
	}
	
	@Test(priority =38)
	void Url40()
	{
		given()
		 .header("content-Type","Application/json")
		 
		.when().get(Url40)
		
		.then().statusCode(200)
	//	.body("data.title",equalTo("Beeruva"))
		.log().all();
	 }
	
  }


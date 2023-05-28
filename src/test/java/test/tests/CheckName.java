package test.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import test.base.Browser;
import test.page.nametest;


public class CheckName extends Browser {
	
@Test
	public void Checkmyname() throws InterruptedException {
		
		nametest obj= new nametest(driver);
		
		//obj.clickname();
		//obj.clickonmyprofile();
		
		//Thread.sleep(5000);
		
//		String expectedname="Rutwik Kulkarni";
//		String actualname=obj.getmyname();
//		Assert.assertEquals(actualname, expectedname);



	obj.clickoncloselogin();
	Thread.sleep(4000);
	obj.clickonbecomeseller();

	String expectedname="Raju Lunawath";
	String actualname=obj.getmiddlemanname();
	System.out.println(actualname);
	Assert.assertEquals(actualname, expectedname);


}
	
	
	

}

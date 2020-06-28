package SocialMedia.MyFirstMavenProject;

import org.testng.annotations.Test;

public class TwitterTest {
	@Test(priority=1)
	public void OpenBroTest() {
		System.out.println("Browser Opens.");
	}
	@Test(priority=2)
	public void LogInTest() {
		System.out.println("Successfully Log in.");

}
	@Test(priority=3)
	public void LogOutTest() {
		System.out.println("Successfully Log out.");
		
		
	}
	@Test(priority=4)
	public void CloseBroTest() {
		System.out.println("browser close Successfully.");
	}

}

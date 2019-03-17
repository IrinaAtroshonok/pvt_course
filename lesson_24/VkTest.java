package core;

import java.io.IOException;

import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VkTest {
	private HttpClient client;
	private WebDriver driver;
	private PageVk pageVk;
	private URIBuilder builder;
	private HttpGet request;
	private HttpResponse response;
	private static String id;
	private static String myName = "Ира";
	private static String myLastname = "Атрошонок";

	@Before
	public void setUp() throws Exception {
		client = HttpClientBuilder.create().build();
		driver = new ChromeDriver();
		pageVk= new PageVk(driver);
		driver.get("https://vk.com/");
		pageVk.login(driver);
		driver.navigate().to("https://vk.com/id536083852");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void postingOnTheWall() throws ClientProtocolException, IOException, URISyntaxException{
        builder = new URIBuilder("https://api.vk.com/method/wall.post?");
        builder.setParameter("access_token", "3a3b2193ea7680a91349699a245e53bd8b7aa856673771b21f223b5e5828a6ce9c4d1cc537cac8eff46f9")
        .setParameter("owner_id", "536083852")
        .setParameter("message", myName)
        .setParameter("attachments", "photo15677299_279296449")  
        .setParameter("v", "5.92");
         request = new HttpGet(builder.build());
         response = client.execute(request);   
         id =EntityUtils.toString(response.getEntity());
         id= id.replaceAll("[^0-9]", "");
         Assert.assertTrue(pageVk.isPostOnTheWall(driver));       
	}

	
	@Test
	public void opdatePost() throws ClientProtocolException, IOException, URISyntaxException{
        builder = new URIBuilder("https://api.vk.com/method/wall.edit?");
        builder.setParameter("access_token", "3a3b2193ea7680a91349699a245e53bd8b7aa856673771b21f223b5e5828a6ce9c4d1cc537cac8eff46f9")
        .setParameter("owner_id", "536083852")
        .setParameter("post_id", id) 
        .setParameter("message", myLastname)
        .setParameter("attachments", "photo15677299_279296449")  
        .setParameter("v", "5.92");
         request = new HttpGet(builder.build());
         response = client.execute(request);   
         System.out.println(EntityUtils.toString(response.getEntity()));
         Assert.assertTrue(pageVk.isPostUpdated(driver));   
	}
		
	@Test
	public void deletePost() throws ClientProtocolException, IOException, URISyntaxException{
        builder = new URIBuilder("https://api.vk.com/method/wall.delete?");
        builder.setParameter("access_token", "3a3b2193ea7680a91349699a245e53bd8b7aa856673771b21f223b5e5828a6ce9c4d1cc537cac8eff46f9")
        .setParameter("owner_id", "536083852")
        .setParameter("post_id", id) 
        .setParameter("v", "5.92");
         request = new HttpGet(builder.build());
         response = client.execute(request);   
         System.out.println(EntityUtils.toString(response.getEntity()));
         Assert.assertFalse(pageVk.isPostDeleted(driver));
	}
	
}

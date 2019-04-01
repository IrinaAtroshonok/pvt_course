package core;

import java.io.IOException;

import java.net.URISyntaxException;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import org.xml.sax.SAXException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import patternAdapter.MatchJSAndXml;

public class StepsVk {
	private static HttpClient client;
	private static URIBuilder builder;
	private static HttpGet request;
	private static HttpResponse response;
	private static String postResponse;
	private static String id;
	private static final String MYNAME = "Ира";
	private static final String MYLASTNAME = "Атрошонок";
	private static int ownerId =0;
	private static final String TOKEN= "964ba4d3758bd65f777abf89df73cd16c04a273efd6b31f4988f9b0a038d2d7be9c9f850f24b8ffdec82e";
	

	
	public StepsVk() throws ClassNotFoundException, SQLException {
		client = HttpClientBuilder.create().build();
	}
	
	@Given("^I decided to post on the wall$")
	public void createPostMetod()throws ClientProtocolException, URISyntaxException{
		builder = new URIBuilder("https://api.vk.com/method/wall.post?");
	}

	@When("^I sent post request$")
	public void sentPostRequest() throws  URISyntaxException,
	ParserConfigurationException, SAXException, IOException {
		builder.setParameter("access_token",TOKEN)
		.setParameter("owner_id", GetUserIdForVk.getUerId(ownerId))
		.setParameter("message", MYNAME)
		.setParameter("attachments", "photo15677299_279296449")
		.setParameter("v", "5.92");
	request = new HttpGet(builder.build());
	}
	
	@When("^I get response$")
	public void getPostResponse() throws  URISyntaxException,
	ParserConfigurationException, SAXException, IOException {
		response = client.execute(request);
		postResponse = (EntityUtils.toString(response.getEntity()));
		System.out.println(postResponse);
		id = postResponse.replaceAll("[^0-9]", "");
		System.out.println(id);		
	}
	
	@Then("I check is it posted$")
	public void isPostPosted() throws ParserConfigurationException, IOException {
		Assert.assertEquals(200, response.getStatusLine().getStatusCode());
	}
	
	@Given("^I decided to update post on the wall$")
	public void createUpdateMetod()throws ClientProtocolException, URISyntaxException{
		builder = new URIBuilder("https://api.vk.com/method/wall.edit?");
	}
	
	@When("^I sent update request$")
	public void sentUpdateRequest() throws  URISyntaxException,
	ParserConfigurationException, SAXException, IOException {
		builder.setParameter("access_token",TOKEN)
		.setParameter("owner_id", GetUserIdForVk.getUerId(ownerId))
		.setParameter("post_id", id)
		.setParameter("message", MYLASTNAME)
		.setParameter("attachments", "photo15677299_279296449")
		.setParameter("v", "5.92");
	request = new HttpGet(builder.build());
	}
		
//pattern Adapter	
	@Then("I check json answer matches xml$")
	public void matchJsonAndXml() throws ParserConfigurationException, IOException {
		System.out.println(MatchJSAndXml.matchJsonAndXml(postResponse));
		Assert.assertTrue(MatchJSAndXml.matchJsonAndXml(postResponse));
	}
}

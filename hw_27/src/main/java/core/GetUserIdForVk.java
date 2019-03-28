package core;

import java.io.File;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import model.User;
import sax.UserHandler;

public class GetUserIdForVk {

	private static final String USER_XML = "users.xml";

	public static String getUerId(Integer id) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		UserHandler userHandler = new UserHandler();
		saxParser.parse(new File(USER_XML), userHandler);
		List<User> users = userHandler.getUser();
		return users.get(id).getUserId();
	}

}

package sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import model.User;

public class UserHandler extends DefaultHandler {
	private List<User> users;
	private User user;
	boolean bName = false;
	boolean bUserId = false;

	public List<User> getUser() {
		return users;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("User")) {
			String id = attributes.getValue("id");
			user = new User();
			user.setId(Integer.parseInt(id));
			if (users == null) {
				users = new ArrayList<>();
			}
		} else if (qName.equalsIgnoreCase("name")) {
			bName = true;
		} else if (qName.equalsIgnoreCase("userId")) {
			bUserId = true;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("User")) {
			users.add(user);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (bName) {
			user.setName(new String(ch, start, length));
			bName = false;
		} else if (bUserId) {
			user.setUserId(new String(ch, start, length));
			bUserId = false;
		}
	}
}

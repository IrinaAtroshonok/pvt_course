package dom;

import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.User;

public class DomParser {
	public List<User> parse(Document document) throws FileNotFoundException, XMLStreamException {
		NodeList nodeList = document.getElementsByTagName("user");
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			users.add(getUser(nodeList.item(i)));
		}
		return users;
	}

	private static User getUser(Node node) {
		User user = new User();
		Element element = (Element) node;
		user.setId(Integer.parseInt(element.getAttribute("id")));
		user.setName(getTagValue("name", element));
		user.setUserId(getTagValue("userId", element));
		return user;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}
}

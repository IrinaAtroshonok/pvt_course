package patternAdapter;

public class XMLResponseAdapter {
	XMLObject xMLObject;

	public XMLResponseAdapter(XMLObject xMLObject) {
		super();
		this.xMLObject = xMLObject;
	}

	public JSONObject getJSONObject() {
		return new JSONObject("{\"response\":1}");
	}
}

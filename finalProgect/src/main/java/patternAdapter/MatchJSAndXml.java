package patternAdapter;


public class MatchJSAndXml {
	public static boolean matchJsonAndXml(String postResponse) {
		JSONObject JSONObject = new JSONObject(postResponse);
		JSONResponse jSONResponse = new JSONResponse(JSONObject);

		XMLResponse xMLResponse = new XMLResponse();
		XMLResponseAdapter XMLResponseAdapter = new XMLResponseAdapter(xMLResponse.getXMLObject());

		return jSONResponse.isJSONEqual(XMLResponseAdapter.getJSONObject());
			
	}
}

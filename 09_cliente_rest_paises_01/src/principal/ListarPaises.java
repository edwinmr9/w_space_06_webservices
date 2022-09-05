package principal;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ListarPaises {

	public static void main(String[] args) throws ParseException {
		String url="https://restcountries.com/v3.1/all";
		RestTemplate template=new RestTemplate();
		
		ResponseEntity<String> resp=template.getForEntity(url, String.class);
		if(resp.getStatusCodeValue()==200) {
			String resultado=resp.getBody();
			JSONParser parser=new JSONParser();
			JSONArray array=(JSONArray)parser.parse(resultado);
			for(Object ob:array) {
				JSONObject json=(JSONObject)ob;
				System.out.print(json.get("name")+"  ");
				System.out.println(json.get("area"));
			}
		}else {
			System.out.println("errorrrrrrrr");
		}
	}
}



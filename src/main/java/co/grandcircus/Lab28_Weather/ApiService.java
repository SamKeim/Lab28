
package co.grandcircus.Lab28_Weather;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.Lab28_Weather.pojos.LocationIQ;
import co.grandcircus.Lab28_Weather.pojos.Weather;

@Component
public class ApiService {

	private RestTemplate rt;
	
	// initialization block that runs when a new instance of the class is created
	// loaded before the constructor
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "ooeeee!");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public Weather findWeather(Double lat, Double lon) throws RestClientException{
		String url = "https://forecast.weather.gov/MapClick.php?lat=" + lat + "&lon=" + lon + "&FcstType=json";
		Weather response = rt.getForObject(url, Weather.class);
		return response;
	}
	
	public List<LocationIQ> findLatLon(String location) throws RestClientException{
		String url = "https://us1.locationiq.com/v1/search.php?key=c6068593d0ecb1&q=" + location + "&format=json";
		LocationIQ[] resp = rt.getForObject(url, LocationIQ[].class);
		List<LocationIQ> responses = new ArrayList<>();
		int i = 0;
		for(LocationIQ loc : resp) {
			String locName = loc.getDisplayName();
			if(locName.substring(locName.length() - 3).equals("USA")){
				responses.add(loc);
			}
		}
		if(responses.size() == 0) {
			throw new RestClientException("Error");
		}
		return responses;
	}
	
}

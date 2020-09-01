package com.example.Lab25;
import java.util.List;



import org.springframework.boot.web.client.RestTemplateBuilder;

import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Lab25.pojo.Data;
import com.example.Lab25.pojo.Weather;
import com.example.Lab25.pojo.Location;

@Service
public class ApiService {

	private RestTemplate rt;

	// ADD DECK_ID value

	// initialization block that runs when a new instance of the class is created
	// loaded before the constructor
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring!");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public Data getLocData(double latitude, double longitude){
	
		//1. specify a URL
		String url = "https://forecast.weather.gov/MapClick.php?lat={latitude}&lon={longitude}&FcstType=json";
		
		//2. call the API, response type to match entire JSON
		
		Weather weather = rt.getForObject(url, Weather.class, latitude, longitude);
		
		//return certain parts of JSON response;
		return weather.getData();
		
	}
	

	}
	


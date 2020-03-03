package co.grandcircus.Lab28_Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestClientException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.Lab28_Weather.pojos.LocationIQ;
import co.grandcircus.Lab28_Weather.pojos.Weather;

@Controller
public class WeatherController {

	@Autowired
	ApiService apiServ;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@PostMapping("/")
	public ModelAndView findLocation(
			@RequestParam String location,
			RedirectAttributes redir
			) {
		ModelAndView mav = new ModelAndView("index");
		
		LocationIQ[] loc = null;
		try {
			loc = apiServ.findLatLon(location);
		} catch(RestClientException e) {
			redir.addFlashAttribute("message", "Location not found");
			return mav;
		}
		
		Weather weatherInfo = apiServ.findWeather(loc[0].getLat(), loc[0].getLon());
		mav.addObject("weather", weatherInfo);
		return mav;
	}
	
	

}

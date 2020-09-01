package com.example.Lab25;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.Lab25.pojo.Data;
import com.example.Lab25.pojo.Location;
import com.example.Lab25.pojo.Weather;

@Controller
public class HomeController {

	@Autowired
	ApiService apiServ;

	@RequestMapping("/")
	public String home() {

		return "redirect:/input";
	}
	
	@RequestMapping("/input")
		public String getInputLocation() {

		return "input-location";
	}
	
	

	
	@RequestMapping("/find-data")
	public String showData(@RequestParam double latitude, @RequestParam double longitude, Model model) {
		
		Data data = apiServ.getLocData(latitude, longitude);
		List <String> dataText = data.getText();
		model.addAttribute("data", dataText);

		return "show-data";
	}

	

}
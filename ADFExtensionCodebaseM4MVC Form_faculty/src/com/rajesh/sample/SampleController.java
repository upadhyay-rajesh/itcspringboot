package com.rajesh.sample;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rajesh.entity.Country;
import com.rajesh.entity.User;


@Controller
public class SampleController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	
	@ModelAttribute("countryList")
	public List<Country> populateCountry() {
		List<Country> countryList = new ArrayList<Country>();
		Country c1 = new Country();
		c1.setCountryId(1);
		c1.setCountryName("India");
		countryList.add(c1);
		c1 = new Country();
		c1.setCountryId(2);
		c1.setCountryName("Others");
		countryList.add(c1);
		return countryList;
	}

	
	
	@RequestMapping("/login.htm")
	public ModelAndView loadLoginPage(ModelMap map) throws Exception
	{
		logger.info("*********loadLoginPage method call");
	     User user = new User();
	     map.addAttribute(user);
		// redirecting to the login page (sample.jsp)
		return new ModelAndView("sample");
	}
	
	@RequestMapping("/userlogin.htm")
	public ModelAndView validateUser(HttpServletRequest request,HttpServletResponse response, @ModelAttribute("user") User user) throws Exception
	{
		logger.info("UserName :"+user.getUserName());
		logger.info("Country : "+user.getCountry());
		ModelAndView mView=new ModelAndView();
		// check the user name and password. If both are equal redirect to success page else error page. 
		if(user.getUserName().equalsIgnoreCase(user.getPassword()) && user.getCountry().equals("1"))
		{
			mView.addObject("USERNAME", user.getUserName());
			mView.setViewName("usersuccess");
		}
		else
		{
			mView.addObject("ERROR", "Invalid Credentials");
			mView.setViewName("sample");
		}
		return mView;
	}
	
	
}

package com.gradle.mvc;

import java.text.*;
import java.util.*;

import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class JinkiController {
	
	private static final Logger logger = LoggerFactory.getLogger(JinkiController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String jinki(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("ServerTime", formattedDate);
		
		return "jinki";
	}

}
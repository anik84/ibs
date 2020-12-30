package com.example.batch7.group1.IBS.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.CustomerModel;
import com.example.batch7.group1.IBS.model.ServiceProviderRegistrationModel;
import com.example.batch7.group1.IBS.service.CustomerService;
import com.example.batch7.group1.IBS.service.ServiceProviderService;

@Controller
public class DefaultController {
	
	@Autowired
	private CustomerService custService;
	
	@Autowired
	private ServiceProviderService svcPvdrService;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@RequestMapping(value={"","/","/home"},method=RequestMethod.GET)
	public String landingPageAction(){
		return "index";
	}
	
	@GetMapping("/newUser")
	public ModelAndView newUserAction() {
		ModelAndView mv = new ModelAndView("user/user_registration_form", "newUser", new CustomerModel());
		return mv;
	}
	
	@GetMapping("/newSvcPvdr")
	public ModelAndView newSvcPvdrAction() {
		ModelAndView mv = new ModelAndView("svc_pvdr/svc_pvdr_registration_form", "newSvcPvdr", new ServiceProviderRegistrationModel());
		return mv;
	}
	
	@PostMapping("/userRegister")
	public ModelAndView addUserAction(@ModelAttribute("newUser") @Valid CustomerModel customer, BindingResult result)
			throws IBSException {
		
		ModelAndView mv = null;
		
		if (result.hasErrors()) {
			mv = new ModelAndView("user/user_registration_form", "newUser", customer);
		} else {
			custService.register(customer);
			mv = new ModelAndView("redirect:/home");//user/user_registration_form
		}

		return mv;
	}
	
	@PostMapping("/svcPvdrRegister")
	public ModelAndView addSvcPvdr(@ModelAttribute("newSvcPvdr") @Valid ServiceProviderRegistrationModel svcPvdr, BindingResult result)
			throws IBSException {
		
		ModelAndView mv = null;
		svcPvdr.setUserId(null);
		svcPvdr.setSvcPvdrId(null);
		svcPvdr.setRole("SvcPvdr");
		if (result.hasErrors()) {
			mv = new ModelAndView("svc_pvdr/svc_pvdr_registration_form", "newSvcPvdr", svcPvdr);
		} else {
			svcPvdrService.register(svcPvdr);
			mv = new ModelAndView("redirect:/home");//user/user_registration_form
		}

		return mv;
	}
	
	

}

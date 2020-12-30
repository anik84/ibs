package com.example.batch7.group1.IBS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.batch7.group1.IBS.entity.CustomerEntity;
import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.CustomerModel;
import com.example.batch7.group1.IBS.model.ServiceProviderModel;
import com.example.batch7.group1.IBS.model.ServiceProviderRegistrationModel;
import com.example.batch7.group1.IBS.service.CustomerService;

@Controller
public class SecurityController {
	
	@Autowired
	private CustomerService custService;
	
	@RequestMapping("/header")
	public ModelAndView headerAction() throws IBSException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("header-fragment");

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if (!(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated()) {			
			mv.addObject("role",auth.getAuthorities().stream().findFirst().get().getAuthority());
			//mv.addObject("userName",auth.getName());
			if (auth.getAuthorities().stream().findFirst().get().getAuthority().equals("user")) {
				mv.addObject("approvalStatus",custService.getApprovalStatus(auth.getName()).getIsReqApproved());
				mv.addObject("custStatus",custService.getApprovalStatus(auth.getName()).getCustUserStatus());
			}
			
		}

		return mv;
	}

	@GetMapping("/login")
	public String loginAction() {
		String view = "index";

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated()) {
			//if (auth.getAuthorities().stream().findFirst().get().getAuthority().equalsIgnoreCase("user")) {
				view = "redirect:/userHome";
			//}
			
			
		}

		return view;
	}
	
	@RequestMapping(value={"/userHome"},method=RequestMethod.GET)
	public ModelAndView homeAction(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user_home");

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated()) {			
			//mv.addObject("role",auth.getAuthorities().stream().findFirst().get().getAuthority());
			mv.addObject("userName",auth.getName().toUpperCase());
		}

		return mv;
	}
	
	

}

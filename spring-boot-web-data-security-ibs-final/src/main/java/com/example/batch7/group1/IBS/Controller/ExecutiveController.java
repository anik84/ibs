package com.example.batch7.group1.IBS.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.AccountModel;
import com.example.batch7.group1.IBS.model.BeneficiariesModel;
import com.example.batch7.group1.IBS.model.CustomerModel;
import com.example.batch7.group1.IBS.repo.CustomerRepo;
import com.example.batch7.group1.IBS.service.AccountService;
import com.example.batch7.group1.IBS.service.CustomerService;

@Controller
@RequestMapping("/executive")
public class ExecutiveController {
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private CustomerService custService;
	
	//Executive Home
	@RequestMapping(value = { "/executiveHome" }, method = RequestMethod.GET)
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
	
	
	//User Links
	
	
	@RequestMapping("/mainHeader")
	public String loadHeader() {
		return "emp/executive_header";
	}
	
		
	// Executive Operations
	//===========================
	
	@GetMapping("/getNewUserRegistrationReq")
	public ModelAndView getNewUserRegistrationReqAction() throws IBSException {
		ModelAndView mv = new ModelAndView("emp/emp_aprove_reject_new_user_reg_req","customerDetails",custService.getNewRegistrationReq());
		
		return mv;
	}
	
	
	@GetMapping("/approve")	
	public ModelAndView approveNewUserAction(@RequestParam("uid")Integer uId) throws IBSException {
		custService.setUserOnApproval(uId);
		ModelAndView mv = new ModelAndView("emp/emp_aprove_reject_new_user_reg_req","customerDetails",custService.getNewRegistrationReq());
		
		return mv;
	}
	
	@GetMapping("/reject")	
	public ModelAndView rejectNewUserAction(@RequestParam("uid")Integer uId) throws IBSException {
		custService.setUserOnRejection(uId);
		ModelAndView mv = new ModelAndView("emp/emp_aprove_reject_new_user_reg_req","customerDetails",custService.getNewRegistrationReq());
		
		return mv;
	}

}

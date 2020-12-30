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
import com.example.batch7.group1.IBS.service.ServiceProviderService;

@Controller
@RequestMapping("/rep")
public class RepController {
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private ServiceProviderService svcPvdrService;
	
	@Autowired
	private CustomerService custService;
	
	//BankRep Home
	@RequestMapping(value = { "/repHome" }, method = RequestMethod.GET)
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
		return "emp/rep_header";
	}
	
		
	// Rep Operations
	//===========================
	
	//service provider get new Registration req and approve / reject
	
	@GetMapping("/getNewServiceProviderRegistrationReq")
	public ModelAndView getNewSvcPvdrRegistrationReqAction() throws IBSException {
		ModelAndView mv = new ModelAndView("emp/emp_approve_reject_svc_pvdr","serviceDetails",svcPvdrService.getNewRegistrationReq());	
		return mv;
	}
	
	
	@GetMapping("/approve")	
	public ModelAndView approveNewSvcPvdrAction(@RequestParam("uid")Integer uid) throws IBSException {
		svcPvdrService.setUserOnApproval(uid);
		ModelAndView mv = new ModelAndView("emp/emp_approve_reject_svc_pvdr","serviceDetails",svcPvdrService.getNewRegistrationReq());
		
		return mv;
	}
	
	@GetMapping("/reject")	
	public ModelAndView rejectNewSvcPvdrAction(@RequestParam("uid")Integer uid) throws IBSException {
		svcPvdrService.setUserOnRejection(uid);
		ModelAndView mv = new ModelAndView("emp/emp_approve_reject_svc_pvdr","serviceDetails",svcPvdrService.getNewRegistrationReq());
		
		return mv;
	}
	
	//Account registration approvals / reject
	
	@GetMapping("/getNewAccountRegistrationReq")
	public ModelAndView getNewAccountRegistrationReqAction() throws IBSException {
		ModelAndView mv = new ModelAndView("emp/emp_approve_reject_new_acct","accountDetails",accountService.getAll());		
		return mv;
	}
	
	
	@GetMapping("/approveAccount")	
	public ModelAndView approveNewUserAction(@RequestParam("acctNumber")Long acctNumber) throws IBSException {
		accountService.setUserOnApproval(acctNumber);
		ModelAndView mv = new ModelAndView("emp/emp_approve_reject_new_acct","accountDetails",accountService.getAll());		
		return mv;
	}
	
	@GetMapping("/rejectAccount")	
	public ModelAndView rejectNewUserAction(@RequestParam("acctNumber")Long acctNumber) throws IBSException {
		accountService.setUserOnRejection(acctNumber);
		ModelAndView mv = new ModelAndView("emp/emp_approve_reject_new_acct","accountDetails",accountService.getAll());		
		return mv;
	}
	
	@GetMapping("/depositAccount")
	public ModelAndView newDepositAccountAction() {
		ModelAndView mv = new ModelAndView("emp/emp_fund_deposit_entry", "newDeposit", new AccountModel());
		return mv;
	}
	
	@PostMapping("/depositAccount")
	public ModelAndView depositAccountAction(@RequestParam("acctNumber")Long acctNumber,@RequestParam("depositAmount")Double depositAmount) throws IBSException {
		ModelAndView mv = null;
		accountService.setDeposit(acctNumber, depositAmount);
		mv = new ModelAndView("redirect:/rep/depositAccount");
		return mv;
	}
}

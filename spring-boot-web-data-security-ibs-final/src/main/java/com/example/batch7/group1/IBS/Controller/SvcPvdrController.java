package com.example.batch7.group1.IBS.Controller;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.batch7.group1.IBS.entity.AccountEntity;
import com.example.batch7.group1.IBS.entity.BeneficiariesEntity;
import com.example.batch7.group1.IBS.entity.ServiceProviderEntity;
import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.AccountModel;
import com.example.batch7.group1.IBS.model.BeneficiariesModel;
import com.example.batch7.group1.IBS.model.CustomerModel;
import com.example.batch7.group1.IBS.model.ServiceProviderModel;
import com.example.batch7.group1.IBS.model.TransactionModel;
import com.example.batch7.group1.IBS.model.UserModel;
import com.example.batch7.group1.IBS.service.AccountService;
import com.example.batch7.group1.IBS.service.BenefService;
import com.example.batch7.group1.IBS.service.CustomerService;
import com.example.batch7.group1.IBS.service.ServiceProviderService;

@Controller
@RequestMapping("/svcPvdr")
public class SvcPvdrController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private CustomerService custService;
	
	@Autowired
	private BenefService benefService;
	
	@Autowired
	private ServiceProviderService svcPvdrService;

	// Svc Pvdr Home
	@RequestMapping(value = { "/svcPvdrHome" }, method = RequestMethod.GET)
	public ModelAndView homeAction() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user_home");

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated()) {
			// mv.addObject("role",auth.getAuthorities().stream().findFirst().get().getAuthority());
			mv.addObject("userName", auth.getName().toUpperCase());
		}

		return mv;
	}

	@RequestMapping("/svcPvdrHeader")
	public String loadHeader() {
		return "svc_pvdr/svc_pvdr_header";
	}
	
	//balance check
	
	@GetMapping("/getAccountTransactions")
	public ModelAndView acctTransAction() throws IBSException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("svc_pvdr/svc_pvdr_transactions");
		if(accountService.getSvcPvdrTrans().isEmpty()) {
			mv.addObject("msg", "No transaction available.");
		}else {
			mv.addObject("transactions", accountService.getSvcPvdrTrans());
		}
		return mv;
	}

}

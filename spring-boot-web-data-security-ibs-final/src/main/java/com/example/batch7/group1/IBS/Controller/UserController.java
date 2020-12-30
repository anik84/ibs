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
@RequestMapping("/user")
public class UserController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private CustomerService custService;
	
	@Autowired
	private BenefService benefService;
	
	@Autowired
	private ServiceProviderService svcPvdrService;

	// User Home
	@RequestMapping(value = { "/userHome" }, method = RequestMethod.GET)
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

	// User Links

	@RequestMapping("/mainHeader")
	public String loadHeader() {
		return "user/user_main_header";
	}

	@RequestMapping("/accountsHeader")
	public String loadAccountsHeader() {
		return "user/user_accounts_header";
	}

	@RequestMapping("/benefHeader")
	public String loadBenefHeader() {
		return "user/user_benef_header";
	}

	@GetMapping("/accountOperations")
	public ModelAndView userAccountsOperationAction() {
		ModelAndView mv = new ModelAndView("user/user_accounts", "newAccount", new AccountModel());
		return mv;
	}

	@GetMapping("/benefOperations")
	public ModelAndView userBenefOperationAction() {
		ModelAndView mv = new ModelAndView("user/user_beneficiary", "newBenef", new BeneficiariesModel());
		return mv;
	}

	

	// =========================
	/*
	 * @RequestMapping("/userMonthltStmt") public String
	 * userMonthlyStatementAction() { return "user/user_monthly_statement"; }
	 */

	/*
	 * @RequestMapping("/userAnnualStmt") public String userAnnualStatementAction()
	 * { return "user/user_annual_statement"; }
	 */

	/*
	 * @RequestMapping("/userTransferFund") public String userTransferFundAction() {
	 * return "user/user_transfer_fund"; }
	 */

	/*
	 * @RequestMapping("/userPayUtilityBill") public String
	 * userPayUtilityBillAction() { return "user/user_pay_utility_bill"; }
	 */

	// password reset

	@GetMapping("/resetPassword")
	public ModelAndView userPasswordResetAction() {
		ModelAndView mv = new ModelAndView("commons/password_reset_form", "resetPwd", new CustomerModel());
		return mv;
	}

	// password reset first login
	// =============================

	@PostMapping("/resetPwd")
	public ModelAndView addUserAction(@ModelAttribute("resetPwd") @Valid UserModel user, BindingResult result)
			throws IBSException {

		ModelAndView mv = null;

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		user.setUserName(auth.getName());
		if (result.hasErrors()) {
			mv = new ModelAndView("commons/password_reset_form", "resetPwd", user);
		} else {
			custService.resetPassword(user);
			mv = new ModelAndView("redirect:/user/userHome");// user/user_registration_form
		}

		return mv;
	}

	// User Account Operations
	// =======================
	//========================
	

	//user open acct
	
	@GetMapping("/openAccounts")
	public ModelAndView newOpenAccountAction() {
		ModelAndView mv = new ModelAndView("user/user_open_account", "newAccount", new AccountModel());
		return mv;
	}

	@PostMapping("/openAccounts")
	public ModelAndView addAccountAction(@ModelAttribute("newAccount") @Valid AccountModel account,
			BindingResult result) throws IBSException {
		ModelAndView mv = new ModelAndView();
		if (result.hasErrors()) {
			mv.setViewName("user/user_open_account");
			mv.addObject("msg", "Please check the entered data");
		} else {
			accountService.openNewAccount(account);
			mv = new ModelAndView("redirect:/user/accountsHomeOnSuccess");
		}
		return mv;
	}

	@GetMapping("/accountsHomeOnSuccess")
	public ModelAndView accountsHomeOnSuccessAction() throws IBSException {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("user/user_accounts");
		mv.addObject("msg", "Account opened successfully!! Accounts which are in pending Approval Status: ");

		mv.addObject("accounts", accountService.getAccountsByUCI());
		return mv;
	}
	
	//balance check
	
	@GetMapping("/balanceCheck")
	public ModelAndView userBalanceCheckAction() throws IBSException {
		ModelAndView mv = new ModelAndView("user/user_balance_check", "balance", accountService.getAccountsByUCI());
		return mv;
	}

	// mini stmt

	@GetMapping("/userMiniStmt")
	public ModelAndView userMiniStatementAction() throws IBSException {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("user/user_mini_statement");
		mv.addObject("flag", "LoadMiniStatement");
		mv.addObject("miniStatement", accountService.getAccountsByUCI());

		return mv;

	}

	@GetMapping("/generateStatement")
	public ModelAndView miniStatementAction(@RequestParam("acctNumber") Long acctNumber) throws IBSException {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("user/user_mini_statement");
		mv.addObject("flag", "");
		mv.addObject("miniStatement1", accountService.getAccountsByUCI());
		mv.addObject("miniStatement2", accountService.miniStatement(acctNumber));

		return mv;
	}
	
	// Monthly statement

	@GetMapping("/userMonthltStmt")
	public ModelAndView userMonthlyStetementAction() throws IBSException {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("user/user_monthly_statement");
		mv.addObject("monthlyStmt", new TransactionModel());
		mv.addObject("msg", "");
		
		return mv;
	}
	
	@PostMapping("/getMonthlyStmt")
	public ModelAndView generateMonthlyStatementAction(@ModelAttribute("monthlyStmt") @Valid TransactionModel transaction,
			BindingResult result) throws IBSException, ParseException {
		ModelAndView mv = new ModelAndView();
		if (result.hasErrors()) {
			throw new IBSException("Please check the entered data and try again.");
		} else {
			if(transaction.getYear().length() != 4) {
				throw new IBSException("The year need to be of four digit");
			} else {
				switch (transaction.getMonth())
			    {
			        case "jan": 
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-01-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-01-31"));
			            break;
			        case "mar": 
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-03-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-03-31"));
			            break;
			        case "may":
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-05-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-05-31"));
			            break;
			        case "jul":
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-07-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-07-31"));
			            break;
			        case "aug": 
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-08-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-08-31"));
			            break;
			        case "oct":
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-10-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-10-31"));
			            break;
			        case "dec":
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-12-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-12-31"));
			            break;
			        case "apr":
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-04-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-04-30"));
			            break;
			        case "jun": 
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-06-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-06-30"));
			            break;
			        case "sep": 
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-09-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-09-30"));
			            break;
			        case "nov":
			        	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-11-01"));
			        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-11-30"));
			            break;
			        case "feb":
			            if (0 == Integer.parseInt(transaction.getYear()) % 4 && 0 != Integer.parseInt(transaction.getYear()) % 100 || 0 == Integer.parseInt(transaction.getYear()) % 400)  
			            {
			            	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-02-01"));
				        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-02-29"));
			            }
			            else
			            {
			            	transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-02-01"));
				        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-02-28"));
			            }
			            break;
			    }
				
				
			} 
					
			mv.setViewName("user/user_monthly_statement");
			if(accountService.periodicStatement(transaction).isEmpty()) {
				mv.addObject("msg", "No transaction details available for this month.");
			}else {
				mv.addObject("monthlyStmt1", accountService.periodicStatement(transaction));
			}
			
		}
		return mv;

		
	}

	// populate account dropdown element list

	@ModelAttribute("accounts")
	public List<AccountModel> getAllAccountsByUCI() throws IBSException{
		return accountService.getAllAccounts();
	}
	
	// periodic statement

	@GetMapping("/userPeriodicStmt")
	public ModelAndView userPeriodicStetementAction() throws IBSException {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("user/user_periodic_statement");
		mv.addObject("periodicStmt", new TransactionModel());
		mv.addObject("msg", "");
		
		return mv;
	}
	
	@PostMapping("/getPeriodicStmt")
	public ModelAndView generatePeriodicStatementAction(@ModelAttribute("periodicStmt") @Valid TransactionModel transaction,
			BindingResult result) throws IBSException {
		ModelAndView mv = new ModelAndView();
		if (result.hasErrors()) {
			throw new IBSException("Please check the entered data and try again.");
		} else {
			mv.setViewName("user/user_periodic_statement");
			if (transaction.getFromDate().isAfter(transaction.getToDate())) {
				mv.addObject("msg","To date need to be future date.");
			} else if(accountService.periodicStatement(transaction).isEmpty()) {
				mv.addObject("msg", "No transaction details available for this month.");
			}else {
				mv.addObject("periodicStmt1", accountService.periodicStatement(transaction));
			}
		}
		return mv;

		
	}
	
	
	// yearly statement

	@GetMapping("/userAnnualStmt")
	public ModelAndView userYearlyStetementAction() throws IBSException {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("user/user_annual_statement");
		mv.addObject("yearlyStmt", new TransactionModel());
		mv.addObject("msg", "");
		
		return mv;
	}
	
	@PostMapping("/getYearlyStmt")
	public ModelAndView generateYearlyStatementAction(@ModelAttribute("yearlyStmt") @Valid TransactionModel transaction,
			BindingResult result) throws IBSException {
		ModelAndView mv = new ModelAndView();
		if (result.hasErrors()) {
			throw new IBSException("Please check the entered data and try again.");
		} else {
			mv.setViewName("user/user_annual_statement");
			transaction.setFromDate(LocalDate.parse(transaction.getYear() + "-01-01"));
        	transaction.setToDate(LocalDate.parse(transaction.getYear() + "-12-31"));
			if(accountService.periodicStatement(transaction).isEmpty()) {
				mv.addObject("msg", "No transaction details available for entered year.");
			}else {
				mv.addObject("yearlyStmt1", accountService.periodicStatement(transaction));
			}
		}
		return mv;

		
	}
	
	//populate beneficiaries dropdown element
	
	@ModelAttribute("benefAccounts")
	public List<BeneficiariesEntity> getAllBenefAccountsByUCI() throws IBSException{
		return benefService.getBenefByUCI();
	}
	
	// Transfer Fund

	@GetMapping("/userTransferFund")
	public ModelAndView loadTransferFundAction() throws IBSException {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("user/user_transfer_fund");
		mv.addObject("transferFund", new AccountModel());
		//mv.addObject("msg", "");
		
		return mv;
	}
	
	@PostMapping("/userTransferFundForm")
	public ModelAndView transferFundAction(@ModelAttribute("transferFund") @Valid AccountModel transAcct,
			BindingResult result) throws IBSException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/user_transfer_fund");
		/*System.out.println(transAcct.getAcctNumber());
		System.out.println(transAcct.getBenefAcctNo());
		System.out.println(transAcct.getTransferAmount());*/
		//System.out.println(transAcct.getTransPwd());
		/*
		 * if (result.hasErrors()) { throw new
		 * IBSException("Please check the entered data and try again."); } else {
		 */
			mv.setViewName("user/user_transfer_fund");
			accountService.doTransfer(transAcct);
			/*
			 * if(accountService.periodicStatement(transaction).isEmpty()) {
			 * mv.addObject("msg", "No transaction details available for entered year.");
			 * }else {
			 */
				//mv.addObject("yearlyStmt1", accountService.periodicStatement(transaction));
			//}
		//}
		return mv;

		
	}
	
	//populate beneficiaries dropdown element
	
	@ModelAttribute("svcPvdrAccounts")
	public List<ServiceProviderEntity> getAllSvcPvdrAccountsByUCI() throws IBSException{
		return svcPvdrService.getAllSvcPvdrAccount();
	}
	
	
	// Pay utility bill

	@GetMapping("/userPayUtilityBill")
	public ModelAndView payUtilityFundAction() throws IBSException {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("user/user_pay_utility_bill");
		mv.addObject("payUtilityBill", new AccountModel());
		//mv.addObject("msg", "");
		
		return mv;
	}
	
	@PostMapping("/userPayUtilityBillForm")
	public ModelAndView payUtilityBillAction(@ModelAttribute("payUtilityBill") @Valid AccountModel payUtility,
			BindingResult result) throws IBSException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/user_pay_utility_bill");
		accountService.payBill(payUtility);
		//mv.addObject("payUtilityBill", new AccountModel());
		return mv;

		
	}
	
	//Beneficiary Operations
	//======================
	//======================
	
	//add benef
	
	@GetMapping("/userAddBenef")
	public ModelAndView userAddBenefAction() {
		ModelAndView mv = new ModelAndView("user/user_add_beneficiary", "newBenef", new BeneficiariesModel());
		return mv;
	}
	
	@PostMapping("/addNewBenef")
	public ModelAndView addNewBenefAction(@ModelAttribute("newBenef") @Valid BeneficiariesModel benef,
			BindingResult result) throws IBSException {
		ModelAndView mv = new ModelAndView();
		if (result.hasErrors()) {
			mv.setViewName("user/user_add_beneficiary");
			mv.addObject("msg", "Please check the entered data");
		} else {
			benef.setAcctType("account");
			benefService.addBenefAcct(benef);
			mv = new ModelAndView("redirect:/user/benefHomeOnSuccess");
			
		}
		return mv;
	}
	
	@GetMapping("/benefHomeOnSuccess")
	public ModelAndView benefHomeOnSuccessAction() throws IBSException {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("user/user_beneficiary");
		mv.addObject("msg", "Beneficiary added successfully!!");

		return mv;
	}
	
	//modify benef
	//===================
	
	/*
	 * @ModelAttribute("accounts") public List<AccountModel> getAllAccountsByUCI()
	 * throws IBSException{ return accountService.getAllAccounts(); }
	 */
	
	@GetMapping("/userModifyBenef")
	public ModelAndView userModifyBenefAction() throws IBSException {
		List<BeneficiariesEntity> benefModel = benefService.getBenefByUCI();
		ModelAndView mv = new ModelAndView("user/user_modify_beneficiary");
			mv.addObject("selectBenef", new BeneficiariesModel());
			mv.addObject("benefModel", benefModel);
			return mv;
		
	}
	
	@PostMapping("/selectAcctForModification")
	public ModelAndView modifyBenefAction(@RequestParam("benefModel") Long benefAcctNo) throws IBSException {
		ModelAndView mv = new ModelAndView();
		
			mv.setViewName("user/user_save_benef_modification");
			mv.addObject("saveBenef", new BeneficiariesModel());
			mv.addObject("benefAcctNo", benefAcctNo);
			mv.addObject("benefId", benefService.getBenefByBenefAcctNo(benefAcctNo).getBenefId());
			mv.addObject("benefName", benefService.getBenefByBenefAcctNo(benefAcctNo).getBenefName());
		
		
		return mv;
	}
	
	@PostMapping("/saveAcctForModification")
	public ModelAndView saveModifyBenefAction(@ModelAttribute("saveBenef") @Valid BeneficiariesModel benef,
			BindingResult result) throws IBSException {
		ModelAndView mv = new ModelAndView();
		if (result.hasErrors()) {
			mv.setViewName("user/user_save_benef_modification");
			mv.addObject("msg", "Please check the entered data");
		} else {
			benefService.updateBenefAcct(benef);
			mv = new ModelAndView("redirect:/user/benefHomeOnUpdateSuccess");
			
		}
		return mv;
	}
	
	@GetMapping("/benefHomeOnUpdateSuccess")
	public ModelAndView benefHomeOnUpdateSuccessAction() throws IBSException {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("user/user_beneficiary");
		mv.addObject("msg", "Beneficiary updated successfully!!");

		return mv;
	}
	
	
	// add Credit card
	
	@GetMapping("/userAddCreditCard")
	public ModelAndView userAddCreditCardAction() {
		ModelAndView mv = new ModelAndView("user/user_add_credit_card", "newCredit", new BeneficiariesModel());
		return mv;
	}
	
	@PostMapping("/userAddCreditCard")
	public ModelAndView addCreditCardAction(@ModelAttribute("newCredit") @Valid BeneficiariesModel account, BindingResult result)
			throws IBSException {
		
		ModelAndView mv = null;
		if (result.hasErrors()) {
			mv = new ModelAndView("user/user_add_credit_card", "newCredit", account);
		} else {
			account.setAcctType("credit-card");
			benefService.openNewBenef(account);
			//mv.addObject("msg","Account opened successfully!!");
			mv = new ModelAndView("redirect:/user/userAddCreditCard");
		}

		return mv;
	}
	
	//modify credit card
	
	@GetMapping("/userModifyCreditCard")
	public ModelAndView userModifyCreditCardAction() {
		ModelAndView mv = new ModelAndView("user/user_modify_credit_card", "modifyCredit", new BeneficiariesModel());
		return mv;
	}
	
	@PostMapping("/userModifyCreditCard")
	public ModelAndView modifyCreditAction(@RequestParam("benefCreditAcctNo")Long benefCreditAcctNo,@RequestParam("benefCreditName")String benefCreditName,@RequestParam("benefType")String benefType) throws IBSException {
		ModelAndView mv = null;
		benefService.updateCredit(benefCreditAcctNo, benefCreditName, benefType);
		mv = new ModelAndView("redirect:/user/userModifyCreditCard");
		return mv;
	}
	
	

}

package com.wellsfargo.batch7.group1.IBS.dto;

public class CustCard {
	
	private Integer cardID;
	private Integer cardPIN;
	private String cardType;
	private Integer card_uci;
	
	public CustCard(Integer cardID, Integer cardPIN, String cardType, Integer card_uci) {
		super();
		this.cardID = cardID;
		this.cardPIN = cardPIN;
		this.cardType = cardType;
		this.card_uci = card_uci;
	}

	public Integer getCardID() {
		return cardID;
	}

	public void setCardID(Integer cardID) {
		this.cardID = cardID;
	}

	public Integer getCardPIN() {
		return cardPIN;
	}

	public void setCardPIN(Integer cardPIN) {
		this.cardPIN = cardPIN;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Integer getCard_uci() {
		return card_uci;
	}

	public void setCard_uci(Integer card_uci) {
		this.card_uci = card_uci;
	}
	
	

}

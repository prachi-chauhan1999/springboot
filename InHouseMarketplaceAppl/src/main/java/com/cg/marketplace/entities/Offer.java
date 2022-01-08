package com.cg.marketplace.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;




public class Offer {
	private int offerId;
	private boolean isAvailable;
	private LocalDate availableUpto;
	private List<Proposal> proposals = new ArrayList<>();
	public Offer() {
		
	}
	public List<Proposal> getProposals() {
		return proposals;
	}
	public void setProposals(List<Proposal> proposals) {
		this.proposals = proposals;
	}
	
	
	
	
	public Offer(int offerId, boolean isAvailable, LocalDate availableUpto) {
		super();
		this.offerId = offerId;
		this.isAvailable = isAvailable;
		this.availableUpto = availableUpto;
		
	}

	public Offer(int offerId, boolean isAvailable, LocalDate availableUpto,List<Proposal> proposals) {
		super();
		this.offerId = offerId;
		this.isAvailable = isAvailable;
		this.availableUpto = availableUpto;
		this.proposals= proposals;
		
	}
	@Override
	public String toString() {
		return "Offer [offerId=" + offerId + ", isAvailable=" + isAvailable + ", availableUpto=" + availableUpto
				+ ",proposals=" +proposals+"]";
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public LocalDate getAvailableUpto() {
		return availableUpto;
	}
	public void setAvailableUpto(LocalDate availableUpto) {
		this.availableUpto = availableUpto;
	}
	
	
	
}

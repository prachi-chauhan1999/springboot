package com.cg.marketplace.dto;

import java.time.LocalDate;
import java.util.List;

import com.cg.marketplace.entities.Proposal;

public class OfferDetails {
	private int offerId;
	private boolean isAvailable;
	private LocalDate availableUpto;
	private List<ProposalDetails> proposals;
	public OfferDetails() {
		
	}
	public OfferDetails(int offerId, boolean isAvailable, LocalDate availableUpto) {
		super();
		this.offerId = offerId;
		this.isAvailable = isAvailable;
		this.availableUpto = availableUpto;
		
	}
	
	public OfferDetails(int offerId, boolean isAvailable, LocalDate availableUpto,  List<ProposalDetails> proposals) {
		super();
		this.offerId = offerId;
		this.isAvailable = isAvailable;
		this.availableUpto = availableUpto;
		this.proposals = proposals;
	}
	@Override
	public String toString() {
		return "OfferDetails [offerId=" + offerId + ", isAvailable=" + isAvailable + ", availableUpto=" + availableUpto
				+ ", proposals=" + proposals + "]";
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
	public List<Proposal> getProposals() {
		return proposals;
	}
	public void setProposals(List<Proposal> proposals) {
		this.proposals = proposals;
	}
	

}

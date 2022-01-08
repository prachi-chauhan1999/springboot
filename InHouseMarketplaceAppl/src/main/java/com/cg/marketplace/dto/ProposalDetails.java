package com.cg.marketplace.dto;

import java.time.LocalDate;

import com.cg.marketplace.entities.Employee;
import com.cg.marketplace.entities.Proposal;
import com.cg.marketplace.entities.Resource;

public class ProposalDetails {
	private int propId;
	private String proposal;
	private	double amount;
	private LocalDate proposalDate;
	private boolean isAccepted;
	private LocalDate acceptedOn;
	
	public ProposalDetails() {
		
	}
public ProposalDetails(Proposal proposals) {
	super();
	propId = proposals.getPropId();
	proposal= proposals.getProposal();
	amount= proposals.getAmount();
	proposalDate= proposals.getAcceptedOn();
	isAccepted= proposals.isAccepted();
	acceptedOn= proposals.getAcceptedOn();
	
	}
	public ProposalDetails(int propId, String proposal, double amount, LocalDate proposalDate, boolean isAccepted,
			LocalDate acceptedOn) {
		super();
		this.propId = propId;
		this.proposal = proposal;
		this.amount = amount;
		this.proposalDate = proposalDate;
		this.isAccepted = isAccepted;
		this.acceptedOn = acceptedOn;
			}
	@Override
	public String toString() {
		return "Proposal [propId=" + propId + ", proposal=" + proposal + ", amount=" + amount + ", proposalDate="
				+ proposalDate + ", isAccepted=" + isAccepted + ", acceptedOn=" + acceptedOn +  "]";
	}
	public int getPropId() {
		return propId;
	}
	public void setPropId(int propId) {
		this.propId = propId;
	}
	public String getProposal() {
		return proposal;
	}
	public void setProposal(String proposal) {
		this.proposal = proposal;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getProposalDate() {
		return proposalDate;
	}
	public void setProposalDate(LocalDate proposalDate) {
		this.proposalDate = proposalDate;
	}
	public boolean isAccepted() {
		return isAccepted;
	}
	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
	public LocalDate getAcceptedOn() {
		return acceptedOn;
	}
	public void setAcceptedOn(LocalDate acceptedOn) {
		this.acceptedOn = acceptedOn;
	}
	
	

}

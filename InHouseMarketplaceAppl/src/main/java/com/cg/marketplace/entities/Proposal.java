package com.cg.marketplace.entities;

import java.time.LocalDate;

public class Proposal {
	private int propId;
	private String proposal;
	private	double amount;
	private LocalDate proposalDate;
	private boolean isAccepted;
	private LocalDate acceptedOn;
	private Employee emp;
	private Resource resource;
	public Proposal() {
		
	}
	public Proposal(int propId, String proposal, double amount, LocalDate proposalDate, boolean isAccepted,
			LocalDate acceptedOn, Employee emp, Resource resource) {
		super();
		this.propId = propId;
		this.proposal = proposal;
		this.amount = amount;
		this.proposalDate = proposalDate;
		this.isAccepted = isAccepted;
		this.acceptedOn = acceptedOn;
		this.emp = emp;
		this.resource = resource;
	}
	@Override
	public String toString() {
		return "Proposal [propId=" + propId + ", proposal=" + proposal + ", amount=" + amount + ", proposalDate="
				+ proposalDate + ", isAccepted=" + isAccepted + ", acceptedOn=" + acceptedOn + ", emp=" + emp
				+ ", resource=" + resource + "]";
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
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	


}

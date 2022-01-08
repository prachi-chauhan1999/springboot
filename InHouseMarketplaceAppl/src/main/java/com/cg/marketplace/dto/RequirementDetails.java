package com.cg.marketplace.dto;

import java.time.LocalDate;
import java.util.List;

import com.cg.marketplace.entities.Proposal;

public class RequirementDetails {
	private int reqId;
	private boolean isFulfilled;
	private LocalDate fulfilledOn;
	private  List<ProposalDetails> proposals;
	public RequirementDetails() {
		
	}
	public RequirementDetails(int reqId, boolean isFulfilled, LocalDate fulfilledOn) {
		super();
		this.reqId = reqId;
		this.isFulfilled = isFulfilled;
		this.fulfilledOn = fulfilledOn;
		
	}
	public RequirementDetails(int reqId, boolean isFulfilled, LocalDate fulfilledOn, List<ProposalDetails> proposals) {
		super();
		this.reqId = reqId;
		this.isFulfilled = isFulfilled;
		this.fulfilledOn = fulfilledOn;
		this.proposals = proposals;
	}
	@Override
	public String toString() {
		return "RequirementDetails [reqId=" + reqId + ", isFulfilled=" + isFulfilled + ", fulfilledOn=" + fulfilledOn
				+ ",  proposals=" + proposals+ "]";
	}
	public int getReqId() {
		return reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	public boolean isFulfilled() {
		return isFulfilled;
	}
	public void setFulfilled(boolean isFulfilled) {
		this.isFulfilled = isFulfilled;
	}
	public LocalDate getFulfilledOn() {
		return fulfilledOn;
	}
	public void setFulfilledOn(LocalDate fulfilledOn) {
		this.fulfilledOn = fulfilledOn;
	}
	public List<Proposal> getProposals() {
		return proposals;
	}
	public void setProposals(List<Proposal> proposals) {
		this.proposals = proposals;
	}

}

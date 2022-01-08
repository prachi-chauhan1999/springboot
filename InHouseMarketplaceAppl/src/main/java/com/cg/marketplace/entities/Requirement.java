package com.cg.marketplace.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Requirement {
	private int reqId;
	private boolean isFulfilled;
	private LocalDate fulfilledOn;
	private  List<Proposal> proposals = new ArrayList<>();
	public Requirement() {
		
	}
	public List<Proposal> getProposals() {
		return proposals;
	}
	public void setProposals(List<Proposal> proposals) {
		this.proposals = proposals;
	}
	
	
	public Requirement(int reqId, boolean isFulfilled, LocalDate fulfilledOn) {
		super();
		this.reqId = reqId;
		this.isFulfilled = isFulfilled;
		this.fulfilledOn = fulfilledOn;
	}
	@Override
	public String toString() {
		return "Requirement [reqId=" + reqId + ", isFulfilled=" + isFulfilled + ", fulfilledOn=" + fulfilledOn + "]";
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
	
	
 


}

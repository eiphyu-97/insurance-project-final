package com.motor.insurance.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proposal")
public class Proposal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "proposal_id")
	private int proposalId;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "coverage_type")
	private String coverageType;
	
	@Column(name = "premium")
	private double premium;
	
	@Column(name = "sum_insure")
	private double sumInsure;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "create_date")
	private Date createDate;
	
	
	
	public int getProposalId() {
		return proposalId;
	}
	public void setProposalId(int proposalId) {
		this.proposalId = proposalId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public double getSumInsure() {
		return sumInsure;
	}
	public void setSumInsure(double sumInsure) {
		this.sumInsure = sumInsure;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}

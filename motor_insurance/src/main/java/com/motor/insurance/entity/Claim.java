package com.motor.insurance.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "claim")
public class Claim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "claim_id")
	private int id;
	
	@Column(name = "loss_of_date")
	private Date lossOfDate;
	
	
	@Column(name = "accident_location")
	private String accidentLocation;
	
	@Column(name = "accident_detail")
	private String accidentDetail;
	
	@Column(name = "status")
	private String status;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getAccidentDetail() {
		return accidentDetail;
	}
	public void setAccidentDetail(String accidentDetail) {
		this.accidentDetail = accidentDetail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getAccidentLocation() {
		return accidentLocation;
	}
	public void setAccidentLocation(String accidentLocation) {
		this.accidentLocation = accidentLocation;
	}
	public Date getLossOfDate() {
		return lossOfDate;
	}
	public void setLossOfDate(Date lossOfDate) {
		this.lossOfDate = lossOfDate;
	}
	
}

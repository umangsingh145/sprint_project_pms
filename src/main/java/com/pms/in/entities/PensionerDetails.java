package com.pms.in.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pensioner_details")
public class PensionerDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6741695700708873345L;
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pensioner_id;
	
	@Column
	private int age;
	
	@Column
	private int aadhar;
	
	@Column
	private int pan;
	
	@Column
	private String pensionType;
	
	@OneToOne
	@JoinColumn(name = "pensioner_id")
	private PensionDetails pensionDetails;
	
	

	public PensionerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PensionerDetails(int pensioner_id, int age, int aadhar, int pan, String pensionType) {
		super();
		this.pensioner_id = pensioner_id;
		this.age = age;
		this.aadhar = aadhar;
		this.pan = pan;
		this.pensionType = pensionType;
	}

	public PensionerDetails(int pensioner_id, int age, int aadhar, int pan, String pensionType,
			PensionDetails pensionDetails) {
		super();
		this.pensioner_id = pensioner_id;
		this.age = age;
		this.aadhar = aadhar;
		this.pan = pan;
		this.pensionType = pensionType;
		this.pensionDetails = pensionDetails;
	}

	public int getPensioner_id() {
		return pensioner_id;
	}

	public void setPensioner_id(int pensioner_id) {
		this.pensioner_id = pensioner_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAadhar() {
		return aadhar;
	}

	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}

	public int getPan() {
		return pan;
	}

	public void setPan(int pan) {
		this.pan = pan;
	}

	public String getPensionType() {
		return pensionType;
	}

	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}

	public PensionDetails getPensionDetails() {
		return pensionDetails;
	}

	public void setPensionDetails(PensionDetails pensionDetails) {
		this.pensionDetails = pensionDetails;
	}

	@Override
	public String toString() {
		return "PensionerDetails [pensioner_id=" + pensioner_id + ", age=" + age + ", aadhar=" + aadhar + ", pan=" + pan
				+ ", pensionType=" + pensionType + ", pensionDetails=" + pensionDetails + "]";
	}

	
	
	
	
}
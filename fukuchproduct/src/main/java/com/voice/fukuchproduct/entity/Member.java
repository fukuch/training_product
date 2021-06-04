package com.voice.fukuchproduct.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name ="member")
@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberId;
	private String name;
	private String nameKana;
	private String sex;
	private String birthday;
	private String position;
	private String joiningDay;
	private String zipcode;
	private String address;
	private String telNumber;
	private String phoneNumber;
	private String hourlyWage;
	private String remarks;
	
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNameKana() {
		return nameKana;
	}
	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getJoiningDay() {
		return joiningDay;
	}
	public void setJoiningDay(String joiningDay) {
		this.joiningDay = joiningDay;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(String hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ",name=" + name + ",nameKana=" + nameKana + ",sex=" + sex + ",birthday=" + birthday + ",position=" + position + ",joiningDay=" + joiningDay + ",zipcode=" + zipcode + ",address=" + address + ",telNumber=" + telNumber + ",phoneNumber=" + phoneNumber + ",remarks=" + remarks + ",hourlyWage=" + hourlyWage + "]";
	}
	
	@Column
		private Date deleteDate;
}

package com.voice.fukuchproduct.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="attendance")
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long attendanceId;
	private Long memberId ;
	private String workDivision;
	private String date;
	private String punchIn;
	private String punchOut;
	private String breakTime;
	private String remarks;
	
	public Long getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(Long attendanceId) {
		this.attendanceId = attendanceId;
	}
	
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	
	public String getWorkDivision() {
		return workDivision;
	}
	public void setWorkDivision(String workDivision) {
		this.workDivision = workDivision;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getPunchIn() {
		return punchIn;
	}
	public void setPunchIn(String punchIn) {
		this.punchIn = punchIn;
	}
	
	public String getPunchOut() {
		return punchOut;
	}
	public void setPunchOut(String punchOut) {
		this.punchOut = punchOut;
	}
	
	public String getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "Attendance [attendanceId=" + attendanceId + ",memberId=" + memberId + ",workDivision=" + workDivision + ",date=" + date + ",punchIn=" + punchIn + ",punchOut=" + punchOut + ",breakTime=" + breakTime + ",remarks=" + remarks + "]";
	}
}
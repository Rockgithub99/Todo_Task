 package com.example.todoOpretion.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Meeting {
	

	private String meetingId;
	private String clientName;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime startDateTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime endDateTime;
	
    private String empId;

	public Meeting() {
		super();
		
	}

	public Meeting(String meetingId, String clientName, LocalDateTime startDateTime, LocalDateTime endDateTime,
			String empId) {
		super();
		this.meetingId = meetingId;
		this.clientName = clientName;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.empId = empId;
	}

	public String getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", clientName=" + clientName + ", startDateTime=" + startDateTime
				+ ", endDateTime=" + endDateTime + ", empId=" + empId + "]";
	}
	
	
    
    
}

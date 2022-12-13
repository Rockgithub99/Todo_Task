package com.example.clientOpretion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.clientOpretion.entity.Meeting;

@Service
public interface MeetImp {
	
	public List<Meeting> getMeetingOfUser(String meetingId);

}

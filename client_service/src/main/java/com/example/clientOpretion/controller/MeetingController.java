package com.example.clientOpretion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clientOpretion.entity.Meeting;
import com.example.clientOpretion.service.MeetingService;

@RestController
@RequestMapping("/meeting")
public class MeetingController {
	
	@Autowired
	private MeetingService meetService;
	
	@GetMapping("/meet/{meetingId}")
	public List<Meeting> getMeeting(@PathVariable ("meetingId") String meetingId){
		return meetService.getMeetingOfUser(meetingId);
		

		
		
	}
	

}

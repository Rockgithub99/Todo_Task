package com.example.clientOpretion.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clientOpretion.entity.Meeting;
import com.example.clientOpretion.repo.MeetingRepo;

@Service
public class MeetingService implements MeetImp {

	@Autowired
	
    private MeetingRepo meetRepo;
//	List<Meeting> list = List.of(new Meeting("12", "xyz", "2022-11-13 10:20:40.100", "2022-11-14 12:20:40.100", "1")
//
//	);

	@Override
	public List<Meeting> getMeetingOfUser(String meetingId) {
		List<Meeting> list=(List<Meeting>) meetRepo.findAll();
		return list;
//		return list.stream().filter(meeting -> meeting.getMeetingId().equals(meetingId)).collect(Collectors.toList());

	}

}

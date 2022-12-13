package com.example.clientOpretion.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.clientOpretion.entity.Meeting;
@Repository
public interface MeetingRepo extends CrudRepository<Meeting, String> {

	

}

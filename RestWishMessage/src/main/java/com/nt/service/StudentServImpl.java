package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.DockerStudent;
import com.nt.repo.IStudentRepo;

@Service
public class StudentServImpl  implements IStudentService{

	@Autowired
	private IStudentRepo repo;
	
	
	@Override
	public String createStudent(DockerStudent student) {
                DockerStudent s1 =repo.save(student);
		return "The Student is Sucessfully Registered With\t" +s1.getStid()+"Radhe Radhe" ;
	}

}

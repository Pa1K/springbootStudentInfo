package com.pavan.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pavan.student.model.Address;
import com.pavan.student.model.Student;
import com.pavan.student.repo.StudentRepository;

@SpringBootApplication
public class SpringBootStudentInfoApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentInfoApplication.class, args);
	}
	
	/*
	 * @Autowired private StudentRepository studentRepository;
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * Student student1 = new Student("pavan", "5th", 500); Student student2 = new
	 * Student("ram", "10th", 560);
	 * 
	 * Address address1 = new Address("141", "sirguppaRoad", "bellary", "karnataka",
	 * 583102, "india"); Address address2 = new Address("142", "sirguppaRoad",
	 * "bellary", "karnataka", 583102, "india");
	 * 
	 * student1.getAddress().add(address1); student1.getAddress().add(address2);
	 * 
	 * student2.getAddress().add(address1); student2.getAddress().add(address2);
	 * 
	 * this.studentRepository.save(student1);
	 * 
	 * }
	 */

}

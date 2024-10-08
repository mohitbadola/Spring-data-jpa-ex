package com.jason.spring_data_jpa_ex;

import com.jason.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//		Student s4 = context.getBean(Student.class);
//
//		s1.setRollNo(1);
//		s1.setName("Mohit");
//		s1.setMarks(100);
//
//		s2.setRollNo(2);
//		s2.setName("Sohit");
//		s2.setMarks(88);
//
//		s3.setRollNo(3);
//		s3.setName("Kaukau");
//		s3.setMarks(80);
//
//		s4.setRollNo(4);
//		s4.setName("Pulkit");
//		s4.setMarks(70);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		repo.delete(s2);

//		System.out.println(repo.findAll());

//		Optional<Student> st = repo.findById(1);
//		System.out.println(st.orElse(new Student()));

//		System.out.println(repo.findByName("Kaukau"));

//		System.out.println(repo.findByMarks(100));

//		System.out.println(repo.findByMarksGreaterThan(85));
	}

}

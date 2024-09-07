package com.jason.spring_data_jpa_ex;

import com.jason.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//		Student s4 = context.getBean(Student.class);
//
//		s1.setRollNo(1);
//		s1.setName("Mohit");
//		s1.setMarks(100);
//
//		s2.setRollNo(2);
//		s2.setName("Sohit");
//		s2.setMarks(90);
//
//		s3.setRollNo(3);
//		s3.setName("Kaukau");
//		s3.setMarks(80);
//
//		s4.setRollNo(4);
//		s3.setName("Pulkit");
//		s3.setMarks(70);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

		System.out.println(repo.findAll());
	}

}

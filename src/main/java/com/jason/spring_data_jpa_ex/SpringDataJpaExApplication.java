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

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		Student s4 = context.getBean(Student.class);

		s1.setRollNo(1);
		s1.setName("Mohit");
		s1.setMarks(100);

		s1.setRollNo(2);
		s1.setName("Sohit");
		s1.setMarks(90);

		s1.setRollNo(3);
		s1.setName("Kaukau");
		s1.setMarks(80);

		repo.save(s1);
	}

}

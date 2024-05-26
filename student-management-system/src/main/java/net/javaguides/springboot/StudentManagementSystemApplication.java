package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.entity.Student;
import net.javaguides.springboot.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository ;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Abhay" ,"tomar" , "abhayalpha21@gmail.com");
//		studentRepository.save(student1); 
//		Student student2 = new Student("Anushka" ,"tomar" , "anu21@gmail.com");
//		studentRepository.save(student2); 
//		Student student3 = new Student("Uditi" ,"Singh" , "usign@gmail.com");
//		studentRepository.save(student3); 
//		Student student4 = new Student("Nanii" ,"negi" , "nanii@gmail.com");
//		studentRepository.save(student4); 
	} 

}
 
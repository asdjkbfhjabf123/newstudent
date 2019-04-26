package com.geekzila.student;

import java.util.List;

import com.geekzila.student.model.Student;
import com.geekzila.student.service.StudentService;
import com.geekzila.student.service.impl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		List<Student> stds = studentService.findAll();

		for (int i = 0; i < stds.size(); i++) {
			Student student = stds.get(i);
			System.out.println("ID:" + student.getId() + " Name:" + student.getName() + " Age:" + student.getAge());
		}
		System.out.println("One more student has been joined and the details are given below;");

		Student std = new Student(456, "Rajat", 29);
		studentService.add(std);
		System.out.println("ID:" + std.getId() + " Name:" + std.getName() + " Age:" + std.getAge());

		System.out.println("The lower age student is been removed hence the left candidates are;");

		studentService.delete(123, "Rakesh", 23);
		for (int i = 0; i < stds.size(); i++) {
			Student student = stds.get(i);
			System.out.println("ID:" + student.getId() + " Name:" + student.getName() + " Age:" + student.getAge());
		}

		System.out.println("One candidate needs to be replaced and the name and other details are given below;");

		Student rajat = studentService.get(456, "Rajat", 29);
		rajat.setId(258);
		rajat.setName("Suresh");
		rajat.setAge(33);

		for (int i = 0; i < stds.size(); i++) {
			Student student = stds.get(i);
			System.out.println("ID:" + student.getId() + " Name:" + student.getName() + " Age:" + student.getAge());
		}
	}
}

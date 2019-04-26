package com.geekzila.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.student.model.Student;
import com.geekzila.student.service.StudentService;

public class StudentServiceImpl implements StudentService {

	public List<Student> stds = new ArrayList<Student>();

	public StudentServiceImpl() {
		stds.add(new Student(123, "Rakesh", 23));
		stds.add(new Student(321, "Ariv", 26));
	}

	public void add(Student student) {
		// TODO Auto-generated method stub
		stds.add(student);

	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return stds;
	}

	public Student get(Integer id, String name, Integer age) {
		// TODO Auto-generated method stub
		for (Student student : stds) {
			if (student.getId().equals(id) && student.getName().equals(name) && student.getAge().equals(age)) {
				return student;
			}
		}
		return null;
	}

	public void delete(Integer id, String name, Integer age) {
		// TODO Auto-generated method stub
		Student studentFromDb = get(id, name, age);
		stds.remove(studentFromDb);

	}

	public Student update(Student student) {
		// TODO Auto-generated method stub
		for (Student studentFromDb : stds) {
			if (studentFromDb.getId() == student.getId() && studentFromDb.getName() == student.getName()
					&& studentFromDb.getAge() == student.getAge()) {
				int studentIndex = stds.indexOf(studentFromDb);
				stds.set(studentIndex, studentFromDb);
			}
		}
		return null;
	}

}

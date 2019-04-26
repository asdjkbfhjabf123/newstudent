package com.geekzila.student.service;

import java.util.List;

import com.geekzila.student.model.Student;

public interface StudentService {

	public void add(Student student);

	public List<Student> findAll();

	public Student get(Integer id, String name, Integer age);

	public void delete(Integer id, String name, Integer age);

	public Student update(Student student);

}

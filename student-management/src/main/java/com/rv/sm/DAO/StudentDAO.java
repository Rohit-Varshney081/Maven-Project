package com.rv.sm.DAO;

import java.util.List;

import com.rv.sm.api.Student;

public interface StudentDAO {
	List<Student> loadStudents();
	void saveStudent(Student student);
}

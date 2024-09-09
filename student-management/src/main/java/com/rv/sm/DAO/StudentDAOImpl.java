package com.rv.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rv.sm.api.Student;
import com.rv.sm.rowmapper.StudentRowMapper;
@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> loadStudents() {
		// I will write some logic to get me the student data from the db
		String sql="SELECT * FROM students;";
		List<Student> theListOfStudent = jdbcTemplate.query(sql,new StudentRowMapper());
		
		return theListOfStudent;
	}
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		// write code to store  the data into db
		Object[] sqlParameters={student.getName(),student.getMobile(),student.getCountry()};
		String sql="insert into students(name,mobile,country) values(?,?,?)";
		jdbcTemplate.update(sql, sqlParameters);
		System.out.println("Updated...");
	}
}

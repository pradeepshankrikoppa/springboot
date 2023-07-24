package net.pradeep.springbootrest.net.pradeep.springbootrest.mapper;

import net.pradeep.springbootrest.net.pradeep.springbootrest.bean.Student;
import net.pradeep.springbootrest.net.pradeep.springbootrest.dto.StudentDto;

public class StudentMapper {
	
	public static StudentDto mapToStudentDto(Student student) {
		StudentDto studto=new StudentDto(
				student.getId(),
				student.getLastname(),
				student.getFirstName()
				);
		return studto;
	}

	public static Student mapToStudent(StudentDto student) {
		Student stu=new Student(
				student.getId(),
				student.getLastname(),
				student.getFirstName()
				);
		return stu;
	}

}

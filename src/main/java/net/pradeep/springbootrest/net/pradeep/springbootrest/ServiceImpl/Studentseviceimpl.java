package net.pradeep.springbootrest.net.pradeep.springbootrest.ServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import lombok.AllArgsConstructor;
import net.pradeep.springbootrest.net.pradeep.springbootrest.Repository.Studentrepo;
import net.pradeep.springbootrest.net.pradeep.springbootrest.bean.Student;
import net.pradeep.springbootrest.net.pradeep.springbootrest.dto.StudentDto;
import net.pradeep.springbootrest.net.pradeep.springbootrest.mapper.StudentMapper;
import net.pradeep.springbootrest.net.pradeep.springbootrest.service.Studentservice;

@AllArgsConstructor
@Service

public class Studentseviceimpl implements Studentservice {
	
	@Autowired
	private Studentrepo srepo ;
	@Autowired
	private ModelMapper modelmapper;

	@Override
	public StudentDto createUser(StudentDto student) {
		//Student stu1=StudentMapper.mapToStudent(student);
		Student stu1= modelmapper.map(student, Student.class);
		Student st=srepo.save(stu1);
		
		//StudentDto studentdto=StudentMapper.mapToStudentDto(st);
		
		StudentDto studentdto=modelmapper.map(st,StudentDto.class);
		
		return studentdto;
	}

}

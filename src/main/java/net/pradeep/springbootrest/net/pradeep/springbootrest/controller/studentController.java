package net.pradeep.springbootrest.net.pradeep.springbootrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;
import net.pradeep.springbootrest.net.pradeep.springbootrest.bean.Student;
import net.pradeep.springbootrest.net.pradeep.springbootrest.dto.StudentDto;
import net.pradeep.springbootrest.net.pradeep.springbootrest.service.Studentservice;


@RestController
@RequestMapping("api")
@AllArgsConstructor
public class studentController {
	@Autowired
	private Studentservice studentservice;
	
//	 @GetMapping("student")
//	public ResponseEntity<Student> getStudent() 
//	{
//		Student student=new Student(1,"pradeep","shankrikoppa");
//		return new ResponseEntity<>(student,HttpStatus.OK);
//	}
//	 @GetMapping("students")
//	 public List<Student> getStudents()
//	 {
//		List<Student> students=new ArrayList();
//		students.add(new Student(2,"abc","xyz"));
//		students.add(new Student(3,"sss","uuu"));
//		return students;
//		
//	 }
//	  @GetMapping("students/{id}/{name}")
//	 public Student studentPath(@PathVariable("id") int sid, 
//			                    @PathVariable("name") String fname)
//	 {
//		 return new Student(sid,fname,"uuu");
//	 }
//	  
//      @GetMapping("students/query")
//	  public Student studentrequest(@RequestParam int id,
//			                        @RequestParam String fname,
//			                        @RequestParam String lname)
//	  {
//		  return new Student(id,fname,lname);
//	  }
//      
      @PostMapping("student/create")
      @ResponseStatus(HttpStatus.CREATED)
      public StudentDto createstudent(@RequestBody StudentDto student) {
//    	  System.out.println(student.getId());
//    	  System.out.println(student.getFirstName());
//    	  System.out.println(student.getLastname());
    	  StudentDto savedstudent=studentservice.createUser(student);
    	  return savedstudent;
    	  
      }
      @PutMapping("student/{id}/update")
      public Student updateStudent(@RequestBody Student student,
    		                       @PathVariable("id") int sid)
      {
    	  System.out.println(student.getFirstName());
    	  System.out.println(student.getLastname());
    	  return student;
      }
      @DeleteMapping("student/{id}/delete")
      public String Delete(@PathVariable("id") int studentId)
      {
    	  System.out.println(studentId);
    	  return "student deleatedsuccessfully";
      }
}

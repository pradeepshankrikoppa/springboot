package net.pradeep.springbootrest.net.pradeep.springbootrest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.pradeep.springbootrest.net.pradeep.springbootrest.bean.Student;

public interface Studentrepo extends JpaRepository<Student,Integer>
{

}

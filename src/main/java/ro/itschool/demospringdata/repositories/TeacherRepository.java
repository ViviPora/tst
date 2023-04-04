package ro.itschool.demospringdata.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ro.itschool.demospringdata.entities.TeachersEntity;

import java.util.List;

public interface TeacherRepository extends CrudRepository<TeachersEntity, Integer> {
//    @Query("SELECT new CourseStudentCount(c.name, count(s) from CourseEntity c JOIN c.students s where c.teacher.id = :idTeacher group by c.name")
//    List<CourseStudentCount> countStudentsInCourses(@Param("idTeacher") int idTeacher);
}

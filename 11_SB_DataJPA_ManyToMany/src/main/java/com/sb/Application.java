package com.sb;

import com.sb.entity.Course;
import com.sb.entity.Student;
import com.sb.repository.CourseRepository;
import com.sb.repository.StudentRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	System.out.println("1111");
        //SpringApplication.run(Application.class, args);
        ApplicationContext ctx=SpringApplication.run(Application.class, args);
        StudentRepository studentRepository=(StudentRepository) ctx.getBean("studentRepository");
        CourseRepository courseRepository=(CourseRepository) ctx.getBean("courseRepository");
       //mappingDemo(studentRepository, courseRepository);
    
        List<Student> list= (List<Student>) studentRepository.findAll();
        /*for(int x=0;x<list.size();x++) {
        	Student s=list.get(x);
        	System.out.println(" ================ ");
        	System.out.println("Name="+s.getName());
        	System.out.println("Age="+s.getAge());
        	System.out.println(s.getCourses());
        	System.out.println(" ================ ");
        }*/
        List<Course> list2= courseRepository.getCourse(1000d, 1600d);
        for(int x=0;x<list2.size();x++) {
        	Course c=list2.get(x);
        	System.out.println(" ================ ");
        	System.out.println("Title="+c.getTitle());
        	System.out.println("Fee="+c.getFee());
        	System.out.println(" ================ ");
        }
        
    }

    public static void  mappingDemo(StudentRepository studentRepository,
                                         CourseRepository courseRepository) {
            // create a student
            Student student = new Student("Amit Singh", 25, "9th");

            // save the student
            studentRepository.save(student);

            // create three courses
            Course course1 = new Course("Spring BOOT", "ML", 12, 1500);
            Course course2 = new Course("SQL", "DS", 8, 800);
            Course course3 = new Course("Web Basics", "WB", 10, 0);

            // save courses
            courseRepository.saveAll(Arrays.asList(course1, course2, course3));

            // add courses to the student
            student.getCourses().addAll(Arrays.asList(course1, course2, course3));

            // update the student
            studentRepository.save(student);
        };
}
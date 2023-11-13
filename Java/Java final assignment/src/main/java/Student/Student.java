package Student;

import StudentService.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class Student extends Person{
    private double avergae;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course>approvedCourses = new HashMap<>();

    public Student(String id, String name, String email, Date birthDate){
        super(id, name,email, birthDate);
    }

    public void enrollToCourse(Course course){
        registerApprovedCourse(course);
        courses.add(course);
    }

    public void registerApprovedCourse(Course course){
        approvedCourses.put(course.getCode(), course);
    }

    public boolean isCourseApproved(String courseCode){
        if(approvedCourses.containsKey(courseCode)){
            return true;
        }
        return false;
    }

    public List<Course> findPassedCourses(Course course){
        System.out.println(course);
        System.out.println(courses);
    }

    public boolean isAttendingCourse(String courseCode){
        if(approvedCourses.containsKey(courseCode)){
            return true;
        }
        return false;
    }

    /*
    @Override
    public List<Course> getApprovedCourses(){
        return null;
    }

     */

    public String toString(){
        return "Student {" + super.toString() + "}";
    }
}

package Day12.Ex02_WildCard;

import java.util.Arrays;

public class WildCardEx {

	// 수강생들이, 교육과정(Course)에 수강등록을 합니다.
		
	// 전체 이용가능 강의 - 수강등록
	public static void joinCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : "
				+ Arrays.toString(course.getStudents()));
	}
	
	// 학생 전용 강의
	public static void joinCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : "
				+ Arrays.toString(course.getStudents()));
	}
	
	// 직장인 전용 강의
	public static void joinCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<> ("일반인과정", 5); 
		personCourse.add(new Person("일반인") );
		personCourse.add(new Worker("직장인") );
		personCourse.add(new Student("학생") );
		personCourse.add(new HighStudent("고등학생") );
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add(new Worker("직장인") );
		
		Course<Student> studCourse = new Course<>("학생과정", 5);
		studCourse.add(new Student("학생"));		
		studCourse.add(new HighStudent("고등학생"));		
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add( new HighStudent("고등학생"));
		
		joinCourse(personCourse);
		joinCourse(workerCourse);
		joinCourse(studCourse);
		joinCourse(highStudentCourse);
		
		// joinCourseStudent(personCourse);
		// joinCourseStudent(workerCourse);
		joinCourseStudent(studCourse);
		joinCourseStudent(highStudentCourse);
		
		joinCourseWorker(personCourse);
		joinCourseWorker(workerCourse);
		// joinCourseWorker(studCourse);
		// joinCourseWorker(highStudentCourse);

				
		
	}
	
}

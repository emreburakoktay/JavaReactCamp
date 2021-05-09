
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"Emre Burak Oktay","emreburakoktay15@gmail.com","12345");
		Student student2 = new Student(2,"Ayþe Yýlmaz","ayþeyýlmaz001@hotmail.com","aw34rft6y7");
		Student student3 = new Student(3,"Mehmet Turan","turanmehmet09@gmail.com","13579");
		
		Student[] students = {student1,student2,student3};
		
		for(Student student : students) {
			System.out.println(student.name);
		}
		
		Course course1 = new Course(1,"JAVA + REACT yazýlým Geliþtirici Yetiþtirme Kampý"
									,"Engin Demiroð",0,"-");
		Course course2 = new Course(2,"C# + ANGULAR yazýlým Geliþtirici Yetiþtirme Kampý"
									,"Engin Demiroð",0,"-");
		
		Course[] courses = {course1,course2};
		
		for(Course course : courses) {
			System.out.println(course.name);
		}
	}
	
	
}

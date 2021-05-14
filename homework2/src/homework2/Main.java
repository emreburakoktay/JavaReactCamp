package homework2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Emre Burak");
		student1.setLastName("Oktay");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		
		UserManager userManager = new UserManager();
		userManager.add(student1, new StudentManager());
		userManager.add(instructor1, new InstructorManager());
		
	}

}

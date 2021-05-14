package homework2;

public class StudentManager extends Manager {
	
	@Override
	public void add(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Öðrencisi eklendi.");
		
	}
}

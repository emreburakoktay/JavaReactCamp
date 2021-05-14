package homework2;

public class InstructorManager extends Manager{
	
	@Override
	public void add(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " eðitmeni eklendi.");
		
	}
}

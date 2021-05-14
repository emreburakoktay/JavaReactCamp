package homework2;

public class Instructor extends User {
		
		private String[] certificates;
		private String[] givenCourses;
		

		public String[] getCertificates() {
			return certificates;
		}
		
		public void setCertificates(String[] certificates) {
			this.certificates = certificates;
		}
		
		public String[] getGivenCourses() {
			return givenCourses;
		}
		
		public void setGivenCourses(String[] givenCourses) {
			this.givenCourses = givenCourses;
		}
}

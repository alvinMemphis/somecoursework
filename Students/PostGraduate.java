package Students;

public class PostGraduate extends Undergaduate {
	String firstdegree;

	public PostGraduate(String registrstionnumber, String firstname,
			String lastname, String telephone, String email, String firstdegree) {
		super(registrstionnumber, firstname, lastname, telephone, email);
		this.firstdegree = firstdegree;
	}

	public PostGraduate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PostGraduate [firstdegree=" + firstdegree
				+ ", registrstionnumber=" + registrstionnumber + ", firstname="
				+ firstname + ", lastname=" + lastname + ", telephone="
				+ telephone + ", email=" + email + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}




}

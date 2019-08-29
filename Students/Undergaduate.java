package Students;

public class Undergaduate extends Student {
String registrstionnumber,firstname,lastname,telephone,email;

	public Undergaduate(String registrstionnumber, String firstname,
		String lastname, String telephone, String email) {
					super();
	this.registrstionnumber = registrstionnumber;
	this.firstname = firstname;
	this.lastname = lastname;
	this.telephone = telephone;
	this.email = email;
}

	public Undergaduate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	int finalMark(int test1,int test2,int coursework,int exammark) {
		// TODO Auto-generated method stub
		return ((test1+test2+coursework)/3+exammark);
	}

}

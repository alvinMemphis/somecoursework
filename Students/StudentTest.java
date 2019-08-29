package Students;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String firstname="Edith",lastname="Influencer",regestrationnumber="45/1000",
		email="eddie@gmail.com",telephone="0788065434",firstdegree="computer science";
		
		PostGraduate postgraduate=new PostGraduate(firstname, lastname, regestrationnumber, email, telephone, firstdegree);
		System.out.println("Object1 details :"+postgraduate);
		//toString() method was overridden to add full on object info
		//therefore providing print as an object implicitly calls toString and prints class props
		PostGraduate postgraduate1=new PostGraduate();
		
		System.out.println("Object2 details :"+postgraduate1);
		
		
	}

}

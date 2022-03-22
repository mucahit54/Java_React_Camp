
public class Courses {
	public Courses() {
		System.out.println("Kurs listelendi");
	}

	public Courses(int id, String name, String detail, String teacherName, String price, Boolean registered,
			int percentComplition) {
		this();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.teacherName = teacherName;
		this.price = price;
		this.registered = registered;
		this.percentComplition = percentComplition;
	}

	int id;
	String name;
	String detail;
	String teacherName;
	String price;
	Boolean registered;
	int percentComplition;

}

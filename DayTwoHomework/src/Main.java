
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Courses course1 = new Courses();
		course1.id = 1;
		course1.name = "JAVASCR�PT";
		course1.detail = "Kamp�m�z 1.5 ay s�recektir.";
		course1.teacherName = "Engin DEM�RO�";
		course1.price = "0";
		course1.registered = false;
		course1.percentComplition = 0;

		Courses course2 = new Courses(2, "C# and ANGULAR", "Kamp�m�z 2 ay s�recektir.", "Engin Demiro�", "0", true, 25);
		Courses course3 = new Courses(3, "JAVA and REACT", "Kamp�m�z 3 ay s�recektir.", "Engin Demiro�", "0", true, 50);
		Courses course4 = new Courses(4, "PROGRAMLAMAYA G�R��", "Kamp�m�z 1 ay s�recektir.", "Engin Demiro�", "0",
				false, 0);

		Courses[] courses = { course1, course2, course3, course4 };
		for (Courses course : courses) {
			// System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.detail);
			System.out.println(course.teacherName);
			if (course.price.equals(0)) {
				System.out.println("Kurs �cretisizdir.");
			} else {
				System.out.println("Kurs " + course.price + " TL'dir.");
			}

			if (course.registered) {
				System.out.println("Kursa kay�tl�s�n�z.");
				System.out.println("%" + course.percentComplition + " tamamland�.\n");
			} else {
				System.out.println("Kursa kay�tl� de�ilsiniz.");
				System.out.println("�nce kursa kaydolmal�s�n�z. \n");
			}
		}
		System.out.println("*****************kursa t�kland��� zaman********************");
		CoursesManager coursesManager = new CoursesManager();
		coursesManager.onClickCourse(course1);
		coursesManager.onClickCourse(course2);
		coursesManager.onClickCourse(course3);
		coursesManager.onClickCourse(course4);

		System.out.println("************************************");
		ProfileMen� men�Item1 = new ProfileMen�();
		men�Item1.id = 1;
		men�Item1.name = "Profili D�zenle";
		ProfileMen� men�Item2 = new ProfileMen�(2, "�yelikleri y�net");
		ProfileMen� men�Item3 = new ProfileMen�(3, "Kart bilgisi ekle veya de�i�tir");
		ProfileMen� men�Item4 = new ProfileMen�(4, "Address");
		ProfileMen� men�Item5 = new ProfileMen�(5, "�leti�im");
		ProfileMen� men�Item6 = new ProfileMen�(6, "��k��");

		ProfileMen�[] items = { men�Item1, men�Item2, men�Item3, men�Item4, men�Item5, men�Item6 };

		for (ProfileMen� item : items) {
			System.out.println(item.name);
		}
		System.out.println("**************************************");

		ProfileMen�Manager profileMen�Manager = new ProfileMen�Manager();
		profileMen�Manager.clickMen�Item(men�Item1);
		profileMen�Manager.clickMen�Item(men�Item2);
		profileMen�Manager.clickMen�Item(men�Item3);
		profileMen�Manager.clickMen�Item(men�Item4);
		profileMen�Manager.clickMen�Item(men�Item5);
		profileMen�Manager.clickMen�Item(men�Item6);
	}
}

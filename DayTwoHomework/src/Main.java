
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Courses course1 = new Courses();
		course1.id = 1;
		course1.name = "JAVASCRİPT";
		course1.detail = "Kampımız 1.5 ay sürecektir.";
		course1.teacherName = "Engin DEMİROĞ";
		course1.price = "0";
		course1.registered = false;
		course1.percentComplition = 0;

		Courses course2 = new Courses(2, "C# and ANGULAR", "Kampımız 2 ay sürecektir.", "Engin Demiroğ", "0", true, 25);
		Courses course3 = new Courses(3, "JAVA and REACT", "Kampımız 3 ay sürecektir.", "Engin Demiroğ", "0", true, 50);
		Courses course4 = new Courses(4, "PROGRAMLAMAYA GİRİŞ", "Kampımız 1 ay sürecektir.", "Engin Demiroğ", "0",
				false, 0);

		Courses[] courses = { course1, course2, course3, course4 };
		for (Courses course : courses) {
			// System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.detail);
			System.out.println(course.teacherName);
			if (course.price.equals(0)) {
				System.out.println("Kurs Ücretisizdir.");
			} else {
				System.out.println("Kurs " + course.price + " TL'dir.");
			}

			if (course.registered) {
				System.out.println("Kursa kayıtlısınız.");
				System.out.println("%" + course.percentComplition + " tamamlandı.\n");
			} else {
				System.out.println("Kursa kayıtlı değilsiniz.");
				System.out.println("Önce kursa kaydolmalısınız. \n");
			}
		}
		System.out.println("*****************kursa tıklandığı zaman********************");
		CoursesManager coursesManager = new CoursesManager();
		coursesManager.onClickCourse(course1);
		coursesManager.onClickCourse(course2);
		coursesManager.onClickCourse(course3);
		coursesManager.onClickCourse(course4);

		System.out.println("************************************");
		ProfileMenü menüItem1 = new ProfileMenü();
		menüItem1.id = 1;
		menüItem1.name = "Profili Düzenle";
		ProfileMenü menüItem2 = new ProfileMenü(2, "Üyelikleri yönet");
		ProfileMenü menüItem3 = new ProfileMenü(3, "Kart bilgisi ekle veya değiştir");
		ProfileMenü menüItem4 = new ProfileMenü(4, "Address");
		ProfileMenü menüItem5 = new ProfileMenü(5, "İletişim");
		ProfileMenü menüItem6 = new ProfileMenü(6, "Çıkış");

		ProfileMenü[] items = { menüItem1, menüItem2, menüItem3, menüItem4, menüItem5, menüItem6 };

		for (ProfileMenü item : items) {
			System.out.println(item.name);
		}
		System.out.println("**************************************");

		ProfileMenüManager profileMenüManager = new ProfileMenüManager();
		profileMenüManager.clickMenüItem(menüItem1);
		profileMenüManager.clickMenüItem(menüItem2);
		profileMenüManager.clickMenüItem(menüItem3);
		profileMenüManager.clickMenüItem(menüItem4);
		profileMenüManager.clickMenüItem(menüItem5);
		profileMenüManager.clickMenüItem(menüItem6);
	}
}

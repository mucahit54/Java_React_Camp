
public class CoursesManager {
	public void onClickCourse(Courses course) {
		if (course.registered) {
			System.out.println(course.name + " kursuna devam edebilirsiniz.");
		} else {
			System.out.println(course.name + " isimli kursa kaydolabilirsiniz.");
		}
	}
}

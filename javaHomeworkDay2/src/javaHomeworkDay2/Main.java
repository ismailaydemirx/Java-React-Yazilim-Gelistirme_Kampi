package javaHomeworkDay2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Teachers teacher1 = new Teachers(12,"Tümü");
		
		Teachers teacher2 = new Teachers(33,"Engin Demiroð");
		
		
		Teachers[] teachers = {teacher1,teacher2};
		
		for (Teachers  teacher : teachers) {
			
			System.out.println("Eðitmen : "+teacher.name);
			System.out.println("========");
		}
		
		Category category1 = new Category(1,"Tümü");
		Category category2 = new Category(1,"Programlama(3)");
		
		Category[] categories= {category1,category2};
		
		for (Category category : categories) {
			System.out.println("Kategori ismi : " + category.name);
			System.out.println("========");
		}
		
		TeachersManager teacherManager = new TeachersManager();
		
		teacherManager.addTeacher(11, "Angelo Lucas");
		
		teacherManager.deleteTeacher(11, "Angelo Lucas");
		
	}

}

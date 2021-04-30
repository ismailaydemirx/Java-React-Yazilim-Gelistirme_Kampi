package javaHomeworkDay2;

public class TeachersManager {
	int id;
	String name;
	
	public void addTeacher(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println("Öðretmen Eklendi : "+ this.name);
	}

	public void deleteTeacher(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println("Öðretmen Silindi : "+ this.name);
	}
}

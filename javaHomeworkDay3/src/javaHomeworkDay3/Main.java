package javaHomeworkDay3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();

		student1.setId(1);
		student1.setAge("23");
		student1.setFirstName("İsmail");
		student1.setLastName("Aydemir");
		student1.setGrade("1");

		StudentManager studentManager = new StudentManager();

		studentManager.add(student1);
		
		Instructor instructor1 = new Instructor();
		
		
		instructor1.setFirstName("Engin");
		instructor1.setDepartment("Software Engineer");
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.add(instructor1);

	}

}

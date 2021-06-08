package encapsulation;

public class Student {
	int age;
	String name;

public  int getAge() {
	return age;
}

public void setAge(int age) {
	if(age>28) {
		System.out.println("U cant be a student uncle");
	}
	else {
	this.age=age;}
}



}

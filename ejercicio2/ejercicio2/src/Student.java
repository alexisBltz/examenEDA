public class Student extends Person{
	//Made by Jhastyn Payehuanca Riquelme
	int year;
	String cui;
	String school;

	public Student(String n, String c, String s, int y){
		super(n);
		this.year = y;
		this.cui = c;
		this.school = s;
	}

}

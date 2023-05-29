import java.util.Date;

public class Person{
	//Made by Gabriel Alberto Bernedo
	String name;
	Date birth;

	public Person(String n, Date d){
		this.name = n;
		this.birth = d;
	}

	public Person(String n){
		this(n, null);
	}

	public String getName(){
		return this.name;
	}

}

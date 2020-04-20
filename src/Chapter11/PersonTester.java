package Chapter11;

public class PersonTester {

	public static void main(String[] args) {
		DataSet tallest = new DataSet();
		tallest.add(new Person("John", 45678));
		tallest.add(new Person("Jim", 4567));
		tallest.add(new Person("Jake",5678));
		System.out.println(tallest.getAverage());
		System.out.println(((Person) tallest.getMaximum()).getName());
	}

}

package Person;

// Main is defined in which parameters are passed to function
public class PersonTest {
	public static void main(String[] args) {

		Person person1 = new Person("Ram", 5, 6, 1980);
		Person person2 = new Person("Shyam", 2, 3, 1987);
		person1.display();
		person2.display();
		person1.olderOne(person1, person2);
	}
}

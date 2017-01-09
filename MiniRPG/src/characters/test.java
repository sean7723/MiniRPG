package characters;

public class test {
	public static void main(String[] args) {
		Characters testSubject1 = new Player(100, 10, 100, "Darwin");
		Characters testSubject2 = new Player(100, 10, 100, "James");
		Characters testSubject3 = new Player(100, 10, 100, "Mark");
		System.out.println(testSubject1.getName() + " has " + testSubject1.getHealth() + " health.");
		System.out.println(testSubject2.getName() + " has " +testSubject2.getHealth() + " health.");
		System.out.println(testSubject3.getName() + " has " +testSubject3.getHealth() + " health.");
		System.out.println(testSubject3.hit(testSubject1));
		System.out.println(testSubject2.hit(testSubject3));
		System.out.println(testSubject3.hit(testSubject1));
		System.out.println(testSubject2.hit(testSubject3));
		System.out.println(testSubject1.hit(testSubject2));
		System.out.println(testSubject2.hit(testSubject1));
	}
}

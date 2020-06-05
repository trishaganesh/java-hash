package crunchify.com.tutorials;
 
/**
 * 
 * @author Crunchify.com
 * How to Override equals() method in Java?
 * How to Override hasCode() method in Java?
 * version:1.2
 * 
 */
 
public class CrunchifyImplementEqualsHashCode {
 
	public static void main(String[] args) {
 
		CrunchifyImplementEqualsHashCode crunchifyTest = new CrunchifyImplementEqualsHashCode();
		Crunchify one = new Crunchify(1);
		Crunchify two = new Crunchify(1);
		crunchifyTest.test1(one, two);
 
		Crunchify three = new Crunchify(1);
		Crunchify four = new Crunchify(2);
		crunchifyTest.test2(three, four);
	}
 
	public void test1(Crunchify one, Crunchify two) {
		if (one.equals(two)) {
			System.out.println("Test1: One and Two are equal to each other");
		} else {
			System.out.println("Test1: One and Two are not equal to each other");
		}
	}
 
	public void test2(Crunchify three, Crunchify four) {
		if (three.equals(four)) {
			System.out.println("Test2: Three and Four are equal to each other");
		} else {
			System.out.println("Test2: Three and Four are not equal to each other");
		}
	}
}
 
class Crunchify {
	private int value;
 
	Crunchify(int val) {
		value = val;
	}
 
	public int getValue() {
		return value;
	}
 
	// The method does override or implement a method declared in a supertype.
	@Override
	public boolean equals(Object o) {
 
		// null check
		if (o == null) {
			return false;
		}
 
		// this instance check
		if (this == o) {
			return true;
		}
 
		// instanceof Check and actual value check
		if ((o instanceof Crunchify) && (((Crunchify) o).getValue() == this.value)) {
			return true;
		} else {
			return false;
		}
	}
 
	@Override
	public int hashCode() {
		int result = 1;
		result = (int) (value / 12);
		return result;
	}
}

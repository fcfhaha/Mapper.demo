
public class Child extends Person
{
	@Override
	public void name() {
		super.name();
		System.out.println("child");
	}
	public static void main(String[] args) {
		Child child = new Child();
		child.name();
	}
}

package org.login;

//Exception Handling
public class Sample {

	private void m1() {
		try {// If error - Catch. No Errror - try Block
			System.out.println(4);
			System.out.println(4 / 0);
			System.out.println("Testing");
		}

		catch (NullPointerException e) {
			System.out.println("It is Arithmatic Exception and it is due dividing a number by 0");
		} catch (IndexOutOfBoundsException a) {
			System.out.println("exception is handled by IndexOutOfBound");
		} catch (NumberFormatException b) {
			System.out.println("exception is handled by NumberFormat");
		} catch (ClassCastException c) {
			System.out.println("exception is handled by using Super Class");
		}

		finally {
			System.out.println("It will execute everytime");
		}

	}

	private void m2() {
		System.out.println("Automation");
	}

	public static void main(String[] args) {

		Sample s = new Sample();
		s.m1();
		s.m2();
	}

}

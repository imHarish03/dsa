package dsa.challenge;

import java.io.IOException;

public class PossibleMethod {

	void m() throws IOException {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() {
		try {
			m();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void p() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.println("finally");
		}
	}

	public static void main(String args[]) {
		// float num = 5 / 0;
		PossibleMethod obj = new PossibleMethod();
		try {
			obj.p();
			System.out.println("demo");
		} catch (Exception e) {
			System.out.println("exception");
		}
		System.out.println("finished");

	}

}

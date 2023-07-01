package inheritance;

class classone {
	void add(int a, int b) {
		System.out.println("addition of a and b ="+ (a + b));
	}

}

class classtwo extends classone {
	int d = 15;
	int e = 10;
	int k = 23;

	void subone() {
		int f = d - e;
		System.out.println("substraction of d and e =" + f);
	}

}

class classthree extends classtwo {
	int l = 3;

	void productone() {
		int p = k * e;
		System.out.println("product of k and e =" + p);
	}

}

class classfour extends classthree {
	void divisionone() {
		int q = d / l;
		System.out.println("division of d and l =" + q);
	}

}

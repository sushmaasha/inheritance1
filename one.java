package inheritance;

class one {
	void add(int a, int b) {
		System.out.println(a + b);
	}
}

class two extends one {
	void multi(int m, int n) {
		System.out.println(m * n);
	}
}

class three extends two {
	void div(int p, int q) {
		int r = p / q;
		System.out.println(r);
	}
}
package com.pl;

public class InnerClassTest {
	
	interface NestedInterface{
		
		void print();
		
	}

	public class NonStaticInnerClass {
		int a = 10;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

	}

	static class StaticInnerClass {

		int b = 10;

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

	}
	
}


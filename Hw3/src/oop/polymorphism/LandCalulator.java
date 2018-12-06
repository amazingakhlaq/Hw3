package oop.polymorphism;

public class LandCalulator {
	
		public int areaOfSylhet(int a, int b) {
			int total = a+b;
			return total;
		}

		public static int areaOfSylhet(int a, int b, int c){
		int total = a + b + b;
		return total;
}
		public void areaOfSylhet(char a, int b, int c){
			int total = a + b + b;
}
		public int areaOfSylhet(int a, int b, int c, int d) {
			int total = a+b+c+d;
			return total;
}
		public int areaOfSylhet(String LandName, int a, int b, int c) {
			int value = Integer.parseInt(LandName);
			int total= a+b+value;
			return total;
}
}
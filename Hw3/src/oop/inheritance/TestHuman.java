package oop.inheritance;

public class TestHuman {

	public static void main(String[] args) {
		Children Aziz = new Children();
		System.out.println("Aziz is");
		Aziz.athletic();
		Aziz.education();
		Aziz.height();
		
		
		GreatGrandChildren Ali = new GreatGrandChildren();
		System.out.println("Grand Children are");
		Ali.athletic();
		
}
}
package inheritancePractice;
//This is a example of inheritance on Multilevel
public class TestEvolution {

	public static void main(String[] args) {
		
		Human Urooj = new Human();
		System.out.println("Urooj as an evolutionized Human being is ");
		Urooj.Advanced();
		Urooj.Intelligent();
		Urooj.Limbs();
		Urooj.Taller();
		
		Human Hassan = new Human();
		System.out.println("Hassan as a evolutionized Human begins is ");
		Hassan.Bigger();
		Hassan.Creative();
		Hassan.Fast();
		Hassan.Hair();
			
	}

}
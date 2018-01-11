package change;

public class Tip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cost = 75;
		
		tip(cost);
	}

	public static double tip(double cost) {
		double tips = cost*0.15;
		System.out.println(tips);
		return tips;
		
		
	}
}

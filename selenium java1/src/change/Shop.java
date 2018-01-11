package change;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double  itemcost = 4.0;
		double Provided = 7.75;
		double change ;
		
	 Makechange(itemcost, Provided);
	}

	

	
	
		
	

		public  static double Makechange(double itemcost , double Provided ) {
			
			double change = Provided - itemcost;
		System.out.println(change);
			return change;
			 
		}
}
	
			
		
		
		
	
		
	



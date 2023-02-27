package codeSmell;

public class codeSmell {

	public static void main(String[] args) {
		
	 CustomerManager customerManager = new CustomerManager();
//	 customerManager.add("Emrah", "Fidan", "111");
//	 customerManager.add("Yağmur", "Fidan", "222");
//	 customerManager.add("Rüzgar", "Emrah", "333");
	 
	 // When we add customers, we want to add their birthplace 
	 
	 customerManager.add("Emrah", "Fidan", "111",43);
	 
	}

}

class CustomerManager{
	
	//public void add(String firstName,String lastName,String identityNumber) {
		public void add(String firstName,String lastName,String identityNumber,int cityID) {
			//public void add(String firstName,String lastName,String identityNumber,int cityID= 10)
			// setting the default value to the parameters should not be the solution.
		
		
			System.out.println("Added");
		
	}
	
}

class Variables_Ex
{
	int empId=23456;//global variable & instance 
	static	short countryCode=91;//global variable & static
	public static void main(String args[])
	{
		char gender='M';//local variables
		byte age=127;
		long contact=9494348734l;
		float salary=23.54235476932243f;
		double result=23.54235476932243;
		boolean value=true;
		System.out.println("welcome to java");	
		System.out.println(gender);	
		System.out.println(age);	
		System.out.println(contact);	
		System.out.println(salary);	
		System.out.println(result);	
		
		
		Variables_Ex obj=new Variables_Ex();
		System.out.println(Variables_Ex.countryCode);
		System.out.println(obj.empId);
		
	}
}

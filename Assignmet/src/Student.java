
public class Student {

//Create a class "Student.java" with a variable "Name". Write two functions:

//getName() that returns "Name" from state.
//setName() that takes an argument and updates the state variable "Name".

	public static void main (String[] args) {}
	// declare variable Name
		
		private String Name;
		
		// create getter method
		public String getName(){
			return Name;  
		}
		
	public void setName(String nm){
		Name = nm;
	}

	public class Main
	{
		public static void main(String[] args) {
			Student s =new Student();
			s.setName("Aakash");
			System.out.println("Name="+s.getName());
		}
	}
}
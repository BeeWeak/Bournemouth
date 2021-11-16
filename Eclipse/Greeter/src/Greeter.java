/** Week 12 Greeting task
 * 
 * @author melanie
 *
 */

public class Greeter {

	// Task 1
	public String sayHello(String name) {
		return "Hello "+name;
	}

	// Task 2
	 public String sayAnything(String input) {
		return input+"!";
	}
	
	//Task 3
	public String welcomeToUni(String name, String uni, String task) {
		return name+",\n"+uni+",\n"+task+".";
	}
	
	//Task 4
	public String aboutMe(String name, String address, String town, String qualifications, String job) {
		return "Name:\t"+name+"\nAdd:\t"+address+"\nTown:\t"+town+"\nQuals:\t"+qualifications+"\nJob:\t"+job;
		
	}
	
}

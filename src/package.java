public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
				
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String fullName = sc.next();
		String date = sc.next();
		Date birthDate = date.toDate();
		
		double avgMark = sc.nextDouble();
		Student s = new Student(id, fullName, birthDate, avgMark);
		
	}

}

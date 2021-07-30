
public class EmployeeWage {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		double empcheck = Math.floor((Math.random() * 10) % 2);
		if(IS_FULL_TIME == empcheck)
		{
			System.out.println("Present");
		}
		else {
			System.out.println("Absent");
		}

	}

}

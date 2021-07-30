
public class EmployeeWageuc2 {

		public static void main(String[] args) {
			//Constants
			int IS_FULL_TIME = 1;
			int IS_PART_TIME = 1;
			//Variables
			int empHrs = 0;
			int empWage = 0;
			int Emp_Rate_Per_Hour= 20;
			//Computation		
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


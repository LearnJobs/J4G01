import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class EmpBirthday {

		// TODO Auto-generated method stub
		int id;
		String name;

		public EmpBirthday(int id, String name) {
			super();
			this.id = id;
			this.name = name;

		}

		public void display() {
			LocalDate dob = LocalDate.of(1990, Month.APRIL, 06);
			
			System.out.println("Employee ID :" + id);
			System.out.println("Employee Name :" + name);
			System.out.println("Employee DATE OF BIRTH :" + dob);
		
		}
		
		
			

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			EmpBirthday bornday = new EmpBirthday(001, "Dimple");
			bornday.display();
			

		}

	}



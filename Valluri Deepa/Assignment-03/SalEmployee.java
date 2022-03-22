
class OwnException extends Exception{

	private static final long serialVersionUID = 1L;

	public OwnException(String s) {
			super(s);
		}
	}

	public class SalEmployee {
		void salaryCheck(int salary) throws OwnException {
			if (salary >= 80000) {
				throw new OwnException("SalaryException");
			} else {
				System.out.println("your salary is : " + salary);
			}
		}

		public static void main(String args[]) {
			SalEmployee	 obj = new SalEmployee();
			try {
				obj.salaryCheck(80000);
			} catch (OwnException ex) {
				System.out.println("Caught the exception");
				System.out.println(ex.getMessage());
			}
		}
	}



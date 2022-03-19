package Assignment2;

public class Q1 {
	public static void main(String[] args) {
		String s1 = "LearnJobs";
		String s2 = "learnjobs";
		String s3 = "LEARNJOBS";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));

		s1 = "Narendra Modi";
		s2 = "Surendra Modi";
		System.out.println(s1.startsWith("Modi"));
		System.out.println(s1.endsWith("Modi"));

		s1 = "Ashish Kumar Dubey";
		s2 = "Shivam Singh Baghel";
		System.out.println(s1.startsWith("Ashish"));
		System.out.println(s1.endsWith("Shivam"));

		System.out.println(s1.indexOf("u"));
		System.out.println(s1.indexOf("v"));
		System.out.println(s1.indexOf("b"));

	}

}

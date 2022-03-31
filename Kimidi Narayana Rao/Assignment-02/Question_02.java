
public class Question_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hi this is Mark JukenBerg and Elon Musk";
		System.out.println(s1);
		String[] wordsplit =s1.split("\\s");
		for(String i:wordsplit)
			System.out.println(i);
	}

}

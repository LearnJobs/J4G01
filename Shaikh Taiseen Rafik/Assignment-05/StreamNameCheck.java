package Assignment5;

import java.util.ArrayList;

public class StreamNameCheck {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Taiseen");	name.add("Shital");
		name.add("Anam");		name.add("Jabin");
		name.add("Tabbo");		name.add("Zoya");
		name.add("Najiya");		name.add("Nagina");
		name.add("Ayesha");		name.add("Naseem");
		name.add("Jamir");		name.add("Rafik");
		name.add("Taslim");		name.add("Sameer");
		name.add("Munna");		name.add("Rajiya");
		name.add("Aslam");		name.add("Suhana");
		name.add("Alfiya");		name.add("Saniya");
		
		System.out.println(name);
		
		name.stream().filter(s->s.startsWith("M")).map(s->s).forEach(s->System.out.println(s));
		long count= name.stream().filter(s->s.startsWith("S")).count();
		System.out.println("No of elements starts with 'S' : "+count);
	}

}

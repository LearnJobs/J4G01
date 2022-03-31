package Treeclass;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Prob3 
{
	public static void main(String[] args) 
	{
		 ExecutorService service = Executors.newSingleThreadExecutor();	// here i create one obj.
		 service.execute(new Map());	
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Autofact {

	public static void main(String[] args) {
		Scanner sc;
		List<Answer> answers = new ArrayList<Answer>();
		int yesAnswers = 0; 
		int totalAnswers = 0;
		
		try {
			sc = new Scanner(new File("src/answers.txt"));
			
			while (sc.hasNextLine()) {			 
			  String[] data = sc.nextLine().split(",");
			  
			  Answer answer = new Answer(data[0],data[1],data[2],data[3]);
			  if(answer.getAnswer().equals("si") && answer.getRole().equals("user")){
				  yesAnswers++;				  
			  }			  
			  totalAnswers++;			  
			}
			float percentage = yesAnswers * 100 / totalAnswers;
			System.out.println("Porcentaje si: " + percentage);
			
		} catch (FileNotFoundException e) {
			// 
			e.printStackTrace();
		}			
		
	}
	
	private int percentage(){
		
		return 0;
	}
}

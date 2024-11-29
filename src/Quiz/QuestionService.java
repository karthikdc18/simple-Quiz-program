package Quiz;

import java.util.Scanner;

public class QuestionService {
	
	Question questions[]= new Question[5];
	String selection[] = new String [5];
	public QuestionService()
	{
		questions[0]=new Question(1,"size of int","1","2","3","4","4");
		questions[1]=new Question(2,"size of long","2","4","8","6","8");
		questions[2]=new Question(3,"size of double","9","2","4","5","8");
		questions[3]=new Question(4,"size of float","6","8","4","3","4");
		questions[4]=new Question(5,"size of char","4","6","7","8","2");
		//questions[0]=new Question(1,"which is the best language","java","cpp","python","cshapr","java");
		//
	}
	
		public void playQuiz()
		{
			int i=0;
			for(Question q:questions)
			{
			System.out.println("Question no : "+q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			Scanner scn = new Scanner(System.in);
			selection [i] = scn.nextLine();
			i++;
			}
			for(String s : selection) {
				System.out.println(s);
			}
		}
		
		
		public void printScore()
		{
			int score = 0;
			for(int i=0;i<questions.length;i++)
			{
				Question que = questions[i];
				String actualAnswer = que.getAnswer();
				String userAnswer = selection[i];
				
				if(actualAnswer.equals(userAnswer))
				{
					score++;
				}
			}
			System.out.println("your score is :"+score);
		}
}

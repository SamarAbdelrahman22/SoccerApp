import java.util.Scanner;

public class QuizGame {
    public void quizGame(){

        String Questions[]={"What is the nickname of Liverpool FC?",
                "What is the shirt number that Mohamed Salah wears for Liverpool?",
                "In which season did Mohamed Salah first win the Premier League Golden Boot?",
                "How many times has Liverpool FC won the UEFA Champions League up to 2023?",
                "Who was the manager who led Liverpool to win the UEFA Champions League title in 2019?",};

        String Options [][]={{"1.The Reds","2.The Eagles","3.The Lions","4.The Warriors"},
                {"1.10","2.11","3.9","4.7"},
                {"1.2016-2017","2.2017-2018","3.2018-2019","4.2019-2020"},
                {"1.5 times","2.6 times","3.7 times","4.8 times"},
                {"1.Mourinho","2. Guardiola","3. Klopp","4. Zidane"}};


        int Answer[]={1,2,2,2,3};
        int Score=0;
        int guess;

        Scanner scanner=new Scanner(System.in);
        System.out.println("******************");
        System.out.println("Welcome to our Quiz");
        System.out.println("********************");

        for (int i = 0; i < Questions.length; i++) {

            System.out.println(Questions[i]);
            for (String option:Options[i]){
            System.out.println(option);
        }
        System.out.print("What is your guess!");
        guess=scanner.nextInt();
        if (guess==Answer[i]){
            System.out.println("************");
            System.out.println("Wow!Correct Answer,Bro");
            System.out.println("*************");
            //score++;
        }else {
            System.out.println("Opps!Wrong Answer,Try again");}}


        System.out.println("Final score is:"+Score+ "Out of"+ Questions.length);
        System.out.println("Thanks!");



    }


}

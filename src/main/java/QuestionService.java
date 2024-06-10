import org.example.Question;

import java.util.Scanner;

public class QuestionService {
    Question[] question = new Question[5];  // an array of questions with 4 qusstions / 3 elements
    // constructor
    public QuestionService(){
        String[] options = { "0","1","2","3","4"};

        Question[0] =new Question("12 % 2 = ?", "0", options);
        Question[1] =new Question("12 % 2 = ?", "0", options);
        Question[2] =new Question("12 % 2 = ?", "0", options);
        Question[3] =new Question("12 % 2 = ?", "0", options);
        Question[4] =new Question("12 % 2 = ?", "0", options);
    }


public void quiz(){
        int score =0;
        int index = 1;
//        countCorrectAnswer = 0;

        for(Question q: questions){
            System.out.println(q.getQuestion());
            for(String a: q.getOptions(){
                System.out.println(a);
            }

            index++;

            Scanner sc = new Scanner(System.in);   // gets user input from the terminal
            String answer = sc.nextLine();

            if(answer.equals(questions[i].getAnswer())){
             score++;
       }
            System.out.println("----------------------");
        }

    System.out.println("You got " + score + "out of" + questions.length);
}



    // this constructior will initialzie all the questions
//    public QuestionService() {
//        String op0 = {"hardy", "tommy","naledi", "teboo"};
//        question[0] = new Question(question: "What is your name ?", op:null, answer: "Teboo");
//
//        String op1 = {"3", "6","8", "0"};
//        question[1] = new Question(question: "What is your name ?", op:op1, answer: "");
//
//        String op2 = {"hardy", "tommy","naledi", "teboo"};
//        question[2] = new Question(question: "What is your name ?", op:op2, answer: "Teboo");
//    };
//
//
//    public void quiz(){
//
//        int countCorrectAnswer = 0;
//        for(int i =0, i < questions.length; i++){
//            System.out.println("Question" + (i+1) + " " + questions[i].getQuestion());
//        }
//        for(int j =0, j < questions.length; j++){
//            System.out.println(questions[i].getOptions(j));
//        }
//
//        Scanner sc = new Scanner(System.in);   // gets user input from the terminal
//
//        String answer = sc.nextLine();
//
//        if(answer.equals(questions[i].getAnswer())){
//            countCorrectAnswer+++;
//        }
//
//    }
}

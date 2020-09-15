package project;

import java.util.Scanner;

public class Questions {
    private String prompt;
    private String answer;
    private String name;


    public Questions(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }

    public Questions() {
    }

    private void enterName() {
        System.out.print("Enter your name: ");
        Scanner scrName = new Scanner(System.in);
        name = scrName.nextLine();
        System.out.println("Welcome " + name);
    }


    private void info() {
        System.out.println("-------------");
        System.out.println("For Audience help enter 'a'");
        System.out.println("To phone a friend enter 'p'");
        System.out.println("For 50/50 enter 'f'");
        System.out.println("-------------");
    }

    public String checkQuestions(Questions[] questions) {
        String answerQuestion;
        int score = 0;

        enterName();
        info();

        Scanner scrQuestion = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            answerQuestion = scrQuestion.nextLine();
            if (answerQuestion.equals(questions[i].answer)) {
                score++;
            } else {
                System.out.println("-------------");
                System.out.println("You lose " + name);
                return "Score: " + score + "/" + questions.length;
            }
        }
        System.out.println("-------------");
        System.out.println("You won " + name);
        return "Score: " + score + "/" + questions.length;
    }


}

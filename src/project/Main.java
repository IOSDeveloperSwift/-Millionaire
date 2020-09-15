package project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String q1 = "What color are apples?\n"
                + "A: red  B: orange\nC: mangenta  D: black";
        String q2 = "What color are apples?\n"
                + "A: red  B: orange\nC: mangenta  D: black";
        String q3 = "What color are apples?\n"
                + "A: red  B: orange\nC: mangenta  D: black";
        String q4 = "What color are apples?\n"
                + "A: red  B: orange\nC: mangenta  D: black";
        String q5 = "What color are apples?\n"
                + "A: red  B: orange\nC: mangenta  D: black";

        Questions[] arrQuestion = {
                new Questions(q1, "1"),
                new Questions(q2, "1"),
                new Questions(q3, "1"),
                new Questions(q4, "1"),
                new Questions(q5, "1")
        };

        Questions questions = new Questions();
        System.out.println(questions.checkQuestions(arrQuestion));




        System.out.println("Type 'R' to restart");
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine().toUpperCase();
        if (input.equals("R"))
            restart(args);
        else
            System.exit(0);



    }

    static void restart(String[] strArr) {
        main(strArr);
    }


}






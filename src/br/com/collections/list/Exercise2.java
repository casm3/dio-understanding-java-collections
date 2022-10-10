package br.com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author: Carlos Melo
 */

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> answers = new ArrayList<>();

        System.out.println("Did you called to the victim (yes/no)? ");
        answers.add(scan.next());

        System.out.println("Were you in the crime scene (yes/no)? ");
        answers.add(scan.next());

        System.out.println("Did you live near the victim (yes/no)? ");
        answers.add(scan.next());

        System.out.println("Did you live near to the victim (yes/no)? ");
        answers.add(scan.next());

        System.out.println("Did you worked with the victim (yes/no)? ");
        answers.add(scan.next());

        judge(answers);

    }

    protected static void judge(List<String> answers){
        int yesCounter = 0;
        for (String answer : answers)
            if (answer.equals("yes"))
                yesCounter += 1;
        if (yesCounter == 5)
            System.out.println("Guilt!");
        else if (yesCounter >= 3)
            System.out.println("Accomplice");
        else if (yesCounter == 2)
            System.out.println("Suspect");
        else
            System.out.println("Innocent");
    }
}

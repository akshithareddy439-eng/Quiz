class ProjectQuizPro { 
    public static void main(String[] args) { 
        int score = 0; 

    //QUESTION 1 // USED CO-1 :- string operations , conditional statements 
        String question1 = "What is the capital of india?"; 
        String optionA1 = "Hyderabad"; 
        String optionB1 = "Goa"; 
        String optionC1 = "New delhi"; 
        String optionD1 = "Karnataka"; 
        
        char Answer1 = 'C'; 
        char userAnswer1 = 'C'; 

        System.out.println(question1); 
        System.out.println("A: " + optionA1); 
        System.out.println("B: " + optionB1); 
        System.out.println("C: " + optionC1); 
        System.out.println("D: " + optionD1); 

        if (userAnswer1 == Answer1) { 
            System.out.println("Correct Answer");  
            score++; 
        } else { 
            System.out.println("Wrong"); 
        } 
        System.out.println("Score = " + score); 
    

        
        // QUESTION 2 // USED CO-3 :- if-else conditions , arrays
        
        String question2 = "What is the capital of japan?"; 
        String[] options = {"Osaka", "Kyoto", "Tokyo", "Nagoya"}; 
        
        
        char Answer2 = 'C'; 
        char userAnswer2 = 'C'; 

        System.out.println(question2); 
        System.out.println("A: " + options[0]); 
        System.out.println("B: " + options[1]); 
        System.out.println("C: " + options[2]); 
        System.out.println("D: " + options[3]); 

        if (userAnswer2 == Answer2) { 
            System.out.println("Correct Answer"); 
            score++; 
        } else { 
            System.out.println("Wrong"); 
        } 
        System.out.println("Total Score = " + score); 
    } 

}

        //Question 3 // USED CO-4 :- Exeptional handling , Encapsulation , Constructor ,Throwing exceptions 
class Question {
    private String q;
    private String[] op;
    private char ans;

    Question(String q, String[] op, char ans) {
        this.q = q;
        this.op = op;
        this.ans = ans;
    }

    void display(char user) {
        System.out.println(q);
        for (int i = 0; i < 4; i++)
            System.out.println((char)('A' + i) + ": " + op[i]);

        if (user < 'A' || user > 'D')
            throw new IllegalArgumentException("Invalid answer");

        if (user == ans)
            System.out.println("Correct");
        else
            System.out.println("Wrong");
    }
}

public class Main {
    public static void main(String[] args) {
        int score = 0;
        Question q = new Question("Which planet is called the Red Planet?",
            new String[]{"Earth", "Mars", "Venus", "Jupiter"}, 'B');

        try {
            q.display('B');
            score++;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Score = " + score);
        }
    }
}

      //Question 4 // USED CO-5 :- String , StringBuilder , Sorting , File Handling 

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] q = {"Capital of Japan?", "Red Planet?"};
        String[] ans = {"Tokyo", "Mars"};
        String[] user = {"Tokyo", "Mars"};
        String[] op = {"Osaka, Kyoto, Tokyo, Nagoya",
                       "Earth, Mars, Venus, Jupiter"};
        int score = 0;

        StringBuilder sb = new StringBuilder(q[0]);
        sb.append(" (Quiz)");

        Arrays.sort(q);
        System.out.println("Sorted Questions: " + Arrays.toString(q));
        System.out.println("Modified: " + sb);

        try {
            FileWriter fw = new FileWriter("quiz.txt");

            for (int i = 0; i < ans.length; i++) {
                System.out.println(q[i] + " Options: " + op[i]);

                if (user[i].equalsIgnoreCase(ans[i])) {
                    score++;
                    System.out.println("Correct");
                } else {
                    System.out.println("Wrong");
                }

                if (q[i].toLowerCase().contains("planet"))
                    System.out.println("Question found: " + q[i]);

                fw.write(q[i] + " Answer: " + ans[i] + "\n");
            }

            fw.write("Score: " + score);
            fw.close();
            System.out.println("Score: " + score);
            System.out.println("Saved to file");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

           //Question 5 // USED CO-6 :-  Stream pipeline , Lambda expression , Functional interface
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> questions = new ArrayList<>(
            Arrays.asList("Java", "Python", "C++", "JavaScript"));

        questions.add("C");

        
        questions.forEach(q -> System.out.println(q));

   
        List<String> result = questions.stream()
            .filter(q -> q.startsWith("J"))
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Questions starting with J: " + result);

        
        Predicate<String> check = q -> q.length() > 3;
        System.out.println("Long names: " +
            questions.stream().filter(check).collect(Collectors.toList()));
    }
}





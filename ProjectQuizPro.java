class ProjectQuizPro { 
    public static void main(String[] args) { 
        int score = 0; 

    //QUESTION 1
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
    

        
        // QUESTION 2
        
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

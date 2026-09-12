**PROJECT TITLE - Adaptive Quiz & Exam Engine**

**TEAM NUMBER - KLH/PSPJ/S5/T3**
**SUPERVISOR'S NAME - Mr.Balaiah Gudipudi  **

**ABSTRACT**
An Adaptive Quiz and Exam Engine is an intelligent assessment platform that personalises evaluations in real time by dynamically adjusting question difficulty based on an examinee's ongoing performance. Traditional examinations use static, one-size-fits-all question sets that often fail to accurately gauge diverse student capabilities, leading to disengagement through boredom or frustration. This engine addresses these limitations by creating a uniquely tailored testing path for every individual. Using advanced Computerised Adaptive Testing frameworks and psychometric algorithms like Item Response Theory, the system begins each session with an item of intermediate difficulty. When a user provides a correct response, the selection engine immediately retrieves a more challenging question from a calibrated item bank. Conversely, an incorrect response prompts the system to serve an easier question. This iterative calibration loop continues dynamically until the scoring algorithm achieves a predetermined level of statistical confidence regarding the examinee's precise mastery level, at which point the exam automatically terminates. Integrating this adaptive architecture yields significant institutional advantages over legacy testing methods. It delivers unmatched measurement precision by pinpointing exact knowledge boundaries and identifying specific learning gaps. It also optimises time efficiency, frequently reducing overall exam duration by up to fifty per cent by eliminating redundant, uninformative questions that are either too simple or too complex for the user. Furthermore, the engine enhances exam security and minimises academic dishonesty because the real-time branching logic ensures that no two test-takers receive the same sequence of items. Ultimately, this technology transforms standardised testing from a rigid, punitive ranking mechanism into a highly precise, scalable diagnostic tool optimised for modern educational institutions and professional corporate certification programs alike.


**TEAM MEMBERS**
- Konabhai Akshitha Reddy - 2620040002
- ELINA RAJ  PULIPATI - 2620080003
- Thanishka  Mandava - 2620030004

Firstly This program is a console-based Quiz Application that tests general knowledge by displaying multiple-choice questions, verifying the user's answers, and tracking their score. It starts by setting up a score counter at zero and proceeds to handle two distinct questions using different coding techniques.

For the first question, the program defines the question text, options, correct answer, and simulated user answer using individual string and character variables. It then prints the quiz layout to the console and runs an if-else conditional check to see if the user's answer matches the correct key; since they match, it increments the score by one and displays the updated total score.

For the second question, the code optimizes the process by storing all four choices inside a single String array instead of separate variables. It retrieves and displays these choices using zero-based array indexing (options[0] through options[3]), runs a similar conditional check to validate the simulated answer, and finally outputs the accumulated total score of two to the console.

**Excution instructions:**
>javac ProjectQuizPro.java
>java ProjectQuizPro

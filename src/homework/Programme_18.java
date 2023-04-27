package homework;

public class Programme_18 {
    public static void main(String[] args) {

        int StudnetID = 14;
        String course_name = "Computer Science";
        int Programming_language_theory = 85;
        int Computer_graphics  = 89;
        int Human_computer_interaction = 80;
        int Artificial_intelligence = 92;
        int Algorithms_and_data_structures = 97;
        int total_marks = Programming_language_theory + Computer_graphics + Human_computer_interaction + Artificial_intelligence + Algorithms_and_data_structures;

        System.out.println("Mark Sheet (2022-23) ");
        System.out.println("Course name: "+course_name);
        System.out.println("Name       : Hemi Shah");
        System.out.println("StudentID  : "+StudnetID);
        System.out.println("         ");

        System.out.println("Subject with Marks");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1. Programming language theory:    "+Programming_language_theory);
        System.out.println("2. Computer graphics:              "+Computer_graphics);
        System.out.println("3. Human-computer interaction:     "+Human_computer_interaction);
        System.out.println("4. Artificial_ntelligence:         "+Artificial_intelligence);
        System.out.println("5. Algorithms_and_data_structures: "+Algorithms_and_data_structures);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Total Marks:                       "+total_marks);
        System.out.println("Percentage:                        "+((total_marks/5)*100)/100);
        System.out.println("Result:                            Pass");
    }
}


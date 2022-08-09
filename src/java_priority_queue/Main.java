package java_priority_queue;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    private final static Scanner scan = new Scanner(Data.data3);

    public static void main(String[] args) {

        Priorities priorities = new Priorities();

        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {

            System.out.println();
            System.out.println("Here are remaining students : ");
            System.out.println();

            for (Student st: students) {
                System.out.println(st.getName() + " : gpa : " + st.getCgpa() + " : id : " + st.getId());
            }
        }
    }

}


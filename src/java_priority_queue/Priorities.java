package java_priority_queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Priorities {

    public Priorities(){

    }

    Student studentWithAlphabetic(Student shortName, Student longName){

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < shortName.getName().length(); i++) {

            int letterShortName = alphabet.indexOf(shortName.getName().charAt(i));

            int letterLongName = alphabet.indexOf(longName.getName().charAt(i));

            if(letterShortName < letterLongName){

                return shortName;
            }

            if(letterShortName > letterLongName){

                return longName;
            }

        }

        // If we reach here we then they have the same name
        // Now we return a student which name indicates we have to sort by id

        return new Student(0, "ID", 0.0);

    }

    public static List<Student> insertStudent(List<Student> students, Student insert, int index){

        List<Student> toReturn = new ArrayList<>();

        for (int i = 0; i < index; i++) {

            toReturn.add(students.get(i));
        }

        toReturn.add(insert);

        for (int i = index; i < students.size(); i++) {

            toReturn.add(students.get(i));
        }

        return toReturn;

    }

    List<Student> getStudents(List<String> events){

        List<Student> students = new ArrayList<>();

        Student compared;

        outerfor: for (String s: events) {

            String[] parts = s.split(" ");

            if(parts[0].equals("ENTER")){

                Student student = new Student(Integer.parseInt(parts[3]), parts[1], Double.parseDouble(parts[2]));

                if(students.isEmpty()){

                    students.add(student);
                    continue;

                }

                for (int i = 0; i < students.size(); i++) {

                    compared = students.get(i);

                    // Look here for a student with lesser gpa

                    if(student.getCgpa() < compared.getCgpa()){

                        continue;
                    }

                    if(student.getCgpa() > compared.getCgpa()){

                        //Then we need to add the student here

                        students = insertStudent(students, student, i);

                        continue outerfor;
                    }

                    if(student.getCgpa() == compared.getCgpa()){

                        System.out.println("We are here");

                        //We reach here automatically if the aboves are false

                        Student alpabetically = (student.getName().length() < compared.getName().length()) ?
                                studentWithAlphabetic(student, compared) : studentWithAlphabetic(compared, student);

                        if(alpabetically.getId() == student.getId()){

                            students = insertStudent(students, student, i);
                            continue outerfor;
                        }

                        if(alpabetically.getName().equals("ID")){

                            // Now we got to sort by id, we see which of stu and candidate has lowest id

                            if(student.getId() < compared.getId()){

                                students = insertStudent(students, student, i);

                                continue outerfor;
                            }

                        }

                    }

                }

                // If we come outside it then we just add the student

                students.add(student);

            }else{

                if(students.isEmpty())
                    continue;

               students.remove(0);

            }

        }

        return students;

    }

    void printList(List<?> students){

        for(Object o: students){

            System.out.println(o.toString());
        }
    }

}

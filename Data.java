/**
 * 672115016 Natthapat Jagkhuruang 
 * 
 * SE102 programming assignment 953102-ADT & PROBLEM SOLVING-Lec.701[2/67]
 */

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.util.Vector;
import java.io.FileNotFoundException;

public class Data {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("studentData.csv");
        Scanner input = new Scanner(f);


        for(int i=0;i<7;i++){
            input.nextLine();
        }
    
        Vector<Student> student = new Vector<>();
        
        while(input.hasNextLine()){
            String dataLine = input.nextLine();
            StringTokenizer stu = new StringTokenizer(dataLine.trim(),",");
            stu.nextToken();
            student.addElement(new Student(stu.nextToken(), stu.nextToken(), stu.nextToken())); //store data Student in Vector

        }
        
        System.out.println("Total student is : " + student.size()); // how many student
        for(char i = 'A';i<='Z';i++){
            displayResult(student, i);
        }
        

    }

    public static void displayResult(Vector<Student> students ,char letter){
        char firstLetter ;
        Vector<Student> toString = new Vector<>();
        int amountStudent = 0;
        String firstName ;


        for(int i = 0;i <students.size();i++){
            firstName = students.elementAt(i).getFirstName();
            firstLetter = firstName.charAt(0);
            
            if (firstLetter == letter) {
                toString.addElement(students.elementAt(i));
                amountStudent++ ;
            }


        }

        System.out.println();
        System.out.println(letter+" : "+amountStudent );
        
        for(Student i : toString){
            System.out.println(i);
        }
        
        }
        
    
}
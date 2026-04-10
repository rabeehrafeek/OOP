package Homework;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
    public int studentId;
    public String studentFullName;
    public HashMap<String, Integer> academicGrades;

    public Student(int id, String name) {
        this.studentId = id;
        this.studentFullName = name;
    }

    public HashMap<String, Integer> addGrade() {
        Scanner inputReader = new Scanner(System.in);
        HashMap<String, Integer> tempGradesMap = new HashMap<String, Integer>();
        
        System.out.print("Input subject count: ");
        int limit = Integer.parseInt(inputReader.nextLine());

        int counter = 0;
        while (counter < limit) {
            System.out.print("Subject: ");
            String key = inputReader.nextLine();
            System.out.print("Marks: ");
            int val = Integer.parseInt(inputReader.nextLine());

            tempGradesMap.put(key, val);
            counter++;
        }

        this.academicGrades = tempGradesMap;
        return academicGrades;
    }

    public int getAverageGrades() {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : academicGrades.entrySet()) {
            sum += entry.getValue();
        }
        return sum / academicGrades.size();
    }

    public void getStudentInformation() {
        System.out.println("================================");
        System.out.println("Name: " + this.studentFullName);
        academicGrades.forEach((sub, score) -> System.out.println(sub + " : " + score));
        System.out.println("================================");
    }
}

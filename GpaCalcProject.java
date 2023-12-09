/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gpacalcproject;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class GpaCalcProject {

    /**
     * @param args the command line arguments
     */
    public String getGrade(double score){
    String grade = "";
    if(score >= 70 && score <= 100){
    grade = "A";
    }else if(score >= 60 && score <= 69){
    grade = "B";
            }else if(score >= 50 && score <= 59){
                grade = "C";
            }else if(score >= 45 && score <= 49){
                grade = "D";
            }else if(score >= 40 && score <= 44){
                grade = "E";
            }else if(score >= 0 && score <= 39){
                grade = "F";
            }else{
                grade = "Invalid score";
                
            }
    return grade;
    }
    
    public int getPoint(String grade){
    int point = 0;
    switch(grade){
        case "A":
            point = 5;
            break;
        case "B":
            point = 4;
            break;
        case "C":
            point = 3;
            break;
        case "D":
            point = 2;
            break;
        case "E":
            point = 1;
            break;
        case "F":
            point = 0;
            break;
    }
    return point;
    }
    
    public static void displayCourseInfo(String course, int gradeUnit, String grade, int point) {
    System.out.printf("| %-16s | %-15d | %-14s | %-16d |\n", course, gradeUnit, grade, point);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Simple CGPA Grading System \n");
        Scanner i = new Scanner(System.in);
        
//        COURSE1

        System.out.println("Enter Course 1: ");
        String course1 = i.nextLine();
        
        System.out.print("Enter " + course1 + " grade: ");
        int gradeUnit1 = i.nextInt();
        
        System.out.print("Enter " + course1 + " score: ");
        double score1 = i.nextDouble();
        i.nextLine();
        
//        COURSE2
        
        System.out.println("Enter Course 2: ");
        String course2 = i.nextLine();
        
        System.out.print("Enter " + course2 + " grade: ");
        int gradeUnit2 = i.nextInt();
        
        System.out.print("Enter " + course2 + " score: ");
        double score2 = i.nextDouble();
        i.nextLine();
        
//        COURSE3
        
        System.out.println("Enter Course 3: ");
        String course3 = i.nextLine();
        
        System.out.print("Enter " + course3 + " grade: ");
        int gradeUnit3 = i.nextInt();
        
        System.out.print("Enter " + course3 + " score: ");
        double score3 = i.nextDouble();
        i.nextLine();
        
//        COURSE4

        System.out.println("Enter Course 4: ");
        String course4 = i.nextLine();
        
        System.out.print("Enter " + course4 + " grade: ");
        int gradeUnit4 = i.nextInt();
        System.out.print("Enter " + course4 + " score: ");
        double score4 = i.nextDouble();
        i.nextLine();
        
        //        COURSE5
        
        System.out.println("Enter Course 5: ");
        String course5 = i.nextLine();
        
        System.out.print("Enter " + course5 + " grade: ");
        int gradeUnit5 = i.nextInt();
        
        System.out.print("Enter " + course5 + " score: ");
        double score5 = i.nextDouble();
        i.nextLine();

//GPA CALC PARAMS

GpaCalcProject st = new GpaCalcProject();

String grade1 = st.getGrade(score1);
String grade2 = st.getGrade(score2);
String grade3 = st.getGrade(score3);
String grade4 = st.getGrade(score4);
String grade5 = st.getGrade(score5);



int point1 = st.getPoint(grade1);
int point2 = st.getPoint(grade2);
int point3 = st.getPoint(grade3);
int point4 = st.getPoint(grade4);
int point5 = st.getPoint(grade5);




System.out.println("|..................|.................|................|..................|");
System.out.println("|COURSE & CODE     | COURSE UNIT     |        GRADE   |       GRADE UNIT |");
System.out.println("|..................|.................|................|..................|");

int totalPoints = point1 + point2 + point3 + point4 + point5;
int totalQualityPoints = ((gradeUnit1 * point1) + (gradeUnit2 * point2) + (gradeUnit3 * point3) + (gradeUnit4 * point4) + (gradeUnit5 * point5));
double cgpa = (double) totalQualityPoints / totalPoints;
displayCourseInfo(course1, gradeUnit1, grade1, point1);
    displayCourseInfo(course2, gradeUnit2, grade2, point2);
    displayCourseInfo(course3, gradeUnit3, grade3, point3);
    displayCourseInfo(course4, gradeUnit4, grade4, point4);
    displayCourseInfo(course5, gradeUnit5, grade5, point5);
    System.out.println("|------------------|-----------------|----------------|------------------|");

            
    System.out.println("Total Points: " + totalPoints);
    System.out.println("Total Quality Points: " + totalQualityPoints);
        
System.out.printf("Your GPA is: %.2f\n", cgpa); 


        
   
    }
    
}

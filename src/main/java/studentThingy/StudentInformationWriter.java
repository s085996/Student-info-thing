package information;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;  

public class StudentInformationWriter {
    public static void main(String[] args)throws IOException{
        Scanner temp = new Scanner(System.in);
        System.out.println("how many students do you wann add: ");
        int studentNumber = 0;
        System.out.println("Enter how many students you want to add:");
        studentNumber = temp.nextInt();
        Student[] arr = new Student[studentNumber];
        temp.nextLine();
        
        //student information writing
        for(int i = 0; i < arr.length; i++){
        System.out.println("enter a name");
        String name = temp.nextLine();
        System.out.println("enter a age");
        int index = temp.nextInt();
        temp.nextLine();
        arr[i] = new Student(name,index);
     
        //write to file
        FileWriter file = new FileWriter("students information.txt");
        for(Student student : arr){
            file.write(student.name + " " + student.index + "\n");
        }
        file.close(); 
        //read to file
        File fileObj = new File("students information.txt");
        System.out.println("------------------------------------------------------------------------");
        Scanner fileReader = new Scanner(fileObj);
        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }
        fileReader.close(); 
        }
    }   
}
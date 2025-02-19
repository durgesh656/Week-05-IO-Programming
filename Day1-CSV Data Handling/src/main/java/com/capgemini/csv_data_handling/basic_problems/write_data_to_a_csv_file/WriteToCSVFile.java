package com.capgemini.csv_data_handling.basic_problems.write_data_to_a_csv_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToCSVFile {
    public static void writeDataToCSVFile(String fileName){

        String filePath = "src/main/java/com/capgemini/csv_data_handling/basic_problems/write_data_to_a_csv_file/"+fileName;

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write("emp_ID,emp_Name,emp_Department,emp_Salary");
            writer.newLine();
            writer.write("101,Rahul,AIML,20000");
            writer.newLine();
            writer.write("102,Ram,AIML,25000");
            writer.newLine();
            writer.write("103,John,CSE,30000");
            writer.newLine();
            writer.write("104,Happy,CSE,35000");
            writer.newLine();
            writer.write("105,Durgesh,AIML,40000");

            System.out.println("CSV file written successfully.");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

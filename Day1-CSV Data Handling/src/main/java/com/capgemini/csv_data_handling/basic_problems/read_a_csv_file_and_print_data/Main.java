package com.capgemini.csv_data_handling.basic_problems.read_a_csv_file_and_print_data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/capgemini/csv_data_handling/basic_problems/read_a_csv_file_and_print_data/students.csv";
        try(BufferedReader bufferedReader = new BufferedReader( new FileReader(filePath))){
            String line;
            while ((line=bufferedReader.readLine())!=null){
                if (!line.trim().isEmpty()) {
                    String[] columns = line.split(",");
                    System.out.println("ID: " + columns[0] + ", Name: " + columns[1] + ", Age: " + columns[2] + ", marks: " + columns[3]);
                }
            }
        }catch (IOException e){
            System.out.println("exception occurred :"+e.getMessage());
        }
    }
}

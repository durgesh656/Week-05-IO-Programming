package com.capgemini.csv_data_handling.basic_problems.read_and_count_rows_in_csv_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountRowsInCSVFile {
    public static int countRowsInCSVFile(){
        int count = 0;
        String filePath = "src/main/java/com/capgemini/csv_data_handling/basic_problems/read_and_count_rows_in_csv_file/student.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String line = br.readLine();

            while((line = br.readLine())!=null){
                count++;
            }
        }catch(IOException e){
            System.out.println("Exception Caught : "+e.getMessage());
        }
        return count;
    }
}

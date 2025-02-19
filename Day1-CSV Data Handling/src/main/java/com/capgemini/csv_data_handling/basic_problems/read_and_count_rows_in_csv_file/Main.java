package com.capgemini.csv_data_handling.basic_problems.read_and_count_rows_in_csv_file;

public class Main {
    public static void main(String[] args) {
        int count = CountRowsInCSVFile.countRowsInCSVFile();
        System.out.println("Number of rows in CSV file except header is: "+count);

    }
}

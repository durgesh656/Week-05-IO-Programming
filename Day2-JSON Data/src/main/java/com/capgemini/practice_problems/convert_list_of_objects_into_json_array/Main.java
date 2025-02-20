package com.capgemini.practice_problems.convert_list_of_objects_into_json_array;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("Durgesh", 22, "durgesh899@gmail.com"),
                new Student("John", 95, "john9@gmail.com"),
                new Student("Alice", 23, "Alice8@gamil.com"));

        ConvertListToJson.convertToJson(list);
    }
}

package com.capgemini.hands_on_practice_problem.convert_list_of_objects_into_json_array;

import com.capgemini.practice_problems.convert_list_of_objects_into_json_array.ConvertListToJson;
import com.capgemini.practice_problems.convert_list_of_objects_into_json_array.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConvertListToJsonTest {
    @Test
    void convertListToJsonTest1(){

        List<com.capgemini.practice_problems.convert_list_of_objects_into_json_array.Student> list = Arrays.asList(new com.capgemini.practice_problems.convert_list_of_objects_into_json_array.Student("Durgesh", 22, "durgesh88@gmail.com"),
                new com.capgemini.practice_problems.convert_list_of_objects_into_json_array.Student("Harsh veer singh", 23, "harshveerthakur69@gmail.com"),
                new Student("John", 23, "john@gamil.com"));

        String jsonArray = ConvertListToJson.convertToJson(list);

        assert jsonArray != null;
        assertTrue(jsonArray.contains("Durgesh"));
        assertTrue(jsonArray.contains("harshveerthakur69@gmail.com"));
        assertTrue(jsonArray.contains("John"));
        System.out.println("✅ Test1 Passed");
    }

}

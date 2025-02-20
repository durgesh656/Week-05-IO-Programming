package com.capgemini.practice_problems.extract_only_specific_fields;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReadExtractTest {

    @Test
    void readFileAndExtractTest1() throws IOException {

        List<User> users = ReadExtractJSON.extractSpecificDetails("demo.json");

        assertEquals("Durgesh", users.getFirst().getName());
        assertEquals("durgesh88@gmail.com", users.getFirst().getEmail());
        assertEquals("bipin@gmail.com", users.get(1).getEmail());
        System.out.println("✅ Test1 Passed");
    }
}

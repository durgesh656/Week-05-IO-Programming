package com.capgemini.hands_on_practice_problem.validate_an_email;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateJsonTest {
    @Test
    void testSchema() throws IOException, ProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        // Load JSON Schema
        JsonNode schemaNode = objectMapper.readTree(new File("src/main/java/com/capgemini/hands_on_practice_problem/validate_an_email/schema.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaNode);

        // Load JSON Data
        JsonNode jsonData = objectMapper.readTree(new File("src/main/java/com/capgemini/hands_on_practice_problem/validate_an_email/sample_data.json"));

        assertTrue(schema.validate(jsonData).isSuccess());
    }
}
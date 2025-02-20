package com.capgemini.ipl_and_censor_analyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IPLCensorAnalyzerTest {
    @Test
    void testMaskTeamName() {
        assertEquals("Mumbai ***", IPLCensorAnalyzer.maskTeamName("Mumbai Indians"));
        assertEquals("Chennai Super ***", IPLCensorAnalyzer.maskTeamName("Chennai Super Kings"));
        assertEquals("KKR", IPLCensorAnalyzer.maskTeamName("KKR")); // Single word team name should remain unchanged}

    }
}

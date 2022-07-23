package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    @Test
    void testAFor3Lowest() {
        assertEquals('A', Grade.getGrade("239.1","3"));
    }

    @Test
    void testAFor3Mid() {
        assertEquals('A', Grade.getGrade("270","3"));
    }

    @Test
    void testAFor3Highest() {
        assertEquals('A', Grade.getGrade("300","3"));
    }

    @Test
    void testAFor4Lowest() {
        assertEquals('A', Grade.getGrade("319.1","4"));
    }

    @Test
    void testAFor4Mid() {
        assertEquals('A', Grade.getGrade("360","4"));
    }

    @Test
    void testAFor4Highest() {
        assertEquals('A', Grade.getGrade("400","4"));
    }

    @Test
    void testBFor3Lowest() {
        assertEquals('B', Grade.getGrade("209.1","3"));
    }

    @Test
    void testBFor3Mid() {
        assertEquals('B', Grade.getGrade("225","3"));
    }

    @Test
    void testBFor3Highest() {
        assertEquals('B', Grade.getGrade("239","3"));
    }

    @Test
    void testBFor4Lowest() {
        assertEquals('B', Grade.getGrade("279.1","4"));
    }

    @Test
    void testBFor4Mid() {
        assertEquals('B', Grade.getGrade("300","4"));
    }

    @Test
    void testBFor4Highest() {
        assertEquals('B', Grade.getGrade("319","4"));
    }

    @Test
    void testCFor3Lowest() {
        assertEquals('C', Grade.getGrade("179.1","3"));
    }

    @Test
    void testCFor3Mid() {
        assertEquals('C', Grade.getGrade("195","3"));
    }

    @Test
    void testCFor3Highest() {
        assertEquals('C', Grade.getGrade("209","3"));
    }

    @Test
    void testCFor4Lowest() {
        assertEquals('C', Grade.getGrade("239.1","4"));
    }

    @Test
    void testCFor4Mid() {
        assertEquals('C', Grade.getGrade("260","4"));
    }

    @Test
    void testCFor4Highest() {
        assertEquals('C', Grade.getGrade("279","4"));
    }

    @Test
    void testFFor3Lowest() {
        assertEquals('F', Grade.getGrade("0","3"));
    }

    @Test
    void testFFor3Mid() {
        assertEquals('F', Grade.getGrade("90","3"));
    }

    @Test
    void testFFor3Highest() {
        assertEquals('F', Grade.getGrade("179","3"));
    }

    @Test
    void testFFor4Lowest() {
        assertEquals('F', Grade.getGrade("0","4"));
    }

    @Test
    void testFFor4Mid() {
        assertEquals('F', Grade.getGrade("120","4"));
    }

    @Test
    void testFFor4Highest() {
        assertEquals('F', Grade.getGrade("239","4"));
    }

    @Test
    void testForLowerException3(){
        assertThrows(IllegalArgumentException.class, () -> {
            Grade.getGrade("-0.5", "3");
        });
    }

    @Test
    void testForUpperException3(){
        assertThrows(IllegalArgumentException.class, () -> {
            Grade.getGrade("300.5", "3");
        });
    }

    @Test
    void testForLowerException4(){
        assertThrows(IllegalArgumentException.class, () -> {
            Grade.getGrade("-0.25", "4");
        });
    }

    @Test
    void testForUpperException4(){
        assertThrows(IllegalArgumentException.class, () -> {
            Grade.getGrade("400.5", "4");
        });
    }

    @Test
    void testForCreditNegative(){
        assertThrows(IllegalArgumentException.class, () -> {
            Grade.getGrade("100", "-4");
        });
    }

    @Test
    void testForCreditOther(){
        assertThrows(IllegalArgumentException.class, () -> {
            Grade.getGrade("100", "5");
        });
    }

    @Test
    void testForInvalidMarks(){
        assertThrows(IllegalArgumentException.class, () -> {
            Grade.getGrade("-1A", "3");
        });
    }

    @Test
    void testForInvalidCredit(){
        assertThrows(IllegalArgumentException.class, () -> {
            Grade.getGrade("100", "?");
        });
    }
}
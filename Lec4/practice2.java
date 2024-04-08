import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        int[][] weeklyHours = {
            {2,4,3,4,5, 8, 8},   // Employee 1
            {7, 3, 4, 3, 3, 4, 4},   // Employee 2
            {3, 3, 4, 3, 3, 2, 2},   // Emp 3
            {9, 3, 4, 7, 3, 4, 1},    // Emp 4
            {3, 4, 4, 6, 3, 4, 4}, //emp 5
            {3,7,4,8,3,8,4}, //emp6
            {6,3,5,9,2,7,9} //emp6
        };
        
        Map<Integer, Integer> totalHoursMap = new HashMap<>();
        
        // Calculate total hours for each employee
        for (int i = 0; i < weeklyHours.length; i++) {
            int totalHours = 0;
            for (int j = 0; j < weeklyHours[i].length; j++) {
                totalHours += weeklyHours[i][j];
            }
            totalHoursMap.put(i + 1, totalHours); // Employee numbers start from 1
        }
        
        // Sort employees based on total hours
        List<Map.Entry<Integer, Integer>> sortedEmployees = new ArrayList<>(totalHoursMap.entrySet());
        Collections.sort(sortedEmployees, (a, b) -> b.getValue().compareTo(a.getValue()));
        
        // Display employees and their total hours in decreasing order
        System.out.println("Employees and their total hours worked (in decreasing order):");
        for (Map.Entry<Integer, Integer> entry : sortedEmployees) {
            System.out.println("Employee " + entry.getKey() + ": " + entry.getValue() + " hours");
        }
    }
}

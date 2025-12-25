/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kabil
 */
public class TeacherTableController {
    // Method to update the Teacher JTable with all teachers from AppContext
    public static void updateTeacherTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        // Clear existing rows before updating the table
        clearTable(table);

        // Get the list of teachers from AppContext
        ArrayList<Teacher> teachers = AppContext.getTeachers();

        // Loop through all teachers and add them to the table
        for (Teacher teacher : teachers) {
            Object[] row = new Object[3];
            row[0] = teacher.getTeacherId(); // ID
            row[1] = teacher.getName();      // Name
            row[2] = teacher.getEmail();     // Email
            model.addRow(row);
        }
    }

    // Method to clear all rows in the JTable
    public static void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Remove all rows
    }

    // Method to add a single teacher to the JTable
    public static void addTeacherToTable(JTable table, Teacher teacher) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        // Add teacher data to the table
        Object[] row = new Object[3];
        row[0] = teacher.getTeacherId(); // ID
        row[1] = teacher.getName();      // Name
        row[2] = teacher.getEmail();     // Email
        model.addRow(row);
    }
}

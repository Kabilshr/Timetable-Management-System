/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AppContext;
import Model.Subject;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kabil
 */
public class SubjectTableController {
    // Method to update the Subject JTable with all subjects from AppContext
    public static void updateSubjectTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Clear existing rows before updating the table
        clearTable(table);

        // Get the list of subjects from AppContext
        ArrayList<Subject> subjects = AppContext.getSubjects();

        // Loop through all subjects and add them to the table
        for (Subject subject : subjects) {
            Object[] row = new Object[2];
            row[0] = subject.getSubjectCode(); // Subject Code
            row[1] = subject.getSubjectName(); // Subject Name
            model.addRow(row);
        }
    }

    // Method to clear all rows in the JTable
    public static void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Remove all rows
    }

}

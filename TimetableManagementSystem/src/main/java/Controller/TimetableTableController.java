/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AppContext;
import Model.Timetable;
import Model.TimetableEntry;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kabil's PC
 */
public class TimetableTableController {
    // Update timetable table with all entries
    public static void updateTimetableTable(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Clear existing rows
        model.setRowCount(0);

        // Get timetable entries from AppContext
        Timetable timetable = AppContext.getTimetable();
        ArrayList<TimetableEntry> entries = timetable.getEntries();

        // Populate table
        for (TimetableEntry entry : entries) {
            Object[] row = new Object[7];

            row[0] = entry.getDay();
            row[1] = entry.getStartTime().toString();
            row[2] = entry.getEndTime().toString();
            row[3] = entry.getClassName();
            row[4] = entry.getSubject().getSubjectName();
            row[5] = entry.getTeacher().getName();
            row[6] = entry.getRoom();

            model.addRow(row);
        }
    }
    
    // Search timetable entries based on the query
    public static ArrayList<TimetableEntry> searchTimetable(String query) {
        Timetable timetable = AppContext.getTimetable();
        ArrayList<TimetableEntry> entries = timetable.getEntries();
        ArrayList<TimetableEntry> filteredEntries = new ArrayList<>();

        // Loop through all entries and check if they match the search query
        for (TimetableEntry entry : entries) {
            if (entry.getDay().toLowerCase().contains(query.toLowerCase()) ||
                entry.getStartTime().toString().toLowerCase().contains(query.toLowerCase()) ||
                entry.getEndTime().toString().toLowerCase().contains(query.toLowerCase()) ||
                entry.getClassName().toLowerCase().contains(query.toLowerCase()) ||
                entry.getSubject().getSubjectName().toLowerCase().contains(query.toLowerCase()) ||
                entry.getTeacher().getName().toLowerCase().contains(query.toLowerCase()) ||
                entry.getRoom().toLowerCase().contains(query.toLowerCase())) {

                filteredEntries.add(entry);  // Add entry to filtered list if it matches the query
            }
        }

        return filteredEntries;
    }
    
    // Update timetable table with filtered entries
    public static void updateFilteredTimetableTable(JTable table, ArrayList<TimetableEntry> filteredEntries) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        // Clear existing rows
        model.setRowCount(0);

        // Populate table with filtered entries
        for (TimetableEntry entry : filteredEntries) {
            Object[] row = new Object[7];
            row[0] = entry.getDay();
            row[1] = entry.getStartTime().toString();
            row[2] = entry.getEndTime().toString();
            row[3] = entry.getClassName();
            row[4] = entry.getSubject().getSubjectName();
            row[5] = entry.getTeacher().getName();
            row[6] = entry.getRoom();
            model.addRow(row);
        }
    }

    // Optional: clear timetable table
    public static void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }
}

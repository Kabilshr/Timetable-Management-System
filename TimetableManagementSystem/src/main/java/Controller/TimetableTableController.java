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

    // Optional: clear timetable table
    public static void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }
}

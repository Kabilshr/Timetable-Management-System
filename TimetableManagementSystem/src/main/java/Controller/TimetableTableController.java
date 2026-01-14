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
    
    public static ArrayList<TimetableEntry> filterTimetable(ArrayList<TimetableEntry> allEntries, String selectedSubject, String selectedDay) {
        ArrayList<TimetableEntry> filteredEntries = new ArrayList<>();

        for (TimetableEntry entry : allEntries) {
            boolean matchesSubject = entry.getSubject().getSubjectName().equals(selectedSubject) || selectedSubject.equals("All");
            boolean matchesDay = entry.getDay().equals(selectedDay) || selectedDay.equals("All");

            if (matchesSubject && matchesDay) {
                filteredEntries.add(entry);
            }
        }
        return filteredEntries;
    }
    
    // Search timetable entries based on the query
    public static ArrayList<TimetableEntry> searchTimetable(String query, Timetable timetable) {
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
    
    // Method that accepts a list of TimetableEntry objects (filtered data)
    public static ArrayList<TimetableEntry> searchTimetable(String query, ArrayList<TimetableEntry> entries) {
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
    
    private static int getDayIndex(String day) {
        switch (day) {
            case "Monday": return 0;
            case "Tuesday": return 1;
            case "Wednesday": return 2;
            case "Thursday": return 3;
            case "Friday": return 4;
            case "Saturday": return 5;
            default: return -1;
        }
    }
    
    // Sorting timetable entries by start time (latest class first) using Selection Sort
    public static void sortTimetableByStartTimeSelectionSort(ArrayList<TimetableEntry> entries) {
        // Selection Sort - considering both Day and Start Time
        for (int i = 0; i < entries.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < entries.size(); j++) {
                TimetableEntry currentEntry = entries.get(j);
                TimetableEntry minEntry = entries.get(minIndex);

                // Compare day first
                int dayComparison = Integer.compare(getDayIndex(currentEntry.getDay()), getDayIndex(minEntry.getDay()));
                // If the days are the same, compare start time
                if (dayComparison == 0) {
                    dayComparison = currentEntry.getStartTime().compareTo(minEntry.getStartTime());
                }

                if (dayComparison < 0) {
                    minIndex = j;
                }
            }

            // Swap the entries
            TimetableEntry temp = entries.get(minIndex);
            entries.set(minIndex, entries.get(i));
            entries.set(i, temp);
        }
    }

    // Sorting timetable entries by start time (latest class first) using Insertion Sort
    public static void sortTimetableByStartTimeInsertionSort(ArrayList<TimetableEntry> entries) {
        // Insertion Sort - considering both Day and Start Time
        for (int i = 1; i < entries.size(); i++) {
            TimetableEntry currentEntry = entries.get(i);
            int j = i - 1;

            while (j >= 0) {
                TimetableEntry previousEntry = entries.get(j);
                int dayComparison = Integer.compare(getDayIndex(currentEntry.getDay()), getDayIndex(previousEntry.getDay()));

                // If the days are the same, compare start time
                if (dayComparison == 0) {
                    dayComparison = currentEntry.getStartTime().compareTo(previousEntry.getStartTime());
                }

                if (dayComparison < 0) {
                    entries.set(j + 1, entries.get(j));
                } else {
                    break;
                }

                j--;
            }
            entries.set(j + 1, currentEntry);
        }
    }

    // Helper method to check if one entry is later than the other
    private static boolean isLater(TimetableEntry entry1, TimetableEntry entry2) {
        // First, compare by day
        int dayComparison = entry1.getDay().compareTo(entry2.getDay());
        if (dayComparison != 0) {
            return dayComparison > 0;
        }
        // If days are equal, compare by start time (latest time first)
        return entry1.getStartTime().isAfter(entry2.getStartTime());
    }

    // Optional: clear timetable table
    public static void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }
}

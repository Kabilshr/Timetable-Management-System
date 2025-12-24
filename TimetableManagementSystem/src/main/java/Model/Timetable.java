/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Kabil's PC
 */
public class Timetable {
    private ArrayList<TimetableEntry> entries;

    public Timetable() {
        entries = new ArrayList<>();
    }

    // Add a new timetable entry
    public void addEntry(TimetableEntry entry) {
        entries.add(entry);
    }

    // Remove a timetable entry
    public boolean removeEntry(TimetableEntry entry) {
        return entries.remove(entry); // Removes the specific entry from the list
    }

    // Get all timetable entries
    public ArrayList<TimetableEntry> getEntries() {
        return entries;
    }

    // Check if the timetable is empty
    public boolean isEmpty() {
        return entries.isEmpty();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author kabil
 */
public class AnnouncementArrayList {
    private ArrayList<Announcement> announcements;

    public AnnouncementArrayList() {
        announcements = new ArrayList<>();
    }

    // Add new announcement (enqueue)
    public void addAnnouncement(Announcement announcement) {
        announcements.add(announcement);  // Adds to the rear of the list (ArrayList)
    }

    // Remove the oldest announcement (dequeue)
    public Announcement removeAnnouncement() {
        if (!announcements.isEmpty()) {
            return announcements.remove(0);  // Removes the first element (oldest)
        }
        return null;  // Return null if the list is empty
    }

    // View all announcements without removing
    public ArrayList<Announcement> getAllAnnouncements() {
        return announcements;  // Returns the entire list
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return announcements.isEmpty();
    }
}
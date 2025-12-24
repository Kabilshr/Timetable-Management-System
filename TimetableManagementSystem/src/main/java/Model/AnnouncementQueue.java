/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author kabil
 */
public class AnnouncementQueue {
    private Queue<Announcement> announcementQueue;

    public AnnouncementQueue() {
        announcementQueue = new LinkedList<>();
    }

    // Add new announcement (enqueue)
    public void addAnnouncement(Announcement announcement) {
        announcementQueue.add(announcement);
    }

    // Remove oldest announcement (dequeue)
    public Announcement removeAnnouncement() {
        return announcementQueue.poll();
    }

    // View all announcements without removing
    public Queue<Announcement> getAllAnnouncements() {
        return announcementQueue;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return announcementQueue.isEmpty();
    }
}

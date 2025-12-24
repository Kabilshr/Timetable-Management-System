/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kabil
 */
public class AppContext {
    private static AnnouncementArrayList announcements = new AnnouncementArrayList();

    public static AnnouncementArrayList getAnnouncementQueue() {
        return announcements;
    }
}

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
public class AppContext {
    private static AnnouncementArrayList announcements = new AnnouncementArrayList();
    
    // Static field to hold the shared instance of the Timetable
    private static Timetable timetable = new Timetable();
    
    private static ArrayList<Teacher> teachers = new ArrayList<>();  // Store all teachers

    


    public static AnnouncementArrayList getAnnouncementQueue() {
        return announcements;
    }
    
    // Method to get the shared instance of the Timetable
    public static Timetable getTimetable() {
        return timetable;
    }
    
    // Getter for teachers list
    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    
    // Method to add a teacher
    public static void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}

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
    
    // List to store all subjects
    private static ArrayList<Subject> subjects = new ArrayList<>();

   
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
    
    // Getter for the list of subjects
    public static ArrayList<Subject> getSubjects() {
        return subjects;
    }

    // Method to add a subject to the list
    public static void addSubject(Subject subject) {
        subjects.add(subject);
    }
        
    // Method to remove a teacher by ID (for delete operation)
    public static void removeTeacherById(String teacherId) {
        teachers.removeIf(teacher -> teacher.getTeacherId().equals(teacherId));
    }

    // Method to remove a subject by code (for delete operation)
    public static void removeSubjectByCode(String subjectCode) {
        subjects.removeIf(subject -> subject.getSubjectCode().equals(subjectCode));
    }
}

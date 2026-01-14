/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalTime;
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

   
    public static AnnouncementArrayList getAnnouncements() {
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
    
    public static void initializeSampleData() {
        // Adding sample teachers
        teachers.add(new Teacher("T001", "John Smith", "john.smith@mail.com"));
        teachers.add(new Teacher("T002", "Alice Johnson", "alice.johnson@mail.com"));
        teachers.add(new Teacher("T003", "Michael Brown", "michael.brown@mail.com"));
        teachers.add(new Teacher("T004", "Emily Davis", "emily.davis@mail.com"));
        teachers.add(new Teacher("T005", "David Wilson", "david.wilson@mail.com"));

        // Adding sample subjects
        subjects.add(new Subject("CS101", "Introduction to Computer Science"));
        subjects.add(new Subject("MATH201", "Calculus II"));
        subjects.add(new Subject("ENG301", "English Literature"));
        subjects.add(new Subject("BIO102", "General Biology"));
        subjects.add(new Subject("CHEM202", "Organic Chemistry"));
        
        Timetable timetable = getTimetable();

        timetable.addEntry(new TimetableEntry(
            "Monday",
            LocalTime.of(9, 0),
            LocalTime.of(10, 0),
            "CS-1A",
            subjects.get(0),
            teachers.get(0),
            "Room 101"
        ));

        timetable.addEntry(new TimetableEntry(
            "Monday",
            LocalTime.of(10, 0),
            LocalTime.of(11, 0),
            "CS-1B",
            subjects.get(1),
            teachers.get(1),
            "Room 102"
        ));

        timetable.addEntry(new TimetableEntry(
            "Tuesday",
            LocalTime.of(9, 0),
            LocalTime.of(10, 0),
            "CS-2A",
            subjects.get(2),
            teachers.get(2),
            "Room 201"
        ));

        timetable.addEntry(new TimetableEntry(
            "Tuesday",
            LocalTime.of(10, 0),
            LocalTime.of(11, 0),
            "CS-2B",
            subjects.get(3),
            teachers.get(3),
            "Room 202"
        ));

        timetable.addEntry(new TimetableEntry(
            "Wednesday",
            LocalTime.of(11, 0),
            LocalTime.of(12, 0),
            "CS-3A",
            subjects.get(4),
            teachers.get(4),
            "Room 301"
        ));

        timetable.addEntry(new TimetableEntry(
            "Wednesday",
            LocalTime.of(12, 0),
            LocalTime.of(13, 0),
            "CS-3B",
            subjects.get(0),
            teachers.get(1),
            "Room 302"
        ));

        timetable.addEntry(new TimetableEntry(
            "Thursday",
            LocalTime.of(9, 0),
            LocalTime.of(10, 0),
            "CS-1A",
            subjects.get(1),
            teachers.get(2),
            "Room 101"
        ));

        timetable.addEntry(new TimetableEntry(
            "Thursday",
            LocalTime.of(10, 0),
            LocalTime.of(11, 0),
            "CS-2A",
            subjects.get(2),
            teachers.get(3),
            "Room 201"
        ));

        timetable.addEntry(new TimetableEntry(
            "Friday",
            LocalTime.of(11, 0),
            LocalTime.of(12, 0),
            "CS-3A",
            subjects.get(3),
            teachers.get(4),
            "Room 301"
        ));

        timetable.addEntry(new TimetableEntry(
            "Friday",
            LocalTime.of(12, 0),
            LocalTime.of(13, 0),
            "CS-1B",
            subjects.get(4),
            teachers.get(0),
            "Room 102"
        ));
    }
}

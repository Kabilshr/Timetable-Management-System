/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kabil
 */
public class TimetableEntry {
    private String day;
    private String startTime;
    private String endTime;

    private String className;
    private Subject subject;
    private Teacher teacher;
    private String room;

    public TimetableEntry(String day, String startTime, String endTime, String className, Subject subject, Teacher teacher, String room) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.className = className;
        this.subject = subject;
        this.teacher = teacher;
        this.room = room;
    }

    public String getDay() { return day; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }
    public String getClassName() { return className; }
    public Subject getSubject() { return subject; }
    public Teacher getTeacher() { return teacher; }
    public String getRoom() { return room; }
}

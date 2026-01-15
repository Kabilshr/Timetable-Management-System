/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AppContext;

/**
 *
 * @author Kabil's PC
 */
public class StatisticsController {
    public static int getTotalClasses() {
        return AppContext.getTimetable().getEntries().size();
    }

    public static int getTotalTeachers() {
        return AppContext.getTeachers().size();
    }
}

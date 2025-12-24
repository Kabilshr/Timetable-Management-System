/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Announcement;
import Model.AnnouncementQueue;
import Model.AppContext;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AnnouncementController {

    public static void updateAnnouncementTable(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Clear existing rows
        model.setRowCount(0);

        // Get shared announcement queue
        AnnouncementQueue queue = AppContext.getAnnouncementQueue();

        // Populate table
        for (Announcement announcement : queue.getAllAnnouncements()) {
            Object[] row = new Object[1];
            row[0] = announcement.getMessage();
            model.addRow(row);
        }
    }
}
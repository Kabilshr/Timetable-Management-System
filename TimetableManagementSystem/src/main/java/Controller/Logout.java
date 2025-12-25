/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.LoginPage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kabil's PC
 */
public class Logout {
    public static void logout(JFrame currentFrame) {

        int choice = JOptionPane.showConfirmDialog(
            currentFrame,
            "Are you sure you want to logout?",
            "Logout",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (choice == JOptionPane.YES_OPTION) {
            new LoginPage().setVisible(true);
            currentFrame.dispose();
        }
    }
}

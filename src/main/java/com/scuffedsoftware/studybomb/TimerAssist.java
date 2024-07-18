/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scuffedsoftware.studybomb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Ismael Fuentes
 */
public final class TimerAssist {
    public static JLabel timerDisplay;
    private static String timerInput;
    private static int hour;
    private static int minute;
    private static int second;
    private static Timer bomb;
        
    private static void parseTimer() {
        hour = Integer.parseInt(timerInput.substring(0, 2));
        minute = Integer.parseInt(timerInput.substring(2,4));
        second = Integer.parseInt(timerInput.substring(4,6));
    }
    
    private static void updateTimerGUI() {
        StringBuilder newString = new StringBuilder();
        if (hour < 10) {
            newString.append("0");
        } newString.append(hour);
        if (minute < 10) {
            newString.append("0");
        } newString.append(minute);
        if (second < 10) {
            newString.append("0");
        } newString.append(second);
        
        timerDisplay.setText(newString.toString());
        }


    
    public static void timerStop() {
        bomb.stop();
    }
    
    public static void timerStart(String input, JLabel uiElement) {
        timerInput = input;
        timerDisplay = uiElement;
        parseTimer(); //Sets values for all time variables
        bomb = new Timer(1000,timerLogic);
        bomb.start();
    }
    
    static ActionListener timerLogic = new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {

            if (second == 0) {
                if (minute == 0) {
                    if (hour == 0) {
//                      DeleteAssist.kaboom();
                        timerDisplay.setText("BOOM!");
                    } else {
                        hour--;
                        minute = 59;
                        second = 59;
                        updateTimerGUI();
                    }
                } else {
                minute--;
                second = 59;
                updateTimerGUI();
                    }
            } else {
            second--;
            updateTimerGUI();
            }}};
    
}

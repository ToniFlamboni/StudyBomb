/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


package com.scuffedsoftware.studybomb;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author toni
 */
public class Task extends javax.swing.JPanel {
    JButton startButton;
    int actionCount = 0;
    
    /**
     * Creates new form Task
     */
    public Task(JButton startSignal) {
        this.startButton = startSignal;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskStatusBox = new javax.swing.JCheckBox();
        subtaskAddButton = new javax.swing.JButton();
        taskTimeInput = new javax.swing.JTextField();
        taskPriorityInc = new javax.swing.JButton();
        taskPriorityDec = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        subtaskPanel = new javax.swing.JPanel();
        signalPrimer();
        taskInput = new javax.swing.JTextField();
        subtaskInput = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(261, 32767));

        taskStatusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskStatusBoxActionPerformed(evt);
            }
        });

        subtaskAddButton.setText("+");
        subtaskAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtaskAddButtonActionPerformed(evt);
            }
        });

        taskTimeInput.setText("00:00");
        taskTimeInput.setAutoscrolls(false);
        taskTimeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskTimeInputActionPerformed(evt);
            }
        });

        taskPriorityInc.setText("^");
        taskPriorityInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskPriorityIncActionPerformed(evt);
            }
        });

        taskPriorityDec.setText("v");

        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setRequestFocusEnabled(false);
        jScrollPane1.setVerifyInputWhenFocusTarget(false);

        subtaskPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        subtaskPanel.setEnabled(false);
        subtaskPanel.setFocusable(false);
        subtaskPanel.setMaximumSize(new java.awt.Dimension(204, 32767));
        subtaskPanel.setOpaque(false);
        subtaskPanel.setLayout(new javax.swing.BoxLayout(subtaskPanel, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane1.setViewportView(subtaskPanel);

        taskInput.setText("Enter a task...");
        taskInput.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                haha(evt);
            }
        });

        subtaskInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subtaskInput.setText("Enter a subtask...");
        subtaskInput.setMaximumSize(new java.awt.Dimension(150, 20));
        subtaskInput.setMinimumSize(new java.awt.Dimension(150, 25));
        subtaskInput.setPreferredSize(new java.awt.Dimension(155, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(taskStatusBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taskInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(taskTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taskPriorityInc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taskPriorityDec, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(subtaskAddButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subtaskInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(taskTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(taskInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(taskStatusBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskPriorityInc)
                    .addComponent(subtaskAddButton)
                    .addComponent(subtaskInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taskPriorityDec)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void subtaskAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtaskAddButtonActionPerformed
        // TODO add your handling code here:
        String subtaskGoal = subtaskInput.getText();
        JCheckBox newSubtask = new JCheckBox(subtaskGoal);
        newSubtask.setEnabled(false);
        
        subtaskInput.setText("");
        subtaskPanel.add(newSubtask);
        subtaskPanel.revalidate();
    }//GEN-LAST:event_subtaskAddButtonActionPerformed

    private void taskTimeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTimeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskTimeInputActionPerformed

    private void taskPriorityIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskPriorityIncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskPriorityIncActionPerformed

    private void haha(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_haha
        // TODO add your handling code here:
    }//GEN-LAST:event_haha

    private void taskStatusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskStatusBoxActionPerformed
        taskComplete();
    }//GEN-LAST:event_taskStatusBoxActionPerformed

    private void taskComplete() {
        Component[] componentList = this.getComponents();
        for (Component component: componentList) {
            component.setEnabled(false);
            
            }
        subtaskToggle(false);
        }
    
    private void subtaskToggle(boolean enableValue) {
        Component[] subtaskList = subtaskPanel.getComponents();
        for (Component subtask : subtaskList) {
            subtask.setEnabled(enableValue);
        }
    }

    
    private void signalPrimer() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionCount += 1;
                System.out.println("hey! i got something!" + actionCount);
                if (actionCount % 2 == 0) {
                    System.out.println("we're good to go!");
                    subtaskToggle(true);
                    subtaskInput.setEnabled(false);
                    subtaskAddButton.setEnabled(false);
                    taskInput.setEditable(false);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton subtaskAddButton;
    private javax.swing.JTextField subtaskInput;
    private javax.swing.JPanel subtaskPanel;
    private javax.swing.JTextField taskInput;
    private javax.swing.JButton taskPriorityDec;
    private javax.swing.JButton taskPriorityInc;
    private javax.swing.JCheckBox taskStatusBox;
    private javax.swing.JTextField taskTimeInput;
    // End of variables declaration//GEN-END:variables
}

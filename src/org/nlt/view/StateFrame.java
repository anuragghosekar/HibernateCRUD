package org.nlt.view;

import java.util.Collection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.nlt.model.States;
import static org.nlt.view.MainInterface.loginUser;
import static org.nlt.view.MainInterface.stateMap;

public class StateFrame extends javax.swing.JFrame implements MainInterface {

    private States state = null;

    public StateFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        stateNameTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stateTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("State");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STATE NAME");

        stateNameTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        stateNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateNameTextFieldActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        submitButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(submitButton);

        updateButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(updateButton);

        deleteButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(deleteButton);

        resetButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel2.add(resetButton);

        jPanel3.setLayout(new java.awt.GridLayout(1, 1));

        stateTable.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        stateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        stateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stateTable);

        jPanel3.add(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stateNameTextField))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        try {
            String name = stateNameTextField.getText().toUpperCase().trim();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid Entry", "State Frame", JOptionPane.ERROR_MESSAGE);

            } else {
                if (stateMap.containsKey(name)) {
                    JOptionPane.showMessageDialog(this, "Duplicate State Name", "State Frame", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    States state = new States();
                    state.setCreated(new Date());
                    state.setModified(new Date());
                    state.setName(name);
                    state.setStatus(1);
                    state.setUser(loginUser);

                    stateService.addState(state);

                    JOptionPane.showMessageDialog(this, "Record Submitted", "State Frame", JOptionPane.INFORMATION_MESSAGE);
                    stateService.setStateMap();

                    stateFrame.setTableData();
                    personFrame.setStateComboBox();
                    cityFrame.setStateComboBox();
                    resetData();
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "State Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            String name = stateNameTextField.getText();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid Entry", "State Frame", JOptionPane.ERROR_MESSAGE);

            } else {
                if (stateMap.containsKey(name)) {
                    JOptionPane.showMessageDialog(this, "Duplicate State Name", "State Frame", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    state.setModified(new Date());
                    state.setName(name);
                    state.setStatus(1);
                    state.setUser(loginUser);

                    stateService.updateState(state);

                    JOptionPane.showMessageDialog(this, "Record Submitted", "State Frame", JOptionPane.INFORMATION_MESSAGE);
                    stateService.setStateMap();

                    stateFrame.setTableData();
                    personFrame.setStateComboBox();
                    resetData();
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "State Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            String name = stateNameTextField.getText();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid Entry", "State Frame", JOptionPane.ERROR_MESSAGE);

            } else {
                state.setModified(new Date());
                state.setName(name);
                state.setStatus(1);
                state.setUser(loginUser);

                stateService.deleteState(state);

                JOptionPane.showMessageDialog(this, "Record Deleteded", "State Frame", JOptionPane.INFORMATION_MESSAGE);
                stateService.setStateMap();

                stateFrame.setTableData();
                personFrame.setStateComboBox();
                resetData();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "State Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void stateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stateTableMouseClicked
        try {
            String name = stateTable.getValueAt(stateTable.getSelectedRow(), 1).toString();
            state = stateMap.get(name);
            stateNameTextField.setText(state.getName());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "State Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_stateTableMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        stateFrame.resetData();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void stateNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateNameTextFieldActionPerformed
    }//GEN-LAST:event_stateNameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField stateNameTextField;
    private javax.swing.JTable stateTable;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    public void setTableData() {
        try {
            String[] cols = {"ID", "NAME"};
            String[][] data = new String[stateMap.size()][cols.length];
            int i = 0;
            Collection<States> stateValues = stateMap.values();
            for (States state : stateValues) {
                data[i][0] = state.getId() + "";
                data[i][1] = state.getName();
                i++;
            }

            DefaultTableModel model = new DefaultTableModel(data, cols);
            stateTable.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "State Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void resetData() {
        stateNameTextField.setText("");
        state = null;
    }
}

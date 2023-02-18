package org.nlt.view;

import java.util.Collection;
import org.nlt.model.Cities;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.nlt.model.States;

public class CityFrame extends javax.swing.JFrame implements MainInterface{

    private Cities city=null;
    //private Cities city = null;

    public CityFrame() {
            initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cityNameTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cityTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("City");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT STATE");

        cityNameTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

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

        cityTable.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cityTable.setModel(new javax.swing.table.DefaultTableModel(
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
        cityTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cityTable);

        jPanel3.add(jScrollPane1);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" CITY NAME");

        stateComboBox.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(cityNameTextField))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(292, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            String name = cityNameTextField.getText().toUpperCase().trim();
            String stateName = stateComboBox.getSelectedItem().toString().toUpperCase().trim();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid Entry", "City Frame", JOptionPane.ERROR_MESSAGE);

            } else {
                if (cityMap.containsKey(name)) {
                    JOptionPane.showMessageDialog(this, "Duplicate City Name", "City Frame", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    Cities city = new Cities();
                    city.setCreated(new Date());
                    city.setModified(new Date());
                    city.setName(name);
                    city.setId(1);
                    city.setStatus(1);
                    city.setUser(loginUser);
                    city.setState(stateMap.get(stateName));
                    cityService.addCity(city);
                    
                    JOptionPane.showMessageDialog(this, "Record Submitted", "City Frame", JOptionPane.INFORMATION_MESSAGE);
                    cityService.setCityMap();
                    cityFrame.setTableData();
                    resetData();
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "City Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
     
        try {
            String name = cityNameTextField.getText().toUpperCase();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid Entry", "City Frame", JOptionPane.ERROR_MESSAGE);

            } else {
                if (stateMap.containsKey(name)) {
                    JOptionPane.showMessageDialog(this, "Duplicate City Name", "City Frame", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    city.setModified(new Date());
                    city.setName(name);
                    city.setStatus(1);
                    city.setUser(loginUser);

                    cityService.updateCity(city);

                    JOptionPane.showMessageDialog(this, "Record Submitted", "City Frame", JOptionPane.INFORMATION_MESSAGE);
                    cityService.setCityMap();

                    cityFrame.setTableData();
                    personFrame.setCityComboBox();
                    resetData();
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "City Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    
        try {
            String name = cityNameTextField.getText();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid Entry", "City Frame", JOptionPane.ERROR_MESSAGE);

            } else {
                city.setModified(new Date());
                city.setName(name);
                city.setStatus(1);
                city.setUser(loginUser);

                cityService.deleteCity(city);

                JOptionPane.showMessageDialog(this, "Record Deleteded", "City Frame", JOptionPane.INFORMATION_MESSAGE);
                cityService.setCityMap();

                cityFrame.setTableData();
                personFrame.setCityComboBox();
                resetData();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "City Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void cityTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityTableMouseClicked

    try
    {
        String name= cityTable.getValueAt(cityTable.getSelectedRow(), 1).toString();
        city = cityMap.get(name);
        cityNameTextField.setText(city.getName());
    }
    catch (Exception ex)
    {
        JOptionPane.showMessageDialog(this, ex,"City Frame", JOptionPane.ERROR_MESSAGE);
   }
    }//GEN-LAST:event_cityTableMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        resetData();
    }//GEN-LAST:event_resetButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JTable cityTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox stateComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    
    
     public void setTableData() {
        try {
            String[] cols = {"ID", "NAME", "STATE"};
            String[][] data = new String[cityMap.size()][cols.length];
            int i = 0;
            Collection<Cities> cityValues = cityMap.values();
            for (Cities city : cityValues) 
            {
                data[i][0] = city.getId() + "";
                data[i][1] = city.getName();
                data[i][2] = city.getState().getName();
                i++;
            }

            DefaultTableModel model = new DefaultTableModel(data, cols);
            cityTable.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "City Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void resetData() {
        cityNameTextField.setText("");
        stateComboBox.setSelectedItem("SELECT");
    }
    
        public void setStateComboBox() {
        try {
            stateComboBox.removeAllItems();
            stateComboBox.addItem("SELECT");

            Collection<States> stateValues = stateMap.values();
            for (States state : stateValues) {
                stateComboBox.addItem(state.getName());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "City Frame", JOptionPane.ERROR_MESSAGE);
        }
    }
}

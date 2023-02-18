package org.nlt.view;

import java.io.File;
import java.util.Collection;
import org.nlt.model.Persons;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.nlt.model.Cities;
import org.nlt.model.States;

public class PersonFrame extends javax.swing.JFrame implements MainInterface {

    private boolean stateFlag = false;
    private Persons person = null;

    public PersonFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        stateComboBox = new javax.swing.JComboBox<>();
        newStateButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        cityComboBox = new javax.swing.JComboBox<>();
        newCityButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        report1Button = new javax.swing.JButton();
        report2Button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Person Details");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        jPanel2.setLayout(new java.awt.GridLayout(6, 2, 10, 10));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NAME");
        jPanel2.add(jLabel1);

        nameTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPanel2.add(nameTextField);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AGE");
        jPanel2.add(jLabel2);

        ageTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPanel2.add(ageTextField);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PHONE");
        jPanel2.add(jLabel3);

        phoneTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPanel2.add(phoneTextField);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("STATE");
        jPanel2.add(jLabel5);

        jPanel8.setLayout(new java.awt.BorderLayout());

        stateComboBox.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        stateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboBoxActionPerformed(evt);
            }
        });
        jPanel8.add(stateComboBox, java.awt.BorderLayout.CENTER);

        newStateButton.setText("NEW");
        newStateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStateButtonActionPerformed(evt);
            }
        });
        jPanel8.add(newStateButton, java.awt.BorderLayout.LINE_END);

        jPanel2.add(jPanel8);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CITY");
        jPanel2.add(jLabel6);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel9.setLayout(new java.awt.BorderLayout());

        cityComboBox.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPanel9.add(cityComboBox, java.awt.BorderLayout.CENTER);

        newCityButton.setText("NEW");
        newCityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCityButtonActionPerformed(evt);
            }
        });
        jPanel9.add(newCityButton, java.awt.BorderLayout.LINE_END);

        jPanel5.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        submitButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel6.add(submitButton);

        updateButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel6.add(updateButton);

        deleteButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel6.add(deleteButton);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        resetButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel7.add(resetButton);

        report1Button.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        report1Button.setText("REPORT1");
        report1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report1ButtonActionPerformed(evt);
            }
        });
        jPanel7.add(report1Button);

        report2Button.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        report2Button.setText("REPORT2");
        report2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report2ButtonActionPerformed(evt);
            }
        });
        jPanel7.add(report2Button);

        jPanel2.add(jPanel7);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 1));

        personTable.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        personTable.setModel(new javax.swing.table.DefaultTableModel(
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
        personTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personTable);

        jPanel3.add(jScrollPane1);

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            String name = nameTextField.getText();
            String age = ageTextField.getText();
            String phone = phoneTextField.getText();
            String city = cityComboBox.getSelectedItem().toString();
            String state = stateComboBox.getSelectedItem().toString();
            if (name.isEmpty() || age.isEmpty() || phone.isEmpty() || city.isEmpty() || state.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invaid Entry", "Person Frame", JOptionPane.ERROR_MESSAGE);
            }

            Persons person = new Persons();
            person.setAge(Integer.parseInt(age));
            person.setCreated(new Date());
            person.setModified(new Date());
            person.setName(name);
            person.setPhone(phone);
            person.setStatus(1);
            person.setUser(loginUser);
            person.setCity(cityMap.get(city));

            personService.addPerson(person);

            JOptionPane.showMessageDialog(this, "Record Submitted", "Person Frame", JOptionPane.INFORMATION_MESSAGE);
            personService.setPersonMap();

            personFrame.setTableData();
            resetData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Person Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void personTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personTableMouseClicked

        String personPhone = personTable.getValueAt(personTable.getSelectedRow(), 3).toString();
        person = personMap.get(personPhone);

        nameTextField.setText(person.getName());
        ageTextField.setText(person.getAge() + "");
        phoneTextField.setText(person.getPhone());
        stateComboBox.setSelectedItem(person.getCity().getState().getName());
        cityComboBox.setSelectedItem(person.getCity().getName());
    }//GEN-LAST:event_personTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

            try {
            String name = nameTextField.getText();
            String age = ageTextField.getText();
            String phone = phoneTextField.getText();
            String city = cityComboBox.getSelectedItem().toString();
            String state= stateComboBox.getSelectedItem().toString();
   
                if(name.isEmpty()||age.isEmpty()||phone.isEmpty()||city.isEmpty()||state.isEmpty())
            {           
                JOptionPane.showMessageDialog(this, "Invalid Entry", "Person Frame", JOptionPane.ERROR_MESSAGE);
            }
            person.setAge(Integer.parseInt(age));
            person.setCreated(new Date());
            person.setModified(new Date());
            person.setName(name);
            person.setPhone(phone);
            person.setStatus(1);
            person.setUser(loginUser);
            person.setCity(cityMap.get(city));
            
            personService.updatePerson(person);
            personService.setPersonMap();
            personFrame.setTableData();
            resetData();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Person Frame", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

                 try {
            String name = nameTextField.getText();
            String age = ageTextField.getText();
            String phone = phoneTextField.getText();
            
            person.setAge(Integer.parseInt(age));
            person.setCreated(new Date());
            person.setModified(new Date());
            person.setName(name);
            person.setPhone(phone);
            person.setStatus(1);
            person.setUser(loginUser);

            personService.deletePerson(person);
            personService.setPersonMap();
            personFrame.setTableData();
            resetData();
            JOptionPane.showMessageDialog(this, "Record Deleted", "Person Frame", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Person Frame", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        
        resetData();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed

        if (stateFlag) {
            String stateName = stateComboBox.getSelectedItem().toString();
            if (!stateName.equalsIgnoreCase("SELECT")) {
                List<Cities> cityList = cityService.getCityList(stateName);
                cityComboBox.removeAllItems();
                for (Cities city : cityList) {
                    cityComboBox.addItem(city.getName());
                }
            }
        }

    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void newStateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStateButtonActionPerformed
        stateFrame.setTableData();
        stateFrame.setVisible(true);
    }//GEN-LAST:event_newStateButtonActionPerformed

    private void newCityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCityButtonActionPerformed
        cityFrame.setStateComboBox();
        cityFrame.setTableData();
        cityFrame.setVisible(true);
    }//GEN-LAST:event_newCityButtonActionPerformed

    private void report2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report2ButtonActionPerformed

        if(person!=null)
        {
        try {
            File f = new File(".");
            String filePath = f.getCanonicalPath() + File.separator + "build" + File.separator + "classes" + File.separator + "org" + File.separator + "nlt" + File.separator + "reports" + File.separator + "report1.jrxml";
            JasperDesign jd = JRXmlLoader.load(filePath);
            String sql = "SELECT\n"
                    + "     persons.`age` AS persons_age,\n"
                    + "     persons.`created` AS persons_created,\n"
                    + "     persons.`modified` AS persons_modified,\n"
                    + "     persons.`name` AS persons_name,\n"
                    + "     persons.`phone` AS persons_phone,\n"
                    + "     persons.`status` AS persons_status,\n"
                    + "     persons.`city_id` AS persons_city_id,\n"
                    + "     persons.`state_id` AS persons_state_id,\n"
                    + "     persons.`user_id` AS persons_user_id,\n"
                    + "     cities.`name` AS cities_name,\n"
                    + "     states.`name` AS states_name,\n"
                    + "     persons.`id` AS persons_id\n"
                    + "FROM\n"
                    + "     `cities` cities INNER JOIN `persons` persons ON cities.`id` = persons.`city_id`\n"
                    + "     INNER JOIN `states` states ON cities.`state_id` = states.`id` and persons.`phone`="+person.getPhone();
            // System.out.println(sql);
            JRDesignQuery query = new JRDesignQuery();
            query.setText(sql);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, session.connection());

//            String pdfFileName = f.getCanonicalPath() + File.separator + "samplereport.pdf";
//            JasperExportManager.exportReportToPdfFile(jp, pdfFileName);
        
            JasperViewer.viewReport(jp, false);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Person Frame", JOptionPane.ERROR_MESSAGE);
        }
        }
       
    }//GEN-LAST:event_report2ButtonActionPerformed

    private void report1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report1ButtonActionPerformed

        try {
            File f = new File(".");
            String filePath = f.getCanonicalPath() + File.separator + "build" + File.separator + "classes" + File.separator + "org" + File.separator + "nlt" + File.separator + "reports" + File.separator + "report1.jrxml";
            JasperDesign jd = JRXmlLoader.load(filePath);
            String sql = "SELECT\n"
                    + "     persons.`age` AS persons_age,\n"
                    + "     persons.`created` AS persons_created,\n"
                    + "     persons.`modified` AS persons_modified,\n"
                    + "     persons.`name` AS persons_name,\n"
                    + "     persons.`phone` AS persons_phone,\n"
                    + "     persons.`status` AS persons_status,\n"
                    + "     persons.`city_id` AS persons_city_id,\n"
                    + "     persons.`state_id` AS persons_state_id,\n"
                    + "     persons.`user_id` AS persons_user_id,\n"
                    + "     cities.`name` AS cities_name,\n"
                    + "     states.`name` AS states_name,\n"
                    + "     persons.`id` AS persons_id\n"
                    + "FROM\n"
                    + "     `cities` cities INNER JOIN `persons` persons ON cities.`id` = persons.`city_id`\n"
                    + "     INNER JOIN `states` states ON cities.`state_id` = states.`id`";
            // System.out.println(sql);
            JRDesignQuery query = new JRDesignQuery();
            query.setText(sql);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, session.connection());

//            String pdfFileName = f.getCanonicalPath() + File.separator + "samplereport.pdf";
//            JasperExportManager.exportReportToPdfFile(jp, pdfFileName);

            JasperViewer.viewReport(jp, false);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Person Frame", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_report1ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JComboBox<String> cityComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton newCityButton;
    private javax.swing.JButton newStateButton;
    private javax.swing.JTable personTable;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton report1Button;
    private javax.swing.JButton report2Button;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox<String> stateComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    public void setTableData() {
        try {
            String[] cols = {"ID", "NAME", "AGE", "PHONE", "CITY", "STATE"};
            String[][] data = new String[personMap.size()][cols.length];
            int i = 0;
            Collection<Persons> personValues = personMap.values();
            for (Persons per : personValues) {
                data[i][0] = per.getId() + "";
                data[i][1] = per.getName();
                data[i][2] = per.getAge() + "";
                data[i][3] = per.getPhone();
                data[i][4] = per.getCity().getName();
                data[i][5] = per.getCity().getState().getName();
                i++;
            }

            DefaultTableModel model = new DefaultTableModel(data, cols);
            personTable.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Person Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setStateComboBox() {
        try {
            stateFlag = false;
            stateComboBox.removeAllItems();
            stateComboBox.addItem("SELECT");

            Collection<States> stateValues = stateMap.values();
            for (States state : stateValues) {
                stateComboBox.addItem(state.getName());
            }
            stateFlag = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Person Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setCityComboBox() {
        try {
            cityComboBox.removeAllItems();
            cityComboBox.addItem("SELECT");

            Collection<Cities> cityValues = cityMap.values();
            for (Cities city : cityValues) {
                cityComboBox.addItem(city.getName());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Person Frame", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void resetData() {
        
        nameTextField.setText("");
        ageTextField.setText("");
        phoneTextField.setText("");
        stateComboBox.setSelectedItem("SELECT");
        cityComboBox.setSelectedItem("SELECT");

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Car;
import model.CarFleet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author piyus
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    CarFleet carFleetDetails;
    public boolean isValidForm = false;
    public boolean isValid = false;
            
    public CreateJPanel(CarFleet carFleetDetails) {
        initComponents();
        this.carFleetDetails = carFleetDetails;
        btnSave.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTitle = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        lblManufacturedBy = new javax.swing.JLabel();
        lblManufacturedDate = new javax.swing.JLabel();
        lblSeatCapacity = new javax.swing.JLabel();
        lblPlatformUsed = new javax.swing.JLabel();
        lblCityOfOperation = new javax.swing.JLabel();
        lblMaintenanceCertExpDate = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtManufacturedDate = new javax.swing.JTextField();
        txtSeatCapacity = new javax.swing.JTextField();
        txtCityOfOperation = new javax.swing.JTextField();
        txtMaintenanceCertExpDate = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblCarAvailability = new javax.swing.JLabel();
        chkboxAvailable = new java.awt.Checkbox();
        comboBoxCreateUsedBy = new javax.swing.JComboBox<>();
        lblModelNumberErrMsg = new javax.swing.JLabel();
        lblSerialNumberErrMsg = new javax.swing.JLabel();
        lblTitleSubHeading = new javax.swing.JLabel();
        lblManufactureDateErrMsg = new javax.swing.JLabel();
        lblMaintenanceDateExpiryErrorMessage = new javax.swing.JLabel();
        comboBoxManufacturerCreate = new javax.swing.JComboBox<>();
        lblSeatCapacityErrMsg = new javax.swing.JLabel();

        btnTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTitle.setText("Create Car");

        lblModelNumber.setText("Model Number*:");

        lblSerialNumber.setText("Serial Number*:");

        lblManufacturedBy.setText("Manufacturer:");

        lblManufacturedDate.setText("Manufactured Date*:");

        lblSeatCapacity.setText("Seat Capacity:");

        lblPlatformUsed.setText("Platform Used*:");

        lblCityOfOperation.setText("City Of Operation:");

        lblMaintenanceCertExpDate.setText("Maintenance Certificate Expiry Date*:");

        txtModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNumberActionPerformed(evt);
            }
        });
        txtModelNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModelNumberKeyPressed(evt);
            }
        });

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });
        txtSerialNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSerialNumberKeyPressed(evt);
            }
        });

        txtManufacturedDate.setToolTipText("Format should be MM/DD/YYYY");
        txtManufacturedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturedDateActionPerformed(evt);
            }
        });
        txtManufacturedDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtManufacturedDateKeyPressed(evt);
            }
        });

        txtSeatCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatCapacityActionPerformed(evt);
            }
        });
        txtSeatCapacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSeatCapacityKeyPressed(evt);
            }
        });

        txtCityOfOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityOfOperationActionPerformed(evt);
            }
        });
        txtCityOfOperation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityOfOperationKeyPressed(evt);
            }
        });

        txtMaintenanceCertExpDate.setToolTipText("Format should be MM/DD/YYYY");
        txtMaintenanceCertExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaintenanceCertExpDateActionPerformed(evt);
            }
        });
        txtMaintenanceCertExpDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaintenanceCertExpDateKeyPressed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblCarAvailability.setText("Car Availability:");

        chkboxAvailable.setLabel("Is Available");

        comboBoxCreateUsedBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uber", "Lyft", "Ola" }));
        comboBoxCreateUsedBy.setSelectedIndex(-1);
        comboBoxCreateUsedBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCreateUsedByActionPerformed(evt);
            }
        });

        lblModelNumberErrMsg.setText("           ");

        lblSerialNumberErrMsg.setText("           ");

        lblTitleSubHeading.setForeground(new java.awt.Color(255, 0, 0));
        lblTitleSubHeading.setText("Fields mark with * are mandatory");

        lblManufactureDateErrMsg.setText("           ");

        lblMaintenanceDateExpiryErrorMessage.setText("           ");

        comboBoxManufacturerCreate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda", "BMW", "Audi", "Tesla", "Suzuki", "Toyota" }));
        comboBoxManufacturerCreate.setSelectedIndex(-1);
        comboBoxManufacturerCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxManufacturerCreateActionPerformed(evt);
            }
        });

        lblSeatCapacityErrMsg.setText("           ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManufacturedDate)
                            .addComponent(lblSerialNumber)
                            .addComponent(lblModelNumber)
                            .addComponent(lblManufacturedBy)
                            .addComponent(lblSeatCapacity)
                            .addComponent(lblCityOfOperation)
                            .addComponent(lblMaintenanceCertExpDate)
                            .addComponent(lblPlatformUsed)
                            .addComponent(lblCarAvailability)
                            .addComponent(lblTitleSubHeading))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSeatCapacity)
                                .addGap(18, 18, 18)
                                .addComponent(lblSeatCapacityErrMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSerialNumber)
                                .addGap(18, 18, 18)
                                .addComponent(lblSerialNumberErrMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtModelNumber)
                                .addGap(18, 18, 18)
                                .addComponent(lblModelNumberErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtManufacturedDate)
                                .addGap(18, 18, 18)
                                .addComponent(lblManufactureDateErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBoxManufacturerCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCityOfOperation, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMaintenanceCertExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMaintenanceDateExpiryErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(comboBoxCreateUsedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkboxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCityOfOperation, txtManufacturedDate, txtModelNumber, txtSeatCapacity, txtSerialNumber});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnTitle)
                .addGap(15, 15, 15)
                .addComponent(lblTitleSubHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelNumberErrMsg)
                    .addComponent(lblModelNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSerialNumberErrMsg))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturedBy)
                    .addComponent(comboBoxManufacturerCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeatCapacity)
                    .addComponent(txtSeatCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeatCapacityErrMsg))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturedDate)
                    .addComponent(txtManufacturedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManufactureDateErrMsg))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityOfOperation)
                    .addComponent(txtCityOfOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaintenanceCertExpDate)
                    .addComponent(txtMaintenanceCertExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaintenanceDateExpiryErrorMessage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlatformUsed)
                    .addComponent(comboBoxCreateUsedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarAvailability)
                    .addComponent(chkboxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSave)
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNumberActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        SimpleDateFormat dateconversion = new SimpleDateFormat("MM/dd/yyyy");

        if (!txtMaintenanceCertExpDate.getText().isEmpty()) {
           try
            {
            dateconversion.parse(txtMaintenanceCertExpDate.getText());
            lblMaintenanceDateExpiryErrorMessage.setText("");
                isValidForm = true;
            }
            catch (Exception e)
            {
            lblMaintenanceDateExpiryErrorMessage.setText("Invalid Date format entered");
                isValidForm = false;
            } 
        }
        
        if (!txtManufacturedDate.getText().isEmpty()) {
           try
            {
                dateconversion.parse(txtManufacturedDate.getText());
                lblManufactureDateErrMsg.setText("");
                isValidForm = true;
            }
            catch (Exception e)
            {
                lblManufactureDateErrMsg.setText("Invalid Date format entered");
                isValidForm = false;
            } 
        }
                
        if (isValidForm) {
            // getting the textbox values and setting the attributes
            DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate localDate = LocalDate.parse(txtManufacturedDate.getText(), datetimeformat);
            LocalDate localDateCertExpire = LocalDate.parse(txtMaintenanceCertExpDate.getText(), datetimeformat);
            LocalDate todaysDate = LocalDate.now();
            Object createdManufacturer = comboBoxManufacturerCreate.getSelectedItem();

            LocalDate manufacturedDate = localDate;
            int modelNumber = Integer.parseInt(txtModelNumber.getText());
            int serialNumber = Integer.parseInt(txtSerialNumber.getText());  
            int seatCapacity = Integer.parseInt(txtSeatCapacity.getText());
            Object createdUsedByApp = comboBoxCreateUsedBy.getSelectedItem();
            
            LocalDate lastUpdated = todaysDate;
            String usedBy = createdUsedByApp.toString();
            String manufacturer = createdManufacturer.toString();
            String city = txtCityOfOperation.getText();
            Boolean IsAvailable = chkboxAvailable.getState();
            LocalDate maintenanceCertExpDate = localDateCertExpire;

            //adding the car instance in the class
            Car car = carFleetDetails.addNewCar();

            car.setModelNumber(modelNumber);
            car.setSerialNumber(serialNumber);
            car.setManufacturedDate(manufacturedDate);
            car.setManufacturer(manufacturer);
            car.setPlatformUsed(usedBy);
            car.setSeatCapacity(seatCapacity);
            car.setMaintenanceCertExpDate(maintenanceCertExpDate);
            car.setCity(city);
            car.setIsAvailable(IsAvailable);
            car.setLastUpdated(lastUpdated);

            JOptionPane.showMessageDialog(this, "New car record added");

            txtModelNumber.setText("");
            txtSerialNumber.setText("");
            txtManufacturedDate.setText("");
            comboBoxManufacturerCreate.setSelectedIndex(-1);

            txtSeatCapacity.setText("");
            comboBoxCreateUsedBy.setSelectedIndex(-1);
            txtCityOfOperation.setText("");
            txtMaintenanceCertExpDate.setText("");
            chkboxAvailable.setState(false);  
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed

    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void txtManufacturedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturedDateActionPerformed
        
    }//GEN-LAST:event_txtManufacturedDateActionPerformed

    private void txtSeatCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatCapacityActionPerformed
        
    }//GEN-LAST:event_txtSeatCapacityActionPerformed

    private void comboBoxCreateUsedByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCreateUsedByActionPerformed
        mandatoryFieldValidation();
    }//GEN-LAST:event_comboBoxCreateUsedByActionPerformed

    private void txtCityOfOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityOfOperationActionPerformed
        
    }//GEN-LAST:event_txtCityOfOperationActionPerformed

    private void txtMaintenanceCertExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaintenanceCertExpDateActionPerformed
        
    }//GEN-LAST:event_txtMaintenanceCertExpDateActionPerformed

    private void txtModelNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelNumberKeyPressed
        // TODO add your handling code here:
        mandatoryFieldValidation();
        char modelNumberKeyPressed = evt.getKeyChar();
        if(Character.isLetter(modelNumberKeyPressed)){
            isValidForm = false;
            txtModelNumber.setEditable(false);
            lblModelNumberErrMsg.setText("Please enter number only!");
            mandatoryFieldValidation();
        }
        else
        {
            txtModelNumber.setEditable(true);
            isValidForm = true;
            lblModelNumberErrMsg.setText("");
            mandatoryFieldValidation();
        }
    }//GEN-LAST:event_txtModelNumberKeyPressed

    private void txtSerialNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialNumberKeyPressed
        mandatoryFieldValidation();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isValidForm = false;
            txtSerialNumber.setEditable(false);
            lblSerialNumberErrMsg.setText("Please enter number only!");
            mandatoryFieldValidation();
        }
        else
        {
            txtSerialNumber.setEditable(true);
            isValidForm = true;
            lblSerialNumberErrMsg.setText("");
            mandatoryFieldValidation();
        }
    }//GEN-LAST:event_txtSerialNumberKeyPressed

    private void comboBoxManufacturerCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxManufacturerCreateActionPerformed
        // TODO add your handling code here:
        mandatoryFieldValidation();
    }//GEN-LAST:event_comboBoxManufacturerCreateActionPerformed

    private void txtSeatCapacityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatCapacityKeyPressed
        mandatoryFieldValidation();
        char seatNumberKeyPressed = evt.getKeyChar();
        if(Character.isLetter(seatNumberKeyPressed)){
            isValidForm = false;
            txtSeatCapacity.setEditable(false);
            lblSeatCapacityErrMsg.setText("Please enter number only!");
            mandatoryFieldValidation();
        }
        else
        {
            txtSeatCapacity.setEditable(true);
            isValidForm = true;
            lblSeatCapacityErrMsg.setText("");
            mandatoryFieldValidation();
        }
    }//GEN-LAST:event_txtSeatCapacityKeyPressed

    private void txtManufacturedDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtManufacturedDateKeyPressed
        mandatoryFieldValidation();
    }//GEN-LAST:event_txtManufacturedDateKeyPressed

    private void txtCityOfOperationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityOfOperationKeyPressed
        mandatoryFieldValidation();
    }//GEN-LAST:event_txtCityOfOperationKeyPressed

    private void txtMaintenanceCertExpDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaintenanceCertExpDateKeyPressed
        mandatoryFieldValidation();
    }//GEN-LAST:event_txtMaintenanceCertExpDateKeyPressed

    private void mandatoryFieldValidation() {
        if (!txtModelNumber.getText().isEmpty() && !txtSerialNumber.getText().isEmpty()) {
            isValid = true;
            btnSave.setEnabled(isValid);
            return;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel btnTitle;
    private java.awt.Checkbox chkboxAvailable;
    private javax.swing.JComboBox<String> comboBoxCreateUsedBy;
    private javax.swing.JComboBox<String> comboBoxManufacturerCreate;
    private javax.swing.JLabel lblCarAvailability;
    private javax.swing.JLabel lblCityOfOperation;
    private javax.swing.JLabel lblMaintenanceCertExpDate;
    private javax.swing.JLabel lblMaintenanceDateExpiryErrorMessage;
    private javax.swing.JLabel lblManufactureDateErrMsg;
    private javax.swing.JLabel lblManufacturedBy;
    private javax.swing.JLabel lblManufacturedDate;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblModelNumberErrMsg;
    private javax.swing.JLabel lblPlatformUsed;
    private javax.swing.JLabel lblSeatCapacity;
    private javax.swing.JLabel lblSeatCapacityErrMsg;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblSerialNumberErrMsg;
    private javax.swing.JLabel lblTitleSubHeading;
    private javax.swing.JTextField txtCityOfOperation;
    private javax.swing.JTextField txtMaintenanceCertExpDate;
    private javax.swing.JTextField txtManufacturedDate;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSeatCapacity;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

}

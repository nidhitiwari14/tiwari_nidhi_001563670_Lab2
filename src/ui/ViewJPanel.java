/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.CarFleet;
import model.Car;
/**
 *
 * @author nidhitiwari
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    CarFleet carFleetDetails;
    public ViewJPanel(CarFleet carFleetDetails) {
        initComponents();
        
        this.carFleetDetails = carFleetDetails;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewCarDetails = new javax.swing.JTable();
        btnViewCarDetails = new javax.swing.JButton();
        btnDeleteCarDetails = new javax.swing.JButton();
        txtLastUpdated = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblMaintenanceCertExpDate = new javax.swing.JLabel();
        txtModelNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSerialNum = new javax.swing.JTextField();
        chkboxAvailable = new java.awt.Checkbox();
        lblCarModelNum = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        lblCarSerialNum = new javax.swing.JLabel();
        txtManufacturedDate = new javax.swing.JTextField();
        lblCarManufacturer = new javax.swing.JLabel();
        txtSeatCapacity = new javax.swing.JTextField();
        lblManufacturedDate = new javax.swing.JLabel();
        txtUsedBy = new javax.swing.JTextField();
        lblSeatCapacity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblUsedBy = new javax.swing.JLabel();
        txtMaintenanceCertExpDate = new javax.swing.JTextField();
        lblLastUpdated = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("View Car Details");

        tblViewCarDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Model Number", "Serial Number", "Manufacturer", "Manufactured Date", "Seat Capacity", "Is Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewCarDetails);

        btnViewCarDetails.setText("View");

        btnDeleteCarDetails.setText("Delete");

        lblCity.setText("City:");

        lblMaintenanceCertExpDate.setText("Maintenance Certificate Expire Date:");

        txtModelNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNumActionPerformed(evt);
            }
        });

        jLabel2.setText("Is Available:");

        chkboxAvailable.setLabel("checkbox1");

        lblCarModelNum.setText("Model Number:");

        lblCarSerialNum.setText("Serial Number:");

        lblCarManufacturer.setText("Manufacturer:");

        lblManufacturedDate.setText("Manufactured Date:");

        lblSeatCapacity.setText("Seat Capacity:");

        lblUsedBy.setText("Used By App:");

        lblLastUpdated.setText("Last Updated:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewCarDetails)
                .addGap(34, 34, 34)
                .addComponent(btnDeleteCarDetails)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblManufacturedDate)
                                    .addComponent(lblCarSerialNum)
                                    .addComponent(lblCarModelNum)
                                    .addComponent(lblCarManufacturer)
                                    .addComponent(lblSeatCapacity)
                                    .addComponent(lblUsedBy)
                                    .addComponent(lblCity))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtModelNum)
                                    .addComponent(txtSerialNum)
                                    .addComponent(txtManufacturer)
                                    .addComponent(txtManufacturedDate)
                                    .addComponent(txtSeatCapacity)
                                    .addComponent(txtUsedBy)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMaintenanceCertExpDate)
                                    .addComponent(lblLastUpdated)
                                    .addComponent(jLabel2))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaintenanceCertExpDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLastUpdated, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkboxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 101, Short.MAX_VALUE)))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewCarDetails)
                    .addComponent(btnDeleteCarDetails))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarModelNum)
                    .addComponent(txtModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarSerialNum)
                    .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarManufacturer)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturedDate)
                    .addComponent(txtManufacturedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeatCapacity)
                    .addComponent(txtSeatCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsedBy)
                    .addComponent(txtUsedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaintenanceCertExpDate)
                    .addComponent(txtMaintenanceCertExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLastUpdated)
                    .addComponent(txtLastUpdated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(chkboxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCarDetails;
    private javax.swing.JButton btnViewCarDetails;
    private java.awt.Checkbox chkboxAvailable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarManufacturer;
    private javax.swing.JLabel lblCarModelNum;
    private javax.swing.JLabel lblCarSerialNum;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblLastUpdated;
    private javax.swing.JLabel lblMaintenanceCertExpDate;
    private javax.swing.JLabel lblManufacturedDate;
    private javax.swing.JLabel lblSeatCapacity;
    private javax.swing.JLabel lblUsedBy;
    private javax.swing.JTable tblViewCarDetails;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtLastUpdated;
    private javax.swing.JTextField txtMaintenanceCertExpDate;
    private javax.swing.JTextField txtManufacturedDate;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtModelNum;
    private javax.swing.JTextField txtSeatCapacity;
    private javax.swing.JTextField txtSerialNum;
    private javax.swing.JTextField txtUsedBy;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblViewCarDetails.getModel();
        model.setRowCount(0);
        
        for(Car c: carFleetDetails.getCarFleetDetails()) {
            Object [] row = new Object[6];
            row[0] = c.getModelNumber();
            row[1] = c.getSerialNumber();
            row[2] = c.getManufacturer();
            row[3] = c.getManufacturedDate();
            row[4] = c.getSeatCapacity();
            row[5] = c.isIsAvailable();
            
            model.addRow(row);
        }
        
    }
}

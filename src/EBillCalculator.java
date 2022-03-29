import javax.swing.JOptionPane;

public class EBillCalculator extends javax.swing.JFrame {

     // Creates new form EBillCalculator
    public EBillCalculator() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCustomerId = new javax.swing.JComboBox();
        cmbCustomerType = new javax.swing.JComboBox();
        txtFullname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblAlertCusId = new javax.swing.JLabel();
        lblAlertCusType = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNoofUnits = new javax.swing.JTextField();
        btnCalculateBill = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        lblAlertUnits = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblResultTotalUnitCharges = new javax.swing.JLabel();
        lblResultFuel = new javax.swing.JLabel();
        lblResultFixedCharge = new javax.swing.JLabel();
        lblResultTotalBill = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Bill Calculator - UWU/CST/18/013");
        setBackground(new java.awt.Color(186, 211, 236));

        jPanel1.setBackground(new java.awt.Color(170, 195, 202));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ECB Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Hobo Std", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setText("Customer Id");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel3.setText("Full Name");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel5.setText("Customer Type");

        cmbCustomerId.setFont(new java.awt.Font("Calisto MT", 0, 19)); // NOI18N
        cmbCustomerId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Customer ID--", "1", "2", "3", "4", "5", "6", "7", "8" }));
        cmbCustomerId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCustomerId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomerIdItemStateChanged(evt);
            }
        });

        cmbCustomerType.setFont(new java.awt.Font("Calisto MT", 0, 19)); // NOI18N
        cmbCustomerType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Customer Type--", "Domestic", "Business", "Public" }));
        cmbCustomerType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtFullname.setEditable(false);
        txtFullname.setFont(new java.awt.Font("Calisto MT", 0, 19)); // NOI18N

        txtAddress.setEditable(false);
        txtAddress.setFont(new java.awt.Font("Calisto MT", 0, 19)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("*");

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("*");

        lblAlertCusId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAlertCusId.setForeground(new java.awt.Color(153, 0, 0));

        lblAlertCusType.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAlertCusType.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFullname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbCustomerId, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCustomerType, 0, 333, Short.MAX_VALUE)
                    .addComponent(txtAddress)
                    .addComponent(lblAlertCusId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAlertCusType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(2, 2, 2)
                .addComponent(lblAlertCusId, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlertCusType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(170, 195, 202));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bill Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Hobo Std", 0, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel6.setText("No of Units");

        txtNoofUnits.setFont(new java.awt.Font("Calisto MT", 0, 19)); // NOI18N

        btnCalculateBill.setBackground(new java.awt.Color(16, 6, 89));
        btnCalculateBill.setFont(new java.awt.Font("Trajan Pro", 1, 20)); // NOI18N
        btnCalculateBill.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculateBill.setText("Calculate Bill Summary");
        btnCalculateBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalculateBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateBillActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("*");

        lblAlertUnits.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAlertUnits.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCalculateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlertUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(26, 26, 26)
                        .addComponent(txtNoofUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoofUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlertUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCalculateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(170, 195, 202));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ECB Bill Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Hobo Std", 0, 18))); // NOI18N
        jPanel3.setToolTipText("");
        jPanel3.setAutoscrolls(true);

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 19)); // NOI18N
        jLabel7.setText("Total Unit Charges");

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 19)); // NOI18N
        jLabel8.setText("Fuel Adjusments");

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 19)); // NOI18N
        jLabel9.setText("Fixed Charge");

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 19)); // NOI18N
        jLabel10.setText("Total Bill");

        lblResultTotalUnitCharges.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N

        lblResultFuel.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N

        lblResultFixedCharge.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N

        lblResultTotalBill.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultFixedCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultTotalUnitCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(358, 358, 358))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(lblResultTotalUnitCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResultFuel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(lblResultFixedCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResultTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(153, 0, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(1, 1, 49));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Electricity Bill Calculator");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    float totUnitCharge,fuel,fixedCharge,totBill; 
    int noofUnits;
    
    private void calculator(float perUnitCharge,float fuelAdj,float fixedCharge, int noofUnits){
        totUnitCharge=noofUnits*perUnitCharge;
        fuel=totUnitCharge*fuelAdj;        
        totBill=totUnitCharge+fuel+fixedCharge;
        
        lblResultTotalUnitCharges.setText("Rs. "+String.format("%.2f",totUnitCharge));
        lblResultFuel.setText(String.format("%.0f",fuelAdj*100)+"%");
        lblResultFixedCharge.setText("Rs. "+String.format("%.2f",fixedCharge));
        lblResultTotalBill.setText("Rs. "+String.format("%.2f",totBill));
            
    }
    private void btnCalculateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateBillActionPerformed
        
        lblAlertCusId.setText("");
        lblAlertCusType.setText("");
        lblAlertUnits.setText("");
        
        if(!(txtNoofUnits.getText().equals("") || cmbCustomerType.getSelectedIndex()<1 || cmbCustomerId.getSelectedIndex()<1)){
            String cusType=cmbCustomerType.getSelectedItem().toString();
            noofUnits=Integer.parseInt(txtNoofUnits.getText().trim());

            if(cusType.equals("Domestic"))
                calculator(24.20f,0f,540f,noofUnits);
            else if(cusType.equals("Business"))
                calculator(10.80f,0.1f,200f,noofUnits);
            else if(cusType.equals("Public"))
                calculator(12.40f,0.05f,350f,noofUnits);
        }
        else {
            if(cmbCustomerId.getSelectedIndex()<1){
                lblAlertCusId.setText("Please select the Customer Id");
                cmbCustomerId.requestFocus();
            }        
            if(cmbCustomerType.getSelectedIndex()<1){
                lblAlertCusType.setText("Please select the Customer Type");
                cmbCustomerType.requestFocus();
            }
            if (txtNoofUnits.getText().equals("")){
                lblAlertUnits.setText("Please enter the No of Units");
                txtNoofUnits.requestFocus();
            }
        }
             
    }//GEN-LAST:event_btnCalculateBillActionPerformed

    private void cmbCustomerIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomerIdItemStateChanged
        String name[]={"Thilan Navindra","Jeyasena Hettihewa","Harish Raj","Ifna Mohamath","Rahu Ram","Preetha Rohith","Geetha Siva","Haran Selva"};
        String address[]={"No 102, Kallagoda, Badulla","No 22, Riverside road, Badulla","No 32, Madu road, Mannar","No 120, Passara road, Badulla","Temple road, Jaffna","No 40, Linganagar, Trincomale","No 30, Station road, Jaffna","No 80, Stanly road, Jaffna"};

        int index=cmbCustomerId.getSelectedIndex();
         
        txtFullname.setText(name[index-1]);
        txtAddress.setText(address[index-1]);
        
        Clear();
    }//GEN-LAST:event_cmbCustomerIdItemStateChanged

    public void Clear(){
         lblResultTotalUnitCharges.setText("");
         lblResultFuel.setText("");
         lblResultFixedCharge.setText("");
         lblResultTotalBill.setText("");
         txtNoofUnits.setText("");     
    }
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EBillCalculator().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateBill;
    private javax.swing.JComboBox cmbCustomerId;
    private javax.swing.JComboBox cmbCustomerType;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAlertCusId;
    private javax.swing.JLabel lblAlertCusType;
    private javax.swing.JLabel lblAlertUnits;
    private javax.swing.JLabel lblResultFixedCharge;
    private javax.swing.JLabel lblResultFuel;
    private javax.swing.JLabel lblResultTotalBill;
    private javax.swing.JLabel lblResultTotalUnitCharges;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtNoofUnits;
    // End of variables declaration//GEN-END:variables
}

package ViewInvoice;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import ViewInvoice.Frame;
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
import DesignInvoice.InvoiceTBL;
import DesignInvoice.ItemDetails;
import InvoiceControl.Controller;
<<<<<<< HEAD
import static java.lang.Integer.parseInt;
=======
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
=======
import ViewInvoice.Frame;
import DesignInvoice.InvoiceTBL;
import DesignInvoice.ItemDetails;
import InvoiceControl.Controller;
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890

public class NewInvoiceCreation extends javax.swing.JFrame {

    public NewInvoiceCreation() {

        controller = new Controller(this);
        initComponents();
    }
    public int invoiceNum;
    public double Total;
<<<<<<< HEAD
<<<<<<< HEAD
    private int tableRow;

    public int getTableRow() {
        System.out.println("getter-----" + this.tableRow);
        return this.tableRow;
    }

    public void setTableRow(int N) {
        System.out.println("N" + N);
        this.tableRow = N;
        System.out.println("set" + getTableRow());

    }
=======
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
=======
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890

    public NewInvoiceCreation(Object object, boolean b) {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnadd = new java.awt.Button();
        btnadd.addActionListener(controller);
        btncancel = new java.awt.Button();
        btncancel.addActionListener(controller);
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Invoice");

        btnadd.setLabel("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btncancel.setLabel("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        label1.setText("Date");

        label2.setText("Customer Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText(" ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        label3.setText("(DD-MM-YYYY)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncancel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
<<<<<<< HEAD
        System.out.println("Frame invoices" + Frame.invoiceTBL.getRowCount());
        int rowCount = Frame.invoiceTBL.getRowCount();
        if (Frame.invoiceTBL.getRowCount() > 0) {
            String lastRowId = Frame.invoiceTBL.getValueAt(rowCount - 1, 0).toString();
            invoiceNum = parseInt(lastRowId) + 1;
        } else {
            invoiceNum = rowCount + 1;
        }

        Frame.invoiveNumlbl.setText(String.valueOf(invoiceNum));
        Frame.invoiceDatelbl.setText(jTextField1.getText());
        Frame.customerNamelbl.setText(jTextField2.getText());
        Frame.invoiceTotallbl.setText("0");

        Frame.ADDRowToJTable2(new Object[]{
            invoiceNum,
            jTextField1.getText(),
            jTextField2.getText(),
            Total

        });

        int returnedRow = getRowIndexesOfValue(invoiceNum);
        this.setTableRow(returnedRow);

        System.out.println("tableRow" + returnedRow);

        if (invoiceNum > 1) {
            Frame.itemTBL.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "No.", "Item Name", "Item Price", "Count", "Item Total"
                    }
            ));
        }
        btncancelActionPerformed(evt);


<<<<<<< HEAD
=======
=======

>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
        if (Frame.invoices != null) {
            invoiceNum = Frame.invoices.size() + 1;
        } else {
            invoiceNum = 1;
        }
        
        Frame.invoiveNumlbl.setText(String.valueOf(invoiceNum));
        Frame.invoiceDatelbl.setText(jTextField1.getText());
        Frame.customerNamelbl.setText(jTextField2.getText());
        Frame.invoiceTotallbl.setText("0");

        Frame.ADDRowToJTable2(new Object[]{
            invoiceNum,
            jTextField1.getText(),
            jTextField2.getText(),
            Total

        });
        
        btncancelActionPerformed(evt);
        
       for (InvoiceTBL invoice : Frame.invoices)
                if (invoice.getInvoiceItems()!= null) {
                    for (ItemDetails item : invoice.getInvoiceItems()) {
                        Total += item.getItemPrice() * item.getCount();
                    }}
       
       
        
        
        
        

       
        


<<<<<<< HEAD
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
    }//GEN-LAST:event_btnaddActionPerformed

    private int getRowIndexesOfValue(int value) {

        int rowNumbers = 0;

        for (int rowCount = 0; rowCount < Frame.invoiceTBL.getRowCount(); rowCount++) {
            for (int columnCount = 0; columnCount < Frame.invoiceTBL.getColumnCount(); columnCount++) {
                if (Frame.invoiceTBL.getValueAt(rowCount, columnCount).equals(value)) {
                    rowNumbers = rowCount;
                    break;
                }
            }
        }
        return rowNumbers;
    }
    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed

=======
    }//GEN-LAST:event_btnaddActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
        this.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
<<<<<<< HEAD
<<<<<<< HEAD
=======
        // TODO add your handling code here:
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
=======
        // TODO add your handling code here:
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
<<<<<<< HEAD
    }//GEN-LAST:event_jTextField2ActionPerformed

    public static void main(String args[]) {
       
=======
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewInvoiceCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewInvoiceCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewInvoiceCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewInvoiceCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
        java.awt.EventQueue.invokeLater(() -> {
            new NewInvoiceCreation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnadd;
    private java.awt.Button btncancel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
private Controller controller;

    public void add(InvoiceTBL invoiceTBL) {
    }

    public String getInvoiceDate() {

        return this.jTextField1.getText();
    }

    public String getCustomerName() {
        return this.jTextField2.getText();
    }

<<<<<<< HEAD
<<<<<<< HEAD
   
=======
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
=======
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
}

<<<<<<< HEAD
=======

>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
package ViewInvoice;

import DesignInvoice.InvoiceTBL;
import DesignInvoice.ItemDetails;
import InvoiceControl.Controller;
<<<<<<< HEAD
<<<<<<< HEAD
import static java.lang.Integer.parseInt;
=======
import java.util.ArrayList;

>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890

public class NewItemCreation extends javax.swing.JFrame {

    public String itemName;
    public double itemPrice;
=======
import java.util.ArrayList;


public class NewItemCreation extends javax.swing.JFrame {

  public String itemName;
  public double itemPrice;
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
<<<<<<< HEAD
    public int Count;

    public NewItemCreation() {
        controller = new Controller(this);

        initComponents();

=======
  public int Count;
  
  
    public NewItemCreation() {
        controller  = new Controller(this);
      
        initComponents();
       
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
    }

    public NewItemCreation(Object object, boolean b) {
    }

<<<<<<< HEAD
=======
   
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        addbtn.addActionListener(controller);
        cancelbtn = new javax.swing.JButton();
        cancelbtn.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Item");

        jLabel1.setText("Item Name");

        jLabel2.setText("Item Price");

        jLabel3.setText("count");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        addbtn.setText("Create");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
<<<<<<< HEAD
<<<<<<< HEAD
        int number = Integer.parseInt(jTextField2.getText()) * Integer.parseInt(jTextField3.getText());
=======
=======
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
    int number = Integer.parseInt(jTextField2.getText())*Integer.parseInt(jTextField3.getText());
     //double total = 0.0;
             

      //  Frame.invoiceTotallbl.setText(String.valueOf(number));
        Frame.ADDRowToJTable(new Object[]{
        
                                jTextField1.getText(),
                                jTextField2.getText(),
                                jTextField3.getText(),
                                number,
             
             });
       
   Frame.invoiceTotallbl.setText(String.valueOf(number));
   
    double total = 0.0;
   
                    
for (int count = 0; count < Frame.itemTBL.getRowCount(); count++){
  total+= Double.parseDouble (Frame.itemTBL.getValueAt(count, 3).toString());
}
            Frame.invoiceTotallbl.setText(String.valueOf(total));
        cancelbtnActionPerformed(evt);
<<<<<<< HEAD
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890

        Frame.ADDRowToJTable(new Object[]{
            jTextField1.getText(),
            jTextField2.getText(),
            jTextField3.getText(),
            number,});

        Frame.invoiceTotallbl.setText(String.valueOf(number));

        double total = 0.0;

        for (int count = 0; count < Frame.itemTBL.getRowCount(); count++) {
            total += Double.parseDouble(Frame.itemTBL.getValueAt(count, 3).toString());

        }

        int returnedRow = getRowIndexesOfValue(parseInt(Frame.invoiveNumlbl.getText()));
        System.out.println("here returnedRow " + returnedRow);

        Frame.invoiceTotallbl.setText(String.valueOf(total));
        Frame.invoiceTBL.setValueAt(total, returnedRow, 3);

        cancelbtnActionPerformed(evt);
=======

>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890

                
    }//GEN-LAST:event_addbtnActionPerformed

<<<<<<< HEAD
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

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_cancelbtnActionPerformed

    public static void main(String args[]) {

=======
    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
       
                this.setVisible(false);

    }//GEN-LAST:event_cancelbtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewItemCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewItemCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewItemCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewItemCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewItemCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
 private Controller controller;
<<<<<<< HEAD

=======
    

    
        
    
>>>>>>> 18013b1476892a8aad00f612905c1dfc9e9b6890
}

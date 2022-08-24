package InvoiceControl;

import DesignInvoice.InvoiceTBL;
import DesignInvoice.ItemDetails;
import ViewInvoice.Frame;
import ViewInvoice.NewInvoiceCreation;
import ViewInvoice.NewItemCreation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Actions implements ActionListener {
    
    private Frame frame;
    private NewItemCreation item;
    private NewInvoiceCreation invoice;



    public Actions(Frame frame) {
        this.frame = frame;
        this.invoice = new NewInvoiceCreation();
    }
        
       
        public Actions(NewInvoiceCreation invoice){
        this.invoice = invoice;
            
    }
    
       
        public Actions(NewItemCreation item){
        this.item = item;
            
    }
       
    
    
   
    
    
   
    

    @Override
    public void actionPerformed(ActionEvent e) {


        switch (e.getActionCommand()) {

            case "Create New Invoice":
                newInvoice();
                break;

            case "Delete Invoice":
                deleteInvoice();
                break;

            case "Save":
                saveItem();
                break;

            case "Cancel":
                cancelItem();
                break;

            case "Load Files":
                loadFiles();
                break;

            case "Save Files":
            

            case "Add":
                    addInvoice();
                    break;
                    
            case "cancel":
                cancelAddInvoice();
                break;
            case "Create":
                addItem();
                break;
                    
        }
    }

    private void newInvoice() {
        //JOptionPane.showInputDialog(invoice);
    }

    private void deleteInvoice() {
        
    }

    private void saveItem() {
   
          
    }

    private void cancelItem() {
    }

    private void loadFiles() 
    {JFileChooser file=new JFileChooser();
        int result= file.showSaveDialog(frame);
        if(result == JFileChooser.APPROVE_OPTION){
            
                String path = file.getSelectedFile().getPath();
                try {
                FileOutputStream fos=null;
                fos=new FileOutputStream(path);
               // int size = fos.avalible();
                byte[] b= new byte[Integer.SIZE]; 
               //  fos.read(b);
                  
            } catch (FileNotFoundException e) {
            } catch (IOException e) {
             //   Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                }
    }

    private void saveFiles() {
        try {
            JFileChooser file2=new JFileChooser();
            int result= file2.showSaveDialog(frame);
            String path = file2.getSelectedFile().getPath();
            FileOutputStream fos=null;
            fos=new FileOutputStream(path);
            //   int size = fos.avalible();
            //if(result == JFileChooser.APPROVE_OPTION){
            
            //  String path = file.getSelectedFile().getPath();
            //  try {
            //   FileOutputStream fos=null;
            //  fos=new FileOutputStream(path);
            // int size = fos.avalible();
            // byte[] b= new byte[Integer.SIZE];
            //  fos.read(b);
            
            
            // } catch (FileNotFoundException e) {
            //} catch (IOException e) {
            //   Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
            //}
            
            
            //  }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addInvoice() {
    }

    private void cancelAddInvoice() {
    }

    private void addItem() {
    }
}
package InvoiceControl;

import DesignInvoice.InvoiceTBL;
import DesignInvoice.ItemDetails;
import ViewInvoice.Frame;

import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class MouseHandler extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        int selectedInvoice = Frame.invoiceTBL.getSelectedRow() + 1;
        ArrayList<ItemDetails> invoiceItems;
        for (InvoiceTBL invoice : Frame.invoices) {
            if (invoice.getInvoiceNum() == selectedInvoice) {

                Frame.invoiveNumlbl.setText(String.valueOf(invoice.getInvoiceNum()));
                Frame.invoiceDatelbl.setText(sdf.format(invoice.getInvoiceDate()));
                Frame.customerNamelbl.setText(invoice.getCustomerName());
                double total = 0.0;
                if (invoice.getInvoiceItems()!= null) {
                    for (ItemDetails item : invoice.getInvoiceItems()) {
                        total += item.getItemPrice() * item.getCount();
                    }

                    Frame.invoiceTotallbl.setText(String.valueOf(total));
                    invoiceItems = invoice.getInvoiceItems();
                    Object[][] table2Data = getInvoiceItemsTableData(invoiceItems);
                    Frame.itemTBL.setModel(new DefaultTableModel(table2Data,
                            new String[]{"No.", "Item Name", "Item Price", "Count", "Item Total"}));
                } else {
                    Frame.invoiceTotallbl.setText(String.valueOf(total));

                    Frame.itemTBL.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][]{

                            },
                            new String[]{
                                    "No.", "Item Name", "Item Price", "Count", "Item Total"
                            }
                    ));

                    Frame.itemTBL.setModel(new DefaultTableModel(new Object[][]{},
                            new String[]{"No.", "Item Name", "Item Price", "Count", "Item Total"}));

                }

            }
        }
    }

    // Helper Method
    private Object[][] getInvoiceItemsTableData(ArrayList<ItemDetails> items) {

        Object[][] tableData = new Object[items.size()][5];
        for (int i = 0; i < items.size(); i++) {
            tableData[i][0] = items.get(i).getInvoice().getInvoiceNum();
            tableData[i][1] = items.get(i).getItemName();
            tableData[i][2] = items.get(i).getItemPrice();
            tableData[i][3] = items.get(i).getCount();
            double itemTotal = items.get(i).getItemPrice() * items.get(i).getCount();
            tableData[i][4] = itemTotal;

        }

        return tableData;

    }

}


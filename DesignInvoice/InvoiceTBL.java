
package DesignInvoice;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;


public class InvoiceTBL {
    private int num;
    private String name;
    private Date date;
    private ArrayList<ItemDetails> item;
 //   Connection con;
    
    public void Connect(){
   
   
    }

    public InvoiceTBL(int num, String name, Date date) {
        this.num = num;
        this.name = name;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ItemDetails> getItem() {
        if (item == null){
            item=new ArrayList();
        }

        return item;
    }

    public void setItem(ArrayList<ItemDetails> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "InvoiceTBL{" + "num=" + num + ", name=" + name + ", date=" + date + ", item=" + item + '}';
    }
    public double getTotal(){
        double total=0.0;
     for(ItemDetails Ditem :getItem()){
        total += Ditem.getTotal();
    }
     return total;
  
    
}}

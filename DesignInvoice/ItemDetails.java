
package DesignInvoice;

public class ItemDetails {
    private InvoiceTBL inv;
    private int num;
    private String name;
    private int count;
    private double price;

    public ItemDetails(InvoiceTBL inv, int num, String name, int count, double price) {
        this.inv = inv;
        this.num = num;
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InvoiceTBL getInv() {
        return inv;
    }

    public void setInv(InvoiceTBL inv) {
        this.inv = inv;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ItemDetails{" + "num=" + num + ", name=" + name + ", count=" + count + ", price=" + price + '}';
    }
    
    public double getTotal(){
        return count*price;
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
                 
            
}

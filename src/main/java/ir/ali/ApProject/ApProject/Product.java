package ir.ali.ApProject.ApProject;

public class Product {
    private static int n = 1;
    public int ID;
    public String category;
    public String subject;
    public String description;
    public String price;
    public Boolean isStar;
    public String photoLink;
    public String sellerID;
    public String buyerID;

    public Product() {
        //set ID
        n++;
        ID = n;
    }
    public Product(boolean lol)
    {

    }
    public void setCategory(String category) {
        this.category = category;

    }

    public void setInfo(String Subject, String Description, String Price, Boolean IsStar, String PhotoLink) {
        //set main information's about product
        this.subject = Subject;
        this.description = Description;
        this.price = Price;
        this.isStar = IsStar;
        this.photoLink = PhotoLink;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public void setBuyerID(String buyerID) {
        this.buyerID = buyerID;
    }
}

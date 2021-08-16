package MarketPriceHandler;

public class SharePriceData {

    public SharePriceData(int anID, String aCurrency, float aPrice1, float aPrice2, String aDate){
        this.ID = anID;
        this.currency = aCurrency;
        this.price1 = aPrice1;
        this.price2 = aPrice2;
        this.date = aDate;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setPrice1(float price1) {
        this.price1 = price1;
    }

    public float getPrice1() {
        return price1;
    }

    public void setPrice2(float price2) {
        this.price2 = price2;
    }

    public float getPrice2() {
        return price2;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }


    public String toString(){

        return ID + "," + currency + "," + price1 + "," + price2 + "," + date;
    }

    private int ID;
    private String currency;
    private float price1;
    private float price2;
    private String date;
}

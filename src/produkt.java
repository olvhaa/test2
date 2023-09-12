public class produkt {
    private String name;
    private double prize;
    private String category;
    private int ammount;
    private int VAT;
    private int brutto;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public produkt() {
    }

    public produkt(String name, double prize, String category, int ammount, int VAT) {
        this.name = name;
        this.prize = prize;
        this.category = category;
        this.ammount = ammount;
        this.VAT = VAT;
    }

    public String getName() {
        return name;
    }

    public double getPrize() {
        return prize;
    }

    public String getCategory() {
        return category;
    }

    public int getAmmount() {
        return ammount;
    }
    public double countPriceVAT() {
        double priceVAT = 0;
        priceVAT = this.prize * (100 + this.VAT)/100;
        return priceVAT;
    }
    public double countValuePriceBrutto(){
        double priceBrutto = 0;
        priceBrutto = this.ammount * countPriceVAT();
        return priceBrutto;
    }

    @Override
    public String toString() {
        return "produkt{" +
                "name='" + name + '\'' +
                ", prize=" + prize +
                ", category='" + category + '\'' +
                ", ammount=" + ammount +
                ", VAT=" + VAT +
                ", brutto=" + brutto +
                '}';
    }
}

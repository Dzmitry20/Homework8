package academy.belhard;

public class Address {
    private  String town;
    private  String street;
    private  int number;

     Address( String town, String street, int number) {
         this.town = town;
         this.street = street;
         this.number = number;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "town= " + town +
                ", street= " + street +
                ", number=" + number +
                '}';
    }
}


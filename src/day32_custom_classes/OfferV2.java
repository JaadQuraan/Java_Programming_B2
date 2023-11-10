package day32_custom_classes;

public class OfferV2 {

    //5 instance variables
    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public OfferV2(String company, String location){
        this.company = company;
        this.location = location;
    }

    public OfferV2(String company, String location, double salary, boolean isFullTime, int numberOfPTO){
        this(company,location);
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }
    public String toString() {
        return company + " located in: " + location +
                "\nPays: $" + salary + " salary and provides " + numberOfPTO + " days PTO " +
                "\nThis is a full time position: " + isFullTime;

    }
}



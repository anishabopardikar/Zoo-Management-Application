package org.example;


public class Attraction extends Attraction_Abstract {
    private int attractionId;
    private String name;
    private double ticketPrice;
    private String description;
    int count=0;
    private String status;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getI() {
        return count;
    }

    public void setI(int count) {
        this.count = count;
    }

    public static int getAttractionId(Attraction attraction) {
        return attraction.attractionId;
    }

    public void setAttractionId(int attractionId) {
        this.attractionId = attractionId;
    }

    public Attraction(String name, String description , double ticketPrice,String status) {
        this.attractionId = count++;
        this.name = name;
        this.description=description;
        this.ticketPrice=ticketPrice;
        this.status=status;
    }



}

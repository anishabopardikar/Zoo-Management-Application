package org.example;

import org.w3c.dom.Attr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin {
    private static final String username = "admin";
    private static final String password = "password";

    public static String getUsername() {
        return username;
    }
    public static String getPassword(){
        return password;
    }
    public static List<Attraction> getAttraction_list() {
        return attraction_list;
    }

    public static void setAttraction_list(List<Attraction> attraction_list) {
        Admin.attraction_list = attraction_list;
    }
    //Manage attractions
    public static HashMap<Integer, Attraction> attractions = new HashMap<>();
    static List<Attraction> attraction_list= new ArrayList<>();
    public static void addAttraction(String name, String description, double ticketPrice,String status){
            Attraction attraction=new Attraction(name,description,ticketPrice,status);
            attractions.put(Attraction.getAttractionId(attraction), attraction);
            attraction_list.add(attraction);
            System.out.println("Attraction added successfully.");
    }
    public static void viewAttraction(){
        System.out.println("Attractions in the Zoo: ");
        int i=1;
        for(Attraction attraction:attraction_list){
            System.out.println(i++ +". | "+attraction.getName()+"| Rs."+attraction.getTicketPrice()+"|Status: "+attraction.getStatus());
        }

    }
    public static void modifyAttraction(int attractionId,String new_name,String new_description,double new_ticketPrice,String status){
        Attraction attraction=attractions.get(attractionId);
        if (attraction != null) {
            attraction.setName(new_name);
            attraction.setDescription(new_description);
            attraction.setTicketPrice(new_ticketPrice);
            System.out.println("Attraction modified successfully.");
        } else {
            System.out.println("Attraction with ID " + attractionId + " not found.");
        }
    }
    public static void remove_Attraction(int attractionId){
        Attraction attraction=attractions.get(attractionId);
        if (attraction != null) {
            attraction_list.remove(attraction);
            System.out.println("Attraction removed successfully.");
        } else {
            System.out.println("Attraction with ID " + attractionId + " not present.");
        }
    }

    //Manage Animals

    public static HashMap<String,Animal> animals = new HashMap<>();
    public static HashMap<String,Mammal> mammals = new HashMap<>();
    public static HashMap<String,Amphibian> amphibians = new HashMap<>();
    public static HashMap<String,Reptile> reptiles = new HashMap<>();



    static List<Animal> animals_list= new ArrayList<>();
    static List<Mammal> mammals_list= new ArrayList<>();
    static List<Amphibian> amphibians_list= new ArrayList<>();
    static List<Reptile> reptiles_list= new ArrayList<>();

    public static void add_animals(String name,String type,String sound,String info){

        if(type.equals("Mammal")){

            Mammal mammal=new Mammal(name,sound,info);
            animals.put(name,mammal);
            mammals.put(name,mammal);
            animals_list.add(mammal);
            mammals_list.add(mammal);
            System.out.println("Animal added to Zoo.");
        }
        else if(type.equals("Amphibian")){
            Amphibian amphibian=new Amphibian(name, sound, info);
            animals.put(name,amphibian);
            amphibians.put(name,amphibian);
            animals_list.add(amphibian);
            amphibians_list.add(amphibian);
            System.out.println("Animal added to Zoo.");
        }
        else if(type.equals("Reptile")){
            Reptile reptile=new Reptile(name, sound, info);
            animals.put(name,reptile);
            reptiles.put(name,reptile);
            animals_list.add(reptile);
            reptiles_list.add(reptile);
            System.out.println("Animal added to Zoo.");
        }else{
            System.out.println("Invalid Animal Type. ");
        }
    }
    public static void update_animals(String name,String type,String new_name,String new_type,String sound,String info){
        if(animals.containsKey(name)) {
            if (new_type.equals("Mammal")) {
                if (type.equals("Mammal")) {
                    Mammal m = mammals.get(name);
                    mammals.remove(name);
                    mammals_list.remove(m);
                    animals.remove(name);
                    animals_list.remove(m);
                }
                Mammal mammal = new Mammal(name, sound, info);
                mammals.put(name, mammal);
                animals.put(name, mammal);
                animals_list.add(mammal);
                mammals_list.add(mammal);
                System.out.println("Animal Updated to Zoo.");

            } else if (new_type.equals("Amphibian")) {
                if (type.equals("Amphibian")) {
                    Amphibian a = amphibians.get(name);
                    amphibians.remove(name);
                    amphibians_list.remove(a);
                    animals.remove(name);
                    animals_list.remove(a);
                }
                Amphibian amphibian = new Amphibian(name, sound, info);
                amphibians.put(name, amphibian);
                animals.put(name, amphibian);
                animals_list.add(amphibian);
                amphibians_list.add(amphibian);
                System.out.println("Animal updated to Zoo.");

            } else if (new_type.equals("Reptile")) {
                if (type.equals("Reptile")) {
                    Reptile r = reptiles.get(name);
                    reptiles.remove(name);
                    reptiles_list.remove(r);
                    animals.remove(name);
                    animals_list.remove(r);
                }

                Reptile reptile = new Reptile(name, sound, info);
                animals.put(name, reptile);
                reptiles.put(name, reptile);
                animals_list.add(reptile);
                reptiles_list.add(reptile);
                System.out.println("Animal updated to Zoo.");

            } else {
                System.out.println("Invalid Animal Type. ");
            }
        }
        else {
            System.out.println("Invalid Animal Name. ");
        }
    }
    public static void remove_animals(String name,String type){
        if(animals.containsKey(name)) {
            if (type.equals("Mammal")) {
                if (mammals != null) {
                    Mammal m = mammals.get(name);
                    mammals.remove(name);
                    mammals_list.remove(m);
                    animals.remove(name);
                    animals_list.remove(m);
                    System.out.println("Animal Removed.");

                }
            } else if (type.equals("Amphibian")) {
                if (amphibians != null) {
                    Amphibian a = amphibians.get(name);
                    amphibians.remove(name);
                    amphibians_list.remove(a);
                    animals.remove(name);
                    animals_list.remove(a);
                    System.out.println("Animal Removed.");
                }

            } else if (type.equals("Reptile")) {
                if (amphibians != null) {
                    Reptile r = reptiles.get(name);
                    reptiles.remove(name);
                    reptiles_list.remove(r);
                    animals.remove(name);
                    animals_list.remove(r);
                    System.out.println("Animal Removed.");
                }
                else{
                    System.out.println("Invalid Animal Type. ");
                }

            }
        }
        else{
            System.out.println("Invalid Animal Name. ");
        }

    }

    public static void view_animals(){
        System.out.println("Animals in the Zoo: ");
        //modify printing
        int i=1;
        for(Mammal mammal:mammals_list){
            System.out.println(i++ +". | "+mammal.getName()+"| Type: "+mammal.getType());
        }int j=1;
        int k=1;
        for(Amphibian amphibian:amphibians_list){
            System.out.println(j++ +". | "+amphibian.getName()+"| Type: "+amphibian.getType());
        }
        for(Reptile reptile:reptiles_list){
            System.out.println(k++ +". | "+reptile.getName()+"| Type: "+reptile.getType());
        }
    }


    //set  disconts
    public static HashMap<String,Discount> discounts = new HashMap<>();
    static List<Discount> discount_list=new ArrayList<Discount>();
    //static List<String> codes_list=new ArrayList<String>();


    public static void add_discount(String category,int percentage){
        String code= category.toUpperCase()+ percentage;

        Discount discount=new Discount(category,code,percentage);

        discounts.put(code,discount);
        discount_list.add(discount);

        System.out.println("Discount added successfully.");
    }
    public static void modify_discount(String category,String new_category,int new_percentage){
        if (discount_list.isEmpty() != true) {
            Discount discount =discounts.get(category);

            discounts.remove(category);
            String code= new_category.toUpperCase()+ new_percentage;
            Discount d=new Discount(new_category,code,new_percentage);
            discounts.put(code,d);
            discount_list.remove(discount);
            discount_list.add(d);
            System.out.println("Discount modified successfully.");
        } else {
            System.out.println(" Discount with category '" + category + "' not found.");
        }
    }
    public static void remove_discount(String category){
        if (discount_list.isEmpty() != true) {
            Discount discount =discounts.get(category);
            discounts.remove(category);
            discount_list.remove(discount);
            System.out.println("Discount removed successfully.");
        }
        else {
            System.out.println(" Discount with category '" + category + "' not found.");
        }
    }
    public static void view_discounts(){
        System.out.println("Discounts in the Zoo: ");
        int i=1;
        for(Discount discount:discount_list){
            System.out.println(i++ +". | "+discount.getCategory()+"| Rs."+discount.getPercentage()+"|Status: "+discount.getCode());
        }

    }
    //Set deals
    public static HashMap<Integer,Integer> deals = new HashMap<>();
    static List<Integer> deals_list=new ArrayList<Integer>();
    public static void add_deal(int deal,int discount){

        deals.put(deal, discount );
        deals_list.add(deal);
        System.out.println("Deal added successfully.");
    }
    public static void remove_deal(int deal){
        if (deals_list.isEmpty() != true) {
            deals.remove(deal);
            deals_list.remove(deal);
            System.out.println("Deal removed successfully.");
        }
        else {
            System.out.println(" Deal not found.");
        }
    }
    //view visitor stats
    //feedback

    /////////VISITOR//////////

    public static HashMap<String,Visitor> visitors = new HashMap<>();
    static List<Visitor> visitors_list=new ArrayList<Visitor>();


    public static void add_visitor(String membership,Visitor visitor){
        visitors.put(membership,visitor);
        visitors_list.add(visitor);
    }

    public static double basic (String membership,String email,String code,int age){
        Visitor v=visitors.get(email);
        v.setMembership(membership);
        double balance;
        if(discounts.containsKey(code)){
            Discount d=discounts.get(code);
            balance = v.getBalance() - (20 - ((double) (20 * d.getPercentage()) / 100));
        }else {
            balance = v.getBalance() - 20;
        }
        if(code.equals("SENIOR20")||code.equals("MINOR10")) {
            if (age < 18) {
                balance = balance - (10 * balance / 100);
            }
            if (age > 60) {
                balance = balance - (20 * balance / 100);
            }
        }

        if(discounts.containsKey(code)){
            Discount d=discounts.get(code);
            balance = balance - ((double) (balance * d.getPercentage()) / 100);
        }
        v.setBalance(balance);
        return balance;
    }
    public static double premium(String membership,String email,String code,int age){
        Visitor v=visitors.get(email);
        v.setMembership(membership);
        double balance;
        if(discounts.containsKey(code)){
            Discount d=discounts.get(code);
            balance = v.getBalance() - (50 - ((double) (50 * d.getPercentage()) / 100));
        }else {
            balance = v.getBalance() - 50;
        }
        if(code.equals("SENIOR20")||code.equals("MINOR10")) {
            if (age < 18) {
                balance = balance - (10 * balance / 100);
            }
            if (age > 60) {
                balance = balance - (20 * balance / 100);
            }
        }
        if(discounts.containsKey(code)){
            Discount d=discounts.get(code);
            balance = balance - ((double) (balance * d.getPercentage()) / 100);
        }
        v.setBalance(balance);

        return balance;

    }
    public static double buy_ticket(Attraction attraction,int age,String code){
        double balance;

        if(attraction.getStatus().equals("Open")){
            balance=attraction.getTicketPrice();
        }else{
            balance=0;
        }
        if(code.equals("SENIOR20")||code.equals("MINOR10")) {
            if (age < 18) {
                balance = balance - (10 * balance / 100);
            }
            if (age > 60) {
                balance = balance - (20 * balance / 100);
            }
        }
        if(discounts.containsKey(code)) {
            Discount d = discounts.get(code);
            balance = balance - ((double) (balance * d.getPercentage()) / 100);
        }

        return balance;
    }

    public static void view_deals(){

        System.out.println("Deals in the Zoo: ");
        int i=1;
        for(Integer deal:deals_list){
            System.out.println(i++ +". Buy "+deal+" tickets and get "+deals.get(deal)+"% off");
        }
    }
    public static void view_visitors(double revenue){
        System.out.println("Visitor Statistics: ");
        System.out.println("Total Visitors: "+visitors.size());
        System.out.println("- Total Revenue: Rs."+revenue);

    }
    public static void view_feedback(){
        System.out.println("Feedbacks: ");
        int i=1;
        for(Visitor visitor:visitors_list){
            System.out.println(i++ +". "+visitor.getName()+"| "+visitor.getFeedback());
        }
    }
    public static void  add_feedback(String Feedback,String email) {
        Visitor v = visitors.get(email);
        v.setFeedback(Feedback);
    }
    public static double  special_deals(int tickets,double balance) {
        if(deals.containsKey(tickets)){
            System.out.println("You get "+deals.get(tickets)+"% off");
            balance=balance-((double)(deals.get(tickets)*balance)/100);
        }
        return balance;
    }
    public static double  check_discount(int tickets,double balance) {
        if(deals.containsKey(tickets)){
            System.out.println("You get "+deals.get(tickets)+"% off");
            balance=balance-((double)(deals.get(tickets)*balance)/100);
        }
        return balance;
    }

}

package org.example;
//System.out.println("");

import java.util.HashMap;
import java.util.Scanner;

import static org.example.Admin.*;

public class Main {
    public static void main(String[] args) {
        double revenue = 0;
        System.out.println("Welcome to ZOOtopia!");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("1. Enter as Admin\n" +
                    "2. Enter as a Visitor\n" +
                    "3. View Special Deals\n" +
                    "\nEnter your choice: ");
            int option1 = sc.nextInt();
            if (option1 == 1) {
                System.out.print("Enter Admin Username: ");
                String username = sc.next();
                System.out.print("Enter Admin Password: ");
                String password = sc.next();
                System.out.println("\nLogged in as Admin.");
                while (true) {
                    System.out.print("Admin Menu:\n" +
                            "1. Manage Attractions\n" +
                            "2. Manage Animals\n" +
                            "3. Schedule Events\n" +
                            "4. Set Discounts\n" +
                            "5. Set Special Deal\n" +
                            "6. View Visitor Stats\n" +
                            "7. View Feedback\n" +
                            "8. Exit\n" +
                            "\n" +
                            "Enter your choice: ");
                    int option2 = sc.nextInt();
                    System.out.println();
                    if (option2 == 1) {
                        while (true) {
                            System.out.print("Manage Attractions:\n" +
                                    "1. Add Attraction\n" +
                                    "2. View Attractions\n" +
                                    "3. Modify Attraction\n" +
                                    "4. Remove Attraction\n" +
                                    "5. Exit\n" +
                                    "\n" +
                                    "Enter your choice: \n");
                            int option3 = sc.nextInt();
                            System.out.println();

                            if (option3 == 1) {
                                System.out.print("Enter Attraction Name: ");
                                String name = sc.next();
                                System.out.print("Enter Attraction Description: ");
                                String description = sc.next();
                                System.out.print("Enter Attraction Ticket Price: ");
                                double ticketPrice = sc.nextDouble();
                                System.out.print("Enter Attraction Open/Closed: ");
                                String status = sc.next();
                                Admin.addAttraction(name, description, ticketPrice, status);
                                System.out.println("Attraction added successfully.");
                            } else if (option3 == 2) {
                                if (attraction_list.isEmpty() == true) {
                                    System.out.println("No Attractions Added");
                                } else {
                                    Admin.viewAttraction();
                                }

                            } else if (option3 == 3) {
                                if (attraction_list.isEmpty() == true) {
                                    System.out.println("No Attractions Added");
                                } else {

                                    System.out.print("Enter Attraction ID: ");
                                    int id = sc.nextInt();
                                    System.out.print("Enter New Attraction Name: ");
                                    String name = sc.next();
                                    System.out.print("Enter New Attraction Description: ");
                                    String description = sc.next();
                                    System.out.print("Enter New Attraction Ticket Price: ");
                                    double ticketPrice = sc.nextDouble();
                                    System.out.print("Enter Attraction Open/Closed: ");
                                    String status = sc.next();
                                    Admin.modifyAttraction(id, name, description, ticketPrice, status);
                                }


                            } else if (option3 == 4) {
                                System.out.print("Enter Attraction ID: ");
                                int id = sc.nextInt();
                                Admin.remove_Attraction(id);

                            } else if (option3 == 5) {
                                break;
                            } else {
                                System.out.println("Invalid Input");
                            }
                        }

                    } else if (option2 == 2) {
                        Boolean exit2 = true;
                        while (exit2) {
                            System.out.println("Manage Animals:\n" +
                                    "1. Add Animal\n" +
                                    "2. Update Animal Details\n" +
                                    "3. Remove Animal\n" +
                                    "4. Exit\n" +
                                    "\n" +
                                    "Enter your choice: ");
                            int option9 = sc.nextInt();
                            System.out.println();

                            if (option9 == 1) {
                                System.out.println("Enter Animal Name: ");
                                String name = sc.next();
                                System.out.println("Enter Animal Type: ");
                                String type = sc.next();
                                System.out.println("Enter Animal Sound: ");
                                String sound = sc.next();
                                System.out.println("Enter Animal info: ");
                                String info = sc.next();
                                Admin.add_animals(name, type,sound,info);

                            } else if (option9 == 2) {

                                System.out.println("Enter Animal Name: ");
                                String name = sc.next();
                                System.out.println("Enter Animal Type: ");
                                String type = sc.next();
                                System.out.println("Enter New Animal Name: ");
                                String new_name = sc.next();
                                System.out.println("Enter New Animal Type: ");
                                String new_type = sc.next();
                                System.out.println("Enter New Animal Sound: ");
                                String new_sound = sc.next();
                                System.out.println("Enter New Animal info: ");
                                String new_info = sc.next();

                                Admin.update_animals(name, type, new_name, new_type,new_sound,new_info);

                            } else if (option9 == 3) {
                                System.out.println("Enter Animal Name: ");
                                String name = sc.next();
                                System.out.println("Enter Animal Type: ");
                                String type = sc.next();
                                Admin.remove_animals(name, type);
                            } else if (option9 == 4) {
                                System.out.println("Exit");
                                break;
                            } else {

                            }

                        }

                    } else if (option2 == 3) {
                        if (attraction_list.isEmpty() == true) {
                            System.out.println("No Attractions Added");
                        } else {
                            Admin.viewAttraction();
                            System.out.print("Enter Attraction ID to Open /Close event: ");
                            int option12 = sc.nextInt();
                            System.out.println("Enter Attraction name  Open or Close event: ");
                            String name = sc.next();
                            Attraction a = attractions.get(name);
                            if (a.getStatus().equals("Open")) {
                                a.setStatus("Closed");
                                System.out.println("Event Closed");
                            } else {
                                a.setStatus("Open");
                                System.out.println("Event Opened");
                            }
                        }
                    } else if (option2 == 4) {
                        while (true) {
                            System.out.println("Set Discounts:\n" +
                                    "1. Add Discount\n" +
                                    "2. Modify Discount\n" +
                                    "3. Remove Discount\n" +
                                    "4. Exit\n" +
                                    "\n" +
                                    "Enter your choice: ");
                            int option4 = sc.nextInt();
                            System.out.println();
                            if (option4 == 1) {
                                System.out.println("Enter Discount Category: ");
                                String category = sc.next();
                                System.out.println("Enter Discount Percentage (e.g., 20 for 20%): ");
                                int percentage = sc.nextInt();
                                Admin.add_discount(category, percentage);
                            } else if (option4 == 2) {
                                System.out.println("Enter Discount Category: ");
                                String category = sc.next();
                                System.out.println("Enter New Discount Category: ");
                                String new_category = sc.next();
                                System.out.println("Enter New Discount Percentage (e.g., 20 for 20%): ");
                                int new_percentage = sc.nextInt();
                                Admin.modify_discount(category, new_category, new_percentage);

                            } else if (option4 == 3) {
                                System.out.println("Enter Discount Category: ");
                                String category = sc.next();
                                Admin.remove_discount(category);
                            } else if (option4 == 4) {
                                break;
                            } else {
                                System.out.println("Invalid Input");
                            }
                        }
                    } else if (option2 == 5) {
                        while (true) {
                            System.out.println("Set Special Deals:\n" +
                                    "1. Add Deal\n" +
                                    "2. Remove Deal\n" +
                                    "3. Exit\n" +
                                    "\n" +
                                    "Enter your choice: ");
                            int option5 = sc.nextInt();
                            System.out.println();
                            if (option5 == 1) {
                                System.out.println("Enter on how many  no. of attraction purchase, deal will be applicable: ");
                                int deal = sc.nextInt();
                                System.out.println("Enter Discount Percentage (e.g., 20 for 20%): ");
                                int discount = sc.nextInt();
                                Admin.add_deal(deal, discount);
                            } else if (option5 == 2) {
                                System.out.println("Enter on how many  no. of attraction purchase, deal was applicable: ");
                                int deal = sc.nextInt();
                                Admin.remove_deal(deal);
                            } else if (option5 == 3) {
                                break;
                            } else {
                                System.out.println("Invalid Input");
                            }
                        }
                    } else if (option2 == 6) {
                        System.out.println("View Visitor Stats");
                        Admin.view_visitors(revenue);

                    } else if (option2 == 7) {
                        System.out.println("View Feedback");
                        Admin.view_feedback();

                    } else if (option2 == 8) {
                        break;
                    } else {
                        System.out.println("Invalid Input");
                    }
                }

            } else if (option1 == 2) {
                while (true) {
                    System.out.println("1. Register\n" +
                            "2. Login\n" +
                            "3. Exit" +"\n"+
                            "Enter your choice: ");
                    int option6 = sc.nextInt();
                    System.out.println();
                    if (option6 == 1) {
                        System.out.print("Enter Visitor Name: ");
                        String name = sc.next();
                        System.out.print("Enter Visitor Age: ");
                        int age = sc.nextInt();
                        System.out.print("Enter Visitor Phone Number: ");
                        String phone = sc.next();
                        System.out.print("Enter Visitor Balance: ");
                        double balance = sc.nextDouble();
                        System.out.print("Enter Visitor Email: ");
                        String email = sc.next();
                        System.out.print("Enter Visitor Password: ");
                        String password = sc.next();


                        Visitor visitor = new Visitor(name, age, phone, balance, email, password, null);
                        Admin.add_visitor(email, visitor);
                        System.out.println("\nRegistration is successful.");


                    } else if(option6==3){
                        break;
                    }
                    else if (option6 == 2) {
                        System.out.print("Enter Visitor Email: ");
                        String email = sc.next();
                        System.out.print("Enter Visitor Password: ");
                        String password = sc.next();
                        if (visitors.containsKey(email)) {
                            System.out.println("\nLogin Successful.");
                            while (true) {

                                System.out.print("Visitor Menu:\n" +
                                        "1. Explore the Zoo\n" +
                                        "2. Buy Membership\n" +
                                        "3. Buy Tickets\n" +
                                        "4. View Discounts\n" +
                                        "5. View Special Deals\n" +
                                        "6. Visit Animals\n" +
                                        "7. Visit Attractions\n" +
                                        "8. Leave Feedback\n" +
                                        "9. Log Out\n" +
                                        "\n" +
                                        "Enter your choice: ");
                                int option7 = sc.nextInt();
                                System.out.println();
                                if (option7 == 1) {
                                    while (true) {
                                        System.out.print("Explore the Zoo:\n" +
                                                "1. View Attractions\n" +
                                                "2. View Animals\n" +
                                                "3. Exit\n" +
                                                "\n" +
                                                "Enter your choice: ");
                                        int option8 = sc.nextInt();
                                        System.out.println();
                                        if (option8 == 1) {
                                            if (attraction_list.isEmpty() == true) {
                                                System.out.println("No Attractions Added");
                                            } else {
                                                Admin.viewAttraction();
                                            }

                                        } else if (option8 == 2) {

                                            if (animals_list.isEmpty() == true) {
                                                System.out.println("No Animals Added");
                                            } else {
                                                Admin.view_animals();
                                            }

                                        } else if (option8 == 3) {
                                            break;
                                        } else {
                                            System.out.println("Invalid Input");
                                        }
                                    }
                                } else if (option7 == 2) {
                                    System.out.print("Buy Membership:\n" +
                                            "1. Basic Membership (₹20)\n" +
                                            "2. Premium Membership (₹50)\n" +
                                            "Enter your choice: ");
                                    int option10 = sc.nextInt();
                                    System.out.println();

                                    if (option10 == 1) {


                                        System.out.println("Apply Discount Code: ");
                                        String code = sc.next();
                                        System.out.println("Enter Age: ");
                                        int age = sc.nextInt();

                                        double balance = Admin.basic("Basic", email, code, age);
                                        revenue = revenue + balance;
                                        System.out.println("Basic Membership purchased successfully. Your balance is now " + balance);


                                    } else if (option10 == 2) {
                                        System.out.println("Apply Discount Code: ");
                                        String code = sc.next();
                                        System.out.println("Enter Age: ");
                                        int age = sc.nextInt();
                                        double balance = Admin.premium("Premium", email, code, age);
                                        revenue = revenue + balance;

                                        System.out.println("Premium Membership purchased successfully. Your balance is now " + balance);

                                    } else {
                                        System.out.println("Invalid Input");
                                    }


                                } else if (option7 == 3) {
                                    double balance;
                                    double total = 0;
                                    Visitor v = visitors.get(email);
                                    if (v.getMembership() == null) {
                                        System.out.println("You need to buy a membership first.");
                                    } else if (v.getMembership().equals("Premium")) {

                                    } else if (v.getMembership().equals("Basic")) {
                                        System.out.print("Buy Tickets:\n" +
                                                "Enter the number of tickets: ");
                                        int tickets = sc.nextInt();
                                        for (int i = 0; i < tickets; i++) {
                                            System.out.println("Buy Tickets:\n" +
                                                    "Select an Attraction to Buy a Ticket:\n");
                                            Admin.viewAttraction();
                                            System.out.print("Enter your choice: ");
                                            int option11 = sc.nextInt();
                                            System.out.println("Apply Discount Code: ");
                                            String code = sc.next();
                                            Attraction a = attraction_list.get(option11 - 1);
                                            System.out.println("Enter Age: ");
                                            int age = sc.nextInt();
                                            balance = Admin.buy_ticket(attraction_list.get(option11 - 1), age, code);
                                            double visitor_balance = v.getBalance();
                                            visitor_balance = visitor_balance - balance;
                                            v.setBalance(visitor_balance);
                                            revenue = revenue + balance;
                                            total = total + balance;
                                            System.out.println("The ticket for " + attraction_list.get(option11 - 1) + " was purchased successfully. Your balance is now ₹" + visitor_balance);
                                        }
                                        balance=Admin.special_deals(tickets,total);
                                        System.out.println("Your balance is now ₹" + balance);
                                    }


                                } else if (option7 == 4) {
                                    System.out.println("View Discounts");
                                    Admin.view_discounts();

                                } else if (option7 == 5) {
                                    System.out.println("View Special Deals");
                                    Admin.view_deals();

                                }
                                else if (option7 == 6) {
                                    System.out.println("Visit Animals");
                                    Admin.view_animals();
                                    System.out.print("Enter Animal name: ");
                                    String name= sc.next();
                                    System.out.print("Enter Animal type: ");
                                    String type= sc.next();


                                    ;
                                    while(true) {
                                        System.out.print("Choose an option:\n" +
                                                "1. Feed Animal\n" +
                                                "2. Information About Animal\n" +
                                                "3. Exit\n" +
                                                "Enter your choice: ");
                                        int option15 = sc.nextInt();
                                        System.out.println();

                                        if (option15 == 1) {

                                            System.out.println("Feed Animal: ");
                                            if(type.equals("Mammal")){
                                                Mammal m=mammals.get(name);
                                                m.makeSound();
                                            }
                                            else if(type.equals("Amphibian")){
                                                Amphibian a=amphibians.get(name);
                                                a.makeSound();
                                            }
                                            else if(type.equals("Reptile")){
                                                Reptile r=reptiles.get(name);
                                                r.makeSound();
                                            }


                                        } else if (option15 == 2) {
                                            System.out.println("Information About Animal:");
                                            if(type.equals("Mammal")){
                                                Mammal m=mammals.get(name);
                                                m.AnimalInfo();
                                            }
                                            else if(type.equals("Amphibian")){
                                                Amphibian a=amphibians.get(name);
                                                a.AnimalInfo();
                                            }
                                            else if(type.equals("Reptile")){
                                                Reptile r=reptiles.get(name);
                                                r.AnimalInfo();
                                            }

                                        }
                                        else if(option15==3){
                                            break;
                                        }else {
                                            System.out.println("Invalid Input");
                                        }
                                    }

                                } else if (option7 == 7) {
                                    System.out.println("Visit Attractions");
                                    Admin.viewAttraction();
                                    System.out.print("Enter your choice: ");
                                    int option11 = sc.nextInt();
                                    Attraction a = attraction_list.get(option11 - 1);
                                    System.out.println(a.getDescription());

                                } else if (option7 == 8) {
                                    System.out.println("Leave Feedback");
                                    System.out.print("Enter Feedback: ");
                                    String feedback = sc.next();
                                    Admin.add_feedback(feedback, email);
                                    System.out.println("Feedback submitted successfully.");

                                } else if (option7 == 9) {
                                    System.out.println("Logged Out.");
                                    break;
                                } else {
                                    System.out.println("Invalid Input");
                                }
                            }
                        } else {
                            System.out.println("Visitor not registered.");
                        }
                    } else {
                        System.out.println("Invalid Input");
                    }
                }

            } else if (option1 == 3) {
                System.out.println("View Special Deals");
                Admin.view_deals();
                System.out.println();
                System.out.println();


            } else {
                System.out.println("Invalid Input");
            }
        }


    }
}

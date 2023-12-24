package org.example;

public interface Animal {
    String name =null;

    String type=null;

    void makeSound();
    void AnimalInfo();

}

class Mammal implements Animal {
    private String name;
    private String type;
    private String sound;
    private String info;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mammal(String name,String sound,String info) {
        this.name=name;
        this.type="Mammal";
        this.sound=sound;
        this.info=info;
    }

    @Override
    public void makeSound() {
            System.out.println("Mammal sound"+sound);
    }

    @Override
    public void AnimalInfo() {
        System.out.println("Mammal info"+info);
    }
    // Implement methods for Mammal
}

class Amphibian implements Animal {
    private String name;
    private String type;
    private String sound;
    private String info;

    // Implement methods for Amphibian
    public Amphibian(String name,String sound,String info) {
        this.name=name;
        this.type="Amphibian";
        this.sound=sound;
        this.info=info;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void makeSound() {
        System.out.println("Amphibian sound: "+this.getSound());
    }

    @Override
    public void AnimalInfo() {
        System.out.println("Amphibian info: "+this.getInfo());
    }
}

class Reptile implements Animal {
    // Implement methods for Reptile
    private String name;
    private String type;
    private String sound;
    private String info;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Reptile(String name,String sound,String info) {
        this.name=name;
        this.type="Reptile";
        this.sound=sound;
        this.info=info;
    }
    @Override
    public void makeSound() {
        System.out.println("Reptile sound"+sound);
    }

    @Override
    public void AnimalInfo() {
        System.out.println("Reptile info"+info);
    }
}
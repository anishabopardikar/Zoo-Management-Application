package org.example;

public class Discount {
    public Discount(String category, String code, int percentage) {
        this.category = category;
        this.code = code;
        this.percentage = percentage;
    }

    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    private String code;
    private int percentage;

}

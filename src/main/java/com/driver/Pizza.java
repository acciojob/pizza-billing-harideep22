package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private String cheese;
    private int ch=0;
    private String topping;
    private int top=0;
    private String takeWay;
    private int take=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true) {
            this.price = 300;
            this.bill += "Base Price Of The Pizza: 300";
        }
        else{
            this.price= 400;
            this.bill+="Base Price Of The Pizza: 400";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.price=this.price+80;
        ch+=80;
        cheese="Extra Cheese Added: "+ch;
    }

    public void addExtraToppings(){
        if(isVeg){
            this.price+=70;
            top+=70;
            topping="Extra Toppings Added: "+top;
        }
        else{
            this.price+=120;
            top+=120;
            topping="Extra Toppings Added: "+top;
        }
    }

    public void addTakeaway(){
        this.price+=20;
        take+=20;
        takeWay="Paperbag Added: "+take;
    }

    public String getBill(){
        if(ch==0){
            this.bill+="\n"+cheese;
        }
        if(top==0){
            this.bill+="\n"+topping;
        }
        if(take==0){
            this.bill+="\n"+take;
        }
        this.bill+="\n"+"Total Price: "+price;
        return this.bill;
    }
}

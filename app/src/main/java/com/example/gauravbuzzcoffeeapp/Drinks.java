package com.example.gauravbuzzcoffeeapp;

public class Drinks {

    private String name;
    private String desc;
    private int imageID;


    public static final Drinks[] drinks = {

            new Drinks("Latte", "This description is for Latte", R.drawable.latte),
            new Drinks("Cappuccino", "This description is for Cappucino", R.drawable.cappuccino),
            new Drinks("Filter", "This description is for Filter", R.drawable.filter)

    };

    private Drinks(String name, String des, int imageID){

        this.name = name;
        this.desc = desc;
        this.imageID = imageID;


        }

        public String getDesc(){

        return desc;
        }

        public String getName(){
        return name;
        }

        public int getImageID(){
        return imageID;
        }

        public String toString(){
        return this.name;
        }

}

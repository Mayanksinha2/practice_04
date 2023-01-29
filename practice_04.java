package com.internshala;

public class practice_04 {
    public static void main(String[] args) {
        boolean isSecular = true;
        String message;
        if (isSecular){
           message = "India is a Secular country.";
        }
        else {
            message = "India is not a Secular country";
        }
        System.out.println(message);

        // Ternary operator
        String msg = isSecular? "India is a Secular country " : "India is not a secular country ";
        System.out.println(msg);
    }
}

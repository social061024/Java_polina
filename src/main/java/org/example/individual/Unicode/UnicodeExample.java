package org.example.individual.Unicode;

public class UnicodeExample {
    public static void main(String[] args) {
        String firstName = "Hello. My name is Polina";
        String lastName = "I am a student . I study in University of Petro Mohyla";
        int age = 18;
        String wishName= "I with you  a  Happy New Year. I wish you happiness and health";
        String listStar = "************----------------------*****************";

        String emoji = "\uD83D\uDC69";
        String emoji01 = "\uD83D\uDC4B";
        String emoji02 = "\uD83C\uDF19";
        String emoji03 = "\uD83D\uDC9C";
        String emoji04 = "\u2744";
        String emoji05 = "\uD83C\uDF81";
        String emoji06 = "\uD83D\uDE04";

        System.out.println(listStar);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(wishName);


        System.out.println(listStar);
        System.out.println(emoji01 + emoji + emoji04 + emoji05 + emoji06 + emoji03 +emoji02 );
        System.out.println(listStar);

    }
}
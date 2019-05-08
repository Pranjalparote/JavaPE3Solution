package com.stackroute;

public class RemoveVowels {
    public static void main(String[] args) {
//Array of string to hold vowels
        String[] vowels = new String[5];

        vowels[0] = "a";
        vowels[1] = "e";
        vowels[2] = "i";
        vowels[3] = "o";
        vowels[4] = "u";
// Array of string to give input countries
        String[] countries = new String[5];

        countries[0] = "India";
        countries[1] = "United states";
        countries[2] = "Germany";
        countries[3] = "Egypt";
        countries[4] = "czechoslovakia";

        for (int a = 0; a < countries.length; a++) {
            String country = countries[a];     //consider input one by one and hold it in country variable

            for (int i = 0; i < vowels.length; i++) {
                country = country.replace(vowels[i], ""); //replace function to replace vowel with whitespace
            }

            System.out.println(country);
        }
    }
}



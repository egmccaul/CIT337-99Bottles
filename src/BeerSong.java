/**
 * Created by EM on 01/28/16.
 */
public class BeerSong {

    public static void main(String args[]){

        // Calls the method that will output the Beer Song.
        Ninety_Nine_Bottles_of_Beer();
    }

    public static void Ninety_Nine_Bottles_of_Beer(){

        // Create a nice header for the Beer Song
        System.out.println("***************************** Beer Song ***************************\n");

        // Creates a loop that counts down from 99.
        // In this loop, it will output the verses of the Beer Song until it reaches 1 bottle
        for (int i=99; i > 2; i--){
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
            System.out.println("take one down, pass it around, " + (i-1) +" bottles of beer on the wall.");
        }

        // Once there it two bottles left the song will change to output below.
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer");
        System.out.println("take one down, pass	it around, 1 bottle of beer on the wall.");
        System.out.println("1 bottle of	beer on	the	wall, 1	bottle of beer");
        System.out.println("take one down, pass	it around, no more bottles of beer on the wall.");

        // Create a line of *s to show that output has ended.
        System.out.println("\n*****************************************************************\n");

    }
}

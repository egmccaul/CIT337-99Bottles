/**
 * Created by EM on 01/28/16.
 */
public class BeerSong {

    public static void main(String args[]){

    }

    public void Ninety_Nine_Bottles_of_Beer(){
        for (int i=99; i > 1; i--){
            System.println(i + " bottles of	beer on	the	wall, " + i + " bottles	of beer");
            System.println("take one down, pass	it around, " + (i-1) +"	bottles	of beer	on the wall.");
        }
        System.println("1 bottle of	beer on	the	wall, 1	bottle of beer");
        System.println("take one down, pass	it around, no more bottles of beer on the wall.");
    }
}

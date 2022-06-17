package cadavreExquis;

import java.util.List;
import java.util.Scanner;


public class CadavreExquis {

    public CadavreExquis(){
        System.out.println("Veuillez entrer votre texte en respectant bien les règles de ponctuation.");
        Scanner scan = new Scanner(System.in);
        String cadavre = scan.nextLine();
        decouperCadavre(cadavre);

    }

    public String decouperCadavre(String s){


        String[] arrOfStr = s.split("[(\\.\\!\\?]", 0);

        System.out.println(arrOfStr[arrOfStr.length-1]);
        return arrOfStr[arrOfStr.length-1];
    }


}

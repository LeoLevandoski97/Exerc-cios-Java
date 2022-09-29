import java.util.Locale;
import java.util.Scanner;

public class NewAlgoritimo {
    public static void main(String[] args) {

        String[] algoritimoComPronomes = new String[5];

        algoritimoComPronomes[0] = "MYSELF";
        algoritimoComPronomes[1] = "YOURSELF";
        algoritimoComPronomes[2] = "HIMSELF";
        algoritimoComPronomes[3] = "HERSELF";
        algoritimoComPronomes[4] = "OURSELVES";

        Scanner wordsInEnglish = new Scanner(System.in);
        System.out.println("Digite um Pronome em Ingles:");
        String hey = wordsInEnglish.next();


        for (int i=0; i < algoritimoComPronomes.length; i++) {

            if (hey.equals(algoritimoComPronomes[i])) {
                System.out.println(" Este e um pronome valido em ingles "  + i);
                break;
            }else{
                System.out.println("Este nao e um pronome valido em ingles");
            }



    }



    }
}


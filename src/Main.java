import java.util.List;

/**
 * Created by disas on 18.04.2017.
 */

public class Main {

    public static void main(String[]args){

        LatexReader reader = new LatexReader("C:\\Users\\disas\\Dropbox\\Uni Leipzig\\Anwendungen der Linguistischen Informatik\\CLARIN_CTS.tex");
        List<String> latexHeader = reader.getLatexHeader();
        List<String> latexText = reader.getLatexText();

        for(String s : latexHeader)
        {
            System.out.println(s);
        }

        System.out.println("------------------------------Trenner----------------------------------------------");

        for(String s : latexText)
        {
            System.out.println(s);
        }

    }

}

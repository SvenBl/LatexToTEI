import java.util.List;

/**
 * Created by disas on 18.04.2017.
 */

public class Main {

    public static void main(String[]args){

        LatexReader reader = new LatexReader("C:\\Users\\disas\\Dropbox\\Uni Leipzig\\Anwendungen der Linguistischen Informatik\\CLARIN_CTS.tex");
        //LatexReader reader = new LatexReader("C:\\Users\\disas\\Downloads\\article_2\\article_2.tex");

        List<String> latexHeader = reader.getLatexHeader();
        List<String> latexText = reader.getLatexText();

        Header tHead = new Header(latexHeader);
        List<String> teiHeader = tHead.getTeiHeader();

        int i = 0;

        for(String s : teiHeader)
        {
            System.out.println(i + " " + s);
            i++;
        }
//
//        i = 0;
//        for(String s : latexText)
//        {
//            System.out.println(i + " " + s);
//            i++;
//        }

    }

}

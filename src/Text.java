import java.util.ArrayList;
import java.util.List;

/**
 * Created by disas on 20.04.2017.
 */
public class Text {
    private List<String> teiText;

    public Text(List<String> latexText) {
            teiText = new ArrayList<String>();
            createTEI(latexText);

    }

    private void createTEI(List<String> latexText){
        for(String s : latexText){
            //teiText.add("hallo");
        }
        teiText.add("\t<text>");
        teiText.add("\t\t<body>");
        teiText.add("\t\t</body>");
        teiText.add("\t</text>");
        teiText.add("</TEI>");
    }

    public List<String> getTeiText() {
        return teiText;
    }
}

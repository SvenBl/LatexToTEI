import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by disas on 18.04.2017.
 */

public class Header {

    private String title = "";
    private String author = "";

    private String publisher = "";
    private String pubPlace = "";
    private String license = "";

    private String date = "";
    private String language = "";

    private List<String> teiHeader;

    private Pattern titlePattern;
    private Pattern authorPattern;
    private Pattern publisherPattern;
    private Pattern pubPlacePattern;
    private Pattern licensePattern;
    private Pattern datePattern;
    private Pattern languagePattern;

    private Matcher m;



    public Header(List<String> latexHeader){
        teiHeader = new ArrayList<String>();
        initializeIntel(latexHeader);

        createTEI();

    }

    public void initializeIntel(List<String> latexHeader)
    {
        titlePattern = Pattern.compile("^\\\\title\\{.*\\}");
        authorPattern = Pattern.compile("^\\\\author\\{.*\\}");
        publisherPattern = Pattern.compile("^\\\\title\\{.*\\}");
        pubPlacePattern = Pattern.compile("^\\\\title\\{.*\\}");
        licensePattern = Pattern.compile("^\\\\title\\{.*\\}");
        datePattern = Pattern.compile("^\\\\title\\{.*\\}");
        languagePattern = Pattern.compile("^\\\\title\\{.*\\}");

        Matcher m;
        for(String s : latexHeader){
            m = titlePattern.matcher(s);
            if(m.find()){
                title = "test";
            }
            m = authorPattern.matcher(s);
            if(m.find()){
                author = "test";
            }
            m = publisherPattern.matcher(s);
            if(m.find()){
                publisher = "test";
            }
            m = pubPlacePattern.matcher(s);
            if(m.find()){
                pubPlace = "test";
            }
            m = licensePattern.matcher(s);
            if(m.find()){
                license = "test";
            }
            m = datePattern.matcher(s);
            if(m.find()){
                date = "test";
            }
            m = languagePattern.matcher(s);
            if(m.find()){
                language = "test";
            }

        }
    }

    public List<String> getTeiHeader() {
        return teiHeader;
    }


    public void createTEI(){
        teiHeader.add("\t<teiHeader type=\"text\">");
        teiHeader.add("\t\t<fileDesc>");

        teiHeader.add("\t\t\t<titleStmt>");
        teiHeader.add("\t\t\t\t<title>" + title + "</title>");
        teiHeader.add("\t\t\t\t<author>" + author + "</author>");
        teiHeader.add("\t\t\t</titleStmt>");

        teiHeader.add("\t\t\t<publicationStmt>");
        teiHeader.add("\t\t\t\t<publisher>" + publisher + "</publisher>");
        teiHeader.add("\t\t\t\t<pubPlace>" + pubPlace + "</pubPlace>");
        teiHeader.add("\t\t\t\t<license>" + license + "</license>");
        teiHeader.add("\t\t\t</publicationStmt>");

        teiHeader.add("\t\t\t<sourceDesc>");
        teiHeader.add("\t\t\t\t<date>" + date + "</date>");
        teiHeader.add("\t\t\t</sourceDesc>");

        teiHeader.add("\t\t</fileDesc>");
        teiHeader.add("\t\t<profileDesc>");

        teiHeader.add("\t\t\t<langUsage>");
        teiHeader.add("\t\t\t\t<language>" + language + "</language");
        teiHeader.add("\t\t\t</langUsage>");

        teiHeader.add("\t\t</profileDesc>");
        teiHeader.add("\t</teiHeader>");
    }



}

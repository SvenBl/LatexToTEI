import java.util.List;
import java.util.ArrayList;

/**
 * Created by disas on 18.04.2017.
 */

public class Header {

    public String title = "";
    public String author = "";

    public String publisher = "";
    public String pubPlace = "";
    public String license = "";

    public String date = "";
    public String language = "";

    public List<String> headerList;

    public Header(){
        headerList = new ArrayList<String>();
        headerList.add("\t<teiHeader type=\"text\">");
        headerList.add("\t\t<fileDesc>");

        headerList.add("\t\t\t<titleStmt>");
        headerList.add("\t\t\t\t<title>" + title + "</title>");
        headerList.add("\t\t\t\t<author>" + author + "</author>");
        headerList.add("\t\t\t</titleStmt>");

        headerList.add("\t\t\t<publicationStmt>");
        headerList.add("\t\t\t\t<publisher>" + publisher + "</publisher>");
        headerList.add("\t\t\t\t<pubPlace>" + pubPlace + "</pubPlace>");
        headerList.add("\t\t\t\t<license>" + license + "</license>");
        headerList.add("\t\t\t</publicationStmt>");

        headerList.add("\t\t\t<sourceDesc>");
        headerList.add("\t\t\t\t<date>" + date + "</date>");
        headerList.add("\t\t\t</sourceDesc>");

        headerList.add("\t\t</fileDesc>");
        headerList.add("\t\t<profileDesc>");

        headerList.add("\t\t\t<langUsage>");
        headerList.add("\t\t\t\t<language>" + language + "</language");
        headerList.add("\t\t\t</langUsage>");

        headerList.add("\t\t</profileDesc>");
        headerList.add("</teiHeader>");
    }

    public List<String> getHeaderList() {
        return headerList;
    }

}

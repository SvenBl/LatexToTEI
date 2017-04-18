/**
 * Created by disas on 18.04.2017.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args){

        //Define File Path
        List<String> file = readFile("C:\\Users\\disas\\Dropbox\\Uni Leipzig\\Anwendungen der Linguistischen Informatik\\CLARIN_CTS.tex");

        Header header = new Header();


        List<String> headerList = header.getHeaderList();

        for (String s : headerList) {
            System.out.println(s);
        }


    }


    //Create List for File
    private static List<String> readFile(String filename)
    {
        List<String> records = new ArrayList<String>();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null)
            {
                records.add(line);
            }
            reader.close();
            return records;
        }
        catch (Exception e)
        {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
            return null;
        }
    }
}

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testJsonPath {
    public static void main(String[] args) {

        String filter1 = "$.data[?(@.status == 'AVAILABLE' && @.connectionAvailabilityStatus.canConnect == false && @.connectionAvailabilityStatus.conflictedServices != '')]";
        String filter2 = "$.data[?(@.status == 'AVAILABLE' && @.connectionAvailabilityStatus.canConnect == false)]..conflictedServices";
        String filter3 = "$.data..[?(@.tariffs.frontName=='Мой онлайн')]..slug";

        Object read = JsonPath.parse(getJsonStr()).read(filter1);
        System.out.println("=======================\n" + read);


    }

    public static String getJsonStr (){
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get("jsonText.json")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;

    }
}


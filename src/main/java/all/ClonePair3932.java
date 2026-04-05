package all;

import java.util.Properties;
import java.util.StringTokenizer;

public class ClonePair3932 {

    Properties method1(String string){
      Properties result=new Properties();
      if (string == null)   return result;
      StringTokenizer keyValuePairs=new StringTokenizer(string,";");
      StringTokenizer keyValuePair;
      String key;
      String value;
      while (keyValuePairs.hasMoreTokens()) {
        keyValuePair=new StringTokenizer(keyValuePairs.nextToken(),":");
        if (keyValuePair.hasMoreTokens())     key=keyValuePair.nextToken().trim();
     else     continue;
        if (keyValuePair.hasMoreTokens())     value=keyValuePair.nextToken().trim();
     else     continue;
        if (value.startsWith("\""))     value=value.substring(1);
        if (value.endsWith("\""))     value=value.substring(0,value.length() - 1);
        result.setProperty(key.toLowerCase(),value);
      }
      return result;
    }

    Properties method2(String propertyDefs){
      Properties properties=new Properties();
      if (propertyDefs != null) {
        for (StringTokenizer tokenizer=new StringTokenizer(propertyDefs,"|"); tokenizer.hasMoreTokens(); ) {
          String pair=tokenizer.nextToken();
          int equalPosition=pair.indexOf("=");
          if (equalPosition > 0 && equalPosition < pair.length() - 1) {
            properties.put(pair.substring(0,equalPosition),pair.substring(equalPosition + 1));
          }
        }
      }
      return properties;
    }
}

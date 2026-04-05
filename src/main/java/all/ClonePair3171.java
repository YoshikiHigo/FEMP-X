package all;

public class ClonePair3171 {

    String method1(String namespaceUri,String suggestion,boolean requirePrefix){
      if (namespaceUri.compareToIgnoreCase("http://www.imsglobal.org/xsd/imsmd_v1p2") == 0) {
        return "imsmd";
      }
      return suggestion;
    }

    String method2(String code,String defaultValue,boolean isDatum){
      final int s=code.indexOf(':');
      if (s < 0 || code.substring(0,s).trim().equalsIgnoreCase("epsg"))   try {
    switch (Integer.parseInt(code.substring(s + 1).trim())) {
    case 4326:      return isDatum ? "World Geodetic System 1984" : "WGS 84";
      }
    }
     catch (NumberFormatException e) {
    }
    return defaultValue;
    }
}

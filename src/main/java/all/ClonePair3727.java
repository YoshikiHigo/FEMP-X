package all;

import java.util.HashMap;
import java.util.Map;

public class ClonePair3727 {

    Map<String,String> method1(String args){
      Map<String,String> parameters=new HashMap<String,String>();
      if (args != null && args.length() > 0) {
        String[] pairs=args.split("&");
        if (pairs != null && pairs.length > 0) {
          for (      String pair : pairs) {
            String[] para=pair.split("=");
            if (para != null && para.length == 2) {
              parameters.put(para[0],para[1]);
            }
          }
        }
      }
      return parameters;
    }

    Map<String,String> method2(String contentString){
      Map<String,String> params=new HashMap<String,String>();
      if (contentString == null || contentString.trim().equals("")) {
        return params;
      }
      String[] paramsArray=contentString.split("\\&");
      if (paramsArray != null) {
        for (    String param : paramsArray) {
          String[] keyValue=param.split("=");
          if (keyValue != null && keyValue.length == 2) {
            params.put(keyValue[0],keyValue[1]);
          }
        }
      }
      return params;
    }
}

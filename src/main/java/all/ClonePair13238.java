package all;

public class ClonePair13238 {

    String[] method1(String path){
      path=path.replaceFirst("^/+","");
      String ctrlName=null;
      String actionName=null;
      if (path.length() > 0) {
        int divider=path.lastIndexOf("/");
        if (divider == -1) {
          ctrlName=path;
        }
     else {
          ctrlName=path.substring(0,divider).trim();
          if (divider + 1 < path.length()) {
            actionName=path.substring(divider + 1).trim();
          }
        }
      }
      return new String[]{ctrlName,actionName};
    }

    String[] method2(String s){
      s=s.trim();
      String host="", port="";
      final int firstColon=s.indexOf(':');
      if (firstColon < 0) {
        try {
          Integer.parseInt(s);
          port=s;
        }
     catch (    NumberFormatException nfe) {
          host=s;
        }
      }
     else {
        host=s.substring(0,firstColon).trim();
        port=s.substring(firstColon + 1).trim();
      }
      final String[] result=new String[2];
      result[0]=host.length() != 0 ? host : null;
      result[1]=port.length() != 0 ? port : null;
      return result;
    }
}

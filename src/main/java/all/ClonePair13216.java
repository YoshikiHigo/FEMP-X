package all;

public class ClonePair13216 {

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

    String[] method2(String key){
      char[] cs=key.toCharArray();
      StringBuilder pkg=new StringBuilder();
      for (  char c : cs) {
        if (c == '\\' || c == '/') {
          if (pkg.length() != 0) {
            pkg.append(".");
          }
        }
     else     if (c == '.') {
          pkg.append("_");
        }
     else     if (c == ' ') {
          pkg.append("__");
        }
     else {
          pkg.append(c);
        }
      }
      int lastPeriodIndex=pkg.lastIndexOf(".");
      if (lastPeriodIndex == -1) {
        return new String[]{"",pkg.toString()};
      }
      return new String[]{pkg.substring(0,lastPeriodIndex),pkg.substring(lastPeriodIndex + 1)};
    }
}

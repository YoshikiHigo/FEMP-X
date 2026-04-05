package unverified;

public class ClonePair13243 {

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

    String[] method2(String string){
      if (string.startsWith("[x]")) {
        return new String[]{"id=\"todo-done\"",string.substring(3).trim()};
      }
     else   if (string.startsWith("[!]")) {
        return new String[]{"id=\"todo-imp\"",string.substring(3).trim()};
      }
     else   if (string.startsWith("[ ]")) {
        return new String[]{"id=\"todo-normal\"",string.substring(3).trim()};
      }
      return new String[]{"",string};
    }
}

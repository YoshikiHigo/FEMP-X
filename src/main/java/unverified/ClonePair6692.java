package unverified;

public class ClonePair6692 {

    boolean method1(String expr,String extra){
      if (expr.endsWith("package-info")) {
        expr=expr.substring(0,expr.length() - "package-info".length());
      }
      for (int i=0, len=expr.length(); i < len; i++) {
        char c=expr.charAt(i);
        if (extra.indexOf(c) >= 0)     continue;
        if (!Character.isJavaIdentifierPart(c))     return false;
      }
      return true;
    }

    boolean method2(String name,String query){
      query=query.replaceAll("_"," ");
      name=name.replaceAll("_"," ");
      String[] query_tokens=query.split(" ");
      String[] tag_tokens=name.split(" ");
      if (name.contains(query) && name.length() > query.length())   return false;
      if (query.equals(name)) {
        return true;
      }
      int matches=0;
      for (int i=0; i < tag_tokens.length; i++) {
        for (int j=0; j < query_tokens.length; j++) {
          if (tag_tokens[i].equals(query_tokens[j])) {
            matches++;
          }
        }
      }
      if (matches >= tag_tokens.length)   return true;
      return false;
    }
}

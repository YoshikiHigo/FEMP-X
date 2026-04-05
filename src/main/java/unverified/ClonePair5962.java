package unverified;

public class ClonePair5962 {

    boolean method1(String i1,String i2){
      if (i1.length() != 0 && !i1.equals("none") && !i1.equals(i2))   return false;
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

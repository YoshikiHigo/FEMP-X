package all;

public class ClonePair8019 {

    boolean method1(String name,String query){
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

    boolean method2(String sub,String sup){
      int i=0;
      while (i + sub.length() - 1 < sup.length()) {
        int j;
        for (j=0; j < sub.length(); j++) {
          if (sub.charAt(j) != sup.charAt(i + j)) {
            break;
          }
        }
        if (j == sub.length()) {
          if ((i + j) < sup.length()) {
            if (sup.charAt(i + j) == ' ') {
              return true;
            }
     else {
              return false;
            }
          }
     else {
            return true;
          }
        }
        do {
          i++;
        }
     while ((i < sup.length()) && (sup.charAt(i) != ' '));
        i++;
      }
      return false;
    }
}

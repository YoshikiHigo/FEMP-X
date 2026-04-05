package unverified;

public class ClonePair3611 {

    String method1(String varName,String[] prefixes){
      if (prefixes != null) {
        for (int i=0; i < prefixes.length; i++) {
          if (varName.startsWith(prefixes[i])) {
            return varName.substring(prefixes[i].length());
          }
        }
      }
      return varName;
    }

    String method2(String varName,String[] prefix){
      if (prefix == null) {
        return varName;
      }
      for (int i=0; i < prefix.length; i++) {
        if (varName.startsWith(prefix[i])) {
          return varName.substring(prefix[i].length());
        }
      }
      return varName;
    }
}

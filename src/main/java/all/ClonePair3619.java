package all;

public class ClonePair3619 {

    String method1(String varName,String[] suffix){
      if (suffix != null) {
        for (int i=0; i < suffix.length; i++) {
          if (varName.endsWith(suffix[i])) {
            varName=varName.substring(0,varName.length() - suffix[i].length());
            break;
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

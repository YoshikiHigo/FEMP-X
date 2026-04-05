package all;

public class ClonePair3610 {

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

    String method2(String varName,String[] suffix){
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
}

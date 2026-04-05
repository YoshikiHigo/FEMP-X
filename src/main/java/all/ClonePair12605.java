package all;

public class ClonePair12605 {

    String method1(String str,char ch){
      if ((str == null) || str.isEmpty())   return str;
     else   if (str.length() == 1)   return str.charAt(0) == ch ? "" : str;
      try {
        final int l=str.length() - 1;
        if (str.charAt(l) == ch)     return str.substring(0,l);
        return str;
      }
     catch (  final Exception e) {
        return str;
      }
    }

    String method2(String baseDir,char c){
      if (baseDir != null && baseDir.length() > 0) {
        if (baseDir.charAt(baseDir.length() - 1) == c) {
          return baseDir.substring(0,baseDir.length() - 1);
        }
      }
      return baseDir;
    }
}

package all;

public class ClonePair12620 {

    String method1(String sSource,char cEndsWith){
      if (null == sSource)   return null;
     else   if (sSource.length() == 0)   return "";
     else   if (sSource.charAt(sSource.length() - 1) == cEndsWith)   return sSource;
     else   return sSource + String.valueOf(cEndsWith);
    }

    String method2(String sSource,char cEndsWith){
      if (null == sSource) {
        return null;
      }
      if (sSource.length() == 0) {
        return "";
      }
      if (sSource.charAt(sSource.length() - 1) == cEndsWith) {
        return sSource;
      }
      return sSource + String.valueOf(cEndsWith);
    }
}

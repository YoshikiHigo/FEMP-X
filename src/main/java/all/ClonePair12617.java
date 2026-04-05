package all;

public class ClonePair12617 {

    String method1(String sSource,char cEndsWith){
      if (null == sSource) {
        return null;
      }
      if (sSource.length() < 1) {
        return sSource;
      }
      if (sSource.charAt(sSource.length() - 1) == cEndsWith) {
        return sSource.substring(0,sSource.length() - 1);
      }
      return sSource;
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

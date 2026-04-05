package unverified;

public class ClonePair6372 {

    boolean method1(String str,String suffix){
      if (str == null || suffix == null) {
        return (str == null && suffix == null);
      }
      if (suffix.length() > str.length()) {
        return false;
      }
      int strOffset=str.length() - suffix.length();
      return str.regionMatches(true,strOffset,suffix,0,suffix.length());
    }

    boolean method2(String filename,String extension){
      if (filename == null || extension == null) {
        return filename == extension;
      }
      int i=filename.length() - extension.length();
      return filename.regionMatches(true,i < 0 ? 0 : i,extension,0,extension.length());
    }
}

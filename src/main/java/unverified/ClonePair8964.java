package unverified;

public class ClonePair8964 {

    boolean method1(String filename,String extension){
      if (filename == null || extension == null) {
        return filename == extension;
      }
      int i=filename.length() - extension.length();
      return filename.regionMatches(true,i < 0 ? 0 : i,extension,0,extension.length());
    }

    boolean method2(String string,String prefix){
      if (string == null || prefix == null) {
        return string == null && prefix == null;
      }
      if (prefix.length() > string.length()) {
        return false;
      }
      return string.regionMatches(true,0,prefix,0,prefix.length());
    }
}

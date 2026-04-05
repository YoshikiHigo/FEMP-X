package unverified;

public class ClonePair8128 {

    boolean method1(String p1,String p2){
      if ((p1 == null && p2 != null) || (p2 == null && p1 != null)) {
        return false;
      }
      if (p1 == null && p2 == null) {
        return true;
      }
      if (p1.equals(p2) || p1.startsWith(p2)) {
        return true;
      }
      return false;
    }

    boolean method2(String filename,String extension){
      if (filename == null || extension == null) {
        return filename == extension;
      }
      int i=filename.length() - extension.length();
      return filename.regionMatches(true,i < 0 ? 0 : i,extension,0,extension.length());
    }
}

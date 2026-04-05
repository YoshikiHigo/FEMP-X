package unverified;

public class ClonePair8351 {

    boolean method1(String url,String dir){
      if (url == null || dir == null) {
        return false;
      }
      if (url.trim().length() == 0 || dir.trim().length() == 0) {
        return false;
      }
      return true;
    }

    boolean method2(String swift,String iban){
      boolean pass=false;
      if (swift != null && swift.trim().length() > 0 && iban != null && iban.trim().length() > 0) {
        pass=true;
      }
      return (pass);
    }
}

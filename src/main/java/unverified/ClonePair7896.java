package unverified;

public class ClonePair7896 {

    boolean method1(String name,String pwd){
      if (name == null || name.equals("") || pwd == null || pwd.equals("")) {
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

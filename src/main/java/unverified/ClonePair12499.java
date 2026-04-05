package unverified;

public class ClonePair12499 {

    boolean method1(String ref){
      if (ref == null || ref.trim().length() == 0)   return (false);
      char c;
      for (int i=0; i < ref.length(); i++) {
        c=ref.charAt(i);
        if (!(c >= '0' && c <= '9')) {
          return (false);
        }
      }
      return true;
    }

    boolean method2(String $1){
      try {
        if ($1.toLowerCase().startsWith("0x")) {
          $1=$1.toLowerCase().replace("0x","");
          Integer.parseInt($1,16);
        }
     else     if ($1.toLowerCase().startsWith("0o")) {
          $1=$1.toLowerCase().replace("0o","");
          Integer.parseInt($1,8);
        }
     else     if ($1.toLowerCase().startsWith("0b")) {
          $1=$1.toLowerCase().replace("0b","");
          Integer.parseInt($1,2);
        }
     else {
          Integer.parseInt($1);
        }
        return true;
      }
     catch (  Exception e) {
      }
      return false;
    }
}

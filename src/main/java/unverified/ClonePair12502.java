package unverified;

public class ClonePair12502 {

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
        $1=$1.toLowerCase().endsWith("l") ? $1.toLowerCase().replace("l","") : $1;
        if ($1.toLowerCase().startsWith("0x")) {
          $1=$1.toLowerCase().replace("0x","");
          Long.parseLong($1,16);
        }
     else     if ($1.toLowerCase().startsWith("0o")) {
          $1=$1.toLowerCase().replace("0o","");
          Long.parseLong($1,8);
        }
     else     if ($1.toLowerCase().startsWith("0b")) {
          $1=$1.toLowerCase().replace("0b","");
          Long.parseLong($1,2);
        }
     else {
          Long.parseLong($1);
        }
        return true;
      }
     catch (  Exception e) {
      }
      return false;
    }
}

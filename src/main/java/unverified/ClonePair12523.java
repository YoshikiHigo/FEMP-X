package unverified;

public class ClonePair12523 {

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

    boolean method2(String individualId){
      boolean validId=(individualId != null && individualId.trim().length() > 0);
      if (validId) {
        try {
          if (individualId.charAt(0) == 'I') {
            Integer.parseInt(individualId.substring(1));
          }
     else {
            Integer.parseInt(individualId);
          }
        }
     catch (    Exception ex) {
          validId=false;
        }
      }
      return validId;
    }
}

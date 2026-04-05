package all;

public class ClonePair7871 {

    boolean method1(String name,int minLength){
      boolean validated=true;
      if (!(name.matches("^[a-zA-Z.]+$"))) {
        validated=false;
      }
      if (name.length() > 15 || name.length() < minLength) {
        validated=false;
      }
      if ((minLength == 0) && (name.equals(""))) {
        validated=true;
      }
      return validated;
    }

    boolean method2(String nmeasentence,int checksum){
      int sum=0;
      for (int i=0; i < nmeasentence.length(); i++) {
        char value=nmeasentence.charAt(i);
        if (value != '$' && value != '*') {
          sum^=value;
        }
      }
      if (sum == checksum)   return true;
      return false;
    }
}

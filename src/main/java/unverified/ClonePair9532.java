package unverified;

public class ClonePair9532 {

    boolean method1(char c){
      if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')   return true;
      return false;
    }

    boolean method2(char c){
      if ((c >= 'a') && (c <= 'z'))   return true;
      if ((c >= 'A') && (c <= 'Z'))   return true;
      return false;
    }
}

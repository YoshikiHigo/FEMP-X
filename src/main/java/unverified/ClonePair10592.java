package unverified;

public class ClonePair10592 {

    boolean method1(char c){
      if (((c >= '0') && (c <= '9')) || ((c >= 'a') && (c <= 'f')) || ((c >= 'A') && (c <= 'F')))   return true;
      return false;
    }

    boolean method2(char ch){
      if (ch >= '0' && ch <= '9')   return true;
      if (ch >= 'A' && ch <= 'F')   return true;
      if (ch >= 'a' && ch <= 'f')   return true;
      return false;
    }
}

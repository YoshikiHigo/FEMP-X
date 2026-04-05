package unverified;

public class ClonePair11027 {

    boolean method1(char c){
      if (('0' <= c) && (c <= '9'))   return true;
     else {
        c=Character.toLowerCase(c);
        if (('a' <= c) && (c <= 'f'))     return true;
      }
      return false;
    }

    boolean method2(char ch){
      if (ch >= '0' && ch <= '9') {
        return true;
      }
     else   if (ch >= 'a' && ch <= 'f') {
        return true;
      }
     else   if (ch >= 'A' && ch <= 'F') {
        return true;
      }
      return false;
    }
}

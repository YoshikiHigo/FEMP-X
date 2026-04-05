package all;

public class ClonePair11031 {

    boolean method1(char c){
      if (('0' <= c) && (c <= '9'))   return true;
     else {
        c=Character.toLowerCase(c);
        if (('a' <= c) && (c <= 'f'))     return true;
      }
      return false;
    }

    boolean method2(char ch){
      if (ch >= '0' && ch <= '9')   return true;
      if (ch >= 'A' && ch <= 'F')   return true;
      if (ch >= 'a' && ch <= 'f')   return true;
      return false;
    }
}

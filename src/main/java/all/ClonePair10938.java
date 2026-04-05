package all;

public class ClonePair10938 {

    boolean method1(char ch1,char ch2,boolean ignoreCase){
      if (ignoreCase)   return Character.toUpperCase(ch1) == Character.toUpperCase(ch2);
     else   return ch1 == ch2;
    }

    boolean method2(char a,char b,boolean ignoreCase){
      if (a == b)   return true;
     else   if (!ignoreCase)   return false;
     else {
        a=Character.toUpperCase(a);
        if (a == b)     return true;
     else {
          b=Character.toUpperCase(b);
          if (a == b)       return true;
     else {
            a=Character.toLowerCase(a);
            if (a == b)         return true;
     else         return a == Character.toLowerCase(b);
          }
        }
      }
    }
}

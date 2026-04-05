package unverified;

public class ClonePair10935 {

    boolean method1(char c1,char c2,boolean ignCase){
      if (ignCase)   return Character.toLowerCase(c1) == Character.toLowerCase(c2);
      return c1 == c2;
    }

    boolean method2(char ch1,char ch2,boolean ignoreCase){
      if (ignoreCase)   return Character.toUpperCase(ch1) == Character.toUpperCase(ch2);
     else   return ch1 == ch2;
    }
}

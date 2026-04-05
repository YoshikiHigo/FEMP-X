package unverified;

public class ClonePair8123 {

    String method1(int size,String s){
      while (s.length() < size)   s=s + s;
      return (s.substring(0,size));
    }

    String method2(int max,String string){
      if (string.length() > max) {
        return string.substring(0,max);
      }
     else {
        return string;
      }
    }
}

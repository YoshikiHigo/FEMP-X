package all;

public class ClonePair8118 {

    String method1(int size,String s){
      while (s.length() < size)   s=s + s;
      return (s.substring(s.length() - size));
    }

    String method2(int size,String s){
      while (s.length() < size)   s=s + s;
      return (s.substring(0,size));
    }
}

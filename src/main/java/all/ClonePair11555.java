package all;

public class ClonePair11555 {

    String method1(String s,int maxLength){
      if (s.length() < maxLength) {
        return s;
      }
      return s.substring(0,maxLength - 3) + "...";
    }

    String method2(String in,int max){
      if (in.length() < max)   return in;
      return in.substring(0,max - 3) + "...";
    }
}

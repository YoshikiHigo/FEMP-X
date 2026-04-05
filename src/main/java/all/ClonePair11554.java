package all;

public class ClonePair11554 {

    String method1(String s,int maxLength){
      if (s.length() < maxLength) {
        return s;
      }
      return s.substring(0,maxLength - 3) + "...";
    }

    String method2(String s,int length){
      if (s.length() >= length) {
        String result=s;
        result=result.substring(0,length - 3);
        return result + "...";
      }
     else {
        return s.trim();
      }
    }
}

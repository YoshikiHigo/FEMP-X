package all;

public class ClonePair12771 {

    String method1(String text,int maxLength){
      if (text.length() > maxLength) {
        return text.substring(0,maxLength - 3) + "...";
      }
      return text;
    }

    String method2(String s,int length){
      assert length > 3;
      if (s.length() <= length) {
        return s;
      }
     else {
        return s.substring(0,length - 3) + "...";
      }
    }
}

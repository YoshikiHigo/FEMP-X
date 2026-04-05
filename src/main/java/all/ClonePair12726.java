package all;

public class ClonePair12726 {

    String method1(String text,int maxLength){
      if (text.length() > maxLength) {
        return text.substring(0,maxLength - 3) + "...";
      }
      return text;
    }

    String method2(String s,int longueur){
      if (s.length() <= longueur)   return s;
      String debut=s.substring(0,longueur - 3);
      return debut + "...";
    }
}

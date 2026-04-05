package all;

public class ClonePair12318 {

    boolean method1(String text){
      char ch;
      text=text.toUpperCase();
      boolean retVal=true;
      for (int i=0; i < text.length(); i++) {
        ch=text.charAt(i);
        if (!((ch >= 'A' && ch <= 'Z') || (ch == ' ' || ch == '.' || ch == ',')))     retVal=false;
      }
      return retVal;
    }

    boolean method2(String url){
      boolean retVal=true;
      char[] ch=url.toCharArray();
      int index=0;
      while (index < ch.length) {
        if (!((ch[index] > 96 && ch[index] < 123) || (ch[index] > 46 && ch[index] < 59) || ch[index] == 126 || ch[index] == 63 || ch[index] == 56)) {
          retVal=false;
        }
      }
      return retVal;
    }
}

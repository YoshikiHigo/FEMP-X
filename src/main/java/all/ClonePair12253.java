package all;

public class ClonePair12253 {

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

    boolean method2(String p_text){
      char x_ch;
      p_text=p_text.toUpperCase();
      boolean x_return=true;
      for (int i=0; i < p_text.length(); i++) {
        x_ch=p_text.charAt(i);
        if (!((x_ch >= 'A' && x_ch <= 'Z') || (x_ch == ' ' || x_ch == '.' || x_ch == ','))) {
          x_return=false;
        }
      }
      return x_return;
    }
}

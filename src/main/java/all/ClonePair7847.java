package all;

public class ClonePair7847 {

    boolean method1(String input,int index){
      while (index > 0) {
        index--;
        if (input.charAt(index) != '\\')     return false;
     else     if (index == 0 || input.charAt(index - 1) != '\\')     return true;
        index--;
      }
      return false;
    }

    boolean method2(String text,int i){
      if (i == 0) {
        return false;
      }
      int cnt=0;
      while (i > 0 && text.charAt(--i) == '\\') {
        cnt++;
      }
      return (cnt & 1) != 0;
    }
}

package all;

public class ClonePair7861 {

    boolean method1(String text,int i){
      if (i == 0) {
        return false;
      }
      int cnt=0;
      while (i > 0 && text.charAt(--i) == '\\') {
        cnt++;
      }
      return (cnt & 1) != 0;
    }

    boolean method2(String element,int index){
      if (index > 0) {
        return element.charAt(index - 1) == '\\';
      }
      return false;
    }
}

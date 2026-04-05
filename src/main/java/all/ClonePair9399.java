package all;

public class ClonePair9399 {

    int method1(String content,int pos){
      int w;
      for (w=pos; w >= 0; w--) {
        if (Character.isSpace(content.charAt(w))) {
          break;
        }
      }
      return w;
    }

    int method2(String s,int pos){
      for (int i=pos; i >= 0; i--) {
        if (s.charAt(i) == ' ') {
          return i;
        }
      }
      return -1;
    }
}

package all;

public class ClonePair8149 {

    char method1(String str,int index){
      if (index >= str.length()) {
        return 0;
      }
      return str.charAt(index);
    }

    char method2(String str,int index){
      if (str.length() > index) {
        return str.charAt(index);
      }
      return 0;
    }
}

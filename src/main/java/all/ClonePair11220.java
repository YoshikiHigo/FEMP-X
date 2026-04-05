package all;

public class ClonePair11220 {

    boolean method1(char flag){
      if (flag >= 'a' && flag <= 'z') {
        return true;
      }
      if (flag >= 'A' && flag <= 'Z') {
        return true;
      }
      return false;
    }

    boolean method2(char letra){
      if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z')) {
        return true;
      }
     else {
        return false;
      }
    }
}

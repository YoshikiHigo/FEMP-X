package all;

public class ClonePair11127 {

    boolean method1(char a){
      if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9') {
        return true;
      }
      return false;
    }

    boolean method2(char carcatere){
      if (carcatere > 47 && carcatere < 58)   return true;
      return false;
    }
}

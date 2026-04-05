package unverified;

public class ClonePair11128 {

    boolean method1(char a){
      if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9') {
        return true;
      }
      return false;
    }

    boolean method2(char ch){
    switch (ch) {
    case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':    return true;
    default:  return false;
    }
    }
}

package all;

public class ClonePair11254 {

    boolean method1(char carcatere){
      if (carcatere > 47 && carcatere < 58)   return true;
      return false;
    }

    boolean method2(char ch){
    switch (ch) {
    case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':    return true;
    default:  return false;
    }
    }
}

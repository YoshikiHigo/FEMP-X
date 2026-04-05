package all;

public class ClonePair11186 {

    boolean method1(char c){
      if ((c == '0') || (c == '1') || (c == '2')|| (c == '3')|| (c == '4')|| (c == '5')|| (c == '6')|| (c == '7')|| (c == '8')|| (c == '9'))   return true;
     else   return false;
    }

    boolean method2(char carcatere){
      if (carcatere > 47 && carcatere < 58)   return true;
      return false;
    }
}

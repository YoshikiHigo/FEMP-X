package all;

public class ClonePair11187 {

    boolean method1(char c){
      if ((c == '0') || (c == '1') || (c == '2')|| (c == '3')|| (c == '4')|| (c == '5')|| (c == '6')|| (c == '7')|| (c == '8')|| (c == '9'))   return true;
     else   return false;
    }

    boolean method2(char ch){
    switch (ch) {
    case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':    return true;
    default:  return false;
    }
    }
}

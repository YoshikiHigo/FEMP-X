package all;

public class ClonePair11194 {

    boolean method1(char c){
      if ((c == '0') || (c == '1') || (c == '2')|| (c == '3')|| (c == '4')|| (c == '5')|| (c == '6')|| (c == '7')|| (c == '8')|| (c == '9'))   return true;
     else   return false;
    }

    boolean method2(char C){
    switch (C) {
    case '1':    return (true);
    case '2':  return (true);
    case '3':return (true);
    case '4':return (true);
    case '5':return (true);
    case '6':return (true);
    case '7':return (true);
    case '8':return (true);
    case '9':return (true);
    case '0':return (true);
    default:return (false);
    }
    }
}

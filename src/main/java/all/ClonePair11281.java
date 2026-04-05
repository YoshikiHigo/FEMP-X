package all;

public class ClonePair11281 {

    boolean method1(char ch){
    switch (ch) {
    case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':    return true;
    default:  return false;
    }
    }

    boolean method2(char c){
      if (c == '0')   return true;
      if (c == '1')   return true;
      if (c == '2')   return true;
      if (c == '3')   return true;
      if (c == '4')   return true;
      if (c == '5')   return true;
      if (c == '6')   return true;
      if (c == '7')   return true;
      if (c == '8')   return true;
      if (c == '9')   return true;
      return false;
    }
}

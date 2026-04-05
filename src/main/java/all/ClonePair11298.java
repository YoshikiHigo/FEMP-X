package all;

public class ClonePair11298 {

    boolean method1(char c){
    switch (c) {
    case 'a':    return true;
    case 'e':  return true;
    case 'i':return true;
    case 'o':return true;
    case 'u':return true;
    }
    return false;
    }

    boolean method2(char c){
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�')   return true;
      return false;
    }
}

package all;

public class ClonePair6698 {

    int method1(int ch){
      if ((ch >= 'A') && (ch <= 'Z')) {
        return ch - 'A';
      }
     else   if ((ch >= 'a') && (ch <= 'z')) {
        return ch - 'a' + 26;
      }
     else   if ((ch >= '0') && (ch <= '9')) {
        return ch - '0' + 52;
      }
     else {
    switch (ch) {
    case '=':      return 65;
    case '+':    return 62;
    case '/':  return 63;
    default:return -1;
    }
    }
    }

    int method2(int i){
      if (i >= 65 && i <= 90)   return i - 65;
      if (i >= 97 && i <= 122)   return (i - 97) + 26;
      if (i >= 48 && i <= 57)   return (i - 48) + 52;
    switch (i) {
    case 61:    return 65;
    case 43:  return 62;
    case 47:return 63;
    }
    return -1;
    }
}

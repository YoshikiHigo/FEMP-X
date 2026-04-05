package all;

public class ClonePair12503 {

    int method1(String str){
      int col=-1;
      boolean flag=true;
      str=str.trim();
      if (str.length() == 0) {
        return -1;
      }
      try {
        col=Integer.parseInt(str);
      }
     catch (  Exception e) {
        col=-1;
        flag=false;
      }
      if (flag) {
        return col;
      }
     else {
        int c=0;
        int addFactor=0;
        col=0;
        str=str.toUpperCase();
        int len=str.length() - 1;
        for (int i=0; i < str.length(); i++) {
          c=str.charAt(i) - 65;
          if (len > 0)       col+=(26 * len * (c + 1));
     else       col+=c;
          len--;
        }
      }
      return col;
    }

    int method2(String str){
      int col=-1;
      boolean flag=true;
      str=str.trim();
      if (str.length() == 0) {
        return -1;
      }
      try {
        col=Integer.parseInt(str);
      }
     catch (  Exception e) {
        col=-1;
        flag=false;
      }
      if (flag) {
        return col;
      }
     else {
        int c=0;
        int addFactor=0;
        col=0;
        str=str.toUpperCase();
        int len=str.length() - 1;
        for (int i=0; i < str.length(); i++) {
          c=str.charAt(i) - 65;
          if (len > 0) {
            col+=(26 * len * (c + 1));
          }
     else {
            col+=c;
          }
          len--;
        }
      }
      return col;
    }
}

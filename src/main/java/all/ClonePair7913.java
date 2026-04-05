package all;

public class ClonePair7913 {

    int method1(String str1,String str2,boolean ignoreCase){
      char[] char1=str1.toCharArray();
      char[] char2=str2.toCharArray();
      int len=Math.min(char1.length,char2.length);
      for (int i=0, j=0; (i < len) && (j < len); i++, j++) {
        char ch1=char1[i];
        char ch2=char2[j];
        if (Character.isDigit(ch1) && Character.isDigit(ch2) && (ch1 != '0')&& (ch2 != '0')) {
          int _i=i + 1;
          int _j=j + 1;
          for (; _i < char1.length; _i++) {
            if (!Character.isDigit(char1[_i])) {
              break;
            }
          }
          for (; _j < char2.length; _j++) {
            if (!Character.isDigit(char2[_j])) {
              break;
            }
          }
          int len1=_i - i;
          int len2=_j - j;
          if (len1 > len2) {
            return 1;
          }
     else       if (len1 < len2) {
            return -1;
          }
     else {
            for (int k=0; k < len1; k++) {
              ch1=char1[i + k];
              ch2=char2[j + k];
              if (ch1 != ch2) {
                return ch1 - ch2;
              }
            }
          }
          i=_i - 1;
          j=_j - 1;
        }
     else {
          if (ignoreCase) {
            ch1=Character.toLowerCase(ch1);
            ch2=Character.toLowerCase(ch2);
          }
          if (ch1 != ch2) {
            return ch1 - ch2;
          }
        }
      }
      return char1.length - char2.length;
    }

    int method2(String str1,String str2,boolean ignoreCase){
      char[] char1=str1.toCharArray();
      char[] char2=str2.toCharArray();
      int len=Math.min(char1.length,char2.length);
      for (int i=0, j=0; i < len && j < len; i++, j++) {
        char ch1=char1[i];
        char ch2=char2[j];
        if (Character.isDigit(ch1) && Character.isDigit(ch2) && ch1 != '0' && ch2 != '0') {
          int _i=i + 1;
          int _j=j + 1;
          for (; _i < char1.length; _i++) {
            if (!Character.isDigit(char1[_i])) {
              break;
            }
          }
          for (; _j < char2.length; _j++) {
            if (!Character.isDigit(char2[_j])) {
              break;
            }
          }
          int len1=_i - i;
          int len2=_j - j;
          if (len1 > len2)       return 1;
     else       if (len1 < len2)       return -1;
     else {
            for (int k=0; k < len1; k++) {
              ch1=char1[i + k];
              ch2=char2[j + k];
              if (ch1 != ch2)           return ch1 - ch2;
            }
          }
          i=_i - 1;
          j=_j - 1;
        }
     else {
          if (ignoreCase) {
            ch1=Character.toLowerCase(ch1);
            ch2=Character.toLowerCase(ch2);
          }
          if (ch1 != ch2)       return ch1 - ch2;
        }
      }
      return char1.length - char2.length;
    }
}

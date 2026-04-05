package all;

public class ClonePair9081 {

    int method1(String pattern,String text){
      int m=pattern.length();
      int n=text.length();
      int[] r=new int[m];
      int i;
      int j;
      r[0]=i=-1;
      for (j=1; j < m; j++) {
        while (i >= 0 && pattern.charAt(i) != pattern.charAt(j - 1)) {
          i=r[i];
        }
        i++;
        if (pattern.charAt(i) != pattern.charAt(j)) {
          r[j]=i;
        }
     else {
          r[j]=r[i];
        }
      }
      i=0;
      j=0;
      while (i < m && j < n) {
        if (pattern.charAt(i) == text.charAt(j)) {
          j++;
          i++;
        }
     else {
          if (r[i] == -1) {
            i=0;
            j++;
          }
     else {
            i=r[i];
          }
        }
      }
      if (i == m) {
        return j - i;
      }
     else {
        return -1;
      }
    }

    int method2(String pattern,String text){
      int m=pattern.length();
      int n=text.length();
      int[] s=new int[m];
      int i;
      int j;
      s[0]=i=-1;
      for (j=1; j < m; j++) {
        while (i >= 0 && pattern.charAt(i) != pattern.charAt(j - 1)) {
          i=s[i];
        }
        s[j]=++i;
      }
      i=0;
      j=0;
      while (i < m && j < n) {
        if (pattern.charAt(i) == text.charAt(j)) {
          j++;
          i++;
        }
     else {
          if (i == 0) {
            j++;
          }
     else {
            i=s[i];
          }
        }
      }
      if (i == m) {
        return j - i;
      }
     else {
        return -1;
      }
    }
}

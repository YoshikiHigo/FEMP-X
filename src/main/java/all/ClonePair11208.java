package all;

public class ClonePair11208 {

    boolean method1(int list1[],int list2[]){
      try {
        if (list1.length != list2.length) {
          return false;
        }
     else {
          int scan=list1.length;
          while (--scan >= 0) {
            if (list1[scan] != list2[scan]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  Exception ex) {
        return false;
      }
    }

    boolean method2(int first[],int second[]){
      if (first == null || second == null)   return false;
     else   if (first.length != second.length)   return false;
     else {
        int c=0;
        for (; c < first.length && first[c] == second[c]; c++)     ;
        return (c >= first.length);
      }
    }
}

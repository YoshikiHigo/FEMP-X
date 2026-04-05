package all;

public class ClonePair10693 {

    int method1(String firstString,String anotherString){
      int len1=firstString.length();
      int len2=anotherString.length();
      int n=Math.min(len1,len2);
      int i=0;
      int j=0;
      while (n-- != 0) {
        char c1=firstString.charAt(i++);
        char c2=anotherString.charAt(j++);
        if (c1 != c2) {
          return (c1 - c2);
        }
      }
      return (len1 - len2);
    }

    int method2(String source1,String target1){
      char[] source=source1.replace('-','_').toCharArray();
      char[] target=target1.replace('-','_').toCharArray();
      int compare=0;
      for (int i=0, j=0; i < source.length && j < target.length && compare == 0; ++j, ++i)   compare=source[i] - target[j];
      if (compare != 0)   return compare;
      return source.length - target.length;
    }
}

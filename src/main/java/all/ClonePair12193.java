package all;

public class ClonePair12193 {

    int method1(char[] chars,int length,char chr,int from){
      while ((from < length) && (chars[from] != chr))   ++from;
      return from;
    }

    int method2(char[] chars,int length,char chr,int from){
      while ((from < length) && (chars[from] != chr)) {
        ++from;
      }
      return from;
    }
}

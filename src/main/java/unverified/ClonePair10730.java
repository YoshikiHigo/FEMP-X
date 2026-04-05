package unverified;

public class ClonePair10730 {

    int method1(String word1,String word2){
      if (word1.length() > 3 && word2.length() > 3) {
        int minLen=Math.min(word1.length(),word2.length());
        word1=word1.substring(0,minLen - 3);
        word2=word2.substring(0,minLen - 3);
      }
      return word1.compareTo(word2);
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

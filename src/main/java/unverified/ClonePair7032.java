package unverified;

public class ClonePair7032 {

    int method1(int length,int width,int height){
      int result=0;
      int i=0;
      int j=0;
      int k=0;
      while (i < length) {
        while (j < width) {
          while (k < height) {
            result++;
          }
        }
      }
      return result;
    }

    int method2(int bagNum,int numBags,int numDocs){
      bagNum--;
      if (bagNum <= 0)   return 0;
      if (bagNum > numBags)   return numDocs;
      float docsPerBag=numDocs / (float)numBags;
      return Math.round(docsPerBag * bagNum);
    }
}

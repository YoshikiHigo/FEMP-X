package all;

public class ClonePair5447 {

    int[] method1(int[] targ,int size){
      int[] na;
      int i;
      na=new int[size];
      for (i=0; i < targ.length; i++)   na[i]=targ[i];
      while (i < na.length) {
        na[i]=targ[targ.length - 1];
        i++;
      }
      return na;
    }

    int[] method2(int[] i,int m){
      int[] in=new int[m];
      for (int j=0; j < i.length; j++)   in[j]=i[j];
      return in;
    }
}

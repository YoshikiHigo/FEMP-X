package all;

public class ClonePair4428 {

    short method1(short[] a){
      short res=a[0];
      short buff;
      for (int i=1; i < a.length; i++) {
        buff=a[i];
        if (buff > res) {
          res=buff;
        }
      }
      return res;
    }

    short method2(short[] data){
      short max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }
}

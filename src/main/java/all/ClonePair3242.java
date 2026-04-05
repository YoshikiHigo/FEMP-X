package all;

import java.util.Calendar;

public class ClonePair3242 {

    int method1(Object x,Object y){
      Calendar xcal=(Calendar)x;
      Calendar ycal=(Calendar)y;
      if (xcal.before(ycal))   return -1;
      if (xcal.after(ycal))   return 1;
      return 0;
    }

    int method2(Object o1,Object o2){
      Calendar c1=(Calendar)o1;
      Calendar c2=(Calendar)o2;
      long t1=c1.getTime().getTime();
      long t2=c2.getTime().getTime();
      if (t1 < t2)   return -1;
     else   if (t1 > t2)   return 1;
     else   return 0;
    }
}

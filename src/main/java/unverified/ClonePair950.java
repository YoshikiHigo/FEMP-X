package unverified;

public class ClonePair950 {

    double method1(double x,boolean upper){
      if (x < 0) {
        x=-x;
        upper=!upper;
      }
      double y=0.5 * x * x;
      double alnorm;
      if ((x > 7.0) && !(upper && x <= 18.66)) {
        alnorm=0;
      }
     else   if (x <= 1.28) {
        alnorm=0.5 - x * (0.398942280444 - 0.39990348504 * y / (y + 5.75885480458 - 29.8213557807 / (y + 2.62433121679 + 48.6959930692 / (y + 5.92885724438))));
      }
     else {
        alnorm=0.398942280385 * Math.exp(-y) / (x - 3.8052e-8 + 1.00000615302 / (x + 3.98064794e-4 + 1.98615381364 / (x - 0.151679116635 + 5.29330324926 / (x + 4.8385912808 - 15.1508972451 / (x + 0.742380924027 + 30.789933034 / (x + 3.99019417011))))));
      }
      return upper ? alnorm : 1 - alnorm;
    }

    double method2(double z,boolean upper){
      double ltone=7.0, utzero=18.66, con=1.28, a1=0.398942280444, a2=0.399903438504, a3=5.75885480458, a4=29.8213557808, a5=2.62433121679, a6=48.6959930692, a7=5.92885724438, b1=0.398942280385, b2=3.8052e-8, b3=1.00000615302, b4=3.98064794e-4, b5=1.986153813664, b6=0.151679116635, b7=5.29330324926, b8=4.8385912808, b9=15.1508972451, b10=0.742380924027, b11=30.789933034, b12=3.99019417011;
      double y, alnorm;
      if (z < 0) {
        upper=!upper;
        z=-z;
      }
      if (z <= ltone || upper && z <= utzero) {
        y=0.5 * z * z;
        if (z > con) {
          alnorm=b1 * Math.exp(-y) / (z - b2 + b3 / (z + b4 + b5 / (z - b6 + b7 / (z + b8 - b9 / (z + b10 + b11 / (z + b12))))));
        }
     else {
          alnorm=0.5 - z * (a1 - a2 * y / (y + a3 - a4 / (y + a5 + a6 / (y + a7))));
        }
      }
     else {
        alnorm=0;
      }
      if (!upper)   alnorm=1 - alnorm;
      return (alnorm);
    }
}

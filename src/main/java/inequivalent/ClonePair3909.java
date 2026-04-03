package inequivalent;

public class ClonePair3909 {

    double method1(double[] point1, double[] point2) {
        if (point1.length != point2.length) {
            System.out.println("Points of different dimensions are being compared");
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < point1.length; i++) {
            sum += Math.pow(point1[i] - point2[i], 2);
        }
        return Math.sqrt(sum);
    }

    double method2(double[] p, double[] q) {
        double distancia = 0.0;
        double aux = 0.0;
        if (p.length == q.length) {
            for (int i = 0; i < p.length; i++) {
                aux = p[i] - q[i];
                distancia += aux * aux;
            }
        }
        return Math.sqrt(distancia);
    }
}

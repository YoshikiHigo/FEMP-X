package equivalent;

public class ClonePair9138 {
    double method1(double val) {
        double valOut = val;
        if (val > 180) valOut = val - 360.;
        if (val < -180.) valOut = val + 360.;
        return valOut;
    }

    double method2(double phi) {
        if (phi < -180.) phi += 360.;
        if (phi > 180.) phi -= 360.;
        return phi;
    }
}

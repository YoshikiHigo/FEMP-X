package equivalent;

public class ClonePair8400 {
    double method1(int orient) {
        double convertedOrient = Double.NaN;
        if (orient < 8 && orient >= 0) {
            convertedOrient = (8 - orient) * 11.25;
        } else if (orient > 8) {
            convertedOrient = -(orient - 8) * 11.25 + 180;
        } else if (orient == 8) {
            convertedOrient = 0;
        } else {
            convertedOrient = -1;
            convertedOrient = 0;
        }
        return convertedOrient;
    }

    double method2(int theta) {
        double convertedtheta = 0;
        if (theta < 8 && theta >= 0) {
            convertedtheta = (8 - theta) * 11.25;
        } else if (theta > 8) {
            convertedtheta = -(theta - 8) * 11.25 + 180;
        }
        return convertedtheta;
    }
}

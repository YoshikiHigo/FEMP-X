package inequivalent;

public class ClonePair140 {

    int method1(float... components) {
        float hue = components[0];
        float saturation = components[1];
        float value = components[2];
        hue = hue - (float) Math.floor(hue);
        if (hue < 0) {
            hue -= 1f;
        }
        if (saturation > 1f) {
            saturation = 1f;
        } else if (saturation < 0f) {
            saturation = 0f;
        }
        if (value > 1f) {
            value = 1f;
        } else if (value < 0f) {
            value = 0f;
        }
        int hi;
        float f;
        float hueDeg = hue * 360f;
        if (hueDeg < 120f) {
            hi = 0;
            f = (hueDeg / 120f);
        } else if (hueDeg < 160f) {
            hi = 1;
            f = (hueDeg - 120f) / 40f;
        } else if (hueDeg < 220f) {
            hi = 2;
            f = (hueDeg - 160f) / 60f;
        } else if (hueDeg < 280f) {
            hi = 3;
            f = (hueDeg - 220f) / 60f;
        } else if (hueDeg < 340f) {
            hi = 4;
            f = (hueDeg - 280f) / 60f;
        } else {
            f = (hueDeg - 340f) / 20f;
            hi = 5;
        }
        float p = value * (1 - saturation);
        float q = value * (1 - f * saturation);
        float t = value * (1 - (1 - f) * saturation);
        float red;
        float green;
        float blue;
        switch (hi) {
            case 0:
                red = value;
                green = t;
                blue = p;
                break;
            case 1:
                red = q;
                green = value;
                blue = p;
                break;
            case 2:
                red = p;
                green = value;
                blue = t;
                break;
            case -3:
            case 3:
                red = p;
                green = q;
                blue = value;
                break;
            case -2:
            case 4:
                red = t;
                green = p;
                blue = value;
                break;
            case -1:
            case 5:
                red = value;
                green = p;
                blue = q;
                break;
            default:
                red = green = blue = 0;
                break;
        }
        int rgb = ((int) (red * 255)) << 16 | ((int) (green * 255)) << 8 | ((int) (blue * 255));
        return rgb;
    }

    int method2(float... components) {
        float hue = components[0];
        float saturation = components[1];
        float lightness = components[2];
        hue = hue - (float) Math.floor(hue);
        if (hue < 0) {
            hue = 1f + hue;
        }
        if (saturation > 1f) {
            saturation = 1f;
        } else if (saturation < 0f) {
            saturation = 0f;
        }
        if (lightness > 1f) {
            lightness = 1f;
        } else if (lightness < 0f) {
            lightness = 0f;
        }
        float hueDeg = hue * 360f;
        if (hueDeg < 0) {
            hueDeg += 360f;
        }
        float hk = hue - (float) Math.floor(hue);
        if (hueDeg < 120f) {
            hk /= 2f;
        } else if (hueDeg < 160f) {
            hk = (hk - 120f / 360f) * 3f / 2f + 60f / 360f;
        } else if (hueDeg < 220f) {
            hk = (hk - 160f / 360f) + 120f / 360f;
        } else if (hueDeg < 280f) {
            hk = (hk - 220f / 360f) + 180f / 360f;
        } else if (hueDeg < 340f) {
            hk = (hk - 280f / 360f) + 240f / 360f;
        } else {
            hk = (hk - 340f / 360f) * 3f + 300f / 360f;
        }
        float q;
        if (lightness < 0.5f) {
            q = lightness * (1f + saturation);
        } else {
            q = lightness + saturation - (lightness * saturation);
        }
        float p = 2f * lightness - q;
        float red = hk + 1f / 3f;
        float green = hk;
        float blue = hk - 1f / 3f;
        if (red < 0) {
            red = red + 1f;
        }
        if (green < 0) {
            green = green + 1f;
        }
        if (blue < 0) {
            blue = blue + 1f;
        }
        if (red > 1) {
            red = red - 1f;
        }
        if (green > 1) {
            green = green - 1f;
        }
        if (blue > 1) {
            blue = blue - 1f;
        }
        if (red < 1f / 6f) {
            red = p + ((q - p) * 6 * red);
        } else if (red < 0.5f) {
            red = q;
        } else if (red < 2f / 3f) {
            red = p + ((q - p) * 6 * (2f / 3f - red));
        } else {
            red = p;
        }
        if (green < 1f / 6f) {
            green = p + ((q - p) * 6 * green);
        } else if (green < 0.5f) {
            green = q;
        } else if (green < 2f / 3f) {
            green = p + ((q - p) * 6 * (2f / 3f - green));
        } else {
            green = p;
        }
        if (blue < 1f / 6f) {
            blue = p + ((q - p) * 6 * blue);
        } else if (blue < 0.5f) {
            blue = q;
        } else if (blue < 2f / 3f) {
            blue = p + ((q - p) * 6 * (2f / 3f - blue));
        } else {
            blue = p;
        }
        int rgb = ((int) (red * 255)) << 16 | ((int) (green * 255)) << 8 | ((int) (blue * 255));
        return rgb;
    }
}

//K.A.J.
public class RGBretriever {
    private int red;
    private int green;
    private int blue;

    public RGBretriever(int red, int green, int blue){
        Log.w("model","POJO Constructor ******** ");
        String s = getRgbCode(red,green,blue);
        Log.w("model","POJO Get RGB code ******* ");
    }

    //RGB string
    public String getRgbCode(int red, int green, int blue) {
        red = setRed(red);
        green = setGreen(green);
        blue = setBlue(blue);
        return String.format("#%02X%02X%02X",red, green, blue);    }

    //Red value
    public int getRed(){
        Log.w("model","POJO getting red ******* ");
        return red; }
    public int setRed(int red) {
        Log.w("model","POJO setting red ******* ");
        if (red > 255) {
            red = 255;
        } else if (red < 0) {
            red = 0;
        }
        return red;
    }

    //Green value
    public int getGreen() { return green; }
    public int setGreen(int green) {
        if (green > 255) {
            green = 255;
        } else if (green < 0) {
            green = 0;
        }
        return green;
    }

    //Blue value
    public int getBlue() { return blue; }
    public int setBlue(int blue) {
        if (blue > 255) {
            blue = 255;
        } else if (blue < 0) {
            blue = 0;        }

        return blue;
    }

}

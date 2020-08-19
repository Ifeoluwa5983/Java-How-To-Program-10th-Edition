package Exercise1612;

import java.util.HashMap;
import java.util.Map;

public class ColorCodes {
	private Map<String, String> colors = new HashMap<String, String>();

    public ColorCodes() {
        colors.put("white", "#FFFFFF");
        colors.put("black", "#000000");
        colors.put("ash", "#EEEEEE");
        colors.put("blue", "0074D9");
        colors.put("green", "#2ECC40");
        colors.put("red", "#FF4136");
        colors.put("orange", "#FF851B");
        colors.put("yellow", "#FFDC00");
        colors.put("gray", "#AAAAAA");
    }

    public void draw(String color) {
        String message = "";
        for (String key : colors.keySet()) {
            if (color.equals(key)) {
                message = colors.get(key);
            }
        }
        if (message.equals("")) {
            System.out.println("color code doesn't exist");
        } else {
            System.out.println("drawing with " + message);
        }
    }

}

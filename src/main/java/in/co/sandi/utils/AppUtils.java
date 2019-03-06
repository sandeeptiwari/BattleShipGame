package in.co.sandi.utils;

import java.util.HashMap;
import java.util.Map;

public class AppUtils {

    public static int mapVerticalIndex(char height){
        Map<Character, Integer> verticalIndexMap = new HashMap<>();

        for (int i = 65, j = 1; i < 92; i++) {
            verticalIndexMap.put((char) i, j);
            j++;
        }
        return verticalIndexMap.get(height);
    }

    public static boolean isInsideGrid(int gridSize, int x, int y){
        return x <= gridSize && x >= 0
                && y <= gridSize && y >= 0;
    }
}

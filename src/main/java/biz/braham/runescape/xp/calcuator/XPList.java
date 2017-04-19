package biz.braham.runescape.xp.calcuator;

import java.util.Scanner;

/**
 * Class for converting xp to level or level to xp
 */
public class XPList {
    private int[] levels;

    public XPList() {
        this.levels = this.loadLevels();
    }

    /**
     * Reads xp per level from text file and stores it in internal array
     *
     * @return=
     */
    private int[] loadLevels() {
        int[] temp = new int[120];
        //load levels from file
        Scanner in = new Scanner(getClass().getResourceAsStream("/levels"));
        int currentIndex = 0;
        while (in.hasNext()) {
            temp[currentIndex] = in.nextInt();
            currentIndex++;
        }
        return temp;
    }

    /**
     * Converts xp to a level
     *
     * @param xp
     * @return
     */
    public int xpToLevel(int xp) {
        int level = 0;
        for (int i = 0; i < 120; i++) {
            if (levels[i] > xp) {
                level = i;
                break;
            }
        }
        return level;
    }

    /**
     * Returns min xp required to reach a level
     *
     * @param level
     */
    public int levelToXp(int level) {
        return levels[level - 1];
    }
}

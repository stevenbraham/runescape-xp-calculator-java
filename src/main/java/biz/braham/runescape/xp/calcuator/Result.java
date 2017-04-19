package biz.braham.runescape.xp.calcuator;

/**
 * Class to hold caculation results
 *
 * @see XPCalculator.calculate
 */
public class Result {
    public int currentLevel, requestedLevel, requiredXp, xpDifference, actionsNeeded, totalCost;

    public Result(int currentLevel, int requestedLevel, int requiredXp, int xpDifference, int actionsNeeded, int totalCost) {
        this.currentLevel = currentLevel;
        this.requestedLevel = requestedLevel;
        this.requiredXp = requiredXp;
        this.xpDifference = xpDifference;
        this.actionsNeeded = actionsNeeded;
        this.totalCost = totalCost;
    }
}

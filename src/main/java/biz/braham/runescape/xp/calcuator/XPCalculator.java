package biz.braham.runescape.xp.calcuator;

/**
 * Created by stevenbraham on 20-04-17.
 */
public class XPCalculator {

    private XPList xpList;

    private int currentXp, requestedLevel, costsPerAction = 0;
    private double xpPerAction = 0.0;

    public XPCalculator(int currentXp, int requestedLevel, int costsPerAction, double xpPerAction) {
        this.currentXp = currentXp;
        this.requestedLevel = requestedLevel;
        this.costsPerAction = costsPerAction;
        this.xpPerAction = xpPerAction;
        this.xpList = new XPList();
    }

    public Result calculate() {
        int requiredXp = xpList.levelToXp(requestedLevel);
        int xpDiffernce = requiredXp - currentXp;
        int actionsNeeded = (int) Math.ceil(xpDiffernce / xpPerAction);
        return new Result(
                this.xpList.xpToLevel(currentXp),
                requestedLevel,
                requiredXp,
                xpDiffernce,
                actionsNeeded,
                actionsNeeded * costsPerAction
        );
    }


}

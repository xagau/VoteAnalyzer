class Result {
    private int winningSelection;
    private double majorityPercentage;

    public Result(int winningSelection, double majorityPercentage) {
        this.winningSelection = winningSelection;
        this.majorityPercentage = majorityPercentage;
    }

    public int getWinningSelection() {
        return winningSelection;
    }

    public void setWinningSelection(int winningSelection) {
        this.winningSelection = winningSelection;
    }

    public double getMajorityPercentage() {
        return majorityPercentage;
    }

    public void setMajorityPercentage(double majorityPercentage) {
        this.majorityPercentage = majorityPercentage;
    }
}

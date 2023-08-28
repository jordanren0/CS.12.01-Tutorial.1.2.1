public class StepTracker {
    private int days ;
    private int steps;
    private int activeDays;
    private int stepRequirement;
    private int totalSteps;

    public StepTracker(int s) {
        stepRequirement = s;
        steps = 0;
        days = 0;
        activeDays = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int steps) {
        this.steps = steps;
        if(steps >= stepRequirement) this.activeDays++;
        totalSteps += steps;
        days++;
    }

    public int getDays(){
        return days;
    }

    public int getActiveDays(){
        return activeDays;
    }

    public int activeDays(){
        return days;
    }

    public int getStepsForActiveDay(){
        return stepRequirement;
    }

    public int getTotalSteps(){
        return totalSteps;
    }


    public double averageSteps(){
        if(days == 0)
            return 0;
        return steps/days;
    }



}

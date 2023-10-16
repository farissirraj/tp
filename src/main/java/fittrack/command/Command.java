package fittrack.command;

import fittrack.MealList;
import fittrack.UserProfile;
import fittrack.WorkList;
import fittrack.parser.CommandParser;

public abstract class Command {
    protected UserProfile userProfile;
    protected MealList mealList;
    protected WorkList workList;

    /**
     * Set data of the command for execution.
     *
     * @param userProfile user profile
     * @param mealList meal list
     * @param workList work list
     */
    public void setData(UserProfile userProfile, MealList mealList, WorkList workList) {
        this.userProfile = userProfile;
        this.mealList = mealList;
        this.workList = workList;
    }

    /**
     * Execute the command.
     *
     * @return result of the execution
     */
    public abstract CommandResult execute();

    /**
     * Apply arguments to its field using parser.
     *
     * @param args arguments as a string
     * @param parser parser
     */
    public abstract void setArguments(String args, CommandParser parser);

    /**
     * Returns help of the command.
     *
     * @return help
     */
    protected abstract String getHelp();
}
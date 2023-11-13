# Faris - Project Portfolio Page

Fit Track is a comprehensive fitness tracker software designed to monitor and analyze various aspects of personal wellness like workouts, meals consumed, steps walked, calories burned etc. This will provide users with insights to support their fitness/health goals. It offers an intuitive interface and customizable features, enabling individuals to seamlessly track their progress and make informed decisions about their well-being.


### Summary of Contributions

#### Key Contributions


* **Steps Class**
  - Wrote the class for `Step` which was used to store the steps taken by the user as an object.
  - Wrote the methods to enable parsing, formatting and other operations required within the object.
  - Added on to the Parser and Storage classes to integrate this feature with the existing functionality of the codebase.


* **Add and Delete steps**
  - What it does: allows user to add in their steps and view their steps for the day.
  - Calculate the number of steps taken in a particular day.
  - Delete steps that were added by mistake.
  - Justification: this feature helps user to track their steps and compare it with their daily goals.


* **List Steps**
  - What it does: allows user to view the steps in a list.
  - Delete steps that were added by mistake.
  - Justification: Enables the user to better decide on what operation they want to do. For example, deleting a step uses the index in the list as a reference and viewing the list of steps will allow them to carefully select which entry to delete.


* **Calculate the calories consumed**
  - What it does: Calculate the calories consumed based on the meals eaten.
  - Justification: Allows the user to keep track of their fitness goals through the calories consumed from meals.


* **Calculate the total number of steps walked**
  - What it does: Calculate the total number of steps walked in a given day.
  - Justification: Allows the user to keep track of their daily step count. This will allow the user to analyse their walking habits just as they do for their meals and workouts.


* **Provide suggestions on how many more steps need to be walked to reach the daily calorie goal.**
  - What it does: Calculate the calories consumed based on the number of steps walked.
  - This was done after doing some research into how steps walked by an individual can be quantified calorifically
  - Justification: Allows the user to keep track of their calorie expenses through walking alone.


* **Provide a suggestion on the ideal weight range for the user.**
  - What it does: Calculates the ideal weight range for the user provided their height as entered in the user profile.
  - Justification: Allows the user to be mindful of their weight as they are on the journey to becoming fit.


* **JUnit Tests:** JUnit Testing of Code Written.
  - Made an active effort to write as many JUnit tests for the code I wrote as possible.
  - Made sure this was seamlessly integrated with the existing CI pipeline that we were working along.



#### Code Contributions to the tp
* **Code Contributed:** [RepoSense Link](https://nus-cs2113-ay2324s1.github.io/tp-dashboard/?search=farissirraj&breakdown=false&sort=groupTitle%20dsc&sortWithin=title&since=2023-09-22&timeframe=commit&mergegroup=&groupSelect=groupByRepos)



#### Project Management
  - Contributed to the releases of the Project.
  - Open regular pull requests to update the team on the progress of the project.
  - Assigned pull request to certain issues of the project.
  - Contributed to unit testing of my written code.
  - Communicated with team members using Telegram and MS Teams video call to discuss the features integrated and the progress of the project.
  - Participated in regular code reviews were done using in person after the tutorial slot and online to ensure all new features implemented were in accordance with the required coding standards.
  - Similar channels were used to do code reviews or pair programming for bug fixes when extensive integration with the codebase was required.

#### Challenges Faced:
  - Implementing the steps functionality was particularly challenging as it was an idea that was not initially thought of in the beginning of the project. So, when the parser, storage classes and other files were already setup, then I decided         to implement the steps suite of features. A lot of work was in modifying the pre-existing classes like `Command`, `Storage` and `Command Parser` to ensure that all the new commands pertaining to the `Step` class was integrated seamlessly.
  - Moreover, with other new functionalities coming in from the `Meal` ans `workoutList` from the other developers, the merge conflicts became increasingly difficult to resolve. Here is where we confrenced over video call with screen sharing to       ensure that the conflicts were resolved in the best possible way.
  - Some features like `getstepssuggestion` and `checkrecommendedweight` required some additional research into the ways the calories and weights could be computed. This had to be carefully studied and tests had to be written to ensure         
    consistency and reliability over future iterations.

#### Documentation:
  - User Guide:
    - Documented my added features to the user guide.
    - Added documentation for the features `addsteps`, `deletesteps`, `viewsteps`, `caloriesconsumed`, `getstepssuggestion`, `totalsteps` and `checkrecommendedweight` to allow the new user to start using this project.
  - Developer Guide:
    - Documented my added features to the developer guide.
    - Added documentation for the commands pertaining to the `Step` suite of commands which all inherit from the Command superclass to explain the functionality of the commands to another developer.
    - Added sequence diagrams for some of the commands to explain the flow of the code.

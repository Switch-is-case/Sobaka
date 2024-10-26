import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Model
        DataModel model = new DataModel("Initial Data");
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        // Display the initial data
        presenter.showData();

        // Update the data with user input
        presenter.updateData();

        // Append more data to the existing data
        presenter.appendData();

        // Close the view (release resources)
    }
}

/*
1. Separate the Model, View, and Presenter into different classes.

2. Ensure that the Presenter acts as the intermediary between the Model and the View.

3. Make the Model responsible for managing the data, the View responsible for displaying and gathering user input,
and the Presenter for coordinating between them.
*/
    //create model, view, presenter
    // update data
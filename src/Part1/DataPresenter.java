public class DataPresenter {
    //showing the data
    // taking Input and passing to model
    // append more data to update it
    // INPUT OPERATIONS
    private DataModel model;
    private ConsoleView view;

    // Constructor initializes model and view
    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    // Showing the current data (from the model to the view)
    public void showData() {
        String currentData = model.getData();
        view.displayMessage("Current Data: " + currentData);
    }

    // Taking input from the user and passing it to the model (update)
    public void updateData() {
        String newData = view.getInput("Enter new data");
        model.setData(newData);  // Update model with new data
        view.displayMessage("Data updated to: " + model.getData());
    }

    // Appending more data to the existing data
    public void appendData() {
        String moreData = view.getInput("Enter data to append");
        model.appendData(moreData);  // Append data in the model
        view.displayMessage("Data after append: " + model.getData());
    }
}

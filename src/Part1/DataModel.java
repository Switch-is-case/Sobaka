public class DataModel {
    // storing, updating appending data methods
    // ONLY METHODS getdata, setdata, appenddata
    private String data;

    // Constructor initializes with some data
    public DataModel(String initialData) {
        this.data = initialData;
    }

    // Get the current data
    public String getData() {
        return data;
    }

    // Set new data
    public void setData(String newData) {
        this.data = newData;
    }

    // Append more data to the existing data
    public void appendData(String moreData) {
        this.data += " " + moreData;
    }
}

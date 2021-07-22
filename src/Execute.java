public class Execute {

    public static void main(String[] args) {

        FirstTask firstTask = new FirstTask();
        firstTask.consoleOut();

        SecondTask secondTask = new SecondTask();
        secondTask.greeting();

        ThirdTask thirdTask = new ThirdTask();
        thirdTask.searchValues();
    }
}

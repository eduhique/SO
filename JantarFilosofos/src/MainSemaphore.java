public class MainSemaphore {
    private static int NUMBER_OF_PHILOSOPHERS = 5;
    private static int[] THINK_TIME_ARRAY = {100,100,100,100,100};
    private static int[] EAT_TIME_ARRAY = {100,100,100,100,100};

    public static void main(String[] args) {
        DinnerTable dinner = new DinnerTableSemaphore(NUMBER_OF_PHILOSOPHERS);

        for (int i = 0; i < NUMBER_OF_PHILOSOPHERS; i++) {
            new Philosopher(i, EAT_TIME_ARRAY[i], THINK_TIME_ARRAY[i], dinner);
        }
    }
}

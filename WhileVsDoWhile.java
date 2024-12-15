public class WhileVsDoWhile {
    public static void main(String[] args) {
        int count = 5;

        // Example of a while loop
        System.out.println("While Loop:");
        int i = count;
        while (i < 5) {
            System.out.println("This is iteration: " + i);
            i++;
        }
        // The while loop won't execute because the condition (i < 5) is false at the start

        // Example of a do-while loop
        System.out.println("\nDo-While Loop:");
        int j = count;
        do {
            System.out.println("This is iteration: " + j);
            j++;
        } while (j < 5);
        // The do-while loop executes the block at least once even though the condition (j < 5) is false
    }
}

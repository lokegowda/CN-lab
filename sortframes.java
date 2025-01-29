import java.util.*;

public class SortFrames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        List<Integer[]> frames = new ArrayList<>();

        System.out.print("Enter number of frames: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int seqNum = random.nextInt(1000) + 1;
            System.out.printf("Enter data for frame %d: ", i + 1);
            int data = sc.nextInt();
            frames.add(new Integer[]{seqNum, data});
        }

        System.out.println("\nBefore Sorting:");
        frames.forEach(f -> System.out.printf("SeqNum: %d, Data: %d\n", f[0], f[1]));

        frames.sort(Comparator.comparingInt(f -> f[0]));

        System.out.println("\nAfter Sorting:");
        frames.forEach(f -> System.out.printf("SeqNum: %d, Data: %d\n", f[0], f[1]));
    }
}

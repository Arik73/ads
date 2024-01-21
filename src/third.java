import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        LinkedList<Integer> shelf = new LinkedList<>();

        ArrayList<Integer> removeddisk = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int operation = scanner.nextInt();
            int disknumb;

            switch (operation) {
                case 1:
                    disknumb = scanner.nextInt();
                    shelf.addFirst(disknumb);
                    break;
                case 2:
                    disknumb = scanner.nextInt();
                    shelf.addLast(disknumb);
                    break;
                case 3:
                    removeddisk.add(shelf.removeFirst());
                    break;
                case 4: //
                    removeddisk.add(shelf.removeLast());
                    break;
                default:
                    break;
            }
        }

        for(int element : removeddisk) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
import java.util.Scanner;
public class weekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = {
                {"Sunday", "do home work"},
                {"Monday", "go to courses; watch a film"},
                {"Tuesday", "attend meeting"},
                {"Wednesday", "chill out"},
                {"Thursday", "go to the gym"},
                {"Friday", "study"},
                {"Saturday", "go outside and touch some grass"}
        };

        while (true) {
            System.out.print("Please, input the day of the week: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
            boolean flag = false;
            for (String[] day : schedule) {
                if (day[0].equalsIgnoreCase(input)) {
                    System.out.println("Your tasks for " + day[0] + ": " + day[1] + ".");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }//
        scanner.close();
    }
}
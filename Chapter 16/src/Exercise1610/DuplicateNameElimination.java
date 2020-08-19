package Exercise1610;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNameElimination {
	public static void main(String[] args) {
        List<String> firstnames = new ArrayList<String>();
        Set<String> filterdNames;
        Scanner input = new Scanner(System.in);
        String response;
        System.out.printf("Enter 'done' to finish %nEnter show to show all firstnames %nEnter search to search for a name");

        while (true) {
            System.out.println("Enter name: ");
            response = input.next();
            if (response.equals("done")) {
                break;
            } else if (response.equals("search")) {
                System.out.println("Now enter name to search");
                response = input.next();
                if (firstnames.contains(response)) {
                    System.out.println("Yes it does");
                    break;
                } else {
                    System.out.println("No it doesn't");
                    break;
                }
            }
            firstnames.add(response);
        }

        filterdNames = new HashSet<String>(firstnames);
        for (String name : filterdNames) {
            System.out.println(name);
        }
    }

}

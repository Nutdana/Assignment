
import java.util.*;  // Import the Scanner class

class Random_House {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        for(boolean reset = false;reset == false;){
            int N = scan.nextInt();

            scan.nextLine();
            ArrayList<String> Gryffindor = new ArrayList<String>();
            ArrayList<String> Hufflepuff = new ArrayList<String>();
            ArrayList<String> Ravenclaw = new ArrayList<String>();
            ArrayList<String> Slytherin = new ArrayList<String>();
            for (int i = 0; i < N; i++) {
                String name = scan.nextLine();
                if (i % 4 == 0) {
                    Gryffindor.add(name);
                    System.out.println(name + " got the Gryffindor");
                } else if (i % 4 == 1) {
                    Hufflepuff.add(name);
                    System.out.println(name + " got the Hufflepuff");
                } else if (i % 4 == 2) {
                    Ravenclaw.add(name);
                    System.out.println(name + " got the Ravenclaw");
                } else if (i % 4 == 3) {
                    Slytherin.add(name);
                    System.out.println(name + " got the Slytherin");
                }
                if (i == N - 1) {
                    System.out.println("Received the full number of students");
                }
            }

            System.out.println("Gryffindor has a number " + Gryffindor.size());
            System.out.println("List of students in Gryffindor House");
            for (String name : Gryffindor) {
                System.out.println(name);
            }

            System.out.println("Hufflepuff has a number " + Hufflepuff.size());
            System.out.println("List of students in Hufflepuff House");
            for (String name : Hufflepuff) {
                System.out.println(name);
            }

            System.out.println("Ravenclaw has a number " + Ravenclaw.size());
            System.out.println("List of students in Ravenclaw House");
            for (String name : Ravenclaw) {
                System.out.println(name);
            }

            System.out.println("Slytherin has a number " + Slytherin.size());
            System.out.println("List of students in Slytherin House");
            for (String name : Slytherin) {
                System.out.println(name);
            }

            System.out.println("Do you want to reset?");
            System.out.println("Enter 1 to not reset.");
            System.out.println("Enter 2 to reset.");
            int choose = scan.nextInt();
            
            if (choose == 1) {
                System.out.println("Not Reset");
                reset = true ;
            } else if (choose == 2) {
                System.out.println("Reset");
                Gryffindor.clear();
                Hufflepuff.clear();
                Ravenclaw.clear();
                Slytherin.clear();
                reset = false ;
            }
        }
    }
}

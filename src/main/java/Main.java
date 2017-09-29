import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Writter writter = new Writter();
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        if(user.contains("$ manager add ")) {
            String text = "";
            text = user.substring(user.indexOf("\"") + 1, user.length() - 1);
            if (user.contains("game")){
                writter.write(text, "game");
            }
            else if (user.contains("book")){
                writter.write(text, "book");
            }
            else if (user.contains("film")){
                writter.write(text, "film");
            }
        }


    }
}
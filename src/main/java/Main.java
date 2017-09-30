import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sorted sorted = new Sorted();
        Deleter deleter = new Deleter();
        Writter writter = new Writter();
        Reader reader = new Reader();
        Chenger chenger = new Chenger();
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        //add status
        if (user.contains("$ manager add status ")){
            String text = "";
            text = user.substring(user.indexOf("\"") + 1, user.length() - 1);
            System.out.println("ВВедите статус");
            String status = sc.nextLine();
            if (user.contains("game")) {
                chenger.chengeStatus(text, status, "game");
            }
            else  if (user.contains("film")) {
                chenger.chengeStatus(text, status, "film");
            }
            else  if (user.contains("book")) {
                chenger.chengeStatus(text, status, "book");
            }
        }
        //add
       else if (user.contains("$ manager add ")) {
            String text = "";
            text = user.substring(user.indexOf("\"") + 1, user.length() - 1);
            if (user.contains("game")) {
                writter.write(text, "game");
            } else if (user.contains("book")) {
                writter.write(text, "book");
            } else if (user.contains("film")) {
                writter.write(text, "film");
            }
        }
        //sorted
        if (user.contains("$ manager print -s ")) {
            if (user.contains("game")) {
                sorted.readSortedList("game");
            } else if (user.contains("book")) {
                sorted.readSortedList("book");
            } else if (user.contains("film")) {
                sorted.readSortedList("film");
            }
        }
            //print
            else if (user.contains("$ manager print ")) {
                if (user.contains("game")) {
                    reader.readList("game");
                } else if (user.contains("book")) {
                    reader.readList("book");
                } else if (user.contains("film")) {
                    reader.readList("film");
                }
            }

            //print status
            if(user.contains("$ manager status ")) {
                String text = "";
                text = user.substring(user.indexOf("\"") + 1, user.length() - 1);
                if (user.contains("game"))
                    reader.readStatus(text, "game");
                else if (user.contains("film"))
                    reader.readStatus(text, "filn");
                else if (user.contains("book"))
                    reader.readStatus(text, "book");
            }
            //chenge name
        if (user.contains("$ manager edit ")){
            String text = "";
            text = user.substring(user.indexOf("\"") + 1, user.length() - 1);
            if (user.contains("game")) {
                System.out.println("Введите новое название");
                String newName = sc.nextLine();
                chenger.chengeName(text, newName, "game");
            }
            else  if (user.contains("film")) {
                System.out.println("Введите новое название");
                String newName = sc.nextLine();
                chenger.chengeName(text, newName, "film");
            }
            else  if (user.contains("book")) {
                System.out.println("Введите новое название");
                String newName = sc.nextLine();
                chenger.chengeName(text, newName, "book");
            }
        }
        //delete
        if (user.contains("$ manager remove ")){
            String text = "";
            text = user.substring(user.indexOf("\"") + 1, user.length() - 1);
            if (user.contains("game")) {
                deleter.delete(text, "game");
            }
            else  if (user.contains("film")) {
                deleter.delete(text, "film");
            }
            else  if (user.contains("book")) {
                deleter.delete(text,"book");
            }
        }
    }
}
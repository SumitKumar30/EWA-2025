// Example of a tightly coupled Greeting Application


// Gretting App --> main class --> to greet users based on the input language or language preference

import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Choose language (1 for English, 2 for Spanish, 3 for French, 4 for Hindi):");
        int choice = scanner.nextInt();
        GreetingService greetingService = GreetingFactory.getGreetingService(choice);
        if (greetingService != null) {
            greetingService.greet(name);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}

interface GreetingService {
    void greet(String name);
}

// English language

class EnglishGreeting implements GreetingService {
    @Override
    public void greet(String name) {
        System.out.println("Hello! "+name);
    }
}

// Spanish language
class SpanishGreeting implements GreetingService {

    @Override
    public void greet(String name) {
        System.out.println("¡Hola! "+name);
    }
}

// French language
class FrenchGreeting implements GreetingService {

    @Override
    public void greet(String name) {
        System.out.println("Bonjour! "+name);
    }
}

class HindiGreeting implements GreetingService {

    @Override
    public void greet(String name) {
        System.out.println("Namaste! "+name);
    }
}

// factory class for creating greeting objects 

class GreetingFactory {
    public static GreetingService getGreetingService(int choice) {
        switch (choice) {
            case 1:
                return new EnglishGreeting();
            case 2:
                return new SpanishGreeting();
            case 3:
                return new FrenchGreeting();
            case 4:
                return new HindiGreeting();
            default:
                return null;
        }
    }
}   
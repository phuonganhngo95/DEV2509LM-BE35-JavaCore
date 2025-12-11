package Lab14.BT4;

import java.util.Random;

public class SimpleNameNormalization {
    public static void main(String[] args) {
        String[] listName = {
            "nGuYeN hOa bhH", 
            "IE HfaNh hAi", 
            "iRan mAnH tIeN", 
            "IE qUAnG qUaN"
        };
        
        Object lock = new Object();
        final String[] currentName = new String[1];
        final boolean[] nameReady = {false};
        
        Thread t1 = new Thread(() -> {
            Random rand = new Random();
            for (int i = 0; i < 5; i++) {
                synchronized(lock) {
                    while (nameReady[0]) {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                    
                    currentName[0] = listName[rand.nextInt(listName.length)];
                    nameReady[0] = true;
                    System.out.println("Thread 1: " + currentName[0]);
                    lock.notify();
                }
                
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized(lock) {
                    while (!nameReady[0]) {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                    
                    System.out.println("Thread 2: " + normalizeName(currentName[0]));
                    nameReady[0] = false;
                    lock.notify();
                }
            }
        });
        
        t1.start();
        t2.start();
    }
    
    private static String normalizeName(String name) {
        String[] words = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1).toLowerCase())
              .append(" ");
        }
        return sb.toString().trim();
    }
}
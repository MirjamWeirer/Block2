public class LoopDemo {

    public static void main(String[] args) {
        //while => solange die Bedingung
        /*while (true){
            System.out.println("Der Pinguin schlug die Zeitung auf, da Stand:"); //dieses Beispiel würde eine Endlosschleife erstellen
        }*/

        //while (Bedingung)

        //genau 100 mal ausgeben
        int counter = 100;
        while (counter > 0){
            counter --; //counter = counter -1;
            System.out.println(counter + ": Der Pinguin schlug die Zeitung auf, da Stand: ");
        }
        //Aufgabe: wihle loop, zählt von 1 bis 100, Zahl ausgeben und im Fall von ungerade "ping" und gerade "pong"

        int i=1;
        while (i<=100){
            if (i %2 ==0){
                System.out.println(i + " pong");
            }
            else {
                System.out.println(i + " ping");
            }
            i++;
        }
    }
}

public class Loop {
    public static void main(String[] args) {
        //Displayausgabe alle Zahlen zwischen 1 und 100, welche durch 3, 5 oder 7 teilbar sind
        int counter = 1;
        while (counter <=500){
            if (counter % 7 == 0 || counter % 5 == 0 || counter % 3 == 0){
                System.out.println(  counter);
            }
            counter ++;
        }

        int counter2 = 500;
        do {
            System.out.println("do counter < 100");
        }while (counter2 < 100); //mind. 1 Durchlauf da Bedingung am schluss ist, sonst gleich wie while
    }
}

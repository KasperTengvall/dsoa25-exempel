public class Main {

    public static void main(String[] args) {

        String[] testdata = {"Frodo", "Sam", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Merry", "Pippin", "Bilbo", "Elrond", "Galadriel", "Saruman", "Theoden", "Eowyn", "Eomer", "Faramir", "Denethor", "Arwen"};
        String[] sortedData = {"Aragorn", "Arwen", "Bilbo", "Boromir", "Denethor", "Elrond", "Eomer", "Eowyn", "Faramir", "Frodo", "Galadriel", "Gandalf", "Gimli", "Legolas", "Merry", "Pippin", "Sam", "Saruman", "Theoden"};
        String[] weekDays = {"Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag", "Söndag"};

        Graphy graphy = new Graphy();

        Queuey queuey = new Queuey();
        queuey.enqueue("Aragorn");
        queuey.enqueue("Arwen");
        System.out.println("Först i kön: " + queuey.peek());
        System.out.println(queuey.toString());
        queuey.enqueue("Bilbo");
        System.out.println(queuey.toString());
        System.out.println("Dequeue: " + queuey.dequeue());
        System.out.println(queuey.toString());





        /*
        int today = 3;

        int daysAhead = -2;
        int futureDayIndex = (today + daysAhead) % 7;

        if (futureDayIndex < 0) {
            futureDayIndex += 7;
        }

        System.out.printf("Om %d dagar är det %s\n", daysAhead, weekDays[futureDayIndex]);


         */


        /**
         * Stack
         */
        Stacky stacky = new Stacky(5);
        stacky.push("Frodo");
        stacky.push("Sam");
        stacky.push("Gandalf");
        stacky.push("Gimli");
        stacky.push("Legolas");
        stacky.push("Boromir");
        System.out.println(stacky.toString());


        System.out.println("");

        /**
         * Linked list
         */
        Person frodo = new Person(testdata[0]);
        Person sam = new Person(testdata[1]);
        Person gandalf = new Person(testdata[2]);
        Person aragorn = new Person(testdata[3]);

        Linky linky = new Linky();
        linky.add(frodo);
        linky.add(sam);
        linky.add(gandalf);
        linky.add(aragorn);

        System.out.println(linky.toString());
        System.out.println("Linky has " + linky.size() + " nodes");


        System.exit(0);

    }
}
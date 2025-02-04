public class Main {
    public static void main(String[] args) {
        // Example data
        String[] sortedData = {"Aragorn", "Arwen", "Balin", "Bilbo", "Boromir", "Celeborn",
                "Denethor", "Elrond", "Eowyn", "Faramir", "Frodo", "Galadriel",
                "Gandalf", "Gildor", "Glorfindel", "Gimli", "Gollum", "Haldir",
                "Legolas", "Luthien", "Merry", "Pippin", "Radagast", "Rosie",
                "Sam", "Saruman", "Theoden", "Thorin", "Treebeard"};

        StringArray names = new StringArray(sortedData);

        names.add("Frodo");
        System.out.println(names.toString());

        names.reverse();
        System.out.println(names.toString());

        System.exit(0);
    }
}

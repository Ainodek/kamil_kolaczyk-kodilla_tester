public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("MSI",600, 1000, 2010);
        System.out.println(notebook.producent + " weight: " + notebook.weight + " and price: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.comparesYearPrice();
        System.out.println("-----");

        Notebook heavyNotebook = new Notebook("Gigabyte",2000, 1500, 2023);
        System.out.println(heavyNotebook.producent + " weight: " + heavyNotebook.weight + " and price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.comparesYearPrice();
        System.out.println("-----");

        Notebook oldNotebook = new Notebook("IBM", 1200, 500, 2000);
        System.out.println(oldNotebook.producent + " weight: " + oldNotebook.weight + " and price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.comparesYearPrice();
        System.out.println("-----");

        Notebook lenovoNotebook = new Notebook("Lenovo", 2500, 900,2021);
        System.out.println(lenovoNotebook.producent + " weight: " + lenovoNotebook.weight + " and price: " + lenovoNotebook.price);
        lenovoNotebook.checkPrice();
        lenovoNotebook.checkWeight();
        lenovoNotebook.comparesYearPrice();
        System.out.println("-----");

        Notebook dellNotebook = new Notebook("Dell", 900, 2000, 2022);
        System.out.println(dellNotebook.producent + " weight: " + dellNotebook.weight + " and price: " + dellNotebook.price);
        dellNotebook.checkPrice();
        dellNotebook.checkWeight();
        dellNotebook.comparesYearPrice();
        System.out.println("-----");

        Notebook toshibaNotebook = new Notebook("Toshiba",2000, 1500, 2009);
        System.out.println(toshibaNotebook.producent + " weight: " + toshibaNotebook.weight + " and price: " + toshibaNotebook.price);
        toshibaNotebook.checkPrice();
        toshibaNotebook.checkWeight();
        toshibaNotebook.comparesYearPrice();
        System.out.println("-----");

    }
}

public class Notebook {
    int weight;
    int price;
    int year;
    String producent;
    public Notebook(String producent, int weight, int price, int year){
        this.producent = producent;
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice(){
        if(this.price>1000) {
            System.out.println("This notebook is expensive");
        }
        else if(this.price<=1000 && this.price>=600){
            System.out.println("The price id good");
        }
        else{
            System.out.println("This notebook is very cheap");
        }
    }
    public void checkWeight(){
        if(this.weight<1000){
            System.out.println("This notebook is ultralight");
        }
        else if (this.weight>=1000 && this.weight<=1500){
            System.out.println("This notebook is not too heavy");
        }
        else{
            System.out.println("This notebook is overweight!");
        }
    }
    public void comparesYearPrice(){
/*        if(this.price > 1000 && this.year >= 2023){
            System.out.println("This nootebook is expensive because it is new generation");
        }
        else if(this.price<=1000 && this.price>=600 && this.year<2023 && this.year>2000){
            System.out.println("This notebook is well priced, but is not new");
        }
        else if(this.price<600 && this.year<=2000){
            System.out.println("This nootebook is cheap because is too old");
        }
        else {
            System.out.println("Double check this offer, please");
        }

 */
        if(this.year>=2023) {
            if (this.price >= 2000) {
                System.out.println("This notebook is expensive but is latest generation");
            } else if (this.price >= 1000 && this.price < 2000) {
                System.out.println("This notebook is well priced and latest generation");
            } else {
                System.out.println("This notebook is very cheap and brand new!");
            }
        }
        else if(this.year>=2020 && this.year<2023){
            if (this.price >= 2000) {
                System.out.println("This notebook is expensive and not the newest");
            } else if (this.price >= 1000 && this.price < 2000) {
                System.out.println("This notebook is well priced");
            } else {
                System.out.println("This notebook is cheap because is older");
            }
        }
        else{
            if(this.price>=2000){
                System.out.println("This notebook is antique");
            }
            else if(this.price >= 1000 && this.price < 2000){
                System.out.println("This notebook is expensive for its age");
            }
            else{
                System.out.println("This notebook is cheap because it is old");
            }
        }
    }
}

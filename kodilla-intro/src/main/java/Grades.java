public class Grades {
    private int[] grades;
    private int size;
    private double avgGrades = 0;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value){
        if(this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int lastGrade(){
        return this.grades[this.size-1];
    }
    public double avgGrades(){
        for(int i = 0; i < this.size; i++){
            avgGrades += this.grades[i];
        }
        return avgGrades/this.size;
    }

}

package week1.les1.opdracht5;

public class Student {
    private String naam;
    private int studentNummer;

    public Student(String nm) {
        this.naam = nm;
    }

    public Student(String nm, int stNr) {
        this.naam = nm;
        this.studentNummer = stNr;
    }

    public String getNaam() {
        return this.naam;
    }

    public int getStudentNummer(){
        return this.studentNummer;
    }

    public void setStudentNummer(int stNr){
        this.studentNummer=stNr;
    }

    @Override
    public String toString() {
        return "Deze student heet " + this.naam + " en heeft nummer: " + this.studentNummer;
    }
}

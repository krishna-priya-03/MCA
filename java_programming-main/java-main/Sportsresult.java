// create class student and sport and create another class result inherited from student and sports display the academic and sports score of a student.
interface Student {
    int score = 10;
    void displayscore();
}
interface Sport {
    int score = 25;
    void displaysports();
}
class Result implements Student, Sport {
    public void displayscore() {
        System.out.println("Academic Score: " + Student.score);
    }
    public void displaysports() {
        System.out.println("Sports Score: " + Sport.score);
    }
}
public class Sportsresult {
    public static void main(String[] args) {
        Result r = new Result();
        r.displayscore();
        r.displaysports();
    }
}
    
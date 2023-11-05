package Week5.lab.FirstProblem;

interface NationalService {
    int getDaysLeft();
    void work();
}
class CivilService implements Week5.lab.NationalService {
    private int daysLeft;
    public CivilService(int daysLeft) {
        this.daysLeft = 362;
    }
    @Override
    public int getDaysLeft() {
        return 0;
    }
    @Override
    public void work() {
        if(daysLeft > 0){
            daysLeft--;
        }
    }
}
class MilitaryService implements Week5.lab.NationalService {
    private int daysLeft;
    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
    }
    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }
    @Override
    public void work() {
        if(daysLeft > 0){
            daysLeft--;
        }
    }
}

package Kviz;

interface NationalService {
    int getDaysLeft();
    void work();
}
class CivilService implements NationalService{
    private int DaysLeft;
    public CivilService(int DaysLeft){
        this.DaysLeft = 356;
    }
    @Override
    public int getDaysLeft() {
        return 0;
    }

    @Override
    public void work() {
        if(DaysLeft > 0){
            DaysLeft--;
        }
    }
}
class MilitaryService implements NationalService {
    private int DaysLeft;
    public MilitaryService(int DaysLeft){
        this.DaysLeft = DaysLeft;
    }
    @Override
    public int getDaysLeft() {
        return DaysLeft;
    }
    @Override
    public void work() {
        if(DaysLeft > 0){
            DaysLeft--;
        }
    }
}
class Main{
    public static void main(String[] args) {

    }
}
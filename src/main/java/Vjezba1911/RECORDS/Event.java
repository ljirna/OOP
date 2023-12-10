package Vjezba1911.RECORDS;
import java.util.List;
import java.util.Arrays;
record Event (int eventId, String eventName, String location, int attendance){
}
class  EventManager{
    public static double findAverageAttendance(List<Event> events){
        return events.stream()
                .mapToDouble(a -> a.attendance())
                .average()
                .orElse(0.0);
    }
}
class MainSix{
    public static void main(String[] args) {
        List<Event> students = Arrays.asList(
                new Event(111, "Central Clubbing", "Sarajevo", 1000),
                new Event(222, "Laganini events", "Zenica", 202020),
                new Event(333, "Kod saketa","Sarajevo", 2002020)
        );
        System.out.println(EventManager.findAverageAttendance(students));
    }
}
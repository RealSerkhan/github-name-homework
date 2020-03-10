package hw08;

public enum DayofWeek {
    Monday("Education"),Tuesday("Again"), Wednesday("Reading"), Thursday("Going"), Friday("Cuma"), Saturday("Resting"), Sunday("getting ready");
    String schedule;

    DayofWeek(String schedule) {
        this.schedule = schedule;
    }
}

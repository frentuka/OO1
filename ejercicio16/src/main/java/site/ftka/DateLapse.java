package site.ftka;

import java.time.LocalDate;

public class DateLapse {

    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from, LocalDate to) {
        if (from == null || to == null || from.isAfter(to)) {
            throw new IllegalArgumentException();
        }
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public int sizeInDays() {
        return (int) (to.toEpochDay() - from.toEpochDay()) + 1;
    }

    public boolean includesDate(LocalDate date) {
        if (date == null)
            return false;

        return (date.isEqual(from) || date.isAfter(from)) && (date.isEqual(to) || date.isBefore(to));
    }
}

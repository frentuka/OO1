package site.ftka;

import java.time.LocalDate;

public class DateLapse {

    private LocalDate from;
    private int sizeInDays;

    public DateLapse(LocalDate from, LocalDate to) {
        if (from == null || to == null || from.isAfter(to)) {
            throw new IllegalArgumentException();
        }
        this.from = from;
        this.sizeInDays = sizeInDays();
    }

    public DateLapse(LocalDate from, int sizeInDays) {
        if (from == null || sizeInDays <= 0)
            throw new IllegalArgumentException();
        this.from = from;
        this.sizeInDays = sizeInDays;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return from.plusDays(sizeInDays - 1);
    }

    public int sizeInDays() {
        return (int) (getTo().toEpochDay() - from.toEpochDay()) + 1;
    }

    public boolean includesDate(LocalDate date) {
        if (date == null)
            return false;

        return (date.isEqual(from) || date.isAfter(from)) && (date.isEqual(getTo()) || date.isBefore(getTo()));
    }
}

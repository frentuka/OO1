package site.ftka.oobnb;

import java.time.LocalDate;

public class DateLapse {

    private final LocalDate from;
    private final int sizeInDays;

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

    public boolean overlaps(DateLapse dateLapse) {
        if (dateLapse == null)
            return false;

        return includesDate(dateLapse.getFrom()) || includesDate(dateLapse.getTo())
                || dateLapse.includesDate(from) || dateLapse.includesDate(getTo());
    }

}

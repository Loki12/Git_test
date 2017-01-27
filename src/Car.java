import java.awt.*;

/**
 * Created by ${User} on ${Date}
 */
class Car {

    private String mark;
    private int serisl_number, year;
    private Color color;

    public Car(String mark, int serisl_number, int year, Color color) {
        this.mark = mark;
        this.serisl_number = serisl_number;
        this.year = year;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSerisl_number() {
        return serisl_number;
    }

    public void setSerisl_number(int serisl_number) {
        this.serisl_number = serisl_number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

package chapter1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Objects;

public class Ex11 {
    public static class SmartDate {
        private int month;
        private int day;
        private int year;

        SmartDate(int month, int day, int year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        SmartDate(String date) {
            String dates[] = date.split(" ");
            if ((month = Integer.parseInt(dates[0])) > 12 || (month = Integer.parseInt(dates[0])) < 0)
                throw new RuntimeException("illegal date");
            if ((day = Integer.parseInt(dates[1])) > 31 || (day = Integer.parseInt(dates[1])) < 0)
                throw new RuntimeException("illegal date");
            if ((year = Integer.parseInt(dates[2])) > 2020 || (year = Integer.parseInt(dates[2])) < 2000)
                throw new RuntimeException("illegal date");
        }

        int month() {
            return month;
        }

        int day() {
            return day;
        }

        int year() {
            return year;
        }

        public String toString() {
            return month() + "/" + day() + "/" + year();
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SmartDate smartDate = (SmartDate) o;
            return month == smartDate.month &&
                    day == smartDate.day &&
                    year == smartDate.year;
        }

        public int hashCode() {
            return Objects.hash(month, day, year);
        }
    }


    public static void main(String[] args) {
        String s = StdIn.readLine();
        SmartDate smartDate = new SmartDate(s);
        StdOut.println(smartDate.month());
        StdOut.println(smartDate.day());
        StdOut.println(smartDate.year());
    }
}

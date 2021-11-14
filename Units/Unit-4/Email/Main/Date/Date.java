/*
* This program represents a Date class.
* @author (Roy Bachar)
* @version (0.0.1)
*/
public class Date {
    private int _day;
    private int _month;
    private int _year;

    public Date(int d, int m, int y) {
        _day = d;
        _month = m;
        _year = y;
    }

    public Date(Date other) {
        _day = other._day;
        _month = other._month;
        _year = other._year;
    }

    public int getDay() {
        return _day;
    }

    public int getMonth() {
        return _month;
    }

    public int getYear() {
        return _year;
    }

    public void setDay(int day) {
        _day = day;
    }

    public void setMonth(int month) {
        _month = month;
    }

    public void setYear(int year) {
        _year = year;
    }


    public boolean equals(Date other) {
        return (_day == other._day && _month == other._month && _year == other._year);
    }

    public boolean before(Date other) {
        if(this.equals(other)) return false;
        if(_year == other._year) {
            if(_month == other._month) {
                if(_day < other._day) return true;
                else return false;
            } else if(_month < other._month) return true;
        } else if(_year < other._year) return true;
        return false;
    }


    public boolean after(Date other) {
        return other.before(this);
    }


    public String toString() {
        String day = (_day < 10 ? "0" + _day : _day) + "/";
        String month = (_month < 10 ? "0" + _month : _month) + "/";
        String year = Integer.toString(_year);
        
        return (day + month + year); 
    }
 

}



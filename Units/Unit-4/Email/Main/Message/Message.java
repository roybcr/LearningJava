/*
* This program represents a Message class.
* @author (Roy Bachar)
* @version (0.0.1)
*/
public class Message {
    private String _email;
    private String _subject;
    private String _content;
    private Date _dateReceived;

    public Message(String email, String subject, String content, Date dateReceived) {
        _email = email;
        _subject = subject;
        _content = content;
        _dateReceived = new Date(dateReceived);
    }

    public Message(Message other) {
        _email = other._email;
        _subject = other._subject;
        _content = other._content;
        _dateReceived = new Date(other._dateReceived);
    }

    public String getEmail() {
        return _email;
    }

    public String getSubject() {
        return _subject;
    }

    public String getContent() {
        return _content;
    }

    public Date getDate() {
        return _dateReceived;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public void setSubject(String subject) {
        _subject = subject;
    }

    public void setContent(String content) {
        _content = content;
    }

    public void setDate(Date date) {
        _dateReceived.setDay(date.getDay());
        _dateReceived.setMonth(date.getMonth());
        _dateReceived.setYear(date.getYear());
    }

    public boolean equals(Message other) {
        return (_email == other._email && _subject == other._subject && _content == other._content
                && _dateReceived.equals(other._dateReceived));
    }

    public boolean isValidAddress() {
        return _email.indexOf('@') != -1;
    }

    public int howManywords() {
        int length = _content.split(" ").length;
        return length > 5 ? 5 : length;
    }

    public boolean wasReceivedEarlier(Message other) {
        return other._dateReceived.after(_dateReceived);
    }

    public String toString() {
        return "To: " + _email + "\n\r" + "Subject: " + _subject + "\n\r" + "Content: " + _content + "\n\r"
                + "Date received: " + _dateReceived.toString();
    }

}

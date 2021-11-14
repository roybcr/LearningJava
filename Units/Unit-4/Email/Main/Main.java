public class Main {
    public static void main(String[] args) {
        
        Date date = new Date(2, 12, 1997);
        Date date2 = new Date(2, 12, 1997);
        Date date3 = new Date(1, 1, 1780);
        Date date4 = new Date(5, 5, 2025);

        Message msg = new Message("adalovelace.com", "Regarding our last convo...", "Hey there !", date);
        Message msg2 = new Message("roy@roy.com", "Regarding our last convo...",
                "Or, use the normal version of the Integer class object. "
                        + "This cannot be used with the primitive type int",
                date2);


        System.out.println(date2.before(date)); // Expecting: false

        System.out.println(date2.after(date)); // Expecting: false

        System.out.println(date2.equals(date)); // Expecting: true

        System.out.println(date3.before(date)); // Expecting: true

        System.out.println(date.before(date3)); // Expecting: false

        System.out.println(date2.after(date3)); // Expecting: true

        System.out.println(date3.equals(date4)); // Expecting: false

        System.out.println(date); // Expecting: 02/12/1997

        System.out.println(date2); // Expecting: 02/12/1997

        System.out.println(date3); // Expecting: 01/01/1780

        System.out.println(date4); // Expecting: 05/05/2025

        System.out.println("\n\r");

        System.out.println("The Email: " + (msg.getEmail()) + " is " + (msg.isValidAddress() ? "valid." : "not valid.")); // Expecting: not valid

        System.out.println("The Email: " + (msg2.getEmail()) + " is " + (msg2.isValidAddress() ? "valid." : "not valid.")); // Expecting: valid

        System.out.println("Message 2 date is: " + msg2.getDate()); // Expecting: 02/12/1997

        msg2.setDate(date4);

        System.out.println("Message 2 date was updated to be: " + msg2.getDate());

        System.out.println("Message 2 Date: " + (msg2.getDate()) + "\n\r" + "Message 1 Date: " + (msg.getDate()));

        System.out.println("Message 2 content length: " + msg2.howManywords()); // Expecting: 5

        System.out.println("Message 1 content length: " + msg.howManywords()); // Expecting: 3

        System.out.println("Messgae 2 was recieved earlier: " + msg2.wasReceivedEarlier(msg)); // Expecting: false

        msg.setDate(date3);

        System.out.println("Message 1 date was updated to be: " + msg.getDate());

        System.out.println("Message 2 Date: " + (msg2.getDate()) + "\n\r" + "Message 1 Date: " + (msg.getDate()));

        System.out.println("Messgae 1 was recieved earlier: " + msg.wasReceivedEarlier(msg2)); // Expecting: true

        System.out.println("Messgae 2 is equal to Message 1: " + msg2.equals(msg)); // Expecting: false

        msg.setEmail(msg2.getEmail());

        msg.setSubject(msg2.getSubject());

        msg.setContent(msg2.getContent());

        msg.setDate(msg2.getDate());

        System.out.println("Message 1 should now be equal Message 2");

        System.out.println("Messgae 1 is equal to Message 2: " + msg.equals(msg2)); // Expecting: true

        System.out.println(msg2);

        System.out.println(msg);
    }
}


import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Mamad {
    public static void main(String[] args) {
        //SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date created = Calendar.getInstance().getTime();  
        System.out.println(created);
        Date dateCreated = new Date();
        
        System.out.println(dateCreated);
        System.out.println("E-Mail Adressen: " + emailAdressen("muster@muster.de"));

    }


    public static boolean emailAdressen(String emailAdressen) {
        Pattern pattern = Pattern.compile("^[A-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[A-Z0-9_!#$%&'*+/=?`{|}~^-]+↵\n" +
                ")*@[A-Z0-9-]+(?:\\.[A-Z0-9-]+)*$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(emailAdressen);
        return matcher.find();
    }
}

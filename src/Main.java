import java.util.Calendar;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
       System.out.println(upg87()); System.out.println(upg88());
    }


    public static String upg87() {

        LocalTime currentTime = LocalTime.now();
        String time = currentTime.toString();
        return(time);


    }

    public static String upg88() {

        String date = Calendar.getInstance().getTime().toString(); //gör (currentDate) till en String
        String[] datearray = date.split(" "); //delat upp datumet för att localisera de olika delarna

        String day = datearray[2]; //hittar dagen i (currentDate) och gör det till en string
        String year = datearray[5]; //hittar året i (currentDate) och gör det till en string


        //if satser för varje månad
       String month = null;
        if (date.contains("Jan")) {
            month = "01";
        }
        if (date.contains("Feb")) {
            month = "02";
        }
        if (date.contains("Mar")) {
            month = "03";
        }
        if (date.contains("Apr")) {
            month = "04";
        }
        if (date.contains("May")) {
            month = "05";
        }
        if (date.contains("Jun")) {
            month = "06";
        }
        if (date.contains("Jul")) {
            month = "07";
        }
        if (date.contains("Aug")) {
            month = "08";
        }
        if (date.contains("Sep")) {
            month = "09";
        }
        if (date.contains("Oct")) {
            month = "10";
        }
        if (date.contains("Nov")) {
            month = "11";
        }
        if (date.contains("Dec")) {
            month = "12";
        }

        return (year + "/" + month + "/" + day); //skickar tillbaka alla strings för att skrivas ut genom metod (main)

    }


    }


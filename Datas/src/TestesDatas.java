import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;




public class TestesDatas {
    public static void main(String[] args) {


        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("07/07/1986", formato);

        Integer teste = Period.between(data, LocalDate.now()).getYears();

        System.out.println(teste);


        }


}

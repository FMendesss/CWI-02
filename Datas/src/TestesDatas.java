import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;




public class TestesDatas {
    public static void main(String[] args) {


       LocalDate nascimento = LocalDate.of(1986-07-07);
       LocalDate idade = Period.between(LocalDate.now(), nascimento).getYears();

            System.out.println(idade);
        }


}

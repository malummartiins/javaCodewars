package progJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {

        //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        
        Date currentDate = new Date(); //para data completa
        System.out.println(currentDate);

        //para formatar e ver apenas a hora, min e seg;
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));

        //para formatar para ver apenas mês, dia e ano;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(currentDate));

        //para ver o dia:
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeekFormat.format(currentDate));

        //testando itens da documentação;
        SimpleDateFormat teste = new SimpleDateFormat("EEE, MMM d, yyyy");
        System.out.println(teste.format(currentDate));



    }
}

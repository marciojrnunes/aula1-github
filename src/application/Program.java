package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		/*--------------------------------------------------------
		 * Exemplo uso do Calendar
		 */
		
		System.out.println("Bom dia!");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		//Acrescenta 4 horas nessa data
		Calendar cal = Calendar.getInstance();			//instancia o Calendar
		cal.setTime(d);			//Atribui a data armazenada em d para a instancia cal
		cal.add(Calendar.HOUR_OF_DAY, 4);			//Soma 4 horas
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		
		int minutes = cal.get(Calendar.MINUTE);	   //Pega a quantidade de minutos da data
		System.out.println(minutes);
		int month = 1 + cal.get(Calendar.MONTH);		//Pega o mês da data (0-jan ... 11-dez)
		System.out.println(month);
		
		
		/*--------------------------------------------------------
		 * Exemplo uso da classe Date
		 
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();			//Data atual
		Date x2 = new Date(System.currentTimeMillis());			//Data atual convertida em milisegundos
		Date x3 = new Date(0L);			//Cria uma data 0 milisegundos de atraso em relacao a 00:00:00 01/01/1970GMT
		Date x4 = new Date(1000L * 60L * 60L * 5L);			//Cria uma data 5h (1000 ms * 60s * 60m * 5h) após 00:00:00 01/01/1970GMT
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + sdf1.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		*/

	}

}

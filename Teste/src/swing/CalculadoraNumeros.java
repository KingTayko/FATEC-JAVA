package swing;
import java.util.ArrayList;
public class CalculadoraNumeros  {

	public static double CalcularMedia(ArrayList<Integer>juncao) {
		int i= 0;
		for(Integer num:juncao) {
			i+=num;
		}
		double media =(double) i/juncao.size();
		return media;
	}	

}

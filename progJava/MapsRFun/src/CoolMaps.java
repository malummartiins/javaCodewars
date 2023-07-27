import java.util.HashMap;
import java.util.Map;

public class CoolMaps {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> lakers = new HashMap<Integer, String>();

        lakers.put(6, "LeBron James");
        lakers.put(3, "Anthony Davis");
        lakers.put(15, "Austin Reaves");

        //larkers.remove(key); coloca o nº do obj e vai deletar ele.
        //lakers.clear (); remove a lista toda.
        //lakers.replace(6,"outronome"); - vai substituir o nome da chave 6
        //lakers.containsKey(); coloca o num nos () que quer ver se tem no map
        //lakers.contaisValue (); faz a mesma coisa do metodo acima, porém com o nome;

        //System.out.println(lakers);

        for (Map.Entry m: lakers.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}

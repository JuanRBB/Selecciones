import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicios_mapas {

    public static void main(String[] args) {

        int sumaMundiales = 0;
        int sumaJugadores = 0;

        //Ejercicio 1
        Map<String, Integer> selecciones = new HashMap<>();
        selecciones.put("Brasil", 5);
        selecciones.put("España",1);
        selecciones.put("Alemania",4);
        selecciones.put("China",0);
        selecciones.put("Indonesia",0);
        selecciones.put("Urugguay",2);
        selecciones.put("Francia",2);
        selecciones.put("Italia",4);
        selecciones.put("Bélgica",0);

        //Ejercicio 2
        Map<String, List<String>> seleccionJugadores = new HashMap<>();
        seleccionJugadores.put("Brasil", List.of("Neymar JR", "Vinicius JR", "Rodrigo", "Alisson","Marquinhos"));
        seleccionJugadores.put("España",List.of("Gavi","Pedri","Asensio","Morata","Fabian Ruiz"));
        seleccionJugadores.put("Alemania",List.of("Ter stegen", "Müller","Kroos","Rüdiger","Gündongan"));
        seleccionJugadores.put("China",List.of("Wu Lei","Wu Xi","Alan Carvalho","Wei Shihao","Zheng Zhi"));
        seleccionJugadores.put("Indonesia",List.of("Baggott","Sulaiman","Jordi Amat","Klock","Sananta"));
        seleccionJugadores.put("Urugguay",List.of("Luis Súarez","Darwin Nuñez","Valverde","Godín","Araujo"));
        seleccionJugadores.put("Francia",List.of("Mbappe","Griezman","Kimpembe","Fekir","Lloris"));
        seleccionJugadores.put("Italia",List.of("Bonucci","Chiellini","Insigne","Inmobile","Veratti"));
        seleccionJugadores.put("Bélgica",List.of("Courtois","Lukaku","Hazard","Batshuayi","Onana"));

        //Ejercicio 3
        for (Integer mundiales : selecciones.values()){
            sumaMundiales += mundiales;
        }

        // Ejercicio 4

        Map<String, Integer> seleccionNumJugadores = new HashMap<>();

        for(String x: seleccionJugadores.keySet()){
            seleccionNumJugadores.put(x, seleccionJugadores.get(x).size() );
        }

        // Ejercicio 6

        Map<String, List<String>> jugadoresBrasil = new HashMap<>();
        jugadoresBrasil.put("POR", List.of("Alisson"));
        jugadoresBrasil.put("DF",List.of("Marquinhos"));
        jugadoresBrasil.put("DL", List.of("Neymar JR","Vinicius JR","Rodrigo"));

        Map<String, List<String>> jugadoresEspaña = new HashMap<>();
        jugadoresEspaña.put("POR", List.of("Alisson"));
        jugadoresEspaña.put("DF",List.of("Marquinhos"));
        jugadoresEspaña.put("MC", List.of("Gavi","Pedri","Fabián Ruiz","Asesion"));
        jugadoresEspaña.put("DC",List.of("Asensio","Morata"));

        Map<String, List<String>> jugadoresAlemania = new HashMap<>();
        jugadoresAlemania.put("POR", List.of("Ter stegen"));
        jugadoresAlemania.put("DF",List.of("Rüdiger"));
        jugadoresAlemania.put("MC", List.of("Gündongan","Kroos"));
        jugadoresAlemania.put("DC",List.of("Müller"));

        Map<String, List<String>> jugadoresChina = new HashMap<>();
        jugadoresChina.put("POR", List.of("Wu Lei"));
        jugadoresChina.put("DF",List.of());
        jugadoresChina.put("MC", List.of("Wu Xi","Alan Carvalho"));
        jugadoresChina.put("DC",List.of("Wei Shihao","Zheng Zhi"));

        Map<String, List<String>> jugadoresIndonesia = new HashMap<>();
        jugadoresIndonesia.put("POR", List.of("Baggott"));
        jugadoresIndonesia.put("DF",List.of("Sulaiman","Jordi Amat"));
        jugadoresIndonesia.put("MC", List.of("Klock"));
        jugadoresIndonesia.put("DC",List.of("Sananta"));

        Map<String, List<String>> jugadoresUruguay = new HashMap<>();
        jugadoresUruguay.put("POR", List.of("Alisson"));
        jugadoresUruguay.put("DF",List.of("Godín", "Araujo"));
        jugadoresUruguay.put("MC", List.of("Valverde","Darwin Nuñez"));
        jugadoresUruguay.put("DC",List.of("Luis Suarez"));

        Map<String, List<String>> jugadoresFrancia = new HashMap<>();
        jugadoresFrancia.put("POR", List.of("Lloris"));
        jugadoresFrancia.put("DF",List.of());
        jugadoresFrancia.put("MC", List.of("Kimpembe","Fekir"));
        jugadoresFrancia.put("DC",List.of("Griezman","Mbappe"));

        Map<String, List<String>> jugadoresItalia = new HashMap<>();
        jugadoresItalia.put("POR", List.of());
        jugadoresItalia.put("DF",List.of("Bonucci","Chiellini"));
        jugadoresItalia.put("MC", List.of("Insigne","Inmobile","Veratti"));
        jugadoresItalia.put("DC",List.of());

        Map<String, List<String>> jugadoresBelgica = new HashMap<>();
        jugadoresBelgica.put("POR", List.of("Courtais"));
        jugadoresBelgica.put("DF",List.of());
        jugadoresBelgica.put("MC", List.of("Hazard","Batshuayi","Onana"));
        jugadoresBelgica.put("DC",List.of("Lukaku"));

        Map<String,Map<String, List<String>>> seleccionesPoisicion = new HashMap<>();

        seleccionesPoisicion.put("Brasil", jugadoresBrasil);
        seleccionesPoisicion.put("España", jugadoresEspaña);
        seleccionesPoisicion.put("Alemania", jugadoresAlemania);
        seleccionesPoisicion.put("China",jugadoresChina);
        seleccionesPoisicion.put("Indonesia",jugadoresIndonesia);
        seleccionesPoisicion.put("Urugguay",jugadoresUruguay);
        seleccionesPoisicion.put("Francia",jugadoresFrancia);
        seleccionesPoisicion.put("Italia",jugadoresItalia);
        seleccionesPoisicion.put("Bélgica",jugadoresBelgica);

        //Ejercicio 6

        Map<String, Map<String,List<String>>> selecionNumPos = new HashMap<>();


        for(Map seleccion: seleccionesPoisicion.values()){
            Map<String, List<String>> posiciones = new HashMap<>();
           // for(List<String> x: seleccion.values()){
               // posiciones.put(x, seleccion.get(x).size());
          //  }

           // selecionNumPos()
        }
       // System.out.println(seleccionesPoisicion);



    }


}


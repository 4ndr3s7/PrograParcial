package src.main.java;

import java.util.HashMap;
import java.util.Map;

public class ejercicio3_10 {

    public static void contarVotos(int[] votos) {
        Map<Integer, Integer> conteoVotos = new HashMap<>();
        for (int voto : votos) {
            conteoVotos.put(voto, conteoVotos.getOrDefault(voto, 0) + 1);
        }

        int totalVotos = votos.length;
        int maxVotos = 0;
        int candidatoGanador = -1;

        for (Map.Entry<Integer, Integer> entrada : conteoVotos.entrySet()) {
            int candidato = entrada.getKey();
            int votosCandidato = entrada.getValue();
            double porcentaje = (double) votosCandidato / totalVotos * 100;

            System.out.printf("Candidato %d: %d votos (%.2f%%)\n", candidato, votosCandidato, porcentaje);

            if (votosCandidato > maxVotos) {
                maxVotos = votosCandidato;
                candidatoGanador = candidato;
            }
        }

        System.out.println("El candidato ganador es: " + candidatoGanador);
    }

    public static void main(String[] args) {
        int[] votos = {1, 2, 1, 3, 2, 1, 1, 2, 3, 3, 2, 1};

        contarVotos(votos);
    }
}

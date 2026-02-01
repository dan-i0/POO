package edu.daniel.martinez.actividad3.process.strings;

/**
 * Esta clase cuenta el número de vocales seam mayúsculas o minúsculas de una palabra
 * @return cantidad total de vocales encontradas en la palabra
 **/

public class TotalVocales {

    public static int contarVocales(String palabra) {
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);

            switch (c) {
                case 'a':
                    case 'e':
                        case 'i':
                            case 'o':
                                case 'u':
                                    case 'A':
                                        case 'E':
                                            case 'I':
                                                case 'O':
                                                    case 'U':
                    contador++;
                    break;
                default:
            }
        }
        return contador;
    }
}
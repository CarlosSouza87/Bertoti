package exercicio5;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Ran {

public static void main(String[] args) {
    
    // Obtenha e embaralhe a lista de argumentos
    List<String> argList = Arrays.asList(args);
    Collections.shuffle(argList);

    //Imprima os elementos do Java
    argList.stream()
    .forEach(e->System.out.format("%s ",e));

    //Imprimindo os elementos
    for (String arg: argList) {
        System.out.format("%s ", arg);
    }

    System.out.println();
}
}
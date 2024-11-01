import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        // Implementação mais rapida da interface SET
        Set<String> set = new HashSet<>();

        set.add("Neymar jr");
        set.add("Lionel Messi");
        set.add("Luis Soares");

        // Implementando metodo presente na interface SET
        set.removeIf(x -> x.charAt(0) == 'L');

        // implementando outro metodo presente na interface SET. Saida esperada: True
        System.out.println(set.contains("Neymar jr"));

        // Imprimindo elemento(s)
        for (String s : set) {
            System.out.println(s);
        }
        // Pulando linha
        System.out.println();

        // Implementação mais lenta porem ordenada
        Set<String> set2 = new TreeSet<>();

        set2.add("Cristiano Ronaldo");
        set2.add("Karim Benzema");
        set2.add("Gareth Bale");

        // Imprimindo elementos de forma ordenada(Vantagem da implementação de tipo
        // TreeSet)
        for (String s2 : set2) {
            System.out.println(s2);
        }
        // Pulando linha
        System.out.println();

        // Implementação de velocidade intermediaria e elementos na ordem em que são
        // adicionados
        Set<String> set3 = new LinkedHashSet<>();

        set3.add("Everton Ribeiro");
        set3.add("Ricardo Goulart");
        set3.add("Marcelo Moreno");

        // Saida esperada: Everton Ribeiro, Ricardo Goulart, Marcelo moreno.
        for (String s3 : set3) {
            System.out.println(s3);
        }
        // Pulando linha
        System.out.println();

        // Criando novas coleções
        Set<Integer> a = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> b = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // União
        Set<Integer> c = new TreeSet<>(a); // Instanciação de um conjunto "c" como uma copia do conjunto "a"
        c.addAll(b);
        System.out.println(c);

        // Intersecção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Diferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);



    }
}

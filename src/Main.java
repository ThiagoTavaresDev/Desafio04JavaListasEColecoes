//Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.




import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Collections.sort(numeros);
        System.out.println("Numeros ordenados: " + numeros);

        //No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

        Titulo t1 = new Titulo("Harry Potter");
        Titulo t2 = new Titulo("La casa de Papel");
        Titulo t3 = new Titulo("Amanhacer");

        List<Titulo> titulos = new ArrayList<>();

        titulos.add(t1);
        titulos.add(t2);
        titulos.add(t3);

        Collections.sort(titulos);
        System.out.println("Titulos ordernados: " + titulos);

        //Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

        List<String> strings = new ArrayList<>();

        strings.add("texto");
        strings.add("texto2");
        strings.add("texto3");

        Collections.sort(strings);
        System.out.println(strings);

        List<Integer> inteiros = new LinkedList<>();

        inteiros.add(23);
        inteiros.add(43);
        inteiros.add(13);
        inteiros.add(1);
        inteiros.add(2);
        Collections.sort(inteiros);
        System.out.println(inteiros);

        //Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
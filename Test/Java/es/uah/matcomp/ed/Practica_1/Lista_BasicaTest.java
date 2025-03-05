package es.uah.matcomp.ed.Practica_1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Lista_BasicaTest {

    @Test
    void testLista_Basica() {
        Lista_Basica<Integer> lista = new Lista_Basica<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.delete(2);
        List<Integer> resultado = new ArrayList<>();
        Iterador<Integer> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            resultado.add(iterador.next());
        }
        assertEquals(List.of(1, 3), resultado);
        lista.add(null);
        assertEquals(2,lista.getNumElementos());
    }

    @Test
    void add() {
        //Testeado arriba
        Lista_Basica<Integer> lista = new Lista_Basica<>();
        assertEquals(true, lista.add(1));
    }

    @Test
    void delete() {
        Lista_Basica<Integer> lista = new Lista_Basica<>();
        assertEquals(false, lista.delete(2));
        lista.add(2);
        assertEquals(true, lista.delete(2));
    }

    @Test
    void getNumElementos() {
        Lista_Basica<Integer> lista = new Lista_Basica<>();
        lista.add(1);
        lista.add(2);
        assertEquals(2, lista.getNumElementos());
    }

    @Test
    void getIterador() {
        //Testeado arriba
    }
    @Test
    void setElemento() {
        Lista_Basica<Integer> lista = new Lista_Basica<>(5);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        assertEquals(5, lista.getNumElementos());
        lista.setElemento(0,9);
        Iterador<Integer> iterador = lista.getIterador();
        assertEquals(9, iterador.next());
        lista.setElemento(-1,8);
    }
}
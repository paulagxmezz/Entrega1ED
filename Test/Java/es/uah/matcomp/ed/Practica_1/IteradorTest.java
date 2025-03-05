package es.uah.matcomp.ed.Practica_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteradorTest {

    @Test
    void hasNext() {
        Lista_Basica<Integer> lista = new Lista_Basica();
        lista.add(3);
        lista.add(4);
        lista.add(5);
        Iterador<Integer> iterador = lista.getIterador();
        assertEquals(3,iterador.next());
        assertEquals(4,iterador.next());
        assertEquals(true,iterador.hasNext());
        assertEquals(5,iterador.next());
        assertEquals(false,iterador.hasNext());
    }

    @Test
    void next() {
        Lista_Basica<Integer> lista = new Lista_Basica();
        lista.add(3);
        Iterador<Integer> iterador = lista.getIterador();
        assertEquals(3,iterador.next());
        assertEquals(null,iterador.next());
    }

    @Test
    void delete() {
        Integer[] elementos = {1, 2, 3, 4};
        Iterador<Integer> iterador = new Iterador<>(elementos);

        assertEquals(1,iterador.next());
        iterador.delete(); //Eliminas el segundo elemento: 2

        assertEquals(3, iterador.next()); //Como hemos eliminado el 2, ahora el segundo elemento pasa a ser el 3 y se retorna.
        assertEquals(4, iterador.next());
        assertNull(iterador.next()); // Asegurarse de que no hay más elementos
    }
    }
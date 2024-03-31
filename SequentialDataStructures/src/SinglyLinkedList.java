package com.mycompany.asignaturas;

public class SinglyLinkedList {

    public Asignatura head;
    public Asignatura tail;
    public Asignatura subject;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    // Push Front -> O(1)
    public void pushFront(int c, String m, String n, String a,
                          String d, String h, String e) { // Inserta un nuevo nodo al principio
        Asignatura newSubject = new Asignatura(c, m, n, a, d, h, e); // Crea un nuevo nodo y establece sus datos

        if (head == null) { // Verifica si la lista está vacía
            head = newSubject; // El nuevo nodo se convierte en la cabeza
            tail = newSubject; // El nuevo nodo se convierte en la cola
        } else {
            newSubject.next = head; // El nuevo nodo apunta a la cabeza anterior
            head = newSubject; // El nuevo nodo se convierte en la cabeza actual
        }
    }

    // Top Front -> O(1)
    public Asignatura topFront() { // Retorna los datos del nodo frontal
        if (head == null) {
            throw new IllegalStateException("La lista está vacía");
        }
        return head;
    }

    // Pop Front -> O(1)
    public void popFront() { // Elimina el nodo frontal
        if (head == null) { // Verifica si la lista está vacía
            throw new IllegalStateException("La lista está vacía");
        }

        head = head.next; // La cabeza apunta al siguiente nodo

        if (head == null) { // Verifica si la lista está vacía después de eliminar el nodo frontal
            tail = null;
        }
    }

    // Push Back -> O(1)
    public void pushBack(int c, String m, String n, String a,
                         String d, String h, String e) { // Inserta un nuevo nodo al final
        Asignatura newSubject = new Asignatura(c, m, n, a, d, h, e); // Crea un nuevo nodo y establece sus datos

        if (head == null) { // Verifica si la lista está vacía
            head = newSubject; // El nuevo nodo se convierte en la cabeza
            tail = newSubject; // El nuevo nodo se convierte en la cola
        } else {
            tail.next = newSubject; // El siguiente del último nodo apunta al nuevo nodo
            tail = newSubject; // El nuevo nodo se convierte en la cola
        }
    }

    // Top Back -> O(1)
    public Asignatura topBack() { // Retorna los datos del nodo de la cola
        if (tail == null) {
            throw new IllegalStateException("La lista está vacía");
        }
        return tail;
    }

    // Pop Back -> O(n)
    public void popBack() { // Elimina el nodo de la cola
        if (head == null) { // Verifica si la lista está vacía
            throw new IllegalStateException("La lista está vacía");
        }

        if (head == tail) { // Verifica si solo hay un nodo
            head = null;
            tail = null;
            return;
        }

        Asignatura current = head;
        Asignatura previous = null;

        while (current.next != null) { // Recorre la lista
            previous = current;
            current = current.next;
        }

        previous.next = null; // El nodo de la cola apunta a nulo
        tail = previous; // El nodo anterior se convierte en la cola
    }

    // Find -> O(n)
    public boolean findSubject(String m) { // ¿Está la clave en la lista?
        Asignatura current = head; // Comienza desde la cabeza

        while (current != null) { // Recorre la lista
            if (current.materia.equals(m)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Erase -> O(n)
    public void erase(int c, String m, String n, String a,
                      String d, String h, String e) { // Elimina un nodo con datos específicos de la lista
        if (head == null) { // Verifica si la lista está vacía
            throw new IllegalStateException("La lista está vacía");
        }

        if (
                head.codigo.equals(c) &&
                        head.materia.equals(m) &&
                        head.nombre.equals(n) &&
                        head.apellido.equals(a) &&
                        head.dia.equals(d) &&
                        head.hora.equals(h) &&
                        head.edificio.equals(e)
        ) { // Verifica si el nodo de la cabeza tiene los datos
            head = head.next; // La cabeza actual apunta al siguiente nodo
            return;
        }

        Asignatura current = head; // Comienza desde la cabeza
        Asignatura previous = null; // Nodo anterior al nodo actual

        while (current != null) { // Recorre la lista
            if (
                    current.codigo.equals(c) &&
                            current.materia.equals(m) &&
                            current.nombre.equals(n) &&
                            current.apellido.equals(a) &&
                            current.dia.equals(d) &&
                            current.hora.equals(h) &&
                            current.edificio.equals(e)
            ) {
                previous.next = current.next; // El nodo anterior apunta al siguiente nodo actual
                return;
            }
            previous = current; // El nodo anterior se convierte en el nodo actual
            current = current.next; // El nodo actual se convierte en el siguiente nodo actual
        }
    }

    // Empty -> 0(1)
    public boolean isEmpty() { // Is it empty?
        return head == null;
    }

    public void display() { // Display the list
        Asignatura current = head;

        if (current == null) {
            System.out.println("La lista está vacía");
            return;
        }

        System.out.print("Nodos de la lista enlazada simple: ");
        while (current != null) {
            current.allInfo();
            current = current.next;
        }
        System.out.println();
    }
}

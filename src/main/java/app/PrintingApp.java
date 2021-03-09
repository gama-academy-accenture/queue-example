package app;

import java.util.LinkedList;
import java.util.Queue;

public class PrintingApp {
	public static void main(String[] args) {
		
		// Princípio PEPS (Primeiro Entra Primeiro Sai)
		// FIFO
		// Criacao da fila
		Queue<Object> queue = new LinkedList<Object>();
		
		// Criacao dos arquivos
		File file1 = new File("arqA", "txt", 64.0);
		File file2 = new File("arqB", "txt", 32.0);
		File file3 = new File("arqC", "doc", 32.0);
		File file4 = new File("test1", "doc", 128.0);
		File file5 = new File("test2", "java", 100.6);
		File file6 = new File("test3", "py", 30.54);
		File file7 = new File("arqD", "html", 50.23);
		File file8 = new File("arqE", "html", 135.12);
		
		// Adicionando arquivos na fila de impressão
		System.out.println("Adicionando arquivos\n");
		queue.offer(file1);
		queue.offer(file2);
		queue.offer(file3);
		
		// Mostrando a fila
		System.out.println("Fila de impressão: " + queue + "\n");
		
		// Imprimindo arquivo na fila
		System.out.println("Imprimindo arquivo: " + queue.remove() + "\n");
		
		// Mostrando a fila
		System.out.println("Fila de impressão: " + queue + "\n");
		
		// Adicionando arquivos na fila de impressão
		System.out.println("Adicionando arquivos\n");
		queue.offer(file4);
		queue.offer(file5);
		queue.offer(file6);
		
		// Mostrando a fila
		System.out.println("Fila de impressão: " + queue + "\n");
		
		// Mostrando arquivo do topo
        System.out.println("Arquivo da vez: " + queue.peek() + "\n"); 
		
        // Mostrando a fila
     	System.out.println("Fila de impressão: " + queue + "\n");
	}
}

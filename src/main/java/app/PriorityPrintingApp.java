package app;

import java.util.concurrent.PriorityBlockingQueue; 

public class PriorityPrintingApp {
	public static void main(String[] args) {
		
		// Princípio PEPS (Primeiro Entra Primeiro Sai)
		// FIFO
		// Criacao da fila
		Integer capacity = 8;
		PriorityBlockingQueue<File> priorityQueue = new PriorityBlockingQueue<File>(capacity);
		// Criacao dos arquivos
		File file1 = new File("arqA", "txt", 64.0);
		File file2 = new File("arqB", "txt", 32.0);
		File file3 = new File("arqC", "doc", 31.1);
		File file4 = new File("test1", "doc", 128.0);
		File file5 = new File("test2", "java", 100.6);
		File file6 = new File("test3", "py", 30.54);
		File file7 = new File("arqD", "html", 50.23);
		File file8 = new File("arqE", "html", 135.12);
		
		// Adicionando arquivos na fila de impressão
		System.out.println("Adicionando arquivos 1, 2 e 3\n");
		priorityQueue.put(file1);
		priorityQueue.put(file2);
		priorityQueue.put(file3);
		
		// Mostrando a fila
		System.out.println("Fila de impressão: " + priorityQueue + "\n");
		
		// Imprimindo arquivo na fila
		System.out.println("Imprimindo arquivo: " + priorityQueue.poll() + "\n");
		
		// Mostrando a fila
		System.out.println("Fila de impressão: " + priorityQueue + "\n");
		
		// Adicionando arquivos na fila de impressão
		System.out.println("Adicionando arquivos 4, 5 e 6\n");
		priorityQueue.put(file4);
		priorityQueue.put(file5);
		priorityQueue.put(file6);
		
		// Imprimindo arquivo na fila
		System.out.println("Imprimindo arquivo: " + priorityQueue.poll() + "\n");
		// Imprimindo arquivo na fila
		System.out.println("Imprimindo arquivo: " + priorityQueue.poll() + "\n");
		
		// Mostrando a fila
		System.out.println("Fila de impressão: " + priorityQueue + "\n");
		
		// Adicionando arquivos na fila de impressão
		System.out.println("Adicionando arquivos 7 e 8\n");
		priorityQueue.put(file7);
		priorityQueue.put(file8);
		
		// Mostrando arquivo do topo
        System.out.println("Arquivo da vez: " + priorityQueue.peek() + "\n"); 
		
        // Mostrando a fila
     	System.out.println("Fila de impressão: " + priorityQueue + "\n");
	}
}

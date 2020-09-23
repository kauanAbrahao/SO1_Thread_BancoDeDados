package controller;

import java.util.concurrent.Semaphore;

public class ThreadCalculos extends Thread {
	private int id;
	static Semaphore semaforoBD = new Semaphore(1);
	
	public ThreadCalculos(int id) {
		this.id = id;
	}
	
	public void run() {
		if (id % 3 == 1) { //-------------------------------------------------------------------------------------
			int tempobd = 1000;
			
			int tempocalc = (int) (Math.random() * 800)+200;
			System.out.println("Thread#" + id + " está calculando...");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("Thread#" + id + " terminou o cálculo!");
			
			
			try {
				semaforoBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoBD.release();
			}
			
			
			tempocalc = (int) (Math.random() * 800)+200;
			System.out.println("Thread#" + id + " está calculando...");
				try {
					sleep(tempocalc);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println("Thread#" + id + " terminou o cálculo!");
			
			
			try {
				semaforoBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoBD.release();
			}
			
			
		}
		
		if (id % 3 == 2) { //--------------------------------------------------------------------------------------------
			int tempobd = 1500;
			
			int tempocalc = (int) (Math.random() * 1000)+500;
			System.out.println("Thread#" + id + " está calculando...");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " terminou o cálculo!");
			
			
			try {
				semaforoBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoBD.release();
			}
			
			
			tempocalc = (int) (Math.random() * 1000)+500;
			System.out.println("Thread#" + id + " está calculando...");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " terminou o cálculo!");
			
			
			try {
				semaforoBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoBD.release();
			}
			

			tempocalc = (int) (Math.random() * 1000)+500;
			System.out.println("Thread#" + id + " está calculando...");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " terminou o cálculo!");
			
			try {
				semaforoBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoBD.release();
			}
			
		}
		
		
		if (id % 3 == 0 ) { //---------------------------------------------------------------------------------
			int tempobd = 1500;
			

			int tempocalc = (int) (Math.random() * 1000)+1000;
			System.out.println("Thread#" + id + " está calculando...");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " terminou o cálculo!");
			
			
			try {
				semaforoBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoBD.release();
			}
			
			
			tempocalc = (int) (Math.random() * 1000)+1000;
			System.out.println("Thread#" + id + " está calculando...");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " terminou o cálculo!");
			
			
			try {
				semaforoBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoBD.release();
			}
			
			tempocalc = (int) (Math.random() * 1000)+1000;
			System.out.println("Thread#" + id + " está calculando...");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " terminou o cálculo!");
			
			
			try {
				semaforoBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoBD.release();
			}
			
		}
		
		
		
	}
	
	public void transacaoBD(int id, int tempobd) {
		System.out.println("Thread#" + id + " está realizando transação no Banco de Dados...");
		try {
			sleep(tempobd);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread#" + id + " terminou a transação!");
		
	}
	

}

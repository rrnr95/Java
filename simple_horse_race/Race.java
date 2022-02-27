package semana2.corridaCavalos;

public class Race extends Thread {

	Horse h1 = new Horse(); 
	Horse h2 = new Horse(); 
	Horse h3 = new Horse();
	GUI gui;

	public Race() {
		// TODO Auto-generated constructor stub
		this.gui = new GUI();

		gui.bttActivation(this);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		h1.start();
		h2.start();
		h3.start();
		try {
			while(true) {
				gui.setDistances(h1.getDistance(), h2.getDistance(), h3.getDistance());
			}
		} catch (Exception e) {
			System.out.println("Thread Race");
		}

	}



	//	public horseStart() {
	//		for(HorseThread h: horses)
	//			h.start();
	//	}



}

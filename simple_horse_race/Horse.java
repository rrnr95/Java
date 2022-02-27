package semana2.corridaCavalos;

public class Horse extends Thread{

	private int distance = 30;


	public int getDistance() {
		return distance;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(distance != 0) {
				sleep((int) (Math.random() * 1000));
				distance--;
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Thread interrompida no run do Horse!");
		}	

	}
}

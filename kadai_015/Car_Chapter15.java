package kadai_015;

public class Car_Chapter15 {
	
	//フィールドの作成
	private int gear  = 1;//ギア数
	private int speed = 10;//ギア変更による速度	
	
	
	public Car_Chapter15(int gear, int speed) {
		
		this.gear  = gear;
		this.speed = speed;
	}
	//【メソッド】ギア数と連動する速度変化
	public void gearChange(int afterGear) {
		this.gear = afterGear;
		switch(this.gear) {
		case 1  -> this.speed = 10;
		case 2  -> this.speed = 20;
		case 3  -> this.speed = 30;
		case 4  -> this.speed = 40;
		case 5  -> this.speed = 50;
		default -> this.speed = 10;
		}
		
		}
	//ギアの変更と速度の出力
	public void run() {
		System.out.println("ギア1から" +this.gear+ "に切り替えました");
		System.out.println("速度は時速" + this.speed + "kmです");
	
	}
	
}

//C1 : Tạo hàm getMaker : thành tất cả các chữ in thường
//Tạo hàm thay đổi setVolume . Để thêm sô lượng mới VD 20 -> 25
public class Bottle {
    protected String maker;
    protected int volume;
	public Bottle() {
		super();
	}
	public Bottle(String maker, int volume) {
		super();
		this.maker = maker;
		this.volume = volume;
	}
	public String getMaker() {
		return maker.toLowerCase();
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
    
    
    
    
    
}

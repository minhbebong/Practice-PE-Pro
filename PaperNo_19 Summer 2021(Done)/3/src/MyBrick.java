import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Câu 3: + Kiểm tra các string có kí tự số trước kí tự chữ sau đó đếm và cộng lại in ra kết quả
//Tìm ở vị trí số lẻ lớn nhất đầu tiên của array . Sau đó thay kí tự chữ đi kèm bằng XX
//Tìm ở vị trí lớn nhất đầu tiên , sắp xếp lại các kí tự đằng trước tính cả nó tăng dần
public class MyBrick implements IBrick {

	@Override
	public int f1(List<Brick> arg0) {
		int result  = 0;
		for (Brick brick : arg0) {
			if (Character.isDigit(brick.getPlace().charAt(0)) == true && Character.isLetter(brick.getPlace().charAt(brick.getPlace().length()-1))==true) {
				result++;
			}
		}
		
		
		return result;
	}

	@Override
	public void f2(List<Brick> arg0) {
		int max = arg0.get(0).getPrice();
		int position = 0;
		for (int i = 0; i < arg0.size(); i++) {
			if(arg0.get(i).getPrice() > max && arg0.get(i).getPrice() %2 == 1) {
				max = arg0.get(i).getPrice();
				position = i;
			}
		}
		arg0.get(position).setPlace("XX");
		
	}

	@Override
	public void f3(List<Brick> arg0) {
		// find the position of first brick having maximum 
		int max = arg0.get(0).getPrice();
		int position = 0;
		for (int i = 0; i < arg0.size(); i++) {
			if(arg0.get(i).getPrice() > max ) {
				max = arg0.get(i).getPrice();
				position = i;
			}
		}
		//sort all elements before it 
		Collections.sort(arg0.subList(0, position),new Comparator<Brick>() {

			@Override
			public int compare(Brick o1, Brick o2) {
				
				return o1.getPrice() - o2.getPrice();
			}
		});
	}

}

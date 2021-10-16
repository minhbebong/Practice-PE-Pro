//Câu 4 : Đếm và trả về kết quả các kí tự cuối cùng bằng chữ cái m, n
//f1 : counts and return number of words ending with letter "m" or "n" (not case sensitive)
//
//+string lowercase
//+split " " => cho vao mang words;
//+foreach() ; endsWith("m" or "n")
//
//f2 : return the string s, which is obtained by reversing the first (longest) word in the string 
//
//+ find the longest word in the string
//	+ split "\\s" cho vao mang word
//	+ su dung ham length
//=> chuoi dai nhat
//
//+reversing the string
//	+ su dung ham stringBuilder

public class MyString implements IString {

	@Override
	public int f1(String arg0) {
		int result = 0;
		arg0 = arg0.toLowerCase();
		String words[] = arg0.split("\\s");
		for (String string : words) {
			if (string.endsWith("m") || string.endsWith("n")) {
				result++;
			}
		}
		
		
		return result;
	}

	@Override
	public String f2(String arg0) {
		// TODO Auto-generated method stub
		String result ="";
		String word[] = arg0.split("\\s");
		//find the longest word in the string
		int max = word[0].length(); int position = 0;
		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > max ) {
				max  = word[i].length();
				position = i;
			}
		}
		//reversing the word
		result = new StringBuilder(word[position]).reverse().toString();
		arg0 = arg0.replaceFirst(word[position], result);
		return arg0;
	}

}

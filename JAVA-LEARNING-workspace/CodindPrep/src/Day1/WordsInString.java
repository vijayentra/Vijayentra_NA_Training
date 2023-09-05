package Day1;

public class WordsInString {

	public static void main(String[] args) {
		int count=0;
		String s = "\n Shamb is\n a \n\n boy \n\n\n\n\n\n\t ";
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			char ch1 = s.charAt(i);
			if(i==s.length()-1) {
				if(ch1!='\t'||ch1!='\n'||ch1!=' '){
					count++;
				}
			}
			else {
				if(ch1==' '||ch1=='\n'||ch1=='\t') {
					count++;
					
					for(int j=i+1;j<s.length();j++) {
						char ch2 = s.charAt(j);
						if(ch2==' '||ch2=='\n'||ch2=='\t') {
							i+=1;
						}
						else
							break;
					}
				}
			}
		}
		System.out.println(count);
//		String sentence = " This \n\n\n\n \n is a sample sentence\t\t \t";
//
//        // Split the string into words
//        String[] words = sentence.split("\\s+");
//
//        // Count the number of words
//        int wordCount = words.length;
//
//        // Print the number of words
//        System.out.println("Number of words: " + wordCount);
	}
}
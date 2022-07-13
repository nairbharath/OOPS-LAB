import java.util.*;
class strng{
	int count=0,flag=-1;
	String word,word1;
	String arr_words[],temp[];
	String rep1_word,rep_word;
	Scanner read = new Scanner(System.in);
	strng(){
		System.out.print("\n\t Enter a Sentence : ");
		word = read.nextLine();
		arr_words = new String[word.length()];
		for (int i=0;i<word.length();i++){
			arr_words= word.split(" ");
		}
		
	}

	void occur(){
		temp = new String[arr_words.length];
		System.out.println("\n\t Words \t  Count \n");
		for (int i=0;i<arr_words.length;i++){
			for (int j=0;j<arr_words.length;j++){
				if (arr_words[i].equalsIgnoreCase(temp[j])){
					flag = 1;
					break;
				}
				else if (arr_words[i].equalsIgnoreCase(arr_words[j])){
					count++;
				}
			}
			if (flag!=1){
				System.out.println("\t"+arr_words[i]+"\t : "+count);
				count=0;
				temp[i]=arr_words[i];
			}
			else{
				flag=-1;
			}
		}
	}

	void rplc(){
		System.out.print("\n\t Enter word to be replaced : ");
		rep_word = read.nextLine();
		System.out.print("\n\t Enter word to replace : ");
		rep1_word = read.nextLine();
		for(int i=0;i<arr_words.length;i++){
			if (arr_words[i].equals(rep_word)){
				arr_words[i]=rep1_word;
			}	
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0;i<arr_words.length;i++){
			sb.append(arr_words[i]+" ");
		}
		word1 = sb.toString();
		word = word1;
	}

	void revr(){
		int temp1;
		System.out.print("\t Sentence in Reverse : ");
		for (int i=0;i<arr_words.length;i++){
			temp1 = arr_words[i].length();
			for (int j=0;j<temp1;j++){
				System.out.print(arr_words[i].charAt(temp1-(j+1)));
			}
			System.out.print(" ");
		}
	}

	void display(){
		for (String c : arr_words){
			System.out.println(c);
		}
	}
}
class str{
	public static void main(String[] args) {
		strng s = new strng();
		Scanner obj = new Scanner(System.in);
		int choice;
		do{
			System.out.println("\n\t Sentence : "+s.word);
			System.out.println("\n\t\t\t MENU \n");
			System.out.println("\t 1. Number of occurence of each word ");
			System.out.println("\t 2. Replace a word ");
			System.out.println("\t 3. Reverse each word ");
			System.out.println("\t 4. Exit the program ");
			System.out.print("\n\t\t Option : ");
			choice = obj.nextInt();
			switch(choice){
				case 1: s.occur();
						break;
				case 2: s.rplc();
						break;
				case 3: s.revr();
						break;
				case 4: System.out.println("\n\t Program is exiting ....");
						break;
				default:System.out.println("\n\t Wrong Choice \n\t  Try again ");
			}
		}
		while(choice!=4);
	}
}
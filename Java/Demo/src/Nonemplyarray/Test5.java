package Nonemplyarray;

public class Test5 {
	public static void main(String[] args) {
//		String s = "leetcode";
//		String wordDict[] = { "leet", "code" };

		String s = "catsandog";
		String wordDict[] = { "dog","cat","sand","and","cat"};

		for (int i = 0; i < wordDict.length; i++) {
			if (s.contains(wordDict[i])) {
			
				s=s.replace(wordDict[i], "");
				System.out.println(true);
			} else {
				System.out.println(false);
			}

		}

	}
}

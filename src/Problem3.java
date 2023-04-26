public class Problem3 {
	public void reverseWords(char[] s) {
		// Reverse the entire character array
		reverse(s, 0, s.length - 1);

		// Reverse each word in the character array
		int start = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == ' ') {
				reverse(s, start, i - 1);
				start = i + 1;
			}
		}

		// Reverse the last word in the character array
		reverse(s, start, s.length - 1);
	}

	private void reverse(char[] s, int start, int end) {
		while (start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
	}
}

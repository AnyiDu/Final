public abstract class Problem1 {
	abstract boolean knows(int a, int b);

	public int findCelebrity(int n) {

		int celebrity = 0;

		// check if everyone else knows person 0
		for (int i = 1; i < n; i++) {
			if (knows(celebrity, i)) {
				celebrity = i; // person i might be the celebrity
			}
		}

		// check if the celebrity doesn't know anyone
		for (int i = 0; i < n; i++) {
			if (i != celebrity && (knows(celebrity, i) || !knows(i, celebrity))) {
				return -1; // there is no celebrity
			}
		}

		return celebrity;
	}
}




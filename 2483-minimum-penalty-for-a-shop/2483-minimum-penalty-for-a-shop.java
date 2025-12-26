class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();

        int currentPenalty = 0;
        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                currentPenalty++;
            }
        }

        int minPenalty = currentPenalty;
        int bestClosingHour = 0;

        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                currentPenalty--;
            } else { 
                currentPenalty++;
            }

            if (currentPenalty < minPenalty) {
                minPenalty = currentPenalty;
                bestClosingHour = i + 1;
            }
        }
        return bestClosingHour;
    }
}
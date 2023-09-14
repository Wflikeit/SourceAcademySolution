public class Solution {
    public static void printBonusDatesBetween(int startYear, int toYear){
        int[] years = new int[toYear-startYear+1];
        String[] ans = new String[years.length];
        for (int i = 0; i < years.length; i++) {
            years[i] = startYear + i;
        }
        for (int i = 0; i < years.length; i++) {
            String reversedYear = new StringBuilder(Integer.toString(years[i])).reverse().toString();
            int month = Integer.parseInt(reversedYear.substring(0,2));
            int day = Integer.parseInt(reversedYear.substring(2));
            if (month <= 12 && month>0){
                ans[i] = Integer.toString(years[i]) + '-';
                ans[i] += reversedYear.substring(0,2)+ '-';
            }
            if (day != 0 && ans[i]!=null){
                ans[i] += reversedYear.substring(2);
            }

        }
        for (String s: ans){
            if (s!=null)System.out.println(s);
        }

    }

    public static void main(String[] args) {
        int startYear = 2010;
        int endYear = 2015;
        printBonusDatesBetween(startYear, endYear);
    }
}

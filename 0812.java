public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < 10; i++) {
            if (list.get(i).equals(list.get(i - 1)))   {
                count++;
                if (maxCount < count) maxCount = count;
            } else count = 1;
        }
        System.out.println(maxCount);

    }
}

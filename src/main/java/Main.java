import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        solution(new int[]{3, 1, 2, 3});
    }

    public static int solution(int[] nums) {
        int answer = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet()
                        , p -> Integer.min(p.size(), nums.length/2)));

        return answer;
    }
}

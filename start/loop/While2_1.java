package loop;

public class While2_1 {

    public static void main(String[] args) {
        int num = 0;
        int i = 1;
        int endnum = 345;
        int count = 0;

        while (num < endnum) {
            num = num + i;
            i++;
            count++;
            System.out.println("count 숫자는 : " + num);
        }
        System.out.println(count+"번 만큼 실행되었습니다.");
    }
}

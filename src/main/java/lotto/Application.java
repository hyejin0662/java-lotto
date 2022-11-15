package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lotto.domain.NumberGenerator;

public class Application {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> lottoNum = generator.createRandomNumbers();
        int bonusNum = generator.createBonusNumber();




    }
    public static List<Integer> askNumbers() {
        // TODO: 프로그램 구현
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}


package lotto.domain;

import java.util.List;

public class Judgment {

    public int correctCount(List<Integer> lotto, List<Integer> user) {
        int result = 0;
        for (int i = 0; i < user.size(); i++) {
            int userNumber = user.get(i);
            user.contains(userNumber);
            if (lotto.contains(userNumber)) {
                result ++;
            }
        }
        return result;
    }

    public int correctBonus(int lottoBonus, int userBonus) {
        int result = 0;
        if (lottoBonus==userBonus){
            result++;
        }
        return result;
    }
}

package lotto.domain;

import java.util.List;

public class Referee {

    public int compareNumber(List<Integer> lottoNum, List<Integer> userNum){
        Judgment judgment = new Judgment();
        int correctCount = judgment.correctCount(lottoNum,userNum);

        for (int i = 0; i < lottoNum.size(); i++) {
            if (lottoNum.contains(userNum)) {

            }
        }

        return correctCount;
    }
}

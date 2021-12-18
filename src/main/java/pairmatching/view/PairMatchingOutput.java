package pairmatching.view;

import pairmatching.domain.Pair;

public class PairMatchingOutput {
    private static final String pairDelim = " : ";
    public static void matchInstruction() {
        System.out.println("#############################################\n" +
                "과정: 백엔드 | 프론트엔드\n" +
                "미션:\n" +
                "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n" +
                "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n" +
                "  - 레벨3: \n" +
                "  - 레벨4: 성능개선 | 배포\n" +
                "  - 레벨5: \n" +
                "############################################\n" +
                "과정, 레벨, 미션을 선택하세요.\n" +
                "ex) 백엔드, 레벨1, 자동차경주");
    }

    public static void printPair(Pair pair) {
        int totalSize = pair.calculateTotalSize();
        StringBuilder stringBuilder = new StringBuilder();
        for(int number = 0; number < totalSize;) {
            stringBuilder.append(String.join(pairDelim, new String[]{pair.crewNameByNumber(number), pair.crewNameByNumber(number + 1)}));
            stringBuilder.append("\n");
            number = number + 2;
        }
        if (totalSize ==  pair.getCrewSize()) {
            System.out.println(stringBuilder);
            return;
        }
        stringBuilder.append(String.join(pairDelim,
                new String[]{pair.crewNameByNumber(totalSize), pair.crewNameByNumber(totalSize + 1), pair.crewNameByNumber(totalSize+2)}));
    }

}
package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.utils.CommonConstant;
import pairmatching.utils.Validator;

public class PairMatchingInput{
    private static final String QUIT = "Q";

    public static int inputNumberToExecute() {
        PairMatchingOutput.functionInstruction();
        String functionNumber = Console.readLine();
        if (functionNumber.equals(QUIT)) return -1;
        Validator.validateNumber(functionNumber);
        return Integer.parseInt(functionNumber);
    }

    public static String[] choiceMatchingInformation() {
        PairMatchingOutput.choiceInstruction();
        String information = Console.readLine();
        Validator.validateInformationFormat(information);
        String[] matchingInformation = information.split(", ");
        Validator.validateInformationContent(matchingInformation);
        return matchingInformation;
    }

    public static boolean inputForRematch() {
        PairMatchingOutput.rematchInstruction();
        String rematch = Console.readLine();
        Validator.validateRematchFormat(rematch);
        return CommonConstant.YES.equals(rematch);
    }
}

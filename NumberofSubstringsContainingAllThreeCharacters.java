package leetcode;

public class NumberofSubstringsContainingAllThreeCharacters {

    public void NumberofSubstringsContainingAllThreeCharacters() {
        String s = "aaacb";
        int iCounterSubs = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuffer sTemporalSub = new StringBuffer();
            for (int j = i; j < s.length(); j++) {
                sTemporalSub.append(s.substring(j));
                if (sTemporalSub.indexOf("a") != -1 && sTemporalSub.indexOf("b") != -1 && sTemporalSub.indexOf("c") != -1) {
                    int iMaxPosition = i + Math.max(Math.max(sTemporalSub.indexOf("a"), sTemporalSub.indexOf("b")), sTemporalSub.indexOf("c"));
                    iCounterSubs += ((s.length() - iMaxPosition));
                    break;
                } else {
                    break;
                }
            }
        }
        System.out.println(iCounterSubs);
    }
}

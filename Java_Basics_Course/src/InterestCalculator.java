public class InterestCalculator {
    public float calcInterest(float invest, float interest){
        float quaterlyInterestRate = interest/4;
        float answer = 0;
        for(int i = 0; i < 4; i++){
            answer = invest * (1 + (quaterlyInterestRate/100));
            float newInvest = answer;
            invest = newInvest;
        }
        return answer;
    }
}

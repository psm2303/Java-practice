public class Magic {
	public static void main(String[] args) {
    //this is the og number
    int myNumber = 9;
    int stepOne = myNumber * myNumber;
    int stepTwo = myNumber + stepOne;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
	}
}
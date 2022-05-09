public class Question {
  private char[] choices = {'a', 'b', 'c', 'd'};
  // private respone Response;
  private int grade;
  private int rank;

  Question(int grade, int rank) {
    //this.response = response??
    this.grade = grade;
    this.rank = rank;
  }

  public char[] getChoices() {
    return choices;
  }

  public int getRank() {
    return rank;
  }

  public int getGrade() {
    return grade;
  }

  // public respone getResponse() {
  //   return Response;
  // }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  // public int calculateRank() {
  //   //TO-DO
  // }

}

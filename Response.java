public class Response {
  private int studentId;
  private int questionId;
  private char SelectedChoice;

  Response(int studentId, int questionId, char selectedChoice) {
    this.studentId = studentId;
    this.questionId = questionId;
    this.selectedChoice = selectedChoice;
  }

  //Getters
  public int getStudentId() {
    return studentId;
  }

  public int getQuestionId() {
    return questionId;
  }

  public char getSelectedChoice() {
    return SelectedChoice;
  }

}

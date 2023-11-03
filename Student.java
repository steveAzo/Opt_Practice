public class Student {
    private String name;
    private int totalScore;
    private int quizCount;

    //constructors
    public Student(String name) {
        this.name = name;
        this.totalScore = 0;
        this.quizCount = 0;
    }

    //setter for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    //setter for total score
    public void setTotalScore(int totalScore) {
        if(totalScore >= 0){
            this.totalScore = totalScore;
        }
    }

    //setter for quiz count
    public void setQuizCount(int quizCount) {
        if(quizCount > 0) {
            this.quizCount = quizCount;
        }
    }

    //getter for name

    public String getName() {
        return name;
    }

    //getter for total score
    public int getTotalScore() {
        return totalScore;
    }

    //getter for quiz count
    public int getQuizCount() {
        return  quizCount;
    }

    //the method that add the score of the quizzes of the student
    public void addQuiz(int score){
        totalScore += score;
        quizCount ++;        
    }

    //method for calculating the average of the scores of the student
    public float getAverage(){
        if(quizCount == 0){
            return 0.00f;
        }
        return (float)totalScore / quizCount;
    }
}
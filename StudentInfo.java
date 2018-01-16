package FileDemo;

/**
 * Created by ttc on 18-1-15.
 */
public class StudentInfo implements Comparable{

//    学号 姓名   语文 数学 英语 平均值 总值  排序
    private int id;
    private String name;
    private int chinese_score;
    private int math_score;
    private int english_score;
    private int total;
    private int avg;

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chinese_score=" + chinese_score +
                ", math_score=" + math_score +
                ", english_score=" + english_score +
                ", total=" + total +
                ", avg=" + avg +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese_score() {
        return chinese_score;
    }

    public void setChinese_score(int chinese_score) {
        this.chinese_score = chinese_score;
    }

    public int getMath_score() {
        return math_score;
    }

    public void setMath_score(int math_score) {
        this.math_score = math_score;
    }

    public int getEnglish_score() {
        return english_score;
    }

    public void setEnglish_score(int english_score) {
        this.english_score = english_score;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public int compareTo(Object o) {
       StudentInfo s= (StudentInfo)o;
        return s.getTotal()-this.total;
    }
}

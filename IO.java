package FileDemo;

import java.io.*;
import java.util.*;

/**
 * Created by ttc on 18-1-15.
 */
public class IO {
    public static void main(String[] args) throws Exception {
//学号 姓名   语文 数学 英语 平均值 总值  排序
//        1   李守东   83  73  75
//        2   徐贤坤   58  58  87
        FileReader fr = new FileReader("C:\\Documents and Settings\\ttc\\feiq\\Recv Files/student_score.txt");
        BufferedReader br = new BufferedReader(fr);
        String string = br.readLine();
         string = br.readLine();
        List<StudentInfo> list2=new ArrayList<>();
        while (string != null) {
            String[] str = string.split(" ");
            List<String> list = new ArrayList<>();
            for (String a : str) {
                if (!a.equals("")) {
                    list.add(a);
                }
            }
            StudentInfo s = new StudentInfo();
            int id = Integer.parseInt(list.get(0));
            s.setId(id);
            String name = list.get(1);
            s.setName(name);
            int yuwen = Integer.parseInt(list.get(2));
            s.setChinese_score(yuwen);
            int shuxue = Integer.parseInt(list.get(3));
            s.setChinese_score(shuxue);
            int waiyu = Integer.parseInt(list.get(4));
            s.setChinese_score(waiyu);
            int total=yuwen+shuxue+waiyu;
            s.setTotal(total);
           int avg=(yuwen+shuxue+waiyu)/3;
            s.setAvg(avg);
            list2.add(s);
            string = br.readLine();
        }
//        System.out.println(list2.size());
        List<StudentInfo> newOrder=new ArrayList<>();
        newOrder.addAll(list2);
        Collections.sort(newOrder);
        Map<String,Integer> map=new HashMap<>();
        int index=1;
        for(StudentInfo s:newOrder)
        {
            map.put(s.getName(),index++);
        }
        FileWriter fw=new FileWriter("e:/StudentInfo.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write( "学号\t姓名\t语文\t数学\t英语\t平均值\t总值\t排序");
        bw.newLine();
        for(StudentInfo s:list2)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(s.getId());
          sb.append("\t");
          sb.append(s.getName());
          sb.append("\t");
          sb.append(s.getChinese_score());
          sb.append("\t");
          sb.append(s.getMath_score());
          sb.append("\t");
          sb.append(s.getEnglish_score());
          sb.append("\t");
          sb.append(s.getAvg());
          sb.append("\t");
          sb.append(s.getTotal());
          sb.append("\t");
          sb.append(map.get(s.getName()));
          sb.append("\t");
          bw.write(sb.toString());
          bw.newLine();
        }
        bw.flush();

//学号 姓名   语文 数学 英语 平均值 总值  排序
    }
}
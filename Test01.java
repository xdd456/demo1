package x.test;

import java.io.File;
import java.io.FilenameFilter;

//输出S 盘所以  mwv；；；；；        【  搜索   】       【    误删   】
public class Test01 {
    public static void main(String[] args) throws Exception {
        File dir = new File("S:\\");


        find(dir, "wmv");


    }

    public static void find(File dir, String name) {

        if (dir.isDirectory()) {

            if (dir == null) return;
            File[] files = dir.listFiles();
            if (files != null) {
            for (File file : files) {
                find(file, name);
            }}
        } else {
          String sname=dir.getName().toLowerCase();
            if (sname.endsWith(name)) {
                System.out.println(dir);
            }

        }

    }
//class Student implements


}